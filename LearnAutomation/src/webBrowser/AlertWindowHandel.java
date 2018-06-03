package webBrowser;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertWindowHandel {

	@Test
	public void AlertTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\ChromeDriver.exe");
		WebDriver GC = new ChromeDriver();
		GC.manage().window().maximize();
		GC.get("http://ksrtc.in");
		GC.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/form/div[8]/a/font")).click();
		//Alert alrt = GC.switchTo().alert();
		//alrt.accept();
		Thread.sleep(1000);
		String actual_message = GC.switchTo().alert().getText();
		System.out.println("Actual message is ---  " + actual_message );
		GC.switchTo().alert().accept();
		
		String Expected_rst= "'From' place is required.-- New and Wrong";
		Assert.assertEquals(actual_message, Expected_rst);
		
		}

}
