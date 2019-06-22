package com.pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public static WebDriver driver;

public static WebDriver getDriver() {
	return driver;
}


public WebElement getHeaderPage() {
	return HeaderPage;
}

public WebElement getUsername_input() {
	return username_input;
}

public WebElement getPassword_input() {
	return password_input;
}

public WebElement getLogin_click() {
	return login_click;
		
}

public WebElement getVerificationName() {
	return VerificationName;
}

public WebElement getLogout() {
	return logout;
}
@FindBy(xpath="//td[text()='Existing User Login - Build 1']")
private WebElement HeaderPage;

@FindBy(xpath="//input[@id='username']")
private WebElement username_input;

@FindBy(xpath="//input[@id='password']")
private WebElement password_input;

@FindBy(xpath="//input[@id='login']")
private WebElement login_click;

@FindBy(xpath="//input[@id=\"username_show\"]")
private WebElement VerificationName;



@FindBy(xpath="//a[contains(text(),'Logout')]")
private WebElement logout;





public LoginPage(WebDriver ldriver)
{
this.driver=ldriver;
PageFactory.initElements(driver, this);
}








}
