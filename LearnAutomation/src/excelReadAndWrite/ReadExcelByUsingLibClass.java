package excelReadAndWrite;

import libExcelRead.ReadXLSXConfig;

public class ReadExcelByUsingLibClass {

	public static void main(String[] args) {
		ReadXLSXConfig readxlsx = new ReadXLSXConfig("C:\\Users\\ti01045\\Desktop\\ReadExcel\\NewDataSheet.xlsx");
		System.out.println(readxlsx.getData(1, 0, 1));
		

	}

}
