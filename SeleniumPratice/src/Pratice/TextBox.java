package Pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.google.co.in");
		
		
		WebElement wb=driver.findElement(By.xpath("//input[@id='lst-ib']"));
		
		wb.sendKeys("Testing");
		
//		JavascriptExecutor je=(JavascriptExecutor)driver;
//		
//		je.executeScript("arguments[0].value='Testing';", wb);
//		
//		wb.sendKeys(Keys.SPACE);
		
		
		

	}

}
