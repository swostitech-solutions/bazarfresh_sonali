package com.estore.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.estore.qa.basetest.BaseTest;

public class EStoreAddToCartPage extends BaseTest{
	
	@FindBy(xpath ="//*[@class='menu-bar collapsed']")
	WebElement ShopeByCategory;
	
	@FindBy(linkText  ="Groceries & Kirana")
	WebElement GroceriesAndKirana;
	
	@FindBy(xpath ="//*[@id='add-cart-473']")
	WebElement AddAlmonds;
	
	@FindBy(xpath ="//*[@id='add-cart-475']")
	WebElement AddAmulButter;

	@FindBy(xpath ="//*[@class='btn btn-inverse btn-block btn-lg dropdown-toggle active']")
	WebElement MyBasket;
	
	@FindBy(xpath ="//*[@class='checkout']")
	WebElement CheckOut;
	
	
	

	
	
	
	public void EstoreAddToCartPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnShopeByCategory() {
		
		ShopeByCategory.click();
	}
		
		
		public void ClickOnGroceriesAndKirana() {
		
		GroceriesAndKirana.click();
		
		}
		

		public void ClickOnAddAlmonds() {
		
			AddAlmonds.click();
		
		}

		public void ClickOnAddAmulButter() {
		
			AddAmulButter.click();
		
		}
		

		public void ClickOnMyBasket() {
		
			MyBasket.click();
		
		}

		

		public void ClickOnCkeckOut() {
		
			CheckOut.click();
		
		}
		

		
		
	}
	
	
	


