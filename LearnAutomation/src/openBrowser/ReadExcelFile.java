package openBrowser;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcelFile {

	public static void main(String[] args) throws Exception {
		
		File src = new File("C:/Users/ti01045/Desktop/BRD-2016/Auto Care Flows-Revised-Sachin.xls");
		System.out.println("I found my Excel sheet---- Auto Care Flows-Revised-Sachin.xls");
		
		Workbook wb = Workbook.getWorkbook(src);
		System.out.println("Now i upload my excel sheet ---- for reading the sheet containt");
		
		String data01 = wb.getSheet(6).getCell(0,1).getContents();
		System.out.println("Now i want to read and Print the value of sheet -- " + data01);
		
		String data02 = wb.getSheet(6).getCell(0,2).getContents();
		System.out.println("Now i want to read and Print the value of sheet -- " + data02);
		
		String data11 = wb.getSheet(6).getCell(1,1).getContents();
		System.out.println("Now i want to read and Print the value of sheet -- " + data11);
		
		String data12 = wb.getSheet(6).getCell(1,2).getContents();
		System.out.println("Now i want to read and Print the value of sheet -- " + data12);
		

	}

}
