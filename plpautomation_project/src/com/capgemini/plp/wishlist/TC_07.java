package com.capgemini.plp.wishlist;

import java.util.Set;

import org.openqa.selenium.By;

public class TC_07 {
	public static void main(String[] args) throws InterruptedException {
		BaseClass b = new BaseClass();
		b.openBrowser();
		b.login();
		HomePage h = new HomePage();
		h.mouseHoverToMyAccount();
		h.clickOnWishlistLink();
		WishlistPage w = new WishlistPage();
		String s1 = BaseClass.c.getWindowHandle();
		w.clickOnProduct();
		BaseClass.c.manage().window().maximize();

		Set<String> s = BaseClass.c.getWindowHandles();
		for (String w1 : s) {
			String sw = BaseClass.c.switchTo().window(w1).getTitle();
			System.out.println(sw);
			if (BaseClass.c.getTitle()
					.contains("Mi Redmi Note 7 Pro ( 64 GB Storage, 6 GB RAM ) Online at Best Price On Flipkart.com")) {
				Thread.sleep(5000);
				BaseClass.c.findElement(By.xpath("//li[@class=\"col col-6-12\"]")).click();
				// BaseClass.c.switchTo().window(w1).close();

			} else {
				System.out.println("did not clicked");
			}
		}
		BaseClass.c.switchTo().window(s1);
		b.logout();
		b.closeBrowser();

	}

}
