package webBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QuietCloseBrowser {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.close();
		//Difference between Close and Quite -- Close method can close only latest window, but quite can close all windows. 
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\ChromeDriver\\ChromeDriver.exe");
		WebDriver GC = new ChromeDriver();
		GC.get("http://newtours.demoaut.com");
		GC.quit();

	}

}
