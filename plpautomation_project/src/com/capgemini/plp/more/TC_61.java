package com.capgemini.plp.more;

import com.capgemini.plp.wishlist.AppNotification;
import com.capgemini.plp.wishlist.BaseClass;
import com.capgemini.plp.wishlist.HomePage;
import com.capgemini.plp.wishlist.MorePage;

public class TC_61 {

	public static void main(String[] args) throws InterruptedException {
		BaseClass b = new BaseClass();
		b.openBrowser();
		b.login();
		HomePage h = new HomePage();
		h.mouseHoverOnMore();
		Thread.sleep(5000);
		h.clickOnNotificationLink();
		MorePage m = new MorePage();
		m.clickOnAppNotification();
		AppNotification a = new AppNotification();
		a.clickOnDropDown();
		b.logout();
		b.closeBrowser();

	}

}
