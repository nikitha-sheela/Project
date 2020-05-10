package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SellOnlinePage {
	@FindBy(xpath = "//input[@name='registrationNumber']")
	private static WebElement enterNumber;
	@FindBy(xpath = "//button/div")
	private static WebElement RegisterLink;

	public SellOnlinePage() {
		PageFactory.initElements(BaseClass.c, this);
	}

	public static void enterNumberInRegister(String num) {
		enterNumber.sendKeys(num);
	}

	public static void clickOnRegister() {
		RegisterLink.click();
		String actual = "Sell Online on Flipkart | Grow your business with the leader in Indian e-commerce";
		String expected = BaseClass.c.getTitle();
		assertEquals(actual, expected, "user  is not navigated");
		System.out.println("user is navigated ");
		Reporter.log("user is navigated ");

	}

}
