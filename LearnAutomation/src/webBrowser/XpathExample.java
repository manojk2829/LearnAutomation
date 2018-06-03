package webBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathExample {

	public static void main(String[] args) throws InterruptedException {
	//How to write Xpath of WebElement.
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("qqqq");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("qqqq");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		driver.close();
		}
}
