package libExcelRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXLSXConfig {
	XSSFSheet sheet1;
	XSSFWorkbook wb;
	public ReadXLSXConfig(String ExcelPath){
		try {
			File src = new File(ExcelPath);
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
	} 
		catch (Exception e) {
			System.out.println(e.getMessage());			
		}
	}
	public String getData(int SheetNumber, int row, int Column){
		sheet1 = wb.getSheetAt(SheetNumber);
		String data = sheet1.getRow(row).getCell(Column).getStringCellValue();
		return data;
	}
}