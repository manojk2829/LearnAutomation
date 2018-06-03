package webBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindPageTitleName {

	public static void main(String[] args) {
		// How to find page Title Name -- Header Name
		WebDriver GC = new FirefoxDriver();
		GC.get("http://newtours.demoaut.com");
		GC.manage().window().maximize();
		System.out.println(GC.getTitle());
        GC.quit();
	}

}
