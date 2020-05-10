package com.flipkart.addtocartpages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;

import com.flipkart.pages.BaseClass;

public class WishListPage {
	HomePaage home = new HomePaage();

	public void validateWishlist() {
		assertTrue(BaseClass.driver.findElement(By.xpath(home.readDataFromXml("//elements/wishlistPage/wishlisttext")))
				.isDisplayed(), "User not navigated to wishlistPage");
		System.out.println("user navigated to wishlistpage");
	}

	public void clickOnProduct() {
		BaseClass.driver.findElement(By.className(home.readDataFromXml("//elements/wishlistPage/Product"))).click();
	}

}
