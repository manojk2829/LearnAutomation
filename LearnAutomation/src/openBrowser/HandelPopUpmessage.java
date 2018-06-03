package openBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandelPopUpmessage{
	    @Test
	    public static void AlertPOPUP() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\ChromeDriver\\ChromeDriver.exe");
		WebDriver gc= new ChromeDriver();
		gc.manage().window().maximize();
		gc.get("http://www.ksrtc.in/site");
		gc.findElement(By.linkText("Home")).click();
		Thread.sleep(2000);
		gc.findElement(By.linkText("Search Services")).click();
		String actual_message = gc.switchTo().alert().getText();
		System.out.println("Popup actual message is ---  " + actual_message );
		String ExpectedMessage = ("'From' place is required.");
		Assert.assertEquals(actual_message, ExpectedMessage);
		gc.quit();
	}
}

