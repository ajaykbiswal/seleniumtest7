package seleniumPratice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		String filepath="D:\\ExcelDatafile\\TestData.xlsx";
		File src=new File(filepath);
		FileInputStream ofile=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(ofile);
		XSSFSheet osheet=wb.getSheetAt(0);
		osheet.getRow(4).createCell(5).setCellValue("WebDriver");
		FileOutputStream ofiles=new FileOutputStream(src);
		wb.write(ofiles);
		wb.close();

	}

}
