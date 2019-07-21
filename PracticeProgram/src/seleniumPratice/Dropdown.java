package seleniumPratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/account/create?");
		WebElement month_dd=driver.findElement(By.xpath(".//*[@id='usernamereg-month']"));
		Select month_dds=new Select(month_dd);
		month_dds.selectByVisibleText("June");
//		month_dds.selectByVisibleText("August");
		List<WebElement> olists=month_dds.getOptions();
		int tol_month=olists.size();
		System.out.println("Total size of the Month"+tol_month);
		for(int i=0;i<tol_month;i++){
			
			if(olists.get(i).getText().equalsIgnoreCase("August")){
				
				olists.get(i).click();
			}
			
			
		}
		
		
		
				

	}

}
