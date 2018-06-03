package webBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserOpen {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
        
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\ChromeDriver\\ChromeDriver.exe");
		WebDriver GCdriver = new ChromeDriver();
		GCdriver.get("http://newtours.demoaut.com");
		GCdriver.manage().window().maximize();
		
	}

}
