package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.interfaceelements.CartInterPageFaceElement;

public class CartPage extends BaseClass implements CartInterPageFaceElement {
		@FindBy(id = cart_id)
		private WebElement cart;

		@FindBy(xpath = placeorder_xpath)
		private WebElement placeorder;

		public CartPage() {
	        PageFactory.initElements(driver, this);
	    }

		public void cartCheckout() throws Exception {
			clickOnElement(cart);
			//WaitToSee();
			takeScreenshot("Checkout cart");
			clickOnElement(placeorder);
		}

	}


