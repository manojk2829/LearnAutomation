package openBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandelAlertWindow {

	@Test
	public static void AlertWin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ksrtc.in/oprs-web/");
      //  driver.findElement(By.linkText("Home")).click();	
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='button1 redbtn']")).click();
        Thread.sleep(2000);
        String Actualmessage = driver.switchTo().alert().getText();
        System.out.println("My actual popup message ---  " + Actualmessage);
        
        driver.switchTo().alert().accept();
        String Expectedmessage = "'From' place is required.";
        Assert.assertEquals(Actualmessage, Expectedmessage);
        System.out.println("Actual message is -- " + Actualmessage + "Expected message -- " + Expectedmessage );
        driver.quit();
  
        
        

	}
	
}
