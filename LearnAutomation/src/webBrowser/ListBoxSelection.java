package webBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxSelection {

	public static void main(String[] args) throws InterruptedException {
		// HOw to Select List Box.

				WebDriver driver = new FirefoxDriver();
				driver.get("http://newtours.demoaut.com");
				driver.manage().window().maximize();
				driver.findElement(By.name("userName")).sendKeys("qqqq");
				driver.findElement(By.name("password")).sendKeys("qqqq");
				driver.findElement(By.name("login")).click();
				
				WebElement radiobtn = driver.findElement(By.xpath("//input[@value='oneway']"));
				if (!radiobtn.isSelected())
				{
					radiobtn.click();
				}
				Select Passengers = new Select(driver.findElement(By.xpath("//Select[@name='passCount']")));
				Passengers.selectByIndex(2);
				Select Departing = new Select(driver.findElement(By.xpath("//Select[@name='fromPort']")));
				Departing.selectByValue("Paris");
				Select On = new Select(driver.findElement(By.xpath("//Select[@name='fromMonth']")));
				On.selectByVisibleText("July");
							
				WebElement Service = driver.findElement(By.xpath("//input[@value='Business']"));
				if(!Service.isSelected()){
					Service.click();
					
				}
				Thread.sleep(3000);
				
				driver.close();
			}	
		}


