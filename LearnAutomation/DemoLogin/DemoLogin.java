package DemoLogin;

import java.util.Hashtable;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import ZZ_Base_Config.Base_zzz_Class;
import ZZ_Practice.tt_dataRead_Util;

public class DemoLogin extends Base_zzz_Class {
   String testCase = "TestC";
   @Test(dataProvider="getTest")
   public void login(Hashtable<String,String> data) throws Exception{
	   
	   test = ext.startTest("DemoLogin");
	   test.log(LogStatus.INFO, "Test Start to Execute....");
       if(!tt_dataRead_Util.isRunable(xls, testCase) || data.get("Runmode").equals("N")){
    	   test.log(LogStatus.SKIP, "Test Skipped be'coz -- runmode - N");
    	   throw new SkipException("Test Skipped be'coz -- runmode - N");
       }
	   openBrowser("chrome");
	   navigate("AppURL");
	   System.out.println(dr.getTitle());
	   Registration_Link("Ragistration_xpath");
	   Thread.sleep(3000);
	   ScreenShot();
	   FirstName("FirstName_id", data.get("col1"));
	   LastName("LastName_id", data.get("col2"));
	   MaritalStatus("MaritalStatus_xpath");
	   Hobby("Hobby_xpath");
	   contry("Contry_id", "Iceland");
	   DOB_month("DOB_Month_id","10");
	   DOB_date("DOB_day_id","21");
	   DOB_year("DOB_Year_id","2010");
	   test.log(LogStatus.INFO, "Screen Shot going to capture.......");
	   ScreenShot();
	   Mobile_no("Mobile_id","7894567891");
	   Username("Username_id","Kushwaha");
	   Email("Email_name","aaa123@d2h.com");
	   Remark_text("Remark_name",data.get("col5"));
	   password("password_id", data.get("col4"));
	   Confirm_password("confirm_password_id","123@123");
	   System.out.println(dr.getTitle());
	   System.err.println("Process Done");
	   ScreenShot();
	   SaveBtn("Save_btn_name");
	   Thread.sleep(3000);
	   dr.quit();
   }
   @AfterMethod
   public void tearDown(){
	   ext.endTest(test);
	   ext.flush();
   }
   
   @DataProvider
   public Object[][] getTest(){
	    initialization();
	    xls = new Xls_Reader(pro.getProperty("ExcelPath"));
        return tt_dataRead_Util.getTestData(xls, testCase);
    }
   
}
