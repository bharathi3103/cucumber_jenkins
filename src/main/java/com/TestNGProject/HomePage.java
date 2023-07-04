package com.TestNGProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Methods {
 
	public HomePage() {
	 PageFactory.initElements(driver, this);
 } 
	
	
	
 @FindBy(name="username")
 private WebElement username_btn;
 
 @FindBy(name="password")
 private WebElement password_btn;
 
 @FindBy(xpath="//button[@type='submit']")
 private WebElement login_btn;

public WebElement getUsername_btn() {
	return username_btn;
}

public WebElement getPassword_btn() {
	return password_btn;
}

public WebElement getLogin_btn() {
	return login_btn;
}


 }
 
	 
 







