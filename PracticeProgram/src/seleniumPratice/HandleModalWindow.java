package seleniumPratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleModalWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("//a[@id='userAccountLink']")).click();
		driver.findElement(By.xpath("//input[@type='submit' and @title='Sign In']")).click();
		
		driver.switchTo().frame("modal_window");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("AJAYKUMAR");
	

	}

}
