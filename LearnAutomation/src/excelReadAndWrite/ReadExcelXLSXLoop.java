package excelReadAndWrite;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelXLSXLoop {
     public static void main(String[] arg) throws Exception{
    	 File src = new File("C:\\Users\\ti01045\\Desktop\\ReadExcel\\NewDataSheet.xlsx");
    	 FileInputStream fis = new FileInputStream(src);
    	 
    	 XSSFWorkbook wb = new XSSFWorkbook(fis);
    	 XSSFSheet sheet1 = wb.getSheetAt(0);
    	 
    	int rownumcount = sheet1.getLastRowNum();
    	System.out.println("Total number of Row -- " + rownumcount+1 );

    	for(int i=0; i<rownumcount+1;i++)
    	{
    		String data = sheet1.getRow(i).getCell(0).getStringCellValue();
    		System.out.println("Row value --- " + data );
    	}
    	 wb.close();
	 
    	 
    	 
     }
}
