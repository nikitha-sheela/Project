package com.capgemini.plp.more;

import com.capgemini.plp.wishlist.BaseClass;
import com.capgemini.plp.wishlist.HomePage;
import com.capgemini.plp.wishlist.SellOnlinePage;

public class TC_11 {
	public static void main(String[] args) throws InterruptedException {
		BaseClass b = new BaseClass();
		b.openBrowser();
		b.login();
		HomePage h = new HomePage();
		h.mouseHoverOnMore();
		h.clickOnSellonLink();
		SellOnlinePage s = new SellOnlinePage();
		s.enterNumberInRegister("98923jdsfjfh");
		s.clickOnRegister();
		b.closeBrowser();
	}

}
