package studyPackage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LightingClass {

	public static void lightElement(WebDriver dr, WebElement element) throws Exception {
		 JavascriptExecutor js = (JavascriptExecutor)dr;
         js.executeScript("arguments[0].setAttribute('style','background: yellow; border:2px solid red;');", element);
         try{
        	 Thread.sleep(1000);
            }
         
         catch(InterruptedException e){
        	 System.out.println(e.getMessage());
         }
         js.executeScript("arguments[0].setAttribute('style','border:2px solid black')", element);
	}

}
