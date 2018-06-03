package openBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaxmizeWndow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\ChromeDriver.exe");
		WebDriver GC = new ChromeDriver();
		GC.manage().window().maximize();
		GC.get("http://newtours.demoaut.com/");
	}
}
