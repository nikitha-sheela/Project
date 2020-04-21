package com.capgemini.plp.more;

import java.util.Set;

import com.capgemini.plp.wishlist.BaseClass;
import com.capgemini.plp.wishlist.HomePage;
import com.capgemini.plp.wishlist.MorePage;
import com.capgemini.plp.wishlist.PlayStorePage;

public class TC_19 {

	public static void main(String[] args) throws InterruptedException {
		BaseClass b = new BaseClass();
		b.openBrowser();
		b.login();
		HomePage h = new HomePage();
		h.mouseHoverOnMore();
		h.clickOndownload();
		Thread.sleep(5000);
		MorePage m = new MorePage();
		String s1 = BaseClass.c.getWindowHandle();
		m.clickOnPlayStoreLink();
		Set<String> s = BaseClass.c.getWindowHandles();

		for (String w1 : s) {
			String sw = BaseClass.c.switchTo().window(w1).getTitle();
			System.out.println(sw);
			if (BaseClass.c.getTitle().contains("Flipkart Online Shopping App - Apps on Google Play")) {
				Thread.sleep(5000);
				PlayStorePage p = new PlayStorePage();
				Thread.sleep(5000);
				p.clickOnInstalButton();
				BaseClass.c.switchTo().window(w1).close();

			} else {
				System.out.println("did not clicked");
			}
		}
		BaseClass.c.switchTo().window(s1);
		b.logout();
		b.closeBrowser();

	}
}
