package com.TestNGProject;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

import static org.testng.Assert.assertEquals;

import org.junit.runners.Parameterized.Parameters;

   public class Runner_page extends Methods {
		
    	@Test(priority = 1)
		private void page_Launch() throws InterruptedException {
			launchBrowser("chrome");
			getUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(5000);
//		String actual=driver.getCurrentUrl();
//		String expected=("https://opensource-demo.orangehrmlive.com/web/index.php/login");
//		assertEquals(actual,expected);
    	}
	@Test(dependsOnMethods="page_Launch")    
			
		private void page_Login() throws InterruptedException {   
			Thread.sleep(2000);
	    	 inputToElement(PageObjectManager1.getPm().getHr().getUsername_btn(),"Admin");
	    	 inputToElement(PageObjectManager1.getPm().getHr().getPassword_btn(),"admin123");
	    	 elementToBeClick(PageObjectManager1.getPm().getHr().getLogin_btn());
	    	 elementToBeClick(PageObjectManager1.getPm().getHr().getPim_btn());
	    	 elementToBeClick(PageObjectManager1.getPm().getHr().getAddemployee());
	    	 inputToElement(PageObjectManager1.getPm().getHr().getFirstname_btn(),"Cristanio");  
	    	inputToElement(PageObjectManager1.getPm().getHr().getMiddlename_btn(),"Ruban");
	    	inputToElement(PageObjectManager1.getPm().getHr().getLastname_btn(),"Livingston");
	    	inputToElement(PageObjectManager1.getPm().getHr().getEmployee_no(),"3122");
	    	//elementToBeClick(PageObjectManager1.getPm().getHr().getSwitch_on());
	    	//Thread.sleep(2000);
	    	//elementToBeClick(PageObjectManager1.getPm().getHr().getSwitch_on());
	     elementToBeClick(PageObjectManager1.getPm().getHr().getSave());
	}
//	    private void leaveApply() {
//	     elementToBeClick(PageObjectManager1.getPm().getHr().getLeave());
//    } 
	
    }

	