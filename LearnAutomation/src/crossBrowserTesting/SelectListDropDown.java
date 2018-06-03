package crossBrowserTesting;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectListDropDown {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("chrome.switch","--disable-extensions");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\ChromeDriver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver(op);
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.get("http://executeautomation.com/demosite/index.html");
		System.out.println(dr.getTitle());
		
		Select list = new Select(dr.findElement(By.xpath("//select[@id='TitleId']")));
		list.selectByVisibleText("Ms.");
		
		WebElement firstname = dr.findElement(By.id("FirstName"));
        HighLightClass.highLightMethod(dr, firstname);
        firstname.sendKeys("Manoj Kushwaha");
        
        WebElement radio = dr.findElement(By.xpath("//input[@value='female']"));
        if(!radio.isSelected()){
        	radio.click();
        }
        List <WebElement> link = dr.findElements(By.tagName("a"));
        System.out.println(link.size());
        for(int i=0;i<link.size(); i++){
        	System.out.println(link.get(i).getText());
        }
        Thread.sleep(2000);
        dr.findElement(By.linkText("HtmlPopup ")).click();
        for(String popupwindow : dr.getWindowHandles())
        {
        	dr.manage().window().maximize();
			dr.switchTo().window(popupwindow);
        }
			WebElement textBox = dr.findElement(By.id("MiddleName"));
			HighLightClass.highLightMethod(dr, textBox);
			textBox.sendKeys("Kushwaha");
			dr.close();

			for(String oldpopup : dr.getWindowHandles())
			{
			  dr.switchTo().window(oldpopup);
			}
			WebElement midname = dr.findElement(By.id("MiddleName"));
			HighLightClass.highLightMethod(dr, midname);
			midname.sendKeys("123Kushwaha");

            WebElement checkbox = dr.findElement(By.xpath("//input[@name='Hindi']"));
            HighLightClass.highLightMethod(dr, checkbox);
            checkbox.click();
			Thread.sleep(2000);
			
			File src = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
			try{
				FileUtils.copyFile(src, new File("C:\\Users\\ti01045\\Desktop\\ReadExcel\\A.jpg"));
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
            dr.close();
  }
}
