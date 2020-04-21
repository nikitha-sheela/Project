package pom.eBay.Test;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pom.eBay.Pages.LoginPage;

public class VerifyTest extends LoginPage{


	public VerifyTest(WebDriver driver) {
		super(driver);
	}

	@Test
	public void CheckLogin() throws InterruptedException {

		

		LoginPage login = new LoginPage(LoginPage.driver);
		login.openBrowser();
		login.login();

		login.logout();

		login.closebrowser();

	}

}