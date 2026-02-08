package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base_Class;

public class Test_Class extends Base_Class {
	public static void main(String[] args) throws InterruptedException {
	
		launchBrowser("chrome");
		launchurl("https://www.facebook.com/");
	    Thread.sleep(3000);
	    
	    launchUrl("https://www.google.com/");
	    
		//passInput(, "India");
	    launchUrl("https://letcode.in/dropdowns");
	    WebElement element=driver.findElement(By.id("fruits"));
	    selectOptions(element, "index", "2");
	    navigateBack();
	    Thread.sleep(3000);
	    navigateForward();
	    Thread.sleep(3000);
	    refreshPage();
	    launchUrl("https://letcode.in/alert");
	    acceptSimpleAlert();
	    Thread.sleep(3000);
	    driver.findElement(By.id("accept")).click();
	    acceptConfirmAlert();
	    Thread.sleep(3000);
	    driver.findElement(By.id("confirm")).click();
	    dissmissConfirmAlert();
	    Thread.sleep(3000);
	    driver.findElement(By.id("confirm")).click();
	    Thread.sleep(3000);
	    handlePromptAlert("Guna");
	    driver.findElement(By.id("prompt")).click();
	    
	    browserClose();
	    browserTermination();
	    
	
		
	}

}

