package boxLinkClick;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenLoginApplication {
    @Test(dataProvider="datadrivenWork")
    
	public void DataDrivenLogin(String user,String pass) throws Exception {
       System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\chromedriver.exe");
       ChromeOptions op = new ChromeOptions();
	   op.addArguments("--disable-extensions");
	   WebDriver dr = new ChromeDriver(op);
	   dr.manage().window().maximize();
	   dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   dr.get("http://demosite.center/wordpress/wp-login.php?");
	   dr.findElement(By.id("user_login")).sendKeys(user);
	   dr.findElement(By.id("user_pass")).sendKeys(pass);
	   dr.findElement(By.id("wp-submit")).click();
	   System.out.println(dr.getTitle());
	   Assert.assertTrue(dr.getTitle().contains("Dashboard"), "Not Match.......");
	   File src = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(src, new File("C:\\Users\\ti01045\\Desktop\\ReadExcel\\A1.jpg"));
	}


@DataProvider
public Object[][] datadrivenWork(){
	Object[][] data = new Object[3][2];
	data[0][0] = "admin";
	data[0][1] = "data1";
	
	data[1][0] = "admin";
	data[1][1] = "demo123";
	
	data[2][0] = "admin";
	data[2][1] = "data12";
	
	return data;
	
 }
}