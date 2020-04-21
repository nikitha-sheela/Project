package com.capgemini.plp.wishlist;

public class TC_10 {

	public static void main(String[] args) throws InterruptedException {
		BaseClass b = new BaseClass();
		b.openBrowser();
		b.login();
		HomePage h = new HomePage();
		h.mouseHoverToMyAccount();
		String s = h.textOfWishlist();
		System.out.println(s);
		b.logout();
		b.closeBrowser();
	}

}
