package com.flipkart.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class PhonePayPage {
	public PhonePayPage() {
		// This initElements method will creat all webElements
		PageFactory.initElements(BaseClass.driver, this);
	}

	/* All webelements are identified by @FindBy annotation in PhonePayPage */
	@FindBy(id = "onboardingFormSubmitBtn")
	private WebElement sendOtpButton;
	@FindBy(id = "otp")
	private WebElement otptextfeild;

	/*
	 * Defining all the user actions(method) that can be performed in the
	 * PhonePayPage
	 */

	// this method will click on sendotpButton
	public void clickOnSendOtpButton() {
		sendOtpButton.click();
	}

	// this method will validate the OtpTextField is there or not
	public void validateWithOtpTextFeild() {
		/*
		 * these assertTrue method will check otptextfield is displayed or not if assert
		 * is false it will throws the assertion exception
		 */
		assertTrue(otptextfeild.isDisplayed(), "the otptext feild is not displayed");
		Reporter.log("the otptext feild is displayed");
		System.out.println("the otptext feild is displayed");
	}

}
