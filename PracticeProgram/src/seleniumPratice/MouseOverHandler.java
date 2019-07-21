package seleniumPratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverHandler {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		WebElement element=driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
		List<WebElement> ele=driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
		
		for(int i=0;i<ele.size();i++){
			
			String value=ele.get(i).getAttribute("innerHTML");
			
			if(value.equalsIgnoreCase("Appium")){
				
				ele.get(i).click();
			}
		}
		

	}

}
