package startToEnd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PopUpHandel {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//ChromeDriver//chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://executeautomation.com/demosite/index.html");
		Select Title = new Select(dr.findElement(By.xpath("//select[@id='TitleId']")));
		Title.selectByVisibleText("Ms.");
		WebElement radio = dr.findElement(By.xpath("//input[@name='Female']"));
		if(!radio.isSelected()){
			radio.click();
		}
		System.out.println(dr.getTitle());
		dr.findElement(By.linkText("HtmlPopup ")).click();
		dr.manage().window().maximize();
		for(String popup : dr.getWindowHandles()){
			dr.switchTo().window(popup);
		}
		WebElement username  = dr.findElement(By.xpath("//input[@id='FirstName']"));
		HighLightElement.highLightElement(dr, username);
		username.sendKeys("ManojKushwaha");
		Select Country = new Select(dr.findElement(By.xpath("//select[@name='Country']")));
		Country.selectByVisibleText("Singapore");
		System.out.println(dr.getTitle());
		dr.close();
		for(String oldwindow : dr.getWindowHandles()){
			dr.switchTo().window(oldwindow);
		}
		
		//Drag and Drop....
		dr.findElement(By.xpath("//span[contains(.,'Drag and Drop')]")).click();
		
		WebElement source = dr.findElement(By.xpath("//li[@id='item2']"));
		WebElement destination = dr.findElement(By.xpath("//li[@id='item4']"));
		
		Actions act = new Actions(dr);
		act.dragAndDrop(source, destination).build().perform();
		System.out.println("Done...");
		Thread.sleep(3000);
		dr.close();
	}
}
