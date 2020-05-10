package com.flipkart.addtocartpages;

import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.By;

import com.flipkart.pages.BaseClass;

public class ProductPage {
	HomePaage home = new HomePaage();

	public void clickOnAddToCartButton() {
		BaseClass.driver.findElement(By.xpath(home.readDataFromXml("//elements/ProductPage/AddToCartButton"))).click();
	}

	public void validateWithTittle() {
		Set<String> s = BaseClass.driver.getWindowHandles();
		for (String s1 : s) {
			String s2 = BaseClass.driver.switchTo().window(s1).getTitle();
			if (s1.contains(
					"Young Trendz Anti-Pollution -Virus Saftey -Bike Rider -Cotton Mask (Pack of 3) MASK-03 Respirator")) {
				// System.out.println(s2);
				BaseClass.driver.switchTo().window(
						"Young Trendz Anti-Pollution -Virus Saftey -Bike Rider -Cotton Mask (Pack of 3) MASK-03 Respirator");
				String actual = "Young Trendz Anti-Pollution -Virus Saftey -Bike Rider -Cotton Mask (Pack of 3) MASK-03 Respirator";
				assertEquals(actual, s2, "product page is not displayed");
				System.out.println("Product page is displayed");
			}

		}
	}
}
