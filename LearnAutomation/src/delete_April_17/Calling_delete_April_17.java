package delete_April_17;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Delete_BaseClass.Xls_Reader;

public class Calling_delete_April_17 extends delete_Base_April{
   String testCaseName = "TestC";
   @Test(dataProvider="getUtilData")
   public void loginCare(Hashtable<String,String> tab) throws Exception{
	   test = ext.startTest("Calling_delete_April_17");
	   if(!utildataClass.isRunnable(xls,testCaseName) || tab.get("Runmode").equals("N")){
		   test.log(LogStatus.SKIP,"Test Skipped when Run mode -- N ");
		   throw new SkipException("Test Skipped because Run mode -- N ");
	   }
	   openBro(tab.get("Browser"));
	   navigate("CareURL");
	   typeLogin_User("loginUser_name", tab.get("col1"));
	   typeLogin_password("Password_name", tab.get("col2"));
	   System.out.println("Care Login Succesfully.....");
	   ScreenShot1();
	   Click_Login("Click_xpath");
	   ScreenShot1();
	   Thread.sleep(3000);
	   dr.quit();
   }
   
   @AfterMethod
   public void tearDown(){
	   ext.endTest(test);
	   ext.flush();
   }

   @DataProvider
   public Object[][] getUtilData(){
	   initialize();
	   xls = new Xls_Reader(pro.getProperty("ExcelPath"));
	   return utildataClass.getutildata(xls, testCaseName);
   }
}
