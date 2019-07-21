package seleniumPratice;

public class CallingExcelfile {

	public static void main(String[] args) {
		
		Excelconfig obj=new Excelconfig("D:\\ExcelDatafile\\Login3.xlsx");
		System.out.println(obj.getRowcount(0, 2, 1));
		
		
	}

}
