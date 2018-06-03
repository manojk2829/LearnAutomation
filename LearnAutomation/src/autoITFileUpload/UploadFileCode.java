package autoITFileUpload;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFileCode {

	public static void main(String[] args) throws Exception {
		  WebDriver dr = new FirefoxDriver();
		  dr.manage().window().maximize();
		  dr.get("C:\\Users\\ti01045\\Desktop\\UploadFile.html");
		  dr.findElement(By.xpath("//input[@id='1']")).click();
		  Thread.sleep(3000);
		  Runtime.getRuntime().exec("C:\\Users\\ti01045\\Desktop\\AutoIT\\UploadFile.exe");
			
		
	}

}
