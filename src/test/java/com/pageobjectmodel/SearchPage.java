package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.interfaceelements.SearchPageInterfaceElements;

public class SearchPage extends BaseClass implements SearchPageInterfaceElements {


@FindBy(xpath = laptop_xpath)
private WebElement laptops;

@FindBy(xpath = sony_xpath)
private WebElement sony;

@FindBy(xpath = addcart_xpath)
private WebElement addcart;

public SearchPage() {
PageFactory.initElements(driver, this);
}

public void searchProduct() throws Exception {
clickOnElement(laptops);
clickOnElement(sony);
clickOnElement(addcart);
acceptSimpleAlert();
}
}


