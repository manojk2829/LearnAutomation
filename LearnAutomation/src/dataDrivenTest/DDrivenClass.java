package dataDrivenTest;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import crossBrowserTesting.HighLightClass;

public class DDrivenClass {
	WebDriver dr;
	@Test(dataProvider = "workdata")
	public void dataDrivenTesting(String user, String password) throws Exception
    {
		ChromeOptions option = new ChromeOptions();
	    option.addArguments("chrome.switch","--disable-extensions");
	    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\chromedriver.exe");
	    dr = new ChromeDriver(option);
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.get("http://demosite.center/wordpress/wp-login.php");
		WebElement userlogin = dr.findElement(By.id("user_login"));
		LightElement.lightelement(dr, userlogin);
		userlogin.sendKeys(user);
		WebElement pass = dr.findElement(By.id("user_pass"));
		HighLightClass.highLightMethod(dr, pass);
		pass.sendKeys(password);
		dr.findElement(By.id("wp-submit")).click();
		System.out.println(dr.getTitle());
		Assert.assertTrue(dr.getTitle().contains("Dashboard"), "Wrong credential");
		Thread.sleep(3000);
		File src = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		try{
			FileUtils.copyFile(src, new File("C:/Users/ti01045/Desktop/goopix.jpg"));		
			}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
    }

	@AfterMethod
	public void teardown(){
		dr.quit();
	}
     @DataProvider(name= "workdata")
     public Object[][] datavalue(){
    	 Object[][] data = new Object[3][2];
    	 data[0][0] = "admin";
    	 data[0][1] = "demo12";
    	 data[1][0] = "admin";
    	 data[1][1] = "demo123";
    	 data[2][0] = "admin";
    	 data[2][1] = "demo1234";
    	 return data;
     }
}
