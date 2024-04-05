package com.estore.qa.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bazarfresh.qa.Base.BaseTest;
import com.estore.qa.pages.EStoreAddToCartPage;
import com.estore.qa.pages.EStoreRegistrationPage;

public class AddToCartTest  extends BaseTest {
	
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

