package DataDrivenTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WordPressLoginOR {
	Configsetup confg;
	@BeforeTest
	public void Setup()
	{
		confg=new Configsetup();
		
		System.setProperty("webdriver.chrome.driver", confg.getChromedriver());
		
		System.out.println("................SetUp Ready..............");
	}
	
	
	WebDriver driver;
	@Test(dataProvider="wordpressdata")
	public void logintowordpress(String userName,String Password){
		
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get(confg.getApplicationURL());
		
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(userName);
		
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys(Password);
		
		driver.findElement(By.xpath("//input[@id='wp-submit']")).submit();
		
		Assert.assertTrue(driver.getTitle().contains("Dashboard"), "User is unable to login with invalid Credentials...");
		
		System.out.println("User logged Sucessfully...!");
	}
     
	@AfterMethod
	public void teardown(){
		
		driver.quit();
		
	}
	
	
	
	@DataProvider(name="wordpressdata")
	public Object[][] passdata(){
		
		TestDataConfig config=new TestDataConfig(confg.getExcelpath());
		
		int rows=config.getrowCount(0);
		
		Object[][] d=new Object[rows][2];
		
		for(int i=0;i<rows;i++)
		{
			
			d[i][0]=config.getValue(0, i, 0);
			
			d[i][1]=config.getValue(0, i, 1);
		}
		
		return d;
	}
	
	
}
