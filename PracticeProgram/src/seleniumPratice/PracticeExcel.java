package seleniumPratice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PracticeExcel {

	public static void main(String[] args) throws IOException {
		
		String filepath="D:\\ExcelDatafile\\Login3.xlsx";
		File src=new File(filepath);
		FileInputStream ofile=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(ofile);
		XSSFSheet osheet=wb.getSheetAt(0);
		for(int i=0;i<osheet.getLastRowNum();i++){
			System.out.println(osheet.getRow(i).getCell(0).getStringCellValue());
			System.out.println(osheet.getRow(i).getCell(1).getStringCellValue());
		}
		
		osheet.getRow(4).createCell(5).setCellValue("3893");
		FileOutputStream ofiles=new FileOutputStream(src);
		wb.write(ofiles);
		wb.close();

	}

}
