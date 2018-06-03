package demoExcelRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoWriteExcel {

	public static void main(String[] args) throws Exception {
		File src = new File("C:\\Users\\ti01045\\Desktop\\ReadExcel\\ReadAndWrite.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		sheet.getRow(0).createCell(5).setCellValue("Manoj");
		sheet.getRow(1).createCell(5).setCellValue("Sumit");
		
		sheet.getRow(2).createCell(5).setCellValue("Pass");
		sheet.getRow(3).createCell(5).setCellValue("Fail");
		
		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);
		System.out.println("Writen....");
		wb.close();
		
		

	}

}
