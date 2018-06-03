package demoExcelRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LibWriteClass {
	FileInputStream fis;
	FileOutputStream fout;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	File src;
	
	public LibWriteClass(String ExcelPath){
	try
	{
		src = new File("C:\\Users\\ti01045\\Desktop\\ReadExcel\\NewDataSheet.xlsx");
		fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
	}
	catch (Exception e) 
	{
		System.out.println(e.getMessage());
	}
}
	public void writeExcel(int sheetnumber, int rownumber, int columnnumber) throws Exception
	{
		sheet = wb.getSheetAt(sheetnumber);
		int rowcount = sheet.getLastRowNum();
		for(int i=0;i<rowcount+1;i++)
		{
			sheet.getRow(i).createCell(columnnumber).setCellValue(i+1);
			fout = new FileOutputStream(src);
			wb.write(fout);
	    }
	   wb.close();
	}
}
