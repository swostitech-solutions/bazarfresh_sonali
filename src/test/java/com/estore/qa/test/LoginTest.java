package com.estore.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bazarfresh.qa.Base.BaseTest;
import com.bazarfresh.qa.pages.BazarFreshLoginPage;

public class LoginTest extends BaseTest{
	
	  BazarFreshLoginPage loginPage;
	  
	  @BeforeMethod
	  public void setup()
	  {
		  initialization();
		  loginPage=new BazarFreshLoginPage();
	  }
	  
	  @Test(priority = 1)
	  public void VerifyLoginIntoApplication()
	  {
		  loginPage.loginIntoBazarFresh();
	  }
	  
	  
	  @Test(priority = 2)
	  public void VerifyLogOut() throws InterruptedException
	  {
		  loginPage.loginIntoBazarFresh();
		  loginPage.loginOut();
		  Thread.sleep(ThreadSleepTime);
	  }
	  
	  
	  @AfterMethod
	  public void tearDown()
	  {
		  driver.quit();
	  }
		
		


}
