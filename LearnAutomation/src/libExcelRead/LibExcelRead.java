package libExcelRead;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LibExcelRead {
	  
	 File src;
	 FileInputStream fis;
	 XSSFWorkbook wb;
	 XSSFSheet sheet1;
	public LibExcelRead(String ExcelPath){
		try {
			src = new File("C:\\Users\\ti01045\\Desktop\\ReadExcel\\NewDataSheet.xlsx");
			fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		   } 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}	
		public String getdatafromExcel(int Sheetnum, int rownum, int columnnum){
		sheet1 = wb.getSheetAt(Sheetnum);
		String data = sheet1.getRow(rownum).getCell(columnnum).getStringCellValue();
		System.out.println(data);
				return data;
	}
	    
	    public int rowcountLibFile(int sheetnumber){
	    	int rownumber = sheet1.getLastRowNum();
	    	rownumber = rownumber+1;
	    	return rownumber;
	    }

}

