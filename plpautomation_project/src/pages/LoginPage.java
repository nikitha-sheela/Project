package pages;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BaseClass {
	@FindBy(xpath = "//input[@class='_2zrpKA _1dBPDZ']")
	private WebElement usernametextfeild;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordtextfeild;
	@FindBy(xpath = "//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	private WebElement loginButton;
	@FindBy(xpath = "//button[@class='_2AkmmA _29YdH8']")
	private WebElement closeButton;

	@FindBy(className = "_1hgiYz")
	private WebElement loginText;
	@FindBy(xpath = "//span[@class='ZAtlA-']")
	private WebElement errormsgtext;

	@FindBy(xpath = "//a[@class='_21JmK0 _1__46T']")
	private WebElement forgotpasswordlink;
	@FindBy(xpath = "//div[3]/input")
	private WebElement otpTextField;
	@FindBy(xpath = "//div[4]/input")
	private WebElement setPasswordLink;
	@FindBy(linkText = "New to Flipkart? Create an account")
	private WebElement NewtoFlipkart;

	public LoginPage() {
		PageFactory.initElements(BaseClass.c, this);
	}
	
	public void clickOnNewToFlipkartlink() {
		NewtoFlipkart.click();
	}

	public void enterpassword() {
		setPasswordLink.sendKeys("nikitha123");
	}
	
	public void validateforgotpassword() {
	assertTrue(otpTextField.isDisplayed(),"otptextfield is not displayed");
	System.out.println("otp text field is diaplayed");
	}
	
	
	public void clickOnForgotPassworLink() {
		forgotpasswordlink.click();
	}

	public String retriveErrormsg() {
		String s = errormsgtext.getText();
		return s;
	}

	public void validateWithLoginText() {
		assertTrue(loginText.isDisplayed(), "the text of login is not displayed");
		System.out.println("the text of login is displayed on login page");
	}

	public void enterusername(String username) {
		usernametextfeild.sendKeys(username);
	}

	public void enterusername(String username, String password) {
		usernametextfeild.sendKeys(username);
		passwordtextfeild.sendKeys(password);
	}

	public void clickonCloseButton() {
		closeButton.click();
	}

	public void clickOnLoginButton() {
		loginButton.click();

	}

}
