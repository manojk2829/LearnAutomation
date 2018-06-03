package studyPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewtoursDemoaut {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.get("http://newtours.demoaut.com/");
		WebElement username = dr.findElement(By.name("userName"));
		HighLightClass.highlight(dr, username);
		username.sendKeys("qqqq");
		
		WebElement Pass = dr.findElement(By.name("password"));
		HighLightClass.highlight(dr, Pass);
		Pass.sendKeys("qqqq");
		
		WebElement login = dr.findElement(By.name("login"));
		HighLightClass.highlight(dr, login);
		login.click();
		System.out.println(dr.getTitle());
		System.out.println("Done.....");
   
		// radio Button ....
		WebElement radio = dr.findElement(By.xpath("//input[@value='oneway']"));
		Thread.sleep(2000);
		HighLightClass.highlight(dr, radio);
		if(!radio.isSelected()){
			radio.click();
		}
		// Select Drop Down list box....
		Select listForm = new Select(dr.findElement(By.xpath("//select[@name='fromPort']")));
		listForm.selectByVisibleText("Frankfurt");
		
		// Find number of Link
		List <WebElement> link = dr.findElements(By.tagName("a"));
		System.out.println(link.size());
		 for(int i=0;i<link.size();i++){
			 System.out.println(link.get(i).getText());
		 }
		System.out.println("All link name displayed successfully.....");
		dr.quit();
   }
}
