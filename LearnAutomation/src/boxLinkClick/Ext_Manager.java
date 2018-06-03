package boxLinkClick;

import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class Ext_Manager {
	
	public static ExtentReports extent;
	public static ExtentReports getExtentManager(){
		if(extent == null){
			Date d = new Date();
			String fileScreen = d.toString().replace(":", "_").replace(" ", "_")+".html";
			extent = new ExtentReports("D://report//"+fileScreen,true,DisplayOrder.NEWEST_FIRST);
			extent.addSystemInfo("Environment", "QA");
		}
		return extent;
	}
}
