package com.capgemini.plp.wishlist;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//div[@class='dHGf8H']")
	private WebElement myaccount;
	@FindBy(xpath = "//a[contains(@href, '/wishlist?link=home_wishlist')]")
	private WebElement wishlist;
	@FindBy(xpath = "//span[@class=\"_1QZ6fC _3Lgyp8\"]")
	private WebElement Electronics;
	@FindBy(linkText = "Mi")
	private WebElement product;
	@FindBy(xpath = "//div[4]/div/div/div/div")
	private WebElement moreLink;
	@FindBy(xpath = "//div[@class=\"_3yG-R_\"]")
	private WebElement moreText;
	@FindBy(xpath = "//li[@class=\"_1-qoxT\"]")
	private WebElement notificationLink;
	@FindBy(xpath = "//li[2]/a/div")
	private WebElement sellOnLink;
	@FindBy(xpath = "//a[contains(@href, '/helpcentre')]")
	private WebElement customerLink;
	@FindBy(xpath = "//a[contains(.,'Advertise')]")
	private WebElement advertiseLink;
	@FindBy(xpath = "//li[5]/a/div")
	private WebElement downloadLink;
	@FindBy(xpath = "//div[3]/div/a/img")
	private WebElement playStoreLink;

	public HomePage() {

		PageFactory.initElements(BaseClass.c, this);

	}

	public void mouseHoverToMyAccount() throws InterruptedException {
		Thread.sleep(5000);
		Actions a = new Actions(BaseClass.c);
		a.moveToElement(myaccount).perform();
	}

	public void clickOnWishlistLink() {
		wishlist.click();
	}

	public void mouseHoverToElectronics() throws InterruptedException {
		Thread.sleep(5000);
		Actions a = new Actions(BaseClass.c);
		a.moveToElement(Electronics).perform();

	}

	public void clickOnProduct() {
		product.click();
	}

	public String textOfWishlist() {
		String s = wishlist.getText();
		return s;

	}

	public void mouseHoverOnMore() throws InterruptedException {
		Thread.sleep(5000);
		Actions a = new Actions(BaseClass.c);
		a.moveToElement(moreLink).perform();

	}

	public String getTextOfMore() {
		String s = moreText.getText();
		return s;
	}

	public void clickOnNotificationLink() {
		notificationLink.click();
	}

	public void clickOnSellonLink() {
		sellOnLink.click();
	}

	public void clickOn247link() {
		customerLink.click();

	}

	public void clickOnAdverstise() {
		advertiseLink.click();
	}

	public void clickOndownload() {
		downloadLink.click();
	}

	public void clickOnPlayStoreLink() {
		playStoreLink.click();
	}

	public String textOfNotificationLink() {
		String s = notificationLink.getText();
		return s;
	}

	public String textOfSellOnLink() {
		String s = sellOnLink.getText();
		return s;
	}

	public String textOf247Link() {
		return customerLink.getText();

	}

	public String textOfAdvertisementLink() {
		return advertiseLink.getText();

	}

	public String textOfDownloadLink() {
		return downloadLink.getText();

	}

}
