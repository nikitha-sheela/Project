package com.flipkart.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
	@FindBy(className = "TLVGit")
	private WebElement ProductFromwishlist;
	@FindBy(xpath = "//div[@class='_3oWply']")
	private WebElement wishlisttext;

	public WishlistPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public String getTextOfProduct() throws InterruptedException {
		Thread.sleep(5000);
		String s = ProductFromwishlist.getText();
		return s;

	}

	public void clickOnProduct() {

		ProductFromwishlist.click();

	}

	public void validateWishlistPageWithTittle() {
		assertTrue(wishlisttext.isDisplayed(), "User did not navigated to wishlist page");
		System.out.println("User navigated to wishlist page");

	}

}
