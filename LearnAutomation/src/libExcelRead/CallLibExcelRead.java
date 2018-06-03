package libExcelRead;

public class CallLibExcelRead {

	public static void main(String[] args) {
		LibExcelRead readexcel = new LibExcelRead("C:\\Users\\ti01045\\Desktop\\ReadExcel\\NewDataSheet.xlsx");
		readexcel.getdatafromExcel(0, 0, 0);
		System.out.println("Done....");
		
	}

}
