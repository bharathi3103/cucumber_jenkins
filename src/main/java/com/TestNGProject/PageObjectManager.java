package com.TestNGProject;

import org.openqa.selenium.support.PageFactory;

public class PageObjectManager extends Methods{
	
	private PageObjectManager() {
		PageFactory.initElements(driver, this);
	}
	private static PageObjectManager pom;
	public static  PageObjectManager getPom() {
		pom = new PageObjectManager();
		return pom;
	}
	private HomePage hp;

	public HomePage getHp() {
		hp=new HomePage();
		return hp;
	}
	     
	
	
	
	     
	     
}
	
	
