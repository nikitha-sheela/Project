package com.capgemini.plp.wishlist;

public class TC_00 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		BaseClass b = new BaseClass();
		b.openBrowser();
		b.login();
		HomePage h = new HomePage();
		h.mouseHoverToMyAccount();
		h.clickOnWishlistLink();
		b.logout();
		b.closeBrowser();

	}

}
