package startToEnd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ErrorMessage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//ChromeDriver//chromedriver.exe");
    	WebDriver dr = new ChromeDriver();
    	dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.get("http://www.ksrtc.in/oprs-web/");
		System.out.println(dr.getTitle());
		dr.findElement(By.linkText("Sign In")).click();
		Thread.sleep(3000);
		dr.findElement(By.id("submitBtn")).click();
		String actual = dr.findElement(By.xpath("html/body/div[5]/div[1]/div[3]/strong")).getText();
		System.out.println(actual);
		String Expected = "Login incorrect. Please try again";
		Assert.assertEquals(actual, Expected);
		System.out.println("Actual message has been match to Expected Message.....");
		Assert.assertTrue(actual.contains("Login incorrect. Please try"));
		
		dr.findElement(By.name("userName")).sendKeys("Manoj");
		dr.findElement(By.id("submitBtn")).click();
		String actualPass = dr.findElement(By.xpath("html/body/div[5]/div[1]/div[3]/strong")).getAttribute("innerHTML");
		System.out.println(actualPass);
		Assert.assertTrue(actualPass.contains("Login incorrect. Please try again"));
		System.out.println("Actual message has been match successfully...");
		
		Thread.sleep(3000);
		dr.quit();

	}

}
