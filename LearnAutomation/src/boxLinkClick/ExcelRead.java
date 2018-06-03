package boxLinkClick;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		File src = new File("C:\\Users\\ti01045\\Desktop\\New.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis); 
        XSSFSheet sheet = wb.getSheetAt(0);
        String data00 = sheet.getRow(0).getCell(0).getStringCellValue();
        System.out.println(data00);
        wb.close();
	}

}
