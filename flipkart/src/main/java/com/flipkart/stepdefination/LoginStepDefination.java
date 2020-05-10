package com.flipkart.stepdefination;

import com.flipkart.pages.Loginpage;

import cucumber.api.java.en.*;

public class LoginStepDefination {
	Loginpage login;

	@Then("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void userEnterAnd(String arg1, String arg2) throws Throwable {
		login = new Loginpage();
		login.enterusername(arg1, arg2);

	}

}
