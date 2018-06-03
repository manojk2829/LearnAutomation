package ZZ_Practice;

import java.util.Hashtable;
import DemoLogin.Xls_Reader;

public class tt_dataRead_Util {
  public static Object[][] getTestData(Xls_Reader xls,String testCase){
	   String sheetName = "TestData";
	   int TestStartRow = 1;
	   while(!xls.getCellData(sheetName, 0, TestStartRow).equals(testCase)){
		   TestStartRow++;
	   }
	   System.out.println("Test Start Row ---> " + TestStartRow);
	   int colStartNo = TestStartRow+1;
	   int rowStartNo = TestStartRow+2;
	   int row=0;
	   while(!xls.getCellData(sheetName, 0, rowStartNo+row).equals("")){
		   row++;
	   }
	   System.out.println("Total test Rows ---> " + row);
	   int col=0;
	   while(!xls.getCellData(sheetName, col, colStartNo).equals("")){
		   col++;
	   }
	   System.out.println("Total test col ---> " + col);
	   Object[][] data = new Object[row][1];
	   int DataRow=0;
	   Hashtable<String,String> table = null;
	   for(int r=rowStartNo;r<rowStartNo+row;r++){//12 , 4 , 3
		   table = new Hashtable<String,String>();
		   	   for(int c=0;c<col;c++){
		   	  String key = xls.getCellData(sheetName, c, colStartNo);
		      String value = xls.getCellData(sheetName, c, r);
		      table.put(key, value);
	     }
		   	   data[DataRow][0]=table;
		   	   DataRow++;
	   }
	    return data;
  }
  public static boolean isRunable(Xls_Reader xls, String ff ){
	  String sheetName= "Case";
	  int row = xls.getRowCount(sheetName);
	  for(int r=2;r<=row;r++){
		  String tname= xls.getCellData(sheetName, "TestCaseID", r);
		  if(tname.equals(ff)){
			  String runmode = xls.getCellData(sheetName, "Runmode", r);
		  if(runmode.equals("Y"))
			  return true;
		  else return false;
	  }
    }
	return false;
  }
  
 /* public static boolean isRunable(String testname,Xls_Reader xls){
		String sheetName = "Case";
		int row = xls.getRowCount(sheetName);
		for(int r=2;r<=row;r++){
			String tname = xls.getCellData(sheetName, "TestCaseID", r);
			if(tname.equals(testname)){
				String runmode = xls.getCellData(sheetName, "Runmode", r);
				if(runmode.equals("Y"))
				return true;
			}else return false;
		}
		return false;
	}*/
}
