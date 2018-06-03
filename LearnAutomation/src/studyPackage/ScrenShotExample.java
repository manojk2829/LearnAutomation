package studyPackage;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrenShotExample {

	public static void main(String[] args) throws Exception {
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\ChromeDriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://executeautomation.com/demosite/index.html");
		WebElement Initial = driver.findElement(By.id("Initial"));
		LightingClass.lightElement(driver, Initial);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try
		{
			FileUtils.copyFile(src, new File("C:/Users/ti01045/Desktop/BRD-2016/1.jpg"));
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		Initial.sendKeys("Screen");
		WebElement First = driver.findElement(By.id("FirstName"));
		HighLightClass.highlight(driver, First);
		First.sendKeys("Manoj");

		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try
		{
			FileUtils.copyFile(src1, new File("C:/Users/ti01045/Desktop/BRD-2016/2.jpg"));
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}

		List <WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		for(int i=0;i<link.size();i++){
			System.out.println(link.get(i).getText());
		}

		driver.findElement(By.linkText("HtmlPopup ")).click();
		for(String popup : driver.getWindowHandles()){
			driver.switchTo().window(popup);
			WebElement midName = driver.findElement(By.id("MiddleName"));
			LightingClass.lightElement(driver, midName);
			midName.sendKeys("Kushwaha");
			File src2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try
			{
				FileUtils.copyFile(src2, new File("C:/Users/ti01045/Desktop/BRD-2016/3.jpg"));
			}
			catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
		}
		driver.close();
		for(String oldopopup : driver.getWindowHandles()){
			driver.switchTo().window(oldopopup);
			driver.findElement(By.xpath("//input[@name='generate']")).click();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();

			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();

			File src3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try
			{
				FileUtils.copyFile(src3, new File("C:/Users/ti01045/Desktop/BRD-2016/4.jpg"));
			}
			catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
		}
		driver.get("C:\\Users\\ti01045\\Desktop\\UploadFile.html");
		driver.findElement(By.xpath("//input[@id='1']")).click();
		Runtime.getRuntime().exec("C:\\Users\\ti01045\\Desktop\\AutoIT\\UploadFile.exe");
		File src3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try
		{
			FileUtils.copyFile(src3, new File("C:/Users/ti01045/Desktop/BRD-2016/4.jpg"));
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

}


