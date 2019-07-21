package seleniumPratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExcutorDemo {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://www.google.co.in");
	JavascriptExecutor je=(JavascriptExecutor)driver;
	je.executeScript("document.getelementbyid('lst-ib').value='Test1'");
	

	
	}
	
}

