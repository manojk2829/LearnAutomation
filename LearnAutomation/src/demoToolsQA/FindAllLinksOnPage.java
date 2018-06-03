package demoToolsQA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLinksOnPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/");
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		for(int i = 0; i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
		driver.quit();

	}

}
