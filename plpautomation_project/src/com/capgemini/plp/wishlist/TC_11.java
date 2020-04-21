package com.capgemini.plp.wishlist;

public class TC_11 {
	public static void main(String[] args) throws InterruptedException {

		BaseClass b = new BaseClass();
		b.openBrowser();
		b.login();
		HomePage h = new HomePage();
		h.mouseHoverToMyAccount();
		h.clickOnWishlistLink();
		WishlistPage w = new WishlistPage();
		w.clickONdeletbutton();
		String s = w.getTextOfElements();
		System.out.println(s);
		b.logout();
		b.closeBrowser();
	}
}
