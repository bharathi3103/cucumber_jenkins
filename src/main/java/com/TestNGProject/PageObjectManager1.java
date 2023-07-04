package com.TestNGProject;

import org.openqa.selenium.support.PageFactory;

	public class PageObjectManager1 extends Methods{
		
		private PageObjectManager1() { 
			PageFactory.initElements(driver,this);
		}
		private static PageObjectManager1 pm;
		public static  PageObjectManager1 getPm() {
			pm = new PageObjectManager1();
			return pm;
		}
		private OrangeHRM_OH hr;

		public OrangeHRM_OH getHr() {
			hr=new OrangeHRM_OH();
			return hr;
}
}