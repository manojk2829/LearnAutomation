package dataDrivenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
      WebDriver dr;
      @Test(dataProvider="workdata")     
	
	  public void dataDrivenTesting(String user, String password)
      {
    	    ChromeOptions option = new ChromeOptions();
    	    option.addArguments("chrome.switch","--disable-extensions");
    	    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\chromedriver.exe");
		    dr = new ChromeDriver(option);
			dr.manage().window().maximize();
			dr.get("http://demosite.center/wordpress/wp-login.php");
			dr.findElement(By.xpath("//input[@id='user_login']")).sendKeys(user);
			dr.findElement(By.xpath("//input[@id='user_pass']")).sendKeys(password);
			dr.findElement(By.xpath("//input[@id='wp-submit']")).click();
			System.out.println(dr.getTitle());
			Assert.assertTrue(dr.getTitle().contains("Dashboard"), "Credantial is not rights....");
     }
      
       @AfterMethod
       public void teaddown(){
    	   dr.quit();
       }
      
         @DataProvider(name="workdata")
         public Object[][] dataprovider(){
        	 Object[][] data = new Object[3][2];
        	 data[0][0] = "admin";
        	 data[0][1] = "demo1";
        	 data[1][0] = "admin";
        	 data[1][1] = "demo123";
        	 data[2][0] = "admin";
        	 data[2][1] = "demo1234";
         	 return data;
        	 
         }
 }
