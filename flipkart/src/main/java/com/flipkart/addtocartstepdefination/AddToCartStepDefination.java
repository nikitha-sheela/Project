package com.flipkart.addtocartstepdefination;

import com.flipkart.addtocartpages.AddToCartPage;
import com.flipkart.addtocartpages.HomePaage;
import com.flipkart.addtocartpages.LoginPage;
import com.flipkart.addtocartpages.WishListPage;
import com.flipkart.pages.BaseClass;

import cucumber.api.java.en.*;

public class AddToCartStepDefination {
	BaseClass base = new BaseClass();
	LoginPage login = new LoginPage();
	HomePaage home = new HomePaage();
	WishListPage wishlist = new WishListPage();
	com.flipkart.addtocartpages.ProductPage product = new com.flipkart.addtocartpages.ProductPage();
	AddToCartPage addtocart = new AddToCartPage();

	@Given("^Open the Browser$")
	public void openTheBrowser() throws Throwable {
		base.openbrowser();
	}

	@When("^Enter the URL$")
	public void enterTheURL() throws Throwable {
		base.EnterURL();
	}

	@When("^Get the Title of the page$")
	public void getTheTitleOfThePage() throws Throwable {
		base.GetTitle();
	}

	@Then("^User Navigates to Home Page$")
	public void userNavigatesToHomePage() throws Throwable {
		home.validateTittle();

	}

	@Then("^User click on loginlink$")
	public void userClickOnLoginlink() throws Throwable {
		login.clickOnCloseButton();
		home.clickOnLoginLink();
	}

	@Then("^User Navigated to login popup$")
	public void userNavigatedToLoginPopup() throws Throwable {
		login.validateWithLoginText();

	}

	@Then("^User enter UserName and Password$")
	public void userEnterUserNameAndPassword() throws Throwable {
		login.enterUsername();
		login.enterPassword();
	}

	@Then("^Click on Login Button$")
	public void clickOnLoginButton() throws Throwable {
		login.clickOnLoginButton();
	}

	@Then("^User Navigates to User Home Page$")
	public void userNavigatesToUserHomePage() throws Throwable {
		home.validateTittle();
	}

	@When("^User Mouse Hover On MyAccount$")
	public void userMouseHoverOnMyAccount() throws Throwable {
		Thread.sleep(5000);
		home.MouseHoverOnMyAccount();
	}

	@When("^User click On Wishlistlink$")
	public void userClickOnWishlistlink() throws Throwable {
		Thread.sleep(5000);
		home.ClickOnWishListLink();
	}

	@Then("^User Navigates to WishlistPage$")
	public void userNavigatesToWishlistPage() throws Throwable {
		wishlist.validateWishlist();
	}

	@When("^User Click On Product In WishlistPage$")
	public void userClickOnProductInWishlistPage() throws Throwable {
		wishlist.clickOnProduct();
	}

	@Then("^User Navigates to Product Page$")
	public void userNavigatesToProductPage() throws Throwable {
		product.validateWithTittle();

	}

	@When("^User Click On AddToCart$")
	public void userClickOnAddToCart() throws Throwable {
		product.clickOnAddToCartButton();
	}

	@Then("^Product should be displayed to AddToCartPage$")
	public void productShouldBeDisplayedToAddToCartPage() throws Throwable {
		addtocart.validateWithProductText();
	}

	@Then("^User Logout$")
	public void userLogout() throws Throwable {
		base.logout();
	}

	@Then("^close browser$")
	public void closeBrowser() throws Throwable {
		base.closebrowser();
	}

}
