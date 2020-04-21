package com.capgemini.plp.more;

import com.capgemini.plp.wishlist.BaseClass;
import com.capgemini.plp.wishlist.CustomerCarePage;
import com.capgemini.plp.wishlist.HomePage;

public class TC_55 {

	public static void main(String[] args) throws InterruptedException {
		BaseClass b = new BaseClass();
		b.openBrowser();
		b.login();
		HomePage h = new HomePage();
		h.mouseHoverOnMore();
		h.clickOn247link();
		CustomerCarePage c = new CustomerCarePage();
		c.clickOnHelpwithyourorder();
		c.clickOnViewMore();

		b.logout();
		b.closeBrowser();
	}

}
