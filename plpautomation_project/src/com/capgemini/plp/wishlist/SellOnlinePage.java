package com.capgemini.plp.wishlist;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SellOnlinePage {
	@FindBy(xpath = "//input[@name='registrationNumber']")
	private WebElement enterNumber;
	@FindBy(xpath = "//button/div")
	private WebElement RegisterLink;

	public SellOnlinePage() {
		PageFactory.initElements(BaseClass.c, this);
	}

	public void enterNumberInRegister(String num) {
		enterNumber.sendKeys(num);
	}

	public void clickOnRegister() {
		RegisterLink.click();
	}

}
