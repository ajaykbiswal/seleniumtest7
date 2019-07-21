package seleniumPratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BootstrapDropdown_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		List<WebElement> olists=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//li/a//label"));
	    System.out.println(olists.size());
	    
	    for(int i=0; i<olists.size();i++)
		 {
				System.out.println(olists.get(i).getText());
				   if(!olists.get(i).isSelected())
					olists.get(i).click();
				
				
			}
    	    
	    
//		for(int i=0; i<olists.size();i++)
//		{
//			System.out.println(olists.get(i).getText());
//			
//			if(olists.get(i).getText().contains("Angular")){
//				
//				olists.get(i).click();
//				 break;
//				
//			}
//			
//		}
		
		driver.close();	

	}

}
