package ConfigurationDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.ConfigRedaer;

public class TestSeleniumDemo {
	
	ConfigRedaer config;
	@BeforeTest
	public void setupconfig()
	{
		
		config=new ConfigRedaer();
		
		System.setProperty("webdriver.chrome.driver",config.getChromedriver() );
		
		System.out.println("...............SetUp is Ready............");
		
	}
	
	
	
	@Test
	public void ChromeTest(){
		
		System.out.println("...............Test Case Started............");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get(config.getApplicationUrl());
		
		driver.quit();
		
		System.out.println("...............Test Case Completed............");
	}

}
