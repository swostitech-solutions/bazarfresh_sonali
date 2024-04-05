package com.estore.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.estore.qa.basetest.BaseTest;
import com.estore.qa.commonutility.Xls_Reader;
import com.estore.qa.pages.EStoreRegistrationPage;

public class RegistrationTest extends BaseTest{
	EStoreRegistrationPage registrationPage;
	@BeforeMethod
	public void setUP()
	{
		initialization();
		registrationPage=new EStoreRegistrationPage();
	}
	
	@Test
	public void VerifyRegistrationTest() throws Exception
	{

		Xls_Reader reader=new Xls_Reader("D:\\Automation\\GitAutomation\\bazarfresh_sonali\\src\\main\\java\\com\\estore\\qa\\testdata\\EStoreAppdata.xlsx");
		String moduleName="Registration";
		
		String firstName=reader.getCellData(moduleName, "FirstName", 2);
		System.out.println(firstName);
		String lastName=reader.getCellData(moduleName, "LastName", 2);
		System.out.println(lastName);
		String email=reader.getCellData(moduleName, "EmailId", 2);
		System.out.println(email);
		String telephone=reader.getCellData(moduleName, "Telephone", 2);
		String password=reader.getCellData(moduleName, "Password", 2);
		String confirmpassword=reader.getCellData(moduleName, "ConfirmPassword", 2);
		
		registrationPage.clickOnSignUp();
		registrationPage.EnterFirstName(firstName);
		registrationPage.EnterLastName(lastName);
		registrationPage.Enteremail(email);
		registrationPage.Entertelephone(telephone);
		registrationPage.Enterpassword(password);
		registrationPage.Enterconfirmpassword(confirmpassword);
		registrationPage.clickOnAndCheckBox();
		registrationPage.clickOnContinue();
		Thread.sleep(10000);

		

}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	public void tearup() {
		driver.quit();
	}
	
	
}