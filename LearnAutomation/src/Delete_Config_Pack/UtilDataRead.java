package Delete_Config_Pack;
import java.util.Hashtable;

import Delete_BaseClass.Xls_Reader;

public class UtilDataRead {
   public static Object[][] getTestDataData(Xls_Reader xls, String testCase){
	   String sheetName = "TestData";
	   int TestStartRow =1;
    	while(!xls.getCellData(sheetName, 0, TestStartRow).equals(testCase)){
			TestStartRow++;
		}
		System.out.println("Test Start row number -- > " + TestStartRow);
		int rowStartNo = TestStartRow+2;
		int colStartNo = TestStartRow+1;
		int row = 0;
		while(!xls.getCellData(sheetName, 0, rowStartNo+row).equals("")){
			row++;
		}
		System.out.println("Row Start row number -- > " + row);
		int col = 0;
		while(!xls.getCellData(sheetName, col, colStartNo).equals("")){
			col++;
		}
		System.out.println("Col Start col number -- > " + col);
		
		Object[][] data = new Object[row][1];
		Hashtable<String,String> table =null;
		int RowData=0;
		for(int r=rowStartNo;r<rowStartNo+row;r++){
			table = new Hashtable<String, String>();
			for(int c=0;c<col;c++){
				String key = xls.getCellData(sheetName, c, colStartNo);
				String value = xls.getCellData(sheetName, c, r);
				table.put(key, value);
			}
			data[RowData][0]=table;
			RowData++;
		}
		return data;			
   }
   
   public static boolean isRunable(String testcase,Xls_Reader xls){
	   String sheetName = "Case";
	   int row=xls.getRowCount(sheetName);
	   for(int r=2;r<row;r++){
		   String tname= xls.getCellData(sheetName, "TestCaseID", r);
		   if(tname.equals(testcase)){
		   String runmode = xls.getCellData(sheetName, "Runmode", r);
		   if(runmode.equals("Y")){
			   return true;
		   }
		   else return false;
		   }
	   }
	   return false;
	   
   }
}
