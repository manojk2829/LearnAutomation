package crossBrowserTesting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighLightClass {
    public static void highLightMethod(WebDriver dr, WebElement element) throws IOException{
    	JavascriptExecutor js = (JavascriptExecutor)dr;
        js.executeScript("arguments[0].setAttribute('style','background:yellow; border:2px solid red;');", element);
        
        File src = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\ti01045\\Desktop\\ReadExcel\\A.jpg"));
    	try{
    		Thread.sleep(1000);
    	}
    	catch(InterruptedException e){
    		System.out.println(e.getMessage());
    	}
    	
    	js.executeScript("arguments[0].setAttribute('style','border:2px solid red')", element);
    }
}
