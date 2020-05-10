package com.capgemini.plp.wishlist;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class MorePage {
	@FindBy(xpath = "//div[@class='_2BCJf0']")
	private WebElement desktopOptions;
	@FindBy(xpath = "//li[contains(.,'In-App Notifications')]")
	private WebElement appNotificationLink;
	@FindBy(xpath = "//li[contains(.,'SMS')]")
	private WebElement smsNotificationLink;
	@FindBy(xpath = "//li[contains(.,'Email')]")
	private WebElement emailNotificationLink;
	@FindBy(linkText = "Home")
	private WebElement homeLink;
	@FindBy(xpath = "//div[3]/div/a/img")
	private WebElement appStoreLink;
	@FindBy(xpath = "//div[2]/a/img")
	private WebElement playStoreLink;

	public MorePage() {
		PageFactory.initElements(BaseClass.c, this);
	}

	public void validateWithDesktopOptions() {
		assertTrue(desktopOptions.isDisplayed(), "desktop options are not displayed");
		System.out.println("desktop options are displayed");
		Reporter.log("desktop options are displayed");
	}
	public void clickOnAppNotification() {
		appNotificationLink.click();
	}

	public void clickOnSMSNotification() {
		smsNotificationLink.click();
	}

	public void clickOnEmailNotification() {
		emailNotificationLink.click();
	}

	public void clickOnHomeLink() {
		homeLink.click();
	}

	public void clickOnAppStoreLink() {
		appStoreLink.click();
	}

	public void clickOnPlayStoreLink() {
		playStoreLink.click();
	}

}
