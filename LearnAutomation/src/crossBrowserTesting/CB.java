package crossBrowserTesting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CB {
	WebDriver dr;
	@Test
	@Parameters("browser")
   public void crossb(String browsername) throws IOException{
	   if(browsername.equalsIgnoreCase("chrome")){
		   ChromeOptions options = new ChromeOptions();
		   options.addArguments("chrome.switches","--disable-extensions");
		   System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\chromedriver.exe");
		   dr = new ChromeDriver(options);
		   dr.get("http://google.com/");
		   dr.manage().window().maximize();
		   
	   }
	   if(browsername.equals("Firefox")){
		   dr = new FirefoxDriver();
		   dr.get("http://google.com/");
		   dr.manage().window().maximize();
		   
	   }
	   
	   File src = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(src, new File("C:\\Users\\ti01045\\Desktop\\a.jpg"));
	   System.out.println(dr.getTitle());
   }
}
