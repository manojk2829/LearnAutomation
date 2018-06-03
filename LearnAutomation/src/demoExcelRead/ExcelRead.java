package demoExcelRead;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws Exception {
		File src = new File("C:\\Users\\ti01045\\Desktop\\ReadExcel\\ReadAndWrite.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		String data = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		wb.close();
		
		
	}

}
