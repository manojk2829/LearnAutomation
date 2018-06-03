package startToEnd;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpWindow {
    //@Test
	public static void main(String[] arg) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//ChromeDriver//chromedriver.exe");
    	WebDriver dr = new FirefoxDriver();
    	dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.get("http://executeautomation.com/demosite/index.html");
		System.out.println(dr.getTitle());
		dr.findElement(By.linkText("HtmlPopup ")).click();
		dr.manage().window().maximize();
		for(String popupMessage : dr.getWindowHandles())
		    {
			  dr.switchTo().window(popupMessage);
			}
			WebElement PopupFirstName = dr.findElement(By.xpath("//input[@id='FirstName']"));
			HighLightElement.highLightElement(dr, PopupFirstName);
			
			PopupFirstName.sendKeys("Kushwaha");
			Thread.sleep(3000);
			String TilteMSG = dr.getTitle();
			System.out.println(TilteMSG);
			Assert.assertTrue(TilteMSG.contains("Popup Window"));
			System.out.println("Title Verify.....");
	        dr.close();
	        for(String OldWindow : dr.getWindowHandles()){
	        	dr.switchTo().window(OldWindow);
	        }
	        String OldTitle = dr.getTitle();
	        System.out.println(OldTitle);
	        String Expected = "Execute Automation";
	        Assert.assertEquals(OldTitle,Expected);
	        System.out.println("Title Verify.....again");
	        
	        dr.findElement(By.xpath("//input[@name='generate']")).click();
	        String actualMessageText = dr.switchTo().alert().getText();
	        System.out.println(actualMessageText);
	        String ExpectedMessageText = "You generated a Javascript alert";
	        System.out.println(ExpectedMessageText);
	        dr.switchTo().alert().dismiss();
	        Thread.sleep(3000);
	        dr.switchTo().alert().accept();
	        WebElement midname = dr.findElement(By.name("MiddleName"));
	        
	        ShowClass.showClassMethod(dr,midname);
	        midname.sendKeys("Kushwaha");
	        Thread.sleep(3000);
	        dr.quit();

	}
			
}

