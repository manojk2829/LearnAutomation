package newWindow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class NewwindowApp{
		    public static void main(String[] args ) throws InterruptedException
		    {
		        WebDriver driver= new FirefoxDriver(); 
		        driver.get("http://172.19.4.64/MR29/CMS/Admin/index.aspx");
		        driver.manage().window().maximize();
		        Thread.sleep(4000);
		        driver.findElement(By.xpath("//input[@id='txtUserName']")).sendKeys("careteststh");
		        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("irctc@116");
		        driver.findElement(By.xpath("//a[contains(@id,'btnLogin')]")).click();
		        Thread.sleep(20000);
		        WebElement sign = driver.findElement(By.xpath(".//*[@id='treeDirectoryn25']/img"));
		        sign.click();
/*
		        Set<String> windowId = driver.getWindowHandles();    // get  window id of current window
		        Iterator<String> itererator = windowId.iterator();   

		        String mainWinID = itererator.next();
		        String  newAdwinID = itererator.next();

		        driver.switchTo().window(newAdwinID);
		        System.out.println(driver.getTitle());
		        Thread.sleep(3000);
		        driver.close();

		        driver.switchTo().window(mainWinID);
		        System.out.println(driver.getTitle());
		        Thread.sleep(2000);

		        WebElement email_id= driver.findElement(By.xpath("//*[@id='c_uname']"));
		        email_id.sendKeys("hi");
		        Thread.sleep(5000);

		        driver.close();
		        driver.quit();
		        */
		    }  
	}
