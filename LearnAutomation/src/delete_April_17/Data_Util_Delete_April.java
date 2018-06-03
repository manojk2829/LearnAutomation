package delete_April_17;

import java.util.Hashtable;
import Delete_BaseClass.Xls_Reader;

public class Data_Util_Delete_April {
	   public static Object[][] getTestdata(Xls_Reader xls,String testCase){
		   String sheetName = "TestData";
		   int testStartRow = 1;
		   while(!xls.getCellData(sheetName, 0, testStartRow).equals(testCase)){
			   testStartRow++;
		   }System.out.println("Test Row Start --- > " + testStartRow);
		   int RowStartNO = testStartRow+2;
		   int ColStartNO = testStartRow+1;
		   int row=0;
		   
		   while(!xls.getCellData(sheetName, 0, RowStartNO+row).equals("")){
			   row++;
		   }System.out.println(row);
		   int col=0;
		   while(!xls.getCellData(sheetName, col, ColStartNO).equals("")){
			   col++;
		   }System.out.println(col);
		   Object[][] data = new Object[row][1];
		   Hashtable<String,String> table = null;
		   int RowData=0;
		      for(int r=RowStartNO;r<RowStartNO+row;r++){
		    	  table = new Hashtable<String,String>();
		    	  for(int c=0;c<col;c++){
		    		  String key = xls.getCellData(sheetName, c, ColStartNO);
		    		  String value = xls.getCellData(sheetName, c, r);
		    		  table.put(key, value);
		    	  }
		    	  data[RowData][0]=table;
		    	  RowData++;
		      }
		      return data;
	   }

	   public static boolean isRunable(String testCase, Xls_Reader xls){
		   String sheetName = "Case";
		   int row = xls.getRowCount(sheetName);
		    for(int r=2;r<=row;r++){
		    	String tname = xls.getCellData(sheetName, "TestCaseID", r);
		    	if(tname.equals(testCase)){
		    		String runmode = xls.getCellData(sheetName, "Runmode", r);
		    	if(runmode.equals("Y")){
		    		return true;
		    	}else return false;
		    }
		  }
		    return false;
		   
	   }
}
