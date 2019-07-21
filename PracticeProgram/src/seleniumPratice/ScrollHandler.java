package seleniumPratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollHandler {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		
		JavascriptExecutor je= (JavascriptExecutor)driver;
		
//		je.executeScript("scroll(0,500)");
//		Thread.sleep(3000);
//		je.executeScript("scroll(0,-500)");
		WebElement ele=driver.findElement(By.xpath("//*[@id='mCSB_2_container']/p[12]"));
		
		je.executeScript("arguments[0].scrollIntoView(true);", ele);
		
		System.out.println(ele.getText());
		
		driver.quit();
		
		
		
		

	}

}
