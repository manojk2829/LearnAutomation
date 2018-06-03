package Delete_Config_Pack;

import java.util.Hashtable;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import Delete_BaseClass.Delete_Base_TT;
import Delete_BaseClass.Xls_Reader;

public class LoginCallAll_Method extends Delete_Base_TT {
	String testCase = "TestA";
	@Test(dataProvider="getTestdata")
	public void loginApp(Hashtable<String,String> data) throws Exception{
		test = ext.startTest("loginApp");
		test.log(LogStatus.INFO, "Start the Application for Test");
		if(!UtilDataRead.isRunable(testCase, xls) || data.get("Runmode").equals("N")){
			test.log(LogStatus.SKIP, "Skipped the Test....");
			throw new SkipException("Skipped the Test....");
		}
		openBrowser("chrome");
		navigatenew("AppURL");
		typeLogin("loginUser_name", data.get("col1"));
		typePassword("Password_name", data.get("col2"));
		ScreenShot();
		Thread.sleep(2000);
		clickBTN("Click_xpath");
		Thread.sleep(2000);
		dr.quit();
	}

	@AfterMethod
	public void tearDown(){
		ext.endTest(test);
		ext.flush();
	}

	@DataProvider
	public Object[][] getTestdata(){
		initiate();
		xls = new Xls_Reader(pro.getProperty("ExcelPath"));
		return UtilDataRead.getTestDataData(xls, testCase);
		
	}
}
