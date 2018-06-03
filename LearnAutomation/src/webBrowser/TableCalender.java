package webBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableCalender {

	public static void main(String[] args) throws InterruptedException {
		// How to click Tabulated calendar.
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://redbus.in");
		
		driver.findElement(By.id("txtOnwardCalendar")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='rbcal_txtOnwardCalendar']/table[2]/tbody/tr[4]/td[3]")).click();
		
		

	}

}
