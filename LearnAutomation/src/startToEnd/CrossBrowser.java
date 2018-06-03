package startToEnd;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	   WebDriver driver;
       @Test
       @Parameters ("browser")
       public void crossbrowser(String browsername) throws InterruptedException, IOException{
    	   if(browsername.equalsIgnoreCase("chrome")){
    		   System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//ChromeDriver//chromedriver.exe");
    		   driver = new ChromeDriver();
    		   driver.manage().window().maximize();
    		   driver.get("http://google.com");    		   
    	   }
    	   else if(browsername.equalsIgnoreCase("firefox")){
    		   
    		   driver = new FirefoxDriver();
    		   driver.manage().window().maximize();
    		   driver.get("http://newtours.demoaut.com/");  
    	   } 
    	   driver.getTitle();
    	   List <WebElement> link = driver.findElements(By.tagName("a"));
    	   System.out.println(link.size());
    	   for(int i=0;i<link.size();i++){
    		   WebElement element = link.get(i);
    		   String url = element.getAttribute("href");
    		   ActiveLink(url);
    		   System.out.println(link.get(i).getText());
       	   }
    	   Thread.sleep(10000);
    	  driver.quit(); 
       }
	public void ActiveLink(String url){
	  
		try
		{
			URL urllink = new URL(url);
			HttpURLConnection httpconnection =(HttpURLConnection)urllink.openConnection();
			httpconnection.setConnectTimeout(3000);
			httpconnection.connect();
			if(httpconnection.getResponseCode()== 200){
				System.out.println(url+"--"+httpconnection.getResponseMessage());
			}
			if(httpconnection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND){
				System.out.println(url+"--"+httpconnection.getResponseMessage()+"--"+HttpURLConnection.HTTP_NOT_FOUND);
			}
		}
		catch(Exception e){
			System.out.println("Fail....");
		}
	}
}
