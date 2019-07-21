package Pratice;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandlers {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.ksrtc.in/oprs-web/");
		
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
		
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		WebElement wb=driver.findElement(By.xpath("//input[@name='fromPlaceName']"));
		
		JavascriptExecutor je=(JavascriptExecutor)driver;
//		je.executeScript("arguments[0].value='Ban';", wb);
		
		je.executeScript("document.getElementById('toPlaceName').value= 'chenai';");
		WebDriverWait wait=new WebDriverWait(driver,60);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fromPlaceName")));
		
		
		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name='fromPlaceName']")).sendKeys("BANGA");
		
//		WebDriverWait wait=new WebDriverWait(driver,60);
//		
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(locator))
		
		
		
		
	}

}
