package autoITFileUpload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FileUpload {
	@Test
	public void fileUploadMethod() throws Exception {

		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//ChromeDriver//chromedriver.exe");
		//WebDriver dr = new ChromeDriver();
		WebDriver dr = new FirefoxDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		dr.get("C:\\Users\\ti01045\\Desktop\\UploadTextFile.html");
		dr.findElement(By.xpath("//input[@id='1']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\ti01045\\Desktop\\AutoIT\\UploadFile.exe");

	}
}
