package com.flipkart.stepdefination;

import com.flipkart.pages.BaseClass;
import com.flipkart.pages.CustomerCarePage;
import com.flipkart.pages.Homepage;

import cucumber.api.java.en.*;

public class MoreStepDefination {
	BaseClass base;
	Homepage home;
	CustomerCarePage customercare;

	@Then("^User Mouse Hover To More$")
	public void user_Mouse_Hover_To_More() throws Throwable {
		home = new Homepage();
		home.mouseHoverOnMore();
	}

	@When("^User Click on Customer Care Link$")
	public void user_Click_on_Customer_Care_Link() throws Throwable {
		home.clickOnCustomerCarelink();
	}

	@Then("^User Navigates to CustomerCare Page$")
	public void user_Navigates_to_CustomerCare_Page() throws Throwable {

		String s = BaseClass.driver.getTitle();
		System.out.println(s);

	}

	@When("^User Click On Help with your order$")
	public void user_Click_On_Help_with_your_order() throws Throwable {
		customercare = new CustomerCarePage();
		customercare.clickOnHelpWithYourOrders();
	}

	@Then("^User Click On product which user have a issue$")
	public void user_Click_On_product_which_user_have_a_issue() throws Throwable {
		customercare.clickOnProduct();
	}

	@Then("^User gets the status of the Order$")
	public void user_gets_the_status_of_the_Order() throws Throwable {
		customercare.retriveStatus();

	}

	@Then("^user click on logout$")
	public void user_click_on_logout() throws Throwable {
		base = new BaseClass();
		base.logout();

	}

	@When("^User Click On Orders$")
	public void userClickOnOrders() throws Throwable {
		customercare = new CustomerCarePage();
		customercare.clickOnOrders();
	}

	@Then("^User Click On Any FAQ's Question$")
	public void userClickOnAnyFAQSQuestion() throws Throwable {
		customercare.clickOnAnyQusetion();
	}

	@Then("^User gets the Answer form the help center$")
	public void userGetsTheAnswerFormTheHelpCenter() throws Throwable {
		Thread.sleep(5000);
		customercare = new CustomerCarePage();
		customercare.retriveAnswer();
	}

	@When("^User Click On Notification Link$")
	public void userClickOnNotificationLink() throws Throwable {
		home = new Homepage();
		home.ClickOnNotificationLink();
	}

	@Then("^User Navigates to Notifications Page$")
	public void userNavigatesToNotificationsPage() throws Throwable {
	}

	@Then("^User Click On Desktop notification$")
	public void userClickOnDesktopNotification() throws Throwable {
	}

	@Then("^User gets the desktop notification$")
	public void userGetsTheDesktopNotification() throws Throwable {
	}

}
