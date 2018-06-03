package demoExcelRead;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LibReadClass {
	FileInputStream fis;
    XSSFWorkbook wb;
    XSSFSheet sheet;
	public LibReadClass(String ExcelPath){
     try {
			File src = new File("C:\\Users\\ti01045\\Desktop\\ReadExcel\\NewDataSheet.xlsx");
			 fis = new FileInputStream(src);
			 wb = new XSSFWorkbook(fis);
		}  
    	 catch (Exception e) {
			System.out.println(e.getMessage());
		}
      }
	public String datareadfromExcel(int Sheetnumber){
		sheet = wb.getSheetAt(Sheetnumber);
		String Exceldata = "";
		int rownumber = sheet.getLastRowNum();
		int columnnumber = sheet.getRow(0).getLastCellNum();
		for(int i=0;i<rownumber+1;i++){
			for(int j=0;j<columnnumber;j++){
				Exceldata = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(Exceldata + " | ");
				
			}
			System.out.println(" ");
		}
		return Exceldata;
	}
}