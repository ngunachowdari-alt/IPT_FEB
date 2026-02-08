package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.interfaceelements.LoginInterPageFaceElements;
import com.pageobjectmanager.PageObjectManger;

public class LoginPage extends BaseClass implements LoginInterPageFaceElements {
	@FindBy(xpath=Login_xpath)
	private WebElement login;
	
	@FindBy(id=username_id)
	private WebElement username;
	
	@FindBy(css=password_css)
	private WebElement password;
	
	@FindBy(xpath =signin_xpath)
	private WebElement signin;
	
	@FindBy(id=title_id)
	private WebElement title;
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	
public void validLogin() throws IOException,InterruptedException {
	clickOnElement(login);
	passInput(username,PageObjectManger.getPageObjectManager().getFileReader().getDataProperty("username"));
	passInput(password, PageObjectManger.getPageObjectManager().getFileReader().getDataProperty("passwors"));
	clickOnElement(signin);
	Thread.sleep(3000);
	getText(title);
	takeScreenshot("01_Login_Success");
 
}
}
