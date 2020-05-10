package pages;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;


public class HomePage {
	@FindBy(xpath = "//li[@class='_1-qoxT']")
	private WebElement notificationLink;
	@FindBy(xpath = "//div[4]/div/div/div/div")
	private WebElement moreLink;
	@FindBy(xpath = "//div[@class=\"_3yG-R_\"]")
	private WebElement moreText;
	@FindBy(partialLinkText = "Login")
	private WebElement loginlink;
	@FindBy(className = "_1e_EAo")
	private WebElement flipkartLogo;
	@FindBy(xpath = "//div[@class='dHGf8H']")
	private WebElement myaccount;
	@FindBy(xpath = "//a[contains(@href, '/wishlist?link=home_wishlist')]")
	private WebElement wishlist;
	@FindBy(xpath = "//span[@class=\"_1QZ6fC _3Lgyp8\"]")
	private WebElement Electronics;
	@FindBy(linkText = "Mi")
	private WebElement product;
	@FindBy(xpath = "//li[2]/a/div")
	private static WebElement sellOnLink;
	@FindBy(xpath = "//a[contains(@href, '/helpcentre')]")
	private static WebElement customerLink;
	@FindBy(xpath = "//a[contains(.,'Advertise')]")
	private WebElement advertiseLink;
	@FindBy(xpath = "//li[5]/a/div")
	private WebElement downloadLink;
	public HomePage() {
		PageFactory.initElements(BaseClass.c, this);
	}
	public static String textOfSellOnLink() {
		String s = sellOnLink.getText();
		return s;
	}
	public static void clickOn247link() {
		customerLink.click();

	}
	public void clickOnAdverstise() {
		advertiseLink.click();
	}
	public String textOfAdvertisementLink() {
		return advertiseLink.getText();

	}

	public String textOfDownloadLink() {
		return downloadLink.getText();

	}

	public void clickOndownload() {
		downloadLink.click();
	}
	public String textOf247Link() {
		return customerLink.getText();

	}
	public void clickOnSellonLink() {
		sellOnLink.click();
	}
	public void clickOnNotificationLink() {
		notificationLink.click();
	}

	public void mouseHoverOnMore() throws InterruptedException {
		Thread.sleep(5000);
		Actions a = new Actions(BaseClass.c);
		a.moveToElement(moreLink).perform();

	}

	public String getTextOfMore() {
		String s = moreText.getText();
		return s;
	}

	public void clickOnProduct() {
		product.click();
	}

	public String textOfWishlist() {
		String s = wishlist.getText();
		return s;

	}

	public void mouseHoverToMyAccount() throws InterruptedException {
		Thread.sleep(5000);
		Actions a = new Actions(BaseClass.c);
		a.moveToElement(myaccount).perform();
	}

	public void mouseHoverToElectronics() throws InterruptedException {
		Thread.sleep(5000);
		Actions a = new Actions(BaseClass.c);
		a.moveToElement(Electronics).perform();

	}

	public void clickOnWishlistLink() {
		wishlist.click();
	}

	public void clickOnLoginLink() {
		loginlink.click();
	}

	public void validateWithLogo() {
		SoftAssert s = new SoftAssert();
		s.assertTrue(flipkartLogo.isDisplayed(), "flipkartlogo is not displayed on home page");
		System.out.println("flipkartlogo is displayed on home page");
		s.assertAll();
	}

	String actual = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";

	public void validateTittle() {
		assertEquals(actual, BaseClass.c.getTitle(), "the tittle is not verified by actual");
		System.out.println("the tittle is verified by actual");
	}

}
