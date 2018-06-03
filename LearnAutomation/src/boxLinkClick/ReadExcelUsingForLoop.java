package boxLinkClick;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelUsingForLoop {

	public static void main(String[] args) throws Exception {
		File src = new File("C:\\Users\\ti01045\\Desktop\\New.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rownum = sheet.getLastRowNum();
		System.out.println(rownum);
		int columnnum = sheet.getRow(0).getLastCellNum();
		for(int i=0;i<rownum;i++){
			for(int j=0;j<columnnum;j++){
				String rowdata = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(rowdata + "      |     ");
			}
			System.out.println("  ");
		}
		wb.close();
	}

}
