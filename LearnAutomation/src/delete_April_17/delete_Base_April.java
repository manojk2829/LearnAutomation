package delete_April_17;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import Delete_BaseClass.ExtentManager;
import Delete_BaseClass.Xls_Reader;

public class delete_Base_April {
      public Xls_Reader xls;
      public WebDriver dr;
      public Properties pro;
      public ExtentReports ext = ExtentManager.getInstance();
      public ExtentTest test;
      public void initialize(){
    	   if(pro==null){
    		   try{
    			   pro = new Properties(); 
    		  	   FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\Delete_Config_Pack\\config.properties");
    		  	   pro.load(fis);
    		       }
    		   catch(Exception e){
    			   System.out.println(e.getMessage());
    			   e.printStackTrace();
    		   }
    		   System.out.println(pro.getProperty("CareURL"));
    	   }
      }
      public void openBro(String Bro)
       {  
    	  System.setProperty("webdriver.chrome.driver", pro.getProperty("chrome_exe"));
    	  test.log(LogStatus.INFO, "Browser is going to Open.... " + Bro);
    	  if(Bro.equalsIgnoreCase("chrome")){
    		  dr = new ChromeDriver();
       	  }else if(Bro.equalsIgnoreCase("firefox")){
       		  dr = new FirefoxDriver();
       	  }
    	  test.log(LogStatus.INFO, "Browser has been opened successfully...  "  + Bro);
    	  dr.manage().window().maximize();
    	  dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       }
      
      public void navigate(String URL){
    	  test.log(LogStatus.INFO, "URL entered in Browser -- > " + pro.getProperty(URL));
     	  dr.navigate().to(pro.getProperty(URL));
     	  test.log(LogStatus.INFO, "URL entered and Open Application Sucessfully.... Browser Name -- " + pro.getProperty(URL));
      }
      
      public void typeLogin_User(String locater,String data){
    	  test.log(LogStatus.INFO, "Enter user Login ID -- > " +data);
     	  getElement(locater).sendKeys(data);
     	 }
      
      public void typeLogin_password(String locater,String data){
    	  test.log(LogStatus.INFO, "Enter user Password -- > "+ data);
     	  getElement(locater).sendKeys(data);
     	  test.log(LogStatus.INFO, "Password Entered successfully -- >  " + data);
      }
      
      public void Click_Login(String locater){
    	  test.log(LogStatus.INFO, "Click Login Button -- > " + locater);
     	  getElement(locater).click();
     	  test.log(LogStatus.INFO, "Login Button clicked successfully -- >  ");
      }
      
      public boolean ReportingFailure(String report){
    	  return false;
      }
      
      public WebElement getElement(String locaterKey){
    	  WebElement e = null;
    	  if(locaterKey.endsWith("_id"))
    		  e= dr.findElement(By.id(pro.getProperty(locaterKey)));
    	  else if(locaterKey.endsWith("_name"))
    		  e = dr.findElement(By.name(pro.getProperty(locaterKey)));
    	  else if(locaterKey.endsWith("_xpath"))
    		  e = dr.findElement(By.xpath(pro.getProperty(locaterKey)));
    	  else if(locaterKey.endsWith("_Text"))
    		  e = dr.findElement(By.linkText(pro.getProperty(locaterKey)));
    	  else {
    		  ReportingFailure("Locater key not found....");
    	  }
    	  return e;
      }
      
      public void ScreenShot1(){
    	  Date d = new Date();
    	  String ScreenFileName = d.toString().replace(" ","_").replace(":", "_");
    	  File src = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
    	  try{
    		  FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"//report//"+ScreenFileName));
    	  }catch(Exception e){
    		  System.out.println(e.getMessage());
    	  }
    	  test.log(LogStatus.INFO, "Screen SHot ---> " , test.addScreenCapture(System.getProperty("user.dir")+"//report//"+ScreenFileName));
      }
}
