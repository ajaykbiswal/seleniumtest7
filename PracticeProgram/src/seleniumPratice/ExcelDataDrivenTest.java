package seleniumPratice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataDrivenTest {
	XSSFWorkbook wb;
	XSSFSheet osheet;
	public ExcelDataDrivenTest(String filepath) {
		

		
		
		try 
		{
			File src=new File(filepath);
			FileInputStream ofile=new FileInputStream(src);
			wb = new XSSFWorkbook(ofile);
		
		} catch (Exception e) 
		
	    {
			
			System.out.println(e.getMessage());
		}
		 
			
		
		
	}
 public String getData(int sheetno,int row,int col)
 {
	 osheet=wb.getSheetAt(sheetno);
	 return osheet.getRow(row).getCell(col).getStringCellValue();
	  
	 
 }
	
	public int getRowcount(int sheetindex){
		
		int row=wb.getSheetAt(sheetindex).getLastRowNum();
		row++;
		return row;
		
		
	}
	
}
