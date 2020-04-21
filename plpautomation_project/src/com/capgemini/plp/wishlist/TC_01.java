package com.capgemini.plp.wishlist;

public class TC_01 {

	public static void main(String[] args) throws InterruptedException {
		BaseClass b = new BaseClass();
		b.openBrowser();
		b.login();
		HomePage h = new HomePage();
		h.mouseHoverToElectronics();
		h.clickOnProduct();
		ProductPage p = new ProductPage();
		p.clickOnWishlist();
		String s = p.getTextOfProduct();
		h.mouseHoverToMyAccount();
		h.clickOnWishlistLink();
		WishlistPage w = new WishlistPage();
		String s1 = w.getTextOfProduct();
		if (s.equals(s1)) {
			System.out.println("product is displayed");
		} else {
			System.out.println("product is not displayed");
		}
		b.logout();
		b.closeBrowser();

	}

}
