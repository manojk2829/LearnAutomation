package openBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalanderDateFind {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\ChromeDriver.exe");
		WebDriver GC = new ChromeDriver();
		GC.get("http://www.redbus.in");
		GC.manage().window().maximize();
		GC.findElement(By.xpath("//input[@id='txtOnwardCalendar']")).click();
		List <WebElement> dates = GC.findElements(By.xpath("//div[@class='rbcal_txtReturnCalendar']/table[1]//td']"));
		System.out.println(dates);
		
		
		
		
		
	}

}
