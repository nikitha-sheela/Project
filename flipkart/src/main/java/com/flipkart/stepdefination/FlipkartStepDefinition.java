package com.flipkart.stepdefination;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.flipkart.pages.BaseClass;
import com.flipkart.pages.Homepage;
import com.flipkart.pages.Loginpage;
import com.flipkart.pages.PaymentsPage;
import com.flipkart.pages.PhonePayPage;
import com.flipkart.pages.ProductPage;
import com.flipkart.pages.WishlistPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlipkartStepDefinition {
	/*
	 * This variables are globally initiated so that we can utilise these variables
	 * anywhere inside the class
	 */
	BaseClass base;
	Loginpage login;
	Homepage home;
	WishlistPage wishlist;
	ProductPage product;
	PaymentsPage payments;
	PhonePayPage phonepay;

	@Given("^Open the Browser$")
	public void open_the_Browser() {
		base = new BaseClass();
		base.openbrowser();
	}

	@When("^Enter the URL$")
	public void enter_the_URL() {
		base = new BaseClass();
		base.EnterURL();
	}

	@When("^Get the Title of the page$")
	public void get_the_Title_of_the_page() {
		base = new BaseClass();
		base.GetTitle();
	}

	@Then("^User enter UserName and Password$")
	public void user_enter_UserName_and_Password() throws EncryptedDocumentException, IOException {
		login = new Loginpage();
		login.usernamepassword();
	}

	@Then("^Click on Login Button$")
	public void click_on_Login_Button() {
		login = new Loginpage();
		login.loginbutton();
	}

	@Then("^Move cursor to Profile Icon$")
	public void move_cursor_to_Profile_Icon() throws InterruptedException {
		home = new Homepage();
		home.mouseHoverToMyAccount();
	}

	@Then("^Close the Browser$")
	public void close_the_Browser() {
		BaseClass base = new BaseClass();
		base.closebrowser();
	}

	@Then("^User Navigates to Home Page$")
	public void user_Navigates_to_Home_Page() throws Throwable {
		login = new Loginpage();
		login.clickonCloseButton();
		home = new Homepage();
		home.validateTittle();
	}

	@Then("^User Navigated to login popup$")
	public void user_Navigated_to_login_popup() throws Throwable {
		login = new Loginpage();
		login.validateWithLoginText();
	}

	@Then("^User Navigates to User Home Page$")
	public void user_Navigates_to_User_Home_Page() throws Throwable {
		home = new Homepage();
		home.validateWithLogo();

	}

	@Then("^User click on loginlink$")
	public void user_click_on_loginlink() throws Throwable {
		home = new Homepage();
		home.clickOnLoginLink();
	}

	@When("^User Mouse Hover On MyAccount$")
	public void user_Mouse_Hover_On_MyAccount() throws Throwable {
		home = new Homepage();
		home.mouseHoverToMyAccount();
	}

	@When("^User click On Wishlistlink$")
	public void user_click_On_Wishlistlink() throws Throwable {
		home = new Homepage();
		home.clickOnWishlistLink();
	}

	@Then("^User Navigates to WishlistPage$")
	public void user_Navigates_to_WishlistPage() throws Throwable {
		wishlist = new WishlistPage();
		wishlist.validateWishlistPageWithTittle();
	}

	@When("^User Click On Product In WishlistPage$")
	public void user_Click_On_Product_In_WishlistPage() throws Throwable {
		wishlist = new WishlistPage();
		String s = wishlist.getTextOfProduct();
		System.out.println(s);
		wishlist.clickOnProduct();
		product = new ProductPage();
		product.validateWithTittle();
	}

	@Then("^User Navigates to Product Page$")
	public void user_Navigates_to_Product_Page() throws Throwable {
		product = new ProductPage();
		product.validateWithTittle();
	}

	@When("^User Click On BuyNow button$")
	public void user_Click_On_BuyNow_button() throws Throwable {
		product = new ProductPage();
		product.clickOnBuyNowButton();
	}

	@Then("^User Navigates to PaymentsPage$")
	public void user_Navigates_to_PaymentsPage() throws Throwable {
		payments = new PaymentsPage();
		payments.validateWithTittle();
	}

	@When("^User Click On Continue button$")
	public void user_Click_On_Continue_button() throws Throwable {
		payments = new PaymentsPage();
		payments.clickOnContinueButton();
	}

	@Then("^User Click On PhonePay ContinueButton$")
	public void user_Click_On_PhonePay_ContinueButton() throws Throwable {
		payments = new PaymentsPage();
		payments.clickOnPhonePayButton();
	}

	@Then("^User Navigates PhonePay Page$")
	public void user_Navigates_PhonePay_Page() throws Throwable {
	}

	@Then("^User Click On send otp to login$")
	public void user_Click_On_send_otp_to_login() throws Throwable {
		phonepay = new PhonePayPage();
		phonepay.clickOnSendOtpButton();

	}

	@Then("^User will see otp textfeild$")
	public void user_will_see_otp_textfeild() throws Throwable {
		phonepay = new PhonePayPage();
		phonepay.validateWithOtpTextFeild();

	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
		base = new BaseClass();
		base.closebrowser();
	}

}