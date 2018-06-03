package demoExcelRead;

public class CallingConstructorReadExcel {


public static void main(String[] args) {
		LibReadClass excelread = new LibReadClass("C:\\Users\\ti01045\\Desktop\\ReadExcel\\NewDataSheet.xlsx");
		System.out.println(excelread.datareadfromExcel(0));
		
	}

}
