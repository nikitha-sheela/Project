package com.flipkart.pages;


import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentsPage {
	/* All webelements are identified by @FindBy annotation in PaymentsPage */
	@FindBy(xpath = "//*[@id=\"to-payment\"]")
	private WebElement CONTINUEButton;
	@FindBy(xpath = "//button[@class='_2AkmmA _37mBT- _7UHT_c']")
	private WebElement PhonePayContinueButton;

	public PaymentsPage() {
		// This initElements method will creat all webElements
		PageFactory.initElements(BaseClass.driver, this);
	}

	// This method will click On Phone Pay Continue Button
	public void clickOnPhonePayButton() {
		PhonePayContinueButton.click();
	}

	// This method will clickOn Continue Button
	public void clickOnContinueButton() {
		CONTINUEButton.click();
	}

	// This method will validate with tittle of Payments Page
	public void validateWithTittle() {
		assertTrue(CONTINUEButton.isDisplayed(), "Payments Page is not navigated");
		System.out.println("Payments Page is navigated");

		}
	}

