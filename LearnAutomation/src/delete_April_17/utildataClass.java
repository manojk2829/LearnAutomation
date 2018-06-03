package delete_April_17;

import java.util.Hashtable;

import Delete_BaseClass.Xls_Reader;

public class utildataClass {
	
    public static Object[][] getutildata(Xls_Reader xls, String testCaseName){
		//Xls_Reader xls = new Xls_Reader("C:\\Users\\ti01045\\Desktop\\CheckList_HotFix_Environment_7_Feb_17.xlsx");
    	String sheetName = "TestData";
    	int TestStartNo = 1;
    	while(!xls.getCellData(sheetName, 0, TestStartNo).equals(testCaseName)){
    		TestStartNo++;
    	}System.out.println("row Start No --" + TestStartNo) ;
    	
    	int rowStartNo = TestStartNo+2;
    	int colStartNo = TestStartNo+1;
    	int row=0;
    	while(!xls.getCellData(sheetName, 0, rowStartNo+row).equals("")){
    		row++;
    	}System.out.println("Row --- > " + row);
    	int col=0;
    	while(!xls.getCellData(sheetName, col, colStartNo).equals("")){
    		col++;
    	}System.out.println("Col --> " + col);
    	Object[][] data = new Object[row][1];
    	Hashtable<String,String> tab = null;
    	  int RowData=0;
    	 for(int r=rowStartNo;r<rowStartNo+row;r++){
    		 tab = new Hashtable<String,String>();
    		 for(int c=0;c<col;c++){
    			 String key = xls.getCellData(sheetName, c, colStartNo);
    			 String value = xls.getCellData(sheetName, c, r);
    			 tab.put(key, value);
    		 }
    		 data[RowData][0]=tab;
    		 RowData++;
    	 }
		return data;
    }
   public static boolean isRunnable(Xls_Reader xls, String testCase){
    	String sheetName = "Case";
    	int row = xls.getRowCount(sheetName);
    	for(int r=2;r<=row;r++){
    		String tname = xls.getCellData(sheetName, "TestCaseID", r);
    		if(tname.equals(testCase)){
    			String runmode=xls.getCellData(sheetName, "Runmode", r);
    			if(runmode.equals("Y")){
    				return true;
    			}
    			else return false; 
    		}
    	}return false;
     }
  }
