package ConfigurationDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ConfigRedaer;


public class WordPressOR {
	
	ConfigRedaer config;
	@BeforeTest
	public void setupconfig()
	{
		
		config=new ConfigRedaer();
		
		System.setProperty("webdriver.chrome.driver",config.getChromedriver() );
		
		System.out.println("...............SetUp is Ready............");
		
	}
	
	
	WebDriver driver;
	@Test(dataProvider="WordPressData")
	public void ChromeTest(String UserName,String Password){
		
		System.out.println("...............Test Case Started............");
		
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get(config.getApplicationUrl());
		
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(UserName);
		
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys(Password);
		
		driver.findElement(By.xpath("//input[@id='wp-submit']")).submit();
		
		Assert.assertTrue(driver.getTitle().contains("Dashboard"), "User is unable to Login with Invalid Credentials");
		
		System.out.println("User Logged Successfully...!");
		
		
		
	}

	@AfterMethod
	public void teardown(){
		
		driver.quit();
		
		System.out.println("...............Test Case Completed............");
	}
	
	@DataProvider(name="WordPressData")
	public Object[][] passdata(){
		
		ExcelConfig excelreader=new ExcelConfig(config.getExcelPath());
		
		int rows=excelreader.getRow(0);
		
		Object[][] data=new Object[rows][2];
		
		for(int i=0; i<rows;i++){
			
			data[i][0]=excelreader.getData(0, rows, 0);
			
			data[i][1]=excelreader.getData(0, rows, 1);
			
		}
		
		return data;
	}
	
	
	
	
}
