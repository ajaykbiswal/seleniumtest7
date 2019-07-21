package library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Utility {
	
	
	public static void TakeScreenshot(WebDriver driver,String screenshotName){
		
		
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			 
			 File src=ts.getScreenshotAs(OutputType.FILE);
			 
			 FileUtils.copyFile(src, new File("./Screenshots/"+screenshotName+".png"));
		} 
		
		catch (Exception e) 
		
		{
			
			System.out.println(e.getMessage());
			
		} 
	}

}
