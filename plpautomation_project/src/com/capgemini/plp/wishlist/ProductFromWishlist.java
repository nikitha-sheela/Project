package com.capgemini.plp.wishlist;

import java.util.Set;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

////span[@class="_2ExopE"]
public class ProductFromWishlist {

	@FindBy(xpath = "span[@class=\"_2ExopE\"]")
	private WebElement shareButton;
	@FindBy(className = "BXkahK")
	private WebElement elementsInShareButton;

	public ProductFromWishlist() {
		PageFactory.initElements(BaseClass.c, this);
		Set<String> s1 = BaseClass.c.getWindowHandles();

		for (int i = 0; i < s1.size(); i++) {
			BaseClass.c.getTitle();

		}
	}

	public void clickOnShareButton() throws InterruptedException {
		Thread.sleep(5000);
		shareButton.click();
	}

	public String getTextOfElements() throws InterruptedException {
		Thread.sleep(5000);
		String s = elementsInShareButton.getText();
		return s;

	}

}
