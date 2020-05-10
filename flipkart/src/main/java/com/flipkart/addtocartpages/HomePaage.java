package com.flipkart.addtocartpages;

import static org.testng.Assert.assertEquals;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.flipkart.pages.BaseClass;

public class HomePaage {

	public void clickOnLoginLink() {
		BaseClass.driver.findElement(By.partialLinkText(readDataFromXml("//elements/HomePageelements/loginlink")))
				.click();
	}

	public void MouseHoverOnMyAccount() {
		Actions a = new Actions(BaseClass.driver);
		a.moveToElement(
				BaseClass.driver.findElement(By.xpath(readDataFromXml("//elements/HomePageelements/MyAccount"))))
				.perform();
	}

	public void ClickOnWishListLink() {
		BaseClass.driver.findElement(By.xpath(readDataFromXml("//elements/HomePageelements/wishlistLink"))).click();
	}

	// these method validates with home page tittle
	String actual = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";

	public void validateTittle() {
		assertEquals(actual, BaseClass.driver.getTitle(), "the tittle is not verified by actual");
		System.out.println("the tittle is verified by actual");
	}

	public String readDataFromXml(String input) {
		File file = new File("./src/test/resources/testdata/Data.xml");

		Document doc = null;
		try {
			doc = new SAXReader().read(file);

		} catch (DocumentException e) {
			e.printStackTrace();
		}
		String s = doc.selectSingleNode(input).getText();

		return s;

	}

}
