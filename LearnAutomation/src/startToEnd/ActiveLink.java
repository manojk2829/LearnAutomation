package startToEnd;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiveLink {

	public static void main(String[] args) {
		WebDriver dr = new FirefoxDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.get("http://google.com/");
		System.out.println(dr.getTitle());
		List <WebElement> link = dr.findElements(By.tagName("a"));
		System.out.println(link.size());
		for(int i=0;i<link.size();i++){
			WebElement element = link.get(i);
			String url = element.getAttribute("href");
			ActiveLinkFound(url);
			System.out.println(link.get(i).getText());
		}
	}

	public static void ActiveLinkFound(String url) {

		try{
			URL urllink = new URL(url);
			HttpURLConnection httpconnection = (HttpURLConnection)urllink.openConnection();
			httpconnection.setConnectTimeout(3000);
			httpconnection.connect();
			if(httpconnection.getResponseCode()==200){
				System.out.println(url+"---"+httpconnection.getResponseMessage());
			}
			if(httpconnection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
			{
				System.out.println(url+"---"+httpconnection.getResponseMessage()+"---"+HttpURLConnection.HTTP_NOT_FOUND);
			}
		}
		catch(Exception e){
           System.out.println("URL not Active.....");
		}
	}
}
