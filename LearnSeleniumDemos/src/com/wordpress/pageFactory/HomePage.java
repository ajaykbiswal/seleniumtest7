package com.wordpress.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver ldriver)
	{
		
		this.driver=ldriver;
	}
	
	
	@FindBy(id="user_login")
	WebElement userName;
    
	@FindBy(how=How.XPATH,using="//input[@id='user_pass']") 
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//input[@id='wp-submit']") 
	WebElement login_btn;
	
	
	public void login_wordPress(String userId,String pass)
	{
		userName.sendKeys(userId);
		password.sendKeys(pass);
		login_btn.submit();
		
	}
}
