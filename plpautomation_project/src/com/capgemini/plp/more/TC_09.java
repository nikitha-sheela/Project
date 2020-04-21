package com.capgemini.plp.more;

import com.capgemini.plp.wishlist.BaseClass;
import com.capgemini.plp.wishlist.HomePage;
import com.capgemini.plp.wishlist.MorePage;

public class TC_09 {

	public static void main(String[] args) throws InterruptedException {
		BaseClass b = new BaseClass();
		b.openBrowser();
		b.login();
		HomePage h = new HomePage();
		h.mouseHoverOnMore();
		h.clickOnNotificationLink();
		MorePage m = new MorePage();
		m.clickOnEmailNotification();
		b.logout();
		b.closeBrowser();
	}

}
