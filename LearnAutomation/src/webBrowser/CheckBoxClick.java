package webBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxClick {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@id='link-signup']")).click();
		Thread.sleep(8000);
		//driver.findElement(By.id("firstname-placeholder")).sendKeys("raju");
		driver.findElement(By.xpath("//input[@id='SkipCaptcha']")).click();
	}
}
