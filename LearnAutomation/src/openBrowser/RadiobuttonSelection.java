package openBrowser;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class RadiobuttonSelection {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("qqqq");
		driver.findElement(By.name("password")).sendKeys("qqqq");
		driver.findElement(By.name("login")).click();
		//Radio Button
		WebElement radiobtnSex = driver.findElement(By.xpath("//input[@value='oneway']"));
		if(!radiobtnSex.isSelected())
		{
			radiobtnSex.click();
		}
		//Select Drop Down Link
		Select Departing = new Select(driver.findElement(By.name("fromPort")));
		Departing.selectByVisibleText("London");
		// All page Link -- 
		List <WebElement> links = driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++){
		System.out.println(links.get(i).getText());
		}
	}
}