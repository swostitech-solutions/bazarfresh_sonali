package com.estore.qa.pages;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.estore.qa.basetest.BaseTest;

public class EStoreRegistrationPage extends BaseTest {
	
	@FindBy(linkText="Singup")
	WebElement SignupButton;
	
	@FindBy(id="input-firstname")
	WebElement FirstName;
	
	@FindBy(id="input-lastname")
	WebElement LastName;
	
	@FindBy(id="input-email")
	WebElement Email;
	
	@FindBy(id="input-Telephone")
	WebElement Telephone;
	
	@FindBy(id="input-password")
	WebElement password;
	
	@FindBy(id="input-confirm")	
	WebElement confirm;
	
	@FindBy(name="agree")
	WebElement TermAndConditioncheckbox;
	

	@FindBy(xpath = "//*[@class='btn btn-primary']")
	WebElement ContinueButton;
	
	
	
	
	
	public EStoreRegistrationPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnSignUp() {
		
		SignupButton.click();
		
	}
	
	public void EnterFirstName(String Firstname) {
		
		FirstName.sendKeys(Firstname);
		
	}
	
	public void EnterLastName(String Lastname) {
		
		LastName.sendKeys(Lastname);
		
	}
	
	public void Enteremail(String email) {
		
		Email.sendKeys(email);
	}
	
	public void Entertelephone(String telephone) {
		
		Telephone.sendKeys(telephone);
	}
    
	public void Enterpassword(String Password) {
		
		password.sendKeys(Password);
		
		}
	
	public void Enterconfirmpassword(String confirmpassword) {
		
		confirm.sendKeys(confirmpassword);
		
	}
	
	public void clickOnAndCheckBox() {
		
		TermAndConditioncheckbox. click();
		
		
	}
	
	
	public void clickOnContinue()
	{
		ContinueButton.click();
		
		
		}
	
	
}

	
		
		
		

	
	
	
			

	
	
	
	


