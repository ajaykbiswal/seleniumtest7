package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigRedaer {
	
	Properties pro;
	
	public ConfigRedaer(){
		
		try 
		{
			File src=new File("./Configuration/config.property");
			
			FileInputStream ofile=new FileInputStream(src);
			
			pro=new Properties();
					
			pro.load(ofile);
		} 
		
		catch (Exception e) 
		
		{
			System.out.println("Excepetion is...."+e.getMessage());
			
			
		}
				
	
	}

	
	public String getChromedriver(){
		
		return pro.getProperty("ChromeDriver");
		
		
	}
	
  public String getApplicationUrl(){
		
		return pro.getProperty("URL");
		
		
	}
	
  
  public String getExcelPath(){
		
		return pro.getProperty("ExcelPath");
		
		
	}
}
