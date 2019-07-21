package DataDrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configsetup {
	
	Properties pro;
	public Configsetup(){
		
		try {
			File src=new File("./Configuration/config.property");
			
			FileInputStream ofile=new FileInputStream(src);
			
			pro=new Properties();
			
			pro.load(ofile);
		
		} 
		catch (Exception e) 
		{
			
			System.out.println("Exception is...."+e.getMessage());
		}
	}

	public String getChromedriver(){
		
		return pro.getProperty("ChromeDriver");
	}
	
    public String getApplicationURL(){
		
		return pro.getProperty("URL");
	}
	
   public String getExcelpath(){
		
		return pro.getProperty("ExcelPath");
	}
    
}
