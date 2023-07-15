package com.TestNGProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_OH extends Methods {
	 
	public OrangeHRM_OH() {
	 PageFactory.initElements(driver, this);
 } 
	@FindBy(name="username")
 private WebElement username_btn;
 
 @FindBy(name="password")
 private WebElement password_btn;
 
 @FindBy(xpath="//button[@type='submit']")
 private WebElement login_btn;

 @FindBy(xpath="//span[text()='PIM']")
 private WebElement pim_btn;

 @FindBy(xpath="//a[text()='Add Employee']")
 private WebElement addemployee;
 
 @FindBy(name="firstName")
 private WebElement firstname_btn;

 @FindBy(name="middleName")
 private WebElement middlename_btn;
 
 @FindBy(name="lastName")
 private WebElement lastname_btn;
 
 @FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
 private WebElement employee_no;
 
 
 @FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
 private WebElement save;
 
 @FindBy(xpath="//div[@class='oxd-topbar-header-title']")
 private WebElement leave;
 
public WebElement getLeave() {
	return leave;
}
public WebElement getLastname_btn() {
	return lastname_btn;
}

public WebElement getMiddlename_btn() {
	return middlename_btn;
}
public WebElement getSave() {
	return save;
}

public WebElement getFirstname_btn() {
	return firstname_btn;
}
public WebElement getAddemployee() {
	return addemployee;
}
public WebElement getPim_btn() {
	return pim_btn;
}
public WebElement getUsername_btn() {
	return username_btn;
}

public WebElement getPassword_btn() {
	return password_btn;
}

public WebElement getLogin_btn() {
	return login_btn;
}
public WebElement getEmployee_no() {
	return employee_no;


 }
}
