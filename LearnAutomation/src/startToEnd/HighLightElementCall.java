package startToEnd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HighLightElementCall {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//ChromeDriver//chromedriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.manage().window().maximize();
		dr.get("http://executeautomation.com/demosite/index.html");
		/*Select Title = new Select(dr.findElement(By.xpath("//select[@id='TitleId']")));
		Title.selectByVisibleText("Ms.");*/
		WebElement FirstName = dr.findElement(By.xpath("//input[@id='FirstName']"));
		HighLightElement.highLightElement(dr, FirstName);
		FirstName.sendKeys("ManojKushwaha");
		

	}

}
