package com.flipkart.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Loginpage {
	/* All webelements are identified by @FindBy annotation in LoginPage */
	@FindBy(xpath = "//input[@class='_2zrpKA _1dBPDZ']")
	private WebElement Username;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement Password;
	@FindBy(className = "_1hgiYz")
	private WebElement loginText;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")
	private WebElement LoginButton;
	@FindBy(xpath = "//button[@class='_2AkmmA _29YdH8']")
	private WebElement closeButton;

	public Loginpage() {
		// This initElements method will creat all webElements in LoginPage
		PageFactory.initElements(new AjaxElementLocatorFactory(BaseClass.driver, 30), this);
	}

	public void validateWithLoginText() {
		/*
		 * this assertTrue method will check login text field is displayed or not if
		 * assert is false it will throws the assertion exception
		 */
		assertTrue(loginText.isDisplayed(), "the text of login is not displayed");
		System.out.println("the text of login is displayed on login page");
	}

	// this method will enter username and password in their respective text fields
	public void usernamepassword() {
		Username.sendKeys(BaseClass.readdata("Sheet1", 1, 1));
		Password.sendKeys(BaseClass.readdata("Sheet1", 1, 2));
	}

	// these method will close logout popup
	public void clickonCloseButton() {
		closeButton.click();
	}

	// this method will click on login button
	public void loginbutton() {
		LoginButton.click();
	}

	public void enterusername(String username, String password) {
		Username.sendKeys(username);
		Password.sendKeys(password);
	}

}