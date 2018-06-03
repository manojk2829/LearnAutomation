package studyPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighLightClass {
	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style','background:red; border:2px solid yellow;');", element);
		try{
			Thread.sleep(1000);
		   }
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		js.executeScript("arguments[0].setAttribute('style','border:2px solid white')", element);
	}
}
