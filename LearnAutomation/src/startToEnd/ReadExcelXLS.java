package startToEnd;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcelXLS {

	public static void main(String[] args) throws IOException, BiffException {
	    File file = new File("C:\\Users\\ti01045\\Desktop\\Read_data_by_selenium.xls");
	    Workbook wb = Workbook.getWorkbook(file);
	    String data00 = wb.getSheet(0).getCell(0,0).getContents();
	    System.out.println(data00);
	    
	}
}
