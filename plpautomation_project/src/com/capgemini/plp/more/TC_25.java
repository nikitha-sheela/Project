package com.capgemini.plp.more;

import com.capgemini.plp.wishlist.BaseClass;
import com.capgemini.plp.wishlist.HomePage;

public class TC_25 {

	public static void main(String[] args) throws InterruptedException {
		BaseClass b = new BaseClass();
		b.openBrowser();
		b.login();
		HomePage h = new HomePage();
		h.mouseHoverOnMore();
		String s = h.textOfAdvertisementLink();
		System.out.println(s);
		b.logout();
		b.closeBrowser();
	}

}
