package seleniumPratice;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelconfig {
	
	XSSFWorkbook wb;
	XSSFSheet osheet;
	public Excelconfig(String filepath){
		
		try {
			File src=new File(filepath);
			FileInputStream ofile=new FileInputStream(src);
			wb=new XSSFWorkbook(ofile);
			
			
		    } 
		catch (Exception e) 
		{
			
			System.out.println(e.getMessage());
		}
		
	}

	public String getRowcount(int sheetIndex,int rowno,int colno){
	  osheet=wb.getSheetAt(sheetIndex);
	  String data=osheet.getRow(rowno).getCell(colno).getStringCellValue();
	  return data;
		
	}
	
	
	
	
}
