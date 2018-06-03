package webBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnterTextInTextbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\ChromeDriver.exe");
		WebDriver chrome = new ChromeDriver();
		chrome.get("http://newtours.demoaut.com");
		chrome.manage().window().maximize();
		chrome.findElement(By.name("userName")).sendKeys("qqqq");
		chrome.findElement(By.name("password")).sendKeys("qqqq");
		chrome.findElement(By.name("login")).click();
		chrome.quit();

		WebDriver FFdriver = new FirefoxDriver();
		FFdriver.get("http://newtours.demoaut.com");
		FFdriver.manage().window().maximize();
		FFdriver.findElement(By.name("userName")).sendKeys("qqqq");
		FFdriver.findElement(By.name("password")).sendKeys("qqqq");
		FFdriver.findElement(By.name("login")).click();
		FFdriver.close();
	}

}
