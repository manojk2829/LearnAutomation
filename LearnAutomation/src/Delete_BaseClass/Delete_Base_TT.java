package Delete_BaseClass;

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

public class Delete_Base_TT {
	public WebDriver dr;
	public Properties pro;
	public ExtentReports ext = ExtentManager.getInstance();
	public ExtentTest test;
	public Xls_Reader xls;
   public void initiate(){
	   if(pro==null){
		   pro = new Properties();
		   try{
			   FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\Delete_Config_Pack\\config.properties");
			   pro.load(fis);
			  }
		   catch(Exception ee){
			  System.out.println(ee.getMessage()); 
			  ee.printStackTrace();
		   }
		   System.out.println(pro.getProperty("AppURL"));
	   }
   }
   
	public void openBrowser(String Bro){
		System.setProperty("webdriver.chrome.driver", pro.getProperty("chrome_exe"));
		if(Bro.equalsIgnoreCase("chrome")){
			dr = new ChromeDriver();		   
		}else if(Bro.equalsIgnoreCase("firefox")){
			dr = new FirefoxDriver();	
		}
	}

	public void navigatenew(String URL){
		   dr.navigate().to(pro.getProperty(URL));
		   dr.manage().window().maximize();
		   dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   }
	   
   
   public void typeLogin(String locater,String data){
	  getElement(locater).sendKeys(data);   
   }
   
   public void typePassword(String locater,String data){
	   getElement(locater).sendKeys(data);   
   }
   
   public void clickBTN(String locater){
	   getElement(locater).click();
   }
   
   public WebElement getElement(String locaterKey){
	   WebElement w = null;
	   try{
		   if(locaterKey.endsWith("_id"))
		   w = dr.findElement(By.id(pro.getProperty(locaterKey)));
	   else if(locaterKey.endsWith("_name"))
	       w = dr.findElement(By.name(pro.getProperty(locaterKey)));
	   else if (locaterKey.endsWith("_xpath"))
		   w = dr.findElement(By.xpath(pro.getProperty(locaterKey)));
	   else {
		      reporting("Locater not found....");
		} 
	   }catch(Exception e){
	    	System.out.println(e.getMessage());
	    	e.printStackTrace();	    	
	    }
	   return w;
   }
   
   /***********************************/
   
   public void ScreenShot(){
	   Date d = new Date();
	   String ScreenFileName = d.toString().replace(" ", "_").replace(":", "_")+".jpg";
	   try{
		   File src = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
	  	   FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"//report//"+ ScreenFileName));
	   }catch(Exception ex){
		   System.out.println(ex.getMessage());
		   ex.printStackTrace();
	   }
	   test.log(LogStatus.INFO, "teke Screen Shot -- > ", test.addScreenCapture(System.getProperty("user.dir")+"//report//"+ ScreenFileName));
   }
   public boolean reporting(String d){
	   return true;
   }
   
}
