package demoToolsQA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Implicit_Wait {

	public static void main(String[] args) {
		WebDriver ff = new FirefoxDriver();
		ff.get("http://google.com");
		ff.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
		try{
			WebElement element = ff.findElement(By.id("lst-ib"));
			System.out.println(element + "I got the ID element");
			ff.quit();
	
		}catch(Exception e){
			System.out.println("Element is not found on page");
		}
		
		
	}

}
