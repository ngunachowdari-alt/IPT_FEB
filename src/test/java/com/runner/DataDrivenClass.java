package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.ReadExcelData;

public class DataDrivenClass {

public static void main(String[] args)  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.Youtube.com");
         String userName = ReadExcelData.getParticularRowData(1,0);
         String searchText = ReadExcelData.getParticularRowData(1,1);
 		driver.findElement(By.name("search_query")).sendKeys(searchText);
 		driver.findElement(By.name("search_query")).sendKeys(Keys.ENTER);
}
}