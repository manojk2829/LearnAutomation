package startToEnd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
   @Test
   public static void dragAndDrop(){
	   WebDriver dr = new FirefoxDriver();
	   dr.manage().window().maximize();
	   dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   dr.get("http://executeautomation.com/demosite/index.html");
	   dr.findElement(By.xpath("//span[contains(.,'Drag and Drop')]")).click();
	   // Drag and Drop....
	   WebElement source = dr.findElement(By.xpath("//li[@id='item2']"));
	   WebElement destination = dr.findElement(By.xpath("//li[@id='item2']"));
	   
	   Actions act = new Actions(dr);
	   act.dragAndDrop(source, destination).build().perform();
	   System.out.println("Swap Done.......");

}
}
