package com.capgemini.plp.wishlist;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SellOnlinePage {
	@FindBy(xpath = "//input[@name='registrationNumber']")
	private static WebElement enterNumber;
	@FindBy(xpath = "//button/div")
	private static WebElement RegisterLink;

	public SellOnlinePage() {
		PageFactory.initElements(BaseClass.c, this);
	}

	public static void enterNumberInRegister(String num) {
		enterNumber.sendKeys(num);
	}

	public static void clickOnRegister() {
		RegisterLink.click();
	}

}
