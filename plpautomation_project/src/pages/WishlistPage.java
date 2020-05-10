package pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
	@FindBy(className = "TLVGit")
	private WebElement ProductFromwishlist;
	@FindBy(css = ".\\_1hqsXY")
	private WebElement shareButton;
	@FindBy(className = "BXkahK")
	private WebElement elementsInShareButton;
	@FindBy(xpath = "//img[@class=\"_27LgAY\"]")
	private WebElement deletButton;
	@FindBy(xpath = "//div[@class=\"M-og0Q\"]")
	private WebElement textOfDeletButton;
	@FindBy(xpath = "//button[contains(.,'YES, REMOVE')]")
	private WebElement yesRemoveButton;
	@FindBy(xpath = "//button[contains(.,'CANCEL')]")
	private WebElement cancelButton;

	public WishlistPage() {
		PageFactory.initElements(BaseClass.c, this);
	}

	public String getTextOfProduct() throws InterruptedException {
		Thread.sleep(5000);
		String s = ProductFromwishlist.getText();
		return s;

	}

	public void validateWishlistPageWithTittle() {
		String actual = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		String expected = BaseClass.c.getTitle();
		assertEquals(actual, expected, "user does not navigated to whishlist page");
		System.out.println("user navigated to whishlist page");
	}

	public void clickOnProduct() {

		ProductFromwishlist.click();

	}

	public void clickOnShareButton() {

		try {
			Thread.sleep(5000);
			shareButton.isDisplayed();
		} catch (InterruptedException e) {

			System.out.println("element is not displayed");
		}
		shareButton.click();
	}

	public String getTextOfElements() throws InterruptedException {
		Thread.sleep(5000);
		String s = textOfDeletButton.getText();
		assertTrue(textOfDeletButton.isDisplayed(), "delet button is not displayed");
		System.out.println("delet button is displayed");
		return s;

	}

	public void clickONdeletbutton() {
		deletButton.click();

	}

	public String textOnDeletElement() {
		String s = textOfDeletButton.getText();
		return s;

	}

	public void clickOnYesRemoveButton() {
		yesRemoveButton.click();
	}

	public String gettextOfRemoveButton() {
		String s = yesRemoveButton.getText();

		assertTrue(yesRemoveButton.isDisplayed(), "yes remove button is not displayed");
		System.out.println("yes remove button is displayed");
		return s;
	}

	public void clickOnCancelButton() {
		cancelButton.click();
	}

	public String textOfCancelButton() {
		String s = cancelButton.getText();
		assertTrue(cancelButton.isDisplayed(), "cancel button is not displayed");
		System.out.println("cancel button is displayed");
		return s;
	}
}
