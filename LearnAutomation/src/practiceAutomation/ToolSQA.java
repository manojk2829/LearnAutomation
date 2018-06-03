package practiceAutomation;


import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ToolSQA {
    @Test
	public void ToolsQATesting() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\ChromeDriver\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname")).sendKeys("Neha");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Singh");
		WebElement RbtnSex = driver.findElement(By.xpath("//input[@value='Female'][@name='sex']"));
		if(!RbtnSex.isSelected()){
			RbtnSex.click();
		}
		WebElement RbtnExp = driver.findElement(By.xpath("//input[@id='exp-4'][@value='5'][@name='exp']"));
		if(!RbtnExp.isSelected()){
			RbtnExp.click();
		}
		driver.findElement(By.xpath("//input[@type='checkbox'][@value='Automation Tester']")).click();
		driver.findElement(By.xpath("//input[@value='Selenium Webdriver'][@name='tool']")).click();
		
		
		Select dropdoun = new Select(driver.findElement(By.xpath("//Select[@id='continents'][@name='continents']")));
		dropdoun.selectByVisibleText("Africa");
		Select listbox = new Select(driver.findElement(By.xpath("//Select[@id='selenium_commands']")));
		listbox.selectByVisibleText("Wait Commands");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[3]/td[4]/a")).click();
		String msg = driver.getTitle();
		System.out.println(msg);
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try{
	    // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("D:/ToolsQA/PracticeFile.jpg"));
		}
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 }
		driver.findElement(By.xpath("//a[@href='http://20tvni1sjxyh352kld2lslvc.wpengine.netdna-cdn.com/wp-content/uploads/2014/04/OnlineStore.zip']")).click();
		driver.close();
	}
}
