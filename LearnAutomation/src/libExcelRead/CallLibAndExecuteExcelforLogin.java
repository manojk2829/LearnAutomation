package libExcelRead;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CallLibAndExecuteExcelforLogin {
   WebDriver dr;
   @Test(dataProvider="workdata")
	public void CallLibAndExecuteExcel(String user, String pass){
    	ChromeOptions op = new ChromeOptions();
 		op.addArguments("chrome.switch","--disable-extensions");
 		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\ChromeDriver\\chromedriver.exe");
 		dr = new ChromeDriver(op);
 		dr.manage().window().maximize();
 		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 		dr.get("http://demosite.center/wordpress/wp-login.php");
 		dr.findElement(By.id("user_login")).sendKeys(user);
 		dr.findElement(By.id("user_pass")).sendKeys(pass);
 		dr.findElement(By.id("wp-submit")).click();
 		System.out.println(dr.getTitle());
 		Assert.assertTrue(dr.getTitle().contains("Dashboard"), "Validation fail.....");
    }
   
   @AfterMethod
   public void teardown(){
	   dr.close();
   }
   
   @DataProvider(name="workdata")
   public Object[][] ExecutedatainApplication(){
	   LibExcelRead getdatafromExcel = new LibExcelRead("C:\\Users\\ti01045\\Desktop\\ReadExcel\\NewDataSheet.xlsx");
	   int rowcount = getdatafromExcel.rowcountLibFile(1);
	   Object[][] data = new Object[rowcount][2];
	   for(int i=0;i<rowcount;i++){
	   data[i][0] = getdatafromExcel.getdatafromExcel(1, i, 0);
	   data[i][1] = getdatafromExcel.getdatafromExcel(1, i, 1);
   }
	   return data;
 }
}
