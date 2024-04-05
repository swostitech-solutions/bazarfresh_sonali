package com.estore.qa.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.estore.qa.pages.EStoreAddToCartPage;
import com.estore.qa.pages.EStoreRegistrationPage;

public class AddToCartTest  extends com.estore.qa.basetest.BaseTest {
	
	EStoreAddToCartPage addtocartpage;
	@BeforeMethod
	public void setUP()
	{
		initialization();
		addtocartpage=new EStoreAddToCartPage();
	    		 
	}
	
	@Test
	public void VerifyAddToCartTest ()
	{
		addtocartpage.ClickOnShopeByCategory();
		addtocartpage.ClickOnGroceriesAndKirana();
		addtocartpage.ClickOnAddAlmonds();
		addtocartpage.ClickOnAddAmulButter();
		addtocartpage.ClickOnMyBasket();
		addtocartpage.ClickOnCkeckOut();
		

		

	}
}

