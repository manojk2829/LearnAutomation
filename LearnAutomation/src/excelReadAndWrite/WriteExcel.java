package excelReadAndWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws Exception {
		File src = new File("C:\\Users\\ti01045\\Desktop\\ReadExcel\\NewDataSheet.xlsx");
		FileInputStream  fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		sheet.getRow(0).createCell(4).setCellValue("Pass");
		sheet.getRow(1).createCell(4).setCellValue("Fail");
		sheet.getRow(2).createCell(4).setCellValue(14.85);
		sheet.getRow(3).createCell(4).setCellValue(15345);
		sheet.getRow(4).createCell(4).setCellValue(false);
		sheet.getRow(5).createCell(4).setCellValue("27/08/16");
		
		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);
		wb.close();
		System.out.println("Write successfully.....");
		

	}

}
