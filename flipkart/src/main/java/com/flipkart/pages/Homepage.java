package com.flipkart.pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	/* All webelements are identified by @FindBy annotation in HomePage */
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a")
	private WebElement Login;
	@FindBy(partialLinkText = "Login")
	private WebElement loginlink;
	@FindBy(className = "_1e_EAo")
	private WebElement flipkartLogo;
	@FindBy(xpath = "//div[@class='dHGf8H']")
	private WebElement myaccount;
	@FindBy(xpath = "//a[contains(@href, '/wishlist?link=home_wishlist')]")
	private WebElement wishlist;
	@FindBy(xpath = "//a[contains(@href, '#')]")
	private WebElement logoutlink;
	@FindBy(xpath = "//div[4]/div/div/div/div")
	private WebElement moreOption;
	@FindBy(xpath = "//a[contains(@href, '/helpcentre')]")
	private WebElement customercareLink;

	public Homepage() {
		// This initElements method will creat all webElements in HomePage
		PageFactory.initElements(BaseClass.driver, this);
	}
	/*
	 * Defining all the user actions(method) that can be performed in the HomePage
	 */

	// This method is to click On wishlist
	public void clickOnWishlistLink() {
		wishlist.click();
	}

	// method to click on login in home page
	public void clickOnLoginLink() {
		loginlink.click();
	}

	// This method will mouseHover to MyAccount
	public void mouseHoverToMyAccount() throws InterruptedException {
		Thread.sleep(5000);
		Actions a = new Actions(BaseClass.driver);
		a.moveToElement(myaccount).perform();
	}

	// Validate with logo in homepage
	public void validateWithLogo() {

		assertTrue(flipkartLogo.isDisplayed(), "flipkartlogo is not displayed on home page");
		System.out.println("flipkartlogo is displayed on home page");
	}

	// these method validates with home page tittle
	String actual = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";

	public void validateTittle() {
		assertEquals(actual, BaseClass.driver.getTitle(), "the tittle is not verified by actual");
		System.out.println("the tittle is verified by actual");
	}

	// This method is to click on logout
	public void clickOnlogoutlink() {
		logoutlink.click();
	}

	public void mouseHoverOnMore() throws InterruptedException {
		Thread.sleep(5000);
		Actions a = new Actions(BaseClass.driver);
		a.moveToElement(moreOption).perform();

	}

	public void clickOnCustomerCarelink() {
		customercareLink.click();

	}

	public void ClickOnNotificationLink() throws DocumentException {
		BaseClass.driver.findElement(By.xpath(readDataFromXml("//elements/NotificationLink"))).click();
	}

	public String readDataFromXml(String input) throws DocumentException {
		File file = new File("./src\\test\\resources\\testdata\\Data.xml");
		Document doc = new SAXReader().read(file);
		String s = doc.selectSingleNode(input).getText();
		return s;

	}

}