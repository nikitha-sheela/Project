package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	@FindBy(className = "_1hgiYz")
	private WebElement signuptext;

	public SignUpPage() {

		PageFactory.initElements(BaseClass.c, this);
	}
	
	public void validWithSignUpPage() {
		assertTrue(signuptext.isDisplayed(), "signup page is not displayed");
		System.out.println("signup page is displayed");
	}
	
	
	

}
