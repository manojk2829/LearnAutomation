package dataDrivenFrameTwo;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadConfig {
      File src;
      FileInputStream fis;
      XSSFWorkbook wb;
      XSSFSheet sheet;
	public ExcelReadConfig(String ExcelPath){
		try {
			src = new File("D:\\MYJAVA\\Myselenium\\LearnAutomation\\TestData\\NewDataSheet.xlsx");
			fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		}  catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
		public String getdata(int sheetnum, int rownum, int columnnum){
		  sheet = wb.getSheetAt(sheetnum);
		 String data =  sheet.getRow(rownum).getCell(columnnum).getStringCellValue();
		 return data; 
		}
		
		
		public int getrowcount(int sheetnumber){
			int rownumber = wb.getSheetAt(sheetnumber).getLastRowNum();
			rownumber = rownumber+1;
			 return rownumber;
		}
		
	
	}

