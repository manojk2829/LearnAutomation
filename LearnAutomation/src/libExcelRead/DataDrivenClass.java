package libExcelRead;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenClass {
   WebDriver dr;
   @Test(dataProvider="workdata")
     public void datadrivenmethod(String user, String password){
    	ChromeOptions op = new ChromeOptions();
 		op.addArguments("chrome.switch","--disable-extensions");
 		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\ChromeDriver\\chromedriver.exe");
 		dr = new ChromeDriver(op);
 		dr.manage().window().maximize();
 		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 		dr.get("http://demosite.center/wordpress/wp-login.php");
 		dr.findElement(By.id("user_login")).sendKeys(user);
 		dr.findElement(By.id("user_pass")).sendKeys(password);
 		dr.findElement(By.id("wp-submit")).click();
 		System.out.println(dr.getTitle());
 		Assert.assertTrue(dr.getTitle().contains("Dashboard"), "Validation fail.....");
     }
@AfterMethod
public void teardown(){
	dr.close();
}

@DataProvider(name="workdata")
public Object[][] testdata(){
	Object[][] data = new Object[3][2];
	data[0][0] = "admin";
	data[0][1] = "demo1";
	data[1][0] = "admin";
	data[1][1] = "demo123";
	data[2][0] = "admin";
	data[2][1] = "demo1234";
	return data;
	
  }
}