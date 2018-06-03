package webBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonSelection {

	public static void main(String[] args) {
		// How to Select Radio button.
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("qqqq");
		driver.findElement(By.name("password")).sendKeys("qqqq");
		driver.findElement(By.name("login")).click();
		
		WebElement radiobtn = driver.findElement(By.xpath("//input[@value='oneway']"));
		if (!radiobtn.isSelected())
		{
			radiobtn.click();
		}		
	}

}
