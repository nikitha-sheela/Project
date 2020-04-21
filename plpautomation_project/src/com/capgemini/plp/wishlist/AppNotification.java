package com.capgemini.plp.wishlist;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppNotification {
	@FindBy(xpath = "//label/div")
	private WebElement checkBoxLink;
	@FindBy(xpath = "//ul[@class='_2GogMs']")
	private List<WebElement> AllcheckBox;
	@FindBy(css = "li:nth-child(1) .\\_1tuZ-_")
	private WebElement DropDown;

	public AppNotification() {
		PageFactory.initElements(BaseClass.c, this);
	}

	public void clickOnDropDown() {
		DropDown.click();
	}

	public void clickOnAllCheckBox() {
		for (int i = 0; i < AllcheckBox.size(); i++) {
			AllcheckBox.get(i).click();

		}
	}

	public void clickOnCheckBox() {
		checkBoxLink.click();
	}

}
