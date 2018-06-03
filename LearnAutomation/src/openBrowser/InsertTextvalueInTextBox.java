package openBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InsertTextvalueInTextBox {

	public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\ChromeDriver.exe");
				WebDriver GC = new ChromeDriver();
				GC.get("http://newtours.demoaut.com/");
				GC.manage().window().maximize();
				GC.findElement(By.linkText("Register here")).click();
				GC.findElement(By.xpath("//input[@name='firstName']")).sendKeys("manoj");
				GC.findElement(By.name("lastName")).sendKeys("Kushwaha");
				GC.findElement(By.name("phone")).sendKeys("9311245574");
				GC.findElement(By.xpath("//input[@id='userName'][@name='userName']")).sendKeys("manojk2829@mail.com");
				GC.findElement(By.xpath("//input[@name='address1']")).sendKeys("c-Delhi");
				GC.findElement(By.name("city")).sendKeys("Delhi");
				Select Country = new Select(GC.findElement(By.xpath("//select[@name='country']")));
				Country.selectByVisibleText("MEXICO");;
				Thread.sleep(2000);
				GC.findElement(By.xpath("//input[@name='register']")).click();
	}
	}

