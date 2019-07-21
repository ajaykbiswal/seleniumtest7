package com.wordpress.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utility.LogintoBrowser;

public class VerifyLoginPage {
	
	@Test
	
	public void VerifyLogin1(){
		
		WebDriver driver=LogintoBrowser.startBrowser("chrome", "http://demosite.center/wordpress/wp-login.php");
		
		HomePage ologin=PageFactory.initElements(driver, HomePage.class);
		
		ologin.login_wordPress("admin", "demo123");
		
		driver.quit();
		
		
		
		 
	}

}
