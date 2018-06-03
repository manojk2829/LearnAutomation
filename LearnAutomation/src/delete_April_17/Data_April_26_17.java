package delete_April_17;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Delete_BaseClass.Xls_Reader;

public class Data_April_26_17 {

	@Test(dataProvider="getTestdata")
	public void login(Hashtable<String,String> table){
		System.out.println(table.get("Runmode")+ "--- "+ table.get("col1")+ "--- "+ table.get("col2"));
	}
	
	@DataProvider
	   public Object[][] getTestdata(){
		   Xls_Reader xls = new Xls_Reader("C:\\Users\\ti01045\\Desktop\\CheckList_HotFix_Environment_7_Feb_17.xlsx");
		   String sheetName = "TestData";
		   String TestCaseName= "TestC";
		   int testStartRow = 1;
		   while(!xls.getCellData(sheetName, 0, testStartRow).equals(TestCaseName)){
			   testStartRow++;
		   }System.out.println("Test Row Start --- > " + testStartRow);
		   int RowStartNO = testStartRow+2;
		   int ColStartNO = testStartRow+1;
		   int row=0;
		   while(!xls.getCellData(sheetName, 0, RowStartNO+row).equals("")){
			   row++;
		   }System.out.println("Totale Row number -- > " + row);
		   
		   int col=0;
		   while(!xls.getCellData(sheetName, col, ColStartNO).equals("")){
			   col++;
		   }System.out.println("Totale col number -- > " + col);
		   
		   Object[][] data = new Object[row][1];
		   int RowData=0;
		   Hashtable<String,String> table= null;
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
}
