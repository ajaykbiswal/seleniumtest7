package com.wordpress.pages.Normal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyLogin {
	
	@Test
	public void VerifyToLogin(){
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		LoginPage opage=new LoginPage(driver);
		
		opage.Login("admin", "demo123");
		
		driver.quit();
		
	}

}
