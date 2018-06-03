package webBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathofClass {

	public static void main(String[] args) {
		// How to create Xpath Of Class Footer
		// How to find page Title Name -- Header Name
		WebDriver GC = new FirefoxDriver();
		GC.get("http://newtours.demoaut.com");
		GC.manage().window().maximize();
		System.out.println(GC.getTitle());
		System.out.println(GC.findElement(By.xpath("//div[@class='footer']")).getText());
        GC.quit();

	}

}
