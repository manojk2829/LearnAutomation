package internetExplorer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerBrowser {

	public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\IE\\IEDriverServer.exe");
		WebDriver dr = new InternetExplorerDriver();
		dr.manage().window().maximize();
		dr.get("http://www.google.com/");
		System.out.println(dr.getTitle());
        dr.findElement(By.xpath("//input[@class='lst']")).sendKeys("QA");
        dr.findElement(By.name("btnG")).click();
        Thread.sleep(2000);
        System.out.println(dr.getTitle());
	}

}
