package com.capgemini.plp.more;

import com.capgemini.plp.wishlist.BaseClass;
import com.capgemini.plp.wishlist.HomePage;

public class TC_00 {
	public static void main(String[] args) throws InterruptedException {

		BaseClass b = new BaseClass();
		b.openBrowser();
		b.login();
		HomePage h = new HomePage();
		h.mouseHoverOnMore();
		Thread.sleep(5000);
		b.logout();
		b.closeBrowser();

	}
}
