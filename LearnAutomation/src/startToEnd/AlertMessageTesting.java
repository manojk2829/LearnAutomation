package startToEnd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertMessageTesting {
    @Test
    public static void alertMessage() throws InterruptedException{
    	//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//ChromeDriver//chromedriver.exe");
    	WebDriver dr = new FirefoxDriver();
    	dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.get("http://executeautomation.com/demosite/index.html");
		System.out.println(dr.getTitle());
		dr.findElement(By.name("generate")).click();
		Thread.sleep(2000);
		String actualmessage = dr.switchTo().alert().getText();
		dr.switchTo().alert().accept();
		System.out.println(actualmessage);
        String Expected	= "You generated a Javascript alert";
        Assert.assertEquals(actualmessage, Expected);
        String anotherAlertMessage = dr.switchTo().alert().getText();
        System.out.println(anotherAlertMessage);
        dr.switchTo().alert().accept();
        
        
    }
}
