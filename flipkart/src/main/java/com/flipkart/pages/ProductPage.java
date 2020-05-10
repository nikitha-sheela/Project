package com.flipkart.pages;

import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	@FindBy(xpath = "//button[@class='_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c']")
	private WebElement buyNowButton;

	public ProductPage() {
		super();
		PageFactory.initElements(BaseClass.driver, this);
	}

	public void clickOnBuyNowButton() {
		buyNowButton.click();
	}

	public void validateWithTittle() {
		Set<String> s = BaseClass.driver.getWindowHandles();
		for (String s1 : s) {
			String s2 = BaseClass.driver.switchTo().window(s1).getTitle();
			if (s1.contains(
					"Young Trendz Anti-Pollution -Virus Saftey -Bike Rider -Cotton Mask (Pack of 3) MASK-03 Respirator")) {
				// System.out.println(s2);
				BaseClass.driver.switchTo().window("Young Trendz Anti-Pollution -Virus Saftey -Bike Rider -Cotton Mask (Pack of 3) MASK-03 Respirator");
				String actual = "Young Trendz Anti-Pollution -Virus Saftey -Bike Rider -Cotton Mask (Pack of 3) MASK-03 Respirator";
				assertEquals(actual, s2, "product page is not displayed");
				System.out.println("Product page is displayed");
			}
			
		}
	}

}
