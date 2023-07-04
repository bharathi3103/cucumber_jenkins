package com.TestNGProject;

import org.testng.annotations.Test;

public class OrangeHrm extends Methods {

		
	@Test(priority = 1)
	public void browserlaunch() {
		launchBrowser("chrome");
		getUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority = 2)
     public void pageLogin() {
		
    	 inputToElement(PageObjectManager.getPom().getHp().getUsername_btn(),"Admin");
    	 inputToElement(PageObjectManager.getPom().getHp().getPassword_btn(),"admin123");
    	 elementToBeClick(PageObjectManager.getPom().getHp().getLogin_btn());
    	 
     }


}