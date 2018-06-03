package webBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkFind {

	public static void main(String[] args) throws InterruptedException {
		// How to find all Link on Page.
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com");
		Thread.sleep(2000);
		List <WebElement> links = driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
			System.out.println(links.get(i).getText());
		Thread.sleep(5000);
		driver.close();
		
			}

}
