package com.estore.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.estore.qa.basetest.BaseTest;
import com.estore.qa.pages.EStoreLoginPage;

public class LoginTest extends BaseTest{
	
	  EStoreLoginPage loginPage;
	  
	  @BeforeMethod
	  public void setup()
	  {
		  initialization();
		  loginPage=new EStoreLoginPage();
	  }
	  
	  @Test(priority = 1)
	  public void VerifyLoginIntoApplication()
	  {
		  loginPage.logIntoEStore();
	  }
	  
	  
	  @Test(priority = 2)
	  public void VerifyLogOut() throws InterruptedException
	  {
		  loginPage.logIntoEStore();
		  loginPage.loginOut();
		  Thread.sleep(ThreadSleepTime);
		  // This is validation for Log out functionality.
	  }
	  
	  
	  @AfterMethod
	  public void tearDown()
	  {
		  driver.quit();
	  }
		
		


}
