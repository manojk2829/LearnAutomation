package excelReadAndWrite;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXLSX {

	public static void main(String[] args) throws Exception {
		File src = new File("C:\\Users\\ti01045\\Desktop\\ReadExcel\\NewDataSheet.xlsx");
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		String data00 = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data00);
		
		String data01 = sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println(data01);
		
		String data10 = sheet1.getRow(1).getCell(0).getStringCellValue();
		System.out.println(data10);
		
		String data11 = sheet1.getRow(1).getCell(1).getStringCellValue();
		System.out.println(data11);
		
		wb.close();
		
	}
}