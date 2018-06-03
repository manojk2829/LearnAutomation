package demoExcelRead;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadByLoop {

	public static void main(String[] args) throws Exception {
		File src = new File("C:\\Users\\ti01045\\Desktop\\ReadExcel\\NewDataSheet.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rownum = sheet.getLastRowNum();
		int columnNum = sheet.getRow(0).getLastCellNum();
		System.out.println(rownum);
		for(int i=0;i<rownum+1;i++){
			for(int j=0;j<columnNum;j++){
				String Rowdata = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(Rowdata + " | ");
			}
			System.out.println(" ");
			wb.close();
		}
	}
}
