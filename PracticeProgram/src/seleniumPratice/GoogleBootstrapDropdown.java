package seleniumPratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GoogleBootstrapDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/SignUp?");
		driver.findElement(By.xpath("//div[@title='Gender']")).click();
		
		List<WebElement> olists=driver.findElements(By.xpath("//div[contains(@class,'goog-menuitem-content')]"));
	    System.out.println(olists.size());
	    
	    for(int i=0; i<olists.size();i++)
		 {
				System.out.println(olists.get(i).getText());
				   
				
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
