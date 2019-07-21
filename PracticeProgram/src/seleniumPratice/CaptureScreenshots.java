package seleniumPratice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import library.Utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaptureScreenshots {
	
	
	@Test
	public void Capture_Screenshot() throws Exception{
		
	 System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 driver.get("https://www.facebook.com/");
	 
	 Utility.TakeScreenshot(driver, "Browser_Strated");
	 
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("LSJKASJJD");
	 
	 Utility.TakeScreenshot(driver, "Tyep_UserName");
	 
	 driver.quit();
	 
		
	}


}
