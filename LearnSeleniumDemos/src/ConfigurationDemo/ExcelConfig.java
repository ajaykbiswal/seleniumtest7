package ConfigurationDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfig {
	
	XSSFWorkbook wb;
	XSSFSheet osheet;
	public  ExcelConfig(String filepath){
		
		
		try {
			File src=new File(filepath);
			
			FileInputStream ofile=new FileInputStream(src);
			
			wb = new XSSFWorkbook(ofile);
		
			
			
		} catch (Exception e) 
		
		{
			
			System.out.println(e.getMessage());
			
		}
		
	
	}

	
	
	
	
	public String getData(int sheet,int row,int col){
		
		osheet=wb.getSheetAt(sheet);
		
		String data=osheet.getRow(row).getCell(col).getStringCellValue();
		
		return data;
	}

	
	
public int getRow(int sheetindex){
		
		int allrows=wb.getSheetAt(sheetindex).getLastRowNum();
		System.out.println(allrows);
		allrows=allrows+1;
		
		return allrows;
	}
}
