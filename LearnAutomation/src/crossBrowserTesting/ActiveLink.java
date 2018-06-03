package crossBrowserTesting;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActiveLink {
        
	public static void main(String[] args) {
	    
		ChromeOptions op = new ChromeOptions();
		op.addArguments("chrome.switch", "--disable-extensions");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\ChromeDriver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver(op);
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.get("http://google.com");
		List <WebElement> link = dr.findElements(By.tagName("a"));
		System.out.println(link.size());
		for(int i=0;i<link.size();i++){
		WebElement linkurl  = link.get(i);
		String url = linkurl.getAttribute("href");
		Activelink(url);		
	}
}

	public static void Activelink(String urllink) {
		try{
			URL urllinkactive = new URL(urllink);
			HttpURLConnection httplink = (HttpURLConnection)urllinkactive.openConnection();
			httplink.setConnectTimeout(30000);
			httplink.connect();
			if(httplink.getResponseCode()==200){
				System.out.println(urllink+"--"+httplink.getResponseMessage());
			}
			if(httplink.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND){
				System.out.println(urllink+"--"+httplink.getResponseMessage()+"--"+HttpURLConnection.HTTP_NOT_FOUND);
			}
		}
      catch(Exception e){
    	  System.out.println("Fail");
      }
		
	}

}
