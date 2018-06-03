package demoExcelRead;

public class WriteExcleByLibCunstrocter {

	public static void main(String[] args) throws Exception {
		LibWriteClass writeExcleLib = new LibWriteClass("C:\\Users\\ti01045\\Desktop\\ReadExcel\\NewDataSheet.xlsx");
		writeExcleLib.writeExcel(0, 0, 7);
		System.out.println("Done....");
	}
}
