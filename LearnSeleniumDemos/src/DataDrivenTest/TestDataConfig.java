package DataDrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataConfig {
	
	XSSFWorkbook wb;
	XSSFSheet osheet;
	public TestDataConfig(String filepath){
	
		try 
		{
			File src=new File(filepath);
			
			FileInputStream ofile=new FileInputStream(src);
			
			wb = new XSSFWorkbook(ofile);
		}  
		catch (Exception e) 
		
		{
			
			System.out.println(e.getMessage());
		}
		
	}
	
	
	public String getValue(int sheet,int row,int col)
	{
	
		   osheet=wb.getSheetAt(sheet);
		   return osheet.getRow(row).getCell(col).getStringCellValue();
	
	}
	
	public int getrowCount(int sheetno)
	{
	
		  int r=wb.getSheetAt(sheetno).getLastRowNum();
		  r=r+1;
		  return r;
	
	}
	
	
}
