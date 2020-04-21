package com.capgemini.plp.wishlist;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlayStorePage {
	@FindBy(xpath = "//div[@id='fcxH9b']/div[4]/c-wiz/div/div[2]/div/div/div/c-wiz/c-wiz/div/div[2]/div/div[2]/div/div[2]/div/c-wiz/c-wiz/button")
	private WebElement instalButton;

	public PlayStorePage() {
		PageFactory.initElements(BaseClass.c, this);

	}
	public void clickOnInstalButton() {
		instalButton.click();
	}
	
	////button[contains(.,'Installed')]

}
