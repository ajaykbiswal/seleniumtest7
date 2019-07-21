package com.wordpress.pages.Normal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By user_name=By.id("user_login");
    By pass_word=By.xpath("//input[@id='user_pass']");
	By Click_login_btn=By.xpath("//input[@id='wp-submit']");
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;	
		
	}
	
	public void Login(String userName,String Pasword){
		
		driver.findElement(user_name).sendKeys(userName);
		
		driver.findElement(pass_word).sendKeys(Pasword);
		
		driver.findElement(Click_login_btn).submit();
		
	}
}
