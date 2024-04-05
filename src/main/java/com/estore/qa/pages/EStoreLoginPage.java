package com.estore.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.estore.qa.basetest.BaseTest;

public class EStoreLoginPage extends BaseTest {
	
	@FindBy(name="email")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="(//*[@class='btn btn-primary'])[2]")
	WebElement loginButton;
	
	@FindBy(xpath="(//*[text()='Logout'])[1]")
	WebElement logout;
	
	public void EstoreLoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void logIntoEStore() {
		
		userName.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		loginButton.click();
		
		
	}
	
	public void loginOut() 
	{
		logout.click();
	}
	
	
	

}
