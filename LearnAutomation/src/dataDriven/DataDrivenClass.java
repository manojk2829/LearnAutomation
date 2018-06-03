package dataDriven;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDrivenClass {

	public static void main(String[] args) throws BiffException, IOException {
		File f  = new File("C:/Users/ti01045/Desktop/DataDriven.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet s = wb.getSheet(0);
		int rows = s.getRows();
		int columns = s.getColumns();
		String Inputdata [][]= new String [rows][columns];
		for(int i=0; i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				Cell c = s.getCell(j,i);
				Inputdata [i][j] =  c.getContents();
				System.out.println(Inputdata [i][j]);
			}
		}
	}

}
