package crossBrowserTesting;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	WebDriver dr;
	@Test
	@Parameters("browser")
	public void crossbrowserMethod(String browsername) throws InterruptedException, IOException{
		if(browsername.equalsIgnoreCase("chrome")){
			ChromeOptions op = new ChromeOptions();
			op.addArguments("chrome.switch","--disable-extensions");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\ChromeDriver\\chromedriver.exe");
			dr = new ChromeDriver(op);
			dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			dr.get("http://executeautomation.com/demosite/index.html");
		}
		if(browsername.equalsIgnoreCase("firefox")){
			dr = new FirefoxDriver();
			dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			dr.get("http://executeautomation.com/demosite/index.html");
		}

		//String actualTitle = dr.getTitle();
		System.out.println(dr.getTitle());
		Thread.sleep(3000);
		
		Select  listTitle = new Select(dr.findElement(By.xpath("//select[@id='TitleId']")));
		listTitle.selectByVisibleText("Ms.");

		WebElement firstname = dr.findElement(By.id("FirstName"));
		HighLightClass.highLightMethod(dr, firstname);
		firstname.sendKeys("Manoj Kushwaha");

		WebElement radio = dr.findElement(By.xpath("//input[@value='female']"));
		if(!radio.isSelected()){
			radio.click();
		}
		List <WebElement> link = dr.findElements(By.tagName("a"));
		System.out.println(link.size());
		for(int i=0;i<link.size(); i++){
			System.out.println(link.get(i).getText());
		}
		Thread.sleep(3000);
		dr.findElement(By.linkText("HtmlPopup ")).click();
		for(String popupwindow : dr.getWindowHandles()){
			dr.switchTo().window(popupwindow);
			WebElement textBox = dr.findElement(By.id("MiddleName"));
			HighLightClass.highLightMethod(dr, textBox);
			textBox.sendKeys("Kushwaha");
			dr.close();
		}

		for(String oldpopup : dr.getWindowHandles()){
			dr.switchTo().window(oldpopup);
			WebElement checkbox = dr.findElement(By.id("hindi"));
			HighLightClass.highLightMethod(dr, checkbox);
			checkbox.click();
		}
		
	}   
}
