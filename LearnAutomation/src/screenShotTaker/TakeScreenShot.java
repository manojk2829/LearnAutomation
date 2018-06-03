package screenShotTaker;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TakeScreenShot {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
	    option.addArguments("chrome.switch","--disable-extensions");
	    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\chromedriver.exe");
	    WebDriver dr = new ChromeDriver(option);
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.get("http://demosite.center/wordpress/wp-login.php");
		/*File src = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		try{
			FileUtils.copyFile(src, new File("C:/Users/ti01045/Desktop/googlepix.jpg"));
		}
		catch(IOException e){
			System.out.println(e.getMessage());*/
		
        File src = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
        try{
        	FileUtils.copyFile(src, new File("C:/Users/ti01045/Desktop/googlepix.jpg"));
        }
        catch(Exception e){
        	System.out.println(e.getMessage());
        }
	}

}
