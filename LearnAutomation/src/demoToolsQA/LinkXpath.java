package demoToolsQA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LinkXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\ChromeDriver.exe");
		WebDriver gc = new ChromeDriver();
		gc.manage().window().maximize();
		gc.get("http://demoqa.com/");
		gc.findElement(By.linkText("Registration")).click();
		gc.findElement(By.xpath("//input[@name='first_name']")).sendKeys("First12");
		gc.findElement(By.name("last_name")).sendKeys("Last12");
		
		//Radio Button Marital
		WebElement radiobtn_Marital  = gc.findElement(By.xpath("//input[@value='married']"));
		if(!radiobtn_Marital.isSelected()){
			radiobtn_Marital.click();
		}
		gc.findElement(By.xpath("//input[@value='reading']")).click();
		
		Select Country_list = new Select(gc.findElement(By.xpath("//Select[@id='dropdown_7']")));
		Country_list.selectByVisibleText("India");
		
		Select Date_of_Birth_month = new Select(gc.findElement(By.xpath("//Select[@id='mm_date_8']")));
		Date_of_Birth_month.selectByValue("10");
		
		Select Date_of_Birth_day = new Select(gc.findElement(By.xpath("//Select[@id='dd_date_8']")));
		Date_of_Birth_day.selectByValue("25");
		
		Select Date_of_Birth_Year = new Select(gc.findElement(By.xpath("//Select[@id='yy_date_8']")));
		Date_of_Birth_Year.selectByValue("1987");
        
		gc.findElement(By.xpath("//input[@name='phone_9']")).sendKeys("9311245512");
		gc.findElement(By.xpath("//input[@id='username']")).sendKeys("FirstName321");
		gc.findElement(By.xpath("//input[@id='email_1']")).sendKeys("manoj112@d2h.com");
		gc.findElement(By.xpath("//input[@name='password'][@id='password_2']")).sendKeys("bbcl@123");
		gc.findElement(By.xpath("//input[@id='confirm_password_password_2']")).sendKeys("bbcl@123");
		gc.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(1000);
		
		List <WebElement> mylink = gc.findElements(By.tagName("a"));
		for(int i = 0; i < mylink.size();i++)
		{
			System.out.println(mylink.get(i).getText());
		}
		gc.quit();
		}
	}
