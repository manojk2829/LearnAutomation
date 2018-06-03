package startToEnd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewtoursDemoaut {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//ChromeDriver//chromedriver.exe");
    	WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.get("http://newtours.demoaut.com/");
		WebElement user = dr.findElement(By.name("userName"));
		HighLightElement.highLightElement(dr, user);
		user.sendKeys("qqqq");
		WebElement Pass = dr.findElement(By.name("password"));
		HighLightElement.highLightElement(dr, Pass);
		Pass.sendKeys("qqqq");
		

	}

}
