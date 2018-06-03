package screenShotTaker;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot {
	@Test
	public  void screenShotCapture() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\ChromeDriver\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");

		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try{
			FileUtils.copyFile(src, new File("C:/Users/ti01045/Desktop/googlepix.jpg"));
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		System.out.println("Screen shot done......");
		driver.findElement(By.xpath("//input[@class='gsfi']")).sendKeys("Manoj Kushwaha");
		Thread.sleep(2000);
		driver.quit();
	}
	}