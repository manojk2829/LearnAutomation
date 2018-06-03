package webBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickWebLink {

	public static void main(String[] args) throws InterruptedException {
		WebDriver FF = new FirefoxDriver();
		FF.manage().window().maximize();
		FF.get("http:newcarestage02/cms/");
		FF.findElement(By.id("txtUserName")).sendKeys("careadmin1");
		FF.findElement(By.id("txtPassword")).sendKeys("bbcl@gr1");
		FF.findElement(By.linkText("Login")).click();
		Thread.sleep(8000);
	}

}
