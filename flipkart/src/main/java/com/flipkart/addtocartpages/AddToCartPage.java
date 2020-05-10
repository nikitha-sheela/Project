package com.flipkart.addtocartpages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;

import com.flipkart.pages.BaseClass;

public class AddToCartPage {
	HomePaage home = new HomePaage();

	public void validateWithProductText() {
		assertTrue(BaseClass.driver.findElement(By.className(home.readDataFromXml("//elements/AddToCartPage/Product")))
				.isDisplayed(), "user cannot see the product in the add to cart");
		System.out.println("user can see the product in the add to cart");
	}

}
