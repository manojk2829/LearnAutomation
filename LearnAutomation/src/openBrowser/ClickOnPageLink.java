package openBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnPageLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\ChromeDriver.exe");
		WebDriver GC = new ChromeDriver();
		GC.get("http://newtours.demoaut.com/");
		GC.manage().window().maximize();
		GC.findElement(By.linkText("Register here")).click();
	}

}
