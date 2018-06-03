package ZZ_Base_Config;

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
import org.openqa.selenium.support.ui.Select;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import DemoLogin.ExtentManager;
import DemoLogin.Xls_Reader;

public class Base_zzz_Class {
	public WebDriver dr;
	public Properties pro;
	public ExtentReports ext = ExtentManager.getInstance();
	public ExtentTest test;
	public Xls_Reader xls;

	public void initialization(){
		if(pro==null){
			pro = new Properties();
			try{
				FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//ZZ_Base_Config//config.properties");
				pro.load(fis);
			}catch(Exception e){
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		System.out.println(pro.getProperty("AppURL"));
	}

	public void openBrowser(String Bro){
		System.setProperty("webdriver.chrome.driver", pro.getProperty("Chrome_exe"));
		if(Bro.equalsIgnoreCase("chrome")){
			dr = new ChromeDriver();		   
		}else if(Bro.equalsIgnoreCase("firefox")){
			dr = new FirefoxDriver();	
		}
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		   
	}

	public void navigate(String URL){
		dr.navigate().to(pro.getProperty(URL)); //AppURL
	}

	public void Registration_Link(String locaterKey){
		getElement(locaterKey).click();
	}

	public void FirstName(String locaterKey, String data){
		getElement(locaterKey).sendKeys(data);
	}

	public void LastName(String locaterKey, String data){
		getElement(locaterKey).sendKeys(data);
	}

	public void MaritalStatus(String locaterKey){
		WebElement radio_btn_MaritalStatus = getElement(locaterKey);
		if(!radio_btn_MaritalStatus.isSelected()){
			radio_btn_MaritalStatus.click();
		}
	}

	public void Hobby(String locaterKey){
		getElement(locaterKey).click();
	  }
	
	public void contry(String locaterKey, String data){
		Select contry = new Select(getElement(locaterKey));
		contry.selectByVisibleText(data);
	}
	
	public void DOB_month(String locaterKey, String data){
		Select month = new Select(getElement(locaterKey));
		month.selectByVisibleText(data);
	}
	
	public void DOB_date(String locaterKey, String data){
		Select date = new Select(getElement(locaterKey));
		date.selectByVisibleText(data);
	}
	
	public void DOB_year(String locaterKey, String data){
		Select year = new Select(getElement(locaterKey));
		year.selectByVisibleText(data);
	}
	
	public void Mobile_no(String locaterKey, String data){
		getElement(locaterKey).sendKeys(data);
	}
	
	
	public void Username(String locaterKey, String data){
		getElement(locaterKey).sendKeys(data);
	}
	
	public void Email(String locaterKey, String data){
		getElement(locaterKey).sendKeys(data);
	}
	
	public void Remark_text(String locaterKey, String data){
		getElement(locaterKey).sendKeys(data);
	}
	
	public void password(String locaterKey, String data){
		getElement(locaterKey).sendKeys(data);
	}
	
	public void Confirm_password(String locaterKey, String data){
		getElement(locaterKey).sendKeys(data);
	}
	
	
	public void SaveBtn(String locaterKey){
		getElement(locaterKey).click();
	}
	
/******************** Get Element **********************/
	public WebElement getElement(String locater){
		WebElement e = null;
		if(locater.endsWith("_id"))
			e=dr.findElement(By.id(pro.getProperty(locater)));
		else if(locater.endsWith("_name"))
			e=dr.findElement(By.name(pro.getProperty(locater)));
		else if(locater.endsWith("_xpath"))
			e=dr.findElement(By.xpath(pro.getProperty(locater)));
		else if(locater.endsWith("_Text"))
			e=dr.findElement(By.partialLinkText(pro.getProperty(locater)));
		else {
			reportFail("Locater not found....");
		}
		return e;
	}

	public boolean reportFail(String msg){
		return false;
	}
	
	/*********************  Take Screen Shot  *******************/
	public void ScreenShot(){
		Date d = new Date();
		String ScreenFileName = d.toString().replace(" ", "_").replace(":", "_")+".jpg";
		
		try{
		File src = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"//report//"+ScreenFileName));
	   }catch(Exception ex){
		   System.out.println(ex.getMessage());
		   ex.printStackTrace();
	   }
		test.log(LogStatus.INFO, "Screen Shot Capture --- " , test.addScreenCapture(System.getProperty("user.dir")+"//report//"+ScreenFileName));		
	}
	
	

}
