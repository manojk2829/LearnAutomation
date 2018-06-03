package DemoLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Demo_App_Login {
	public WebDriver dr;
   
	@Test
	public void demologin() throws Exception{
	   System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chrome//chromedriver.exe");
	   dr = new ChromeDriver();
	   dr.manage().window().maximize();
	   dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   dr.navigate().to("http://demoqa.com/");
	   System.out.println(dr.getTitle());
	   dr.findElement(By.xpath("//li[@id='menu-item-374']/a")).click();
	   System.out.println(dr.getTitle());
	   Thread.sleep(3000);
	   
	   dr.findElement(By.id("name_3_firstname")).sendKeys("Ma");
	   dr.findElement(By.id("name_3_lastname")).sendKeys("Ku");
	   WebElement radio_btn_marital_status = dr.findElement(By.xpath("//input[@value='married']"));
	   if(!radio_btn_marital_status.isSelected()){
		   radio_btn_marital_status.click();
	   }
	   dr.findElement(By.xpath("//input[@value='cricket ']")).click();
	   Select contry = new Select(dr.findElement(By.id("dropdown_7")));
	   contry.selectByVisibleText("Iceland");
	   
	   Select DOB_Month = new Select(dr.findElement(By.id("mm_date_8")));
	   DOB_Month.selectByVisibleText("10");
	   
	   Select DOB_DAY = new Select(dr.findElement(By.id("dd_date_8")));
	   DOB_DAY.selectByVisibleText("21");
	
	   Select DOB_Year = new Select(dr.findElement(By.id("yy_date_8")));
	   DOB_Year.selectByVisibleText("2010");
	   
	   Thread.sleep(3000);
	   
	   dr.findElement(By.id("phone_9")).sendKeys("4434567890");
	   dr.findElement(By.id("username")).sendKeys("Kushwaha");
	   dr.findElement(By.name("e_mail")).sendKeys("aaa123@d2h.com");
	   dr.findElement(By.id("description")).sendKeys("Done");
	   dr.findElement(By.id("password_2")).sendKeys("sd@123@123");
	   dr.findElement(By.id("confirm_password_password_2")).sendKeys("sd@123@123");
	   String Password_Message = dr.findElement(By.id("piereg_passwordStrengtha")).getText();
	   System.out.println(Password_Message);
	   dr.findElement(By.name("pie_submit"));
	   Thread.sleep(3000);
	   dr.quit();
	
	}
}
