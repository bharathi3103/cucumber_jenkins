package com.TestNGProject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRun extends Methods {
	
	
	@BeforeMethod
	private void Browserlaunch() {   
		launchBrowser("chrome");
		getUrl("https://google.com/");
	}
	
	@Test
	private void getData() {
		 driver.findElement(By.name("q")).sendKeys("chennai",Keys.ENTER);
		
 }

	@Test
   private void getTheData() {
	   driver.findElement(By.name("q")).sendKeys("kerala",Keys.ENTER);
   }
	@AfterTest
 private void TakesScreenShot() throws IOException, InterruptedException {
	Thread.sleep(2000);
		TakeScreenshot("google");
	

	}
}

