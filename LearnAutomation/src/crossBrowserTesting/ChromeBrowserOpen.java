package crossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ChromeBrowserOpen {
    WebDriver dr;
	@Test
    public void chromebrowser() throws InterruptedException{
    	ChromeOptions op = new ChromeOptions();
		op.addArguments("chrome.switch","--disable-extensions");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\ChromeDriver\\chromedriver.exe");
		dr = new ChromeDriver(op);
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.get("http://executeautomation.com/demosite/index.html");
		System.out.println(dr.getTitle());
		Thread.sleep(2000);
		Select  listTitle = new Select(dr.findElement(By.xpath("//select[@id='TitleId']")));
		listTitle.selectByVisibleText("Ms.");
		
		
    }
}
