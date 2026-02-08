package com.pageobjectmanager;

import com.pageobjectmodel.LoginPage;
import com.pageobjectmodel.SearchPage;
import com.utility.FileReaderManager;

public class PageObjectManger {
  private static PageObjectManger pageObjectManger;
  private FileReaderManager fileReader;
  private LoginPage loginPage;
  private SearchPage searchPage;
  
  public FileReaderManager getFileReader() {
	  if(fileReader==null) {
		  fileReader=new FileReaderManager();
  }
  return fileReader;
  }
  public static PageObjectManger getPageObjectManager() {
	  if(pageObjectManger==null) {
		  pageObjectManger=new PageObjectManger();
	  }
	  return pageObjectManger;
	  }
  public LoginPage getLoginPage() {
	  if(loginPage==null) {
		  loginPage=new LoginPage();
	  }
	  return loginPage;
	  }
  
public SearchPage getSearchPage() {
	if(searchPage==null) {
		searchPage=new SearchPage();
	}
	return searchPage;
}
	}

	  

  

