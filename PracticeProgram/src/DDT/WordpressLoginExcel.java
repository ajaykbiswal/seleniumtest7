package DDT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import seleniumPratice.ExcelDataDrivenTest;

public class WordpressLoginExcel {
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
		
    	ExcelDataDrivenTest obj=new ExcelDataDrivenTest("D:\\SeleniumTestAutomation\\PracticeProgram\\TestDataFolder\\InputData.xlsx");
		
    	int rows=obj.getRowcount(0);
    	
    	Object[][] data=new Object[rows][2];
    	
    	for(int i=0;i<rows;i++)
    	{
    		
    		data[i][0]=obj.getData(0, i, 0);
    		
    		data[i][1]=obj.getData(0, i, 1);
    	}
		
		
		
		return data;
		
		
	}
	
	
}
