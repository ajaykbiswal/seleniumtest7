package DDT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WordpressLogin {
	WebDriver driver;
	@Test(dataProvider="WordPressData")
	public void LogintowordPress(String UserName,String Password){
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(UserName);
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@id='wp-submit']")).submit();
		Assert.assertTrue(driver.getTitle().contains("Dashboard"), "User is not able to login with Invalid Credentials");
		System.out.println("User is able to Login Sucessfully...!");
		
		
	}
	@AfterMethod
	public void TearDown(){
		
		driver.quit();
	}
    @DataProvider(name="WordPressData")
	public Object[][] passData(){
		
		Object[][] data=new Object[3][2];
		
		data[0][0]="admin";
		data[0][1]="demo1";
		data[1][0]="admin";
		data[1][1]="demo123";
		data[2][0]="admin";
		data[2][1]="demo1234";
		
		return data;
		
		
	}
	
	
}
