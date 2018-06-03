package crossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CallHighLightClassInPageElement {

	public static void main(String[] args) throws Exception {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("chrome.switch", "--disable-extensions");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\ChromeDriver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver(op);
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.get("http://newtours.demoaut.com/");
		WebElement username = dr.findElement(By.name("userName"));
		HighLightClass.highLightMethod(dr, username);
		username.sendKeys("qqqq");
		WebElement pass = dr.findElement(By.name("password"));
		HighLightClass.highLightMethod(dr, pass);
		pass.sendKeys("qqqq");
		dr.close();
	}

}
