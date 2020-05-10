package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CustomerCarePage {
	@FindBy(xpath = "//div[@class='_1GRhLX _3PF7V3']")
	private WebElement HelpWithOrdersOptions;

	@FindBy(xpath = "//div[3]/div/div/div/div/div/div[2]/div")
	private WebElement Helpwithyourorder;
	@FindBy(xpath = "//div[2]/div[2]/div/div/div[2]/div")
	private WebElement productLink;
	@FindBy(xpath = "//div[2]/div/div[3]/div/div")
	private WebElement Iwanttotrackmyorderlink;
	@FindBy(xpath = "//div[2]/div/span/span")
	private WebElement Helpwithotherissues;
	@FindBy(xpath = "//div[2]/div/div[4]/div/div")
	private WebElement Iwanttomanagemyorder;
	@FindBy(xpath = "//div[2]/div/div[5]")
	private WebElement Iwanthelpwithreturnsrefunds;
	@FindBy(xpath = "//div[6]/div/div")
	private WebElement Iwanthelpwithotherissues;

	@FindBy(xpath = "//span[contains(.,'Flipkart Plus')]")
	private WebElement FlipkartPlus;
	@FindBy(xpath = "//span[contains(.,'Flipkart Super Partners')]")
	private WebElement FlipkartSuperPartners;
	@FindBy(xpath = "//span[contains(.,'Order')]")
	private WebElement Orders;
	@FindBy(xpath = "//span[contains(.,'Cancellations and Returns')]")
	private WebElement CancellationsandReturns;
	@FindBy(xpath = "//div[7]/div")
	private WebElement Payment;
	@FindBy(xpath = "//span[contains(.,'Bajaj Finserv EMI')]")
	private WebElement BajajFinservEMI;

	@FindBy(xpath = "//span[contains(.,'SBI Pre-approved loan')]")
	private WebElement SBIPreapprovedloan;

	@FindBy(xpath = "//span[contains(.,'Credit Card No Cost EMI')]")
	private WebElement CreditCardNoCostEMI;
	@FindBy(xpath = "//span[contains(.,'Shopping')]")
	private WebElement Shopping;
	@FindBy(xpath = "//span[contains(.,'Wallet')]")
	private WebElement Wallet;
	@FindBy(xpath = "//span[contains(.,'PhonePe')]")
	private WebElement PhonePe;
	@FindBy(xpath = "//div[10]/div")
	private WebElement Otherslink;
	@FindBy(xpath = "//div[@id='55c9e2086000001100cb508e']")
	private WebElement Shipping;
	@FindBy(xpath = "//div[@id='55c9e22ea900002900b9993b']")
	private WebElement FlipkartFirst;
	@FindBy(xpath = "//span[contains(.,'Selling on Flipkart')]")
	private WebElement SellingonFlipkart;
	@FindBy(id = "55cc919da900003900b99941")
	private WebElement ProductReviews;
	@FindBy(id = "55cddc57b000002c002c170b")
	private WebElement LoginMyAccount;
	@FindBy(xpath = "//span[contains(.,'Privacy & Security')]")
	private WebElement PrivacySecurity;
	@FindBy(xpath = "//span[contains(.,'Warranty')]")
	private WebElement Warranty;
	@FindBy(xpath = "//span[contains(.,'Gift Cards')]")
	private WebElement GiftCards;
	@FindBy(xpath = "//span[contains(.,'Pickup Stores')]")
	private WebElement PickupStores;
	@FindBy(xpath = "//span[contains(.,'Installation')]")
	private WebElement Installation;
	@FindBy(xpath = "//span[contains(.,'Aegon Life Insurance')]")
	private WebElement AegonLifeInsurance;
	@FindBy(xpath = "//span[contains(.,'View More')]")
	private WebElement ViewMore;
	@FindBy(xpath = "//span[2]/span")
	private WebElement postaladdress;

	@FindBy(xpath = "//button[contains(.,'✕')]")
	private WebElement CloseButton;

	public CustomerCarePage() {
		PageFactory.initElements(BaseClass.c, this);
	}

	public void validatewithHelpWithOrdersOptions() {
		assertTrue(HelpWithOrdersOptions.isDisplayed(),"Help options are not displayed");
		System.out.println("Help options are displayed");
	}
	
	public void ClickOnCloseButton() {
		CloseButton.click();
	}

	public void clickOnpostaladdress() {
		postaladdress.click();
	}

	public String postaladdress() {
		String s = postaladdress.getText();
		return s;
	}

	public void clickOnHelpwithyourorder() {
		Helpwithyourorder.click();
	}

	public void clickOnViewMore() {
		ViewMore.click();
	}

	public void clickOnAegonLifeInsurance() {
		AegonLifeInsurance.click();
	}

	public void clickOnInstallation() {
		Installation.click();
	}

	public void clickOnPickupStores() {
		PickupStores.click();
	}

	public void clickOnGiftCards() {
		GiftCards.click();
	}

	public void clickOnWarranty() {
		Warranty.click();
	}

	public void clickOnPrivacySecurity() {
		PrivacySecurity.click();
	}

	public void clickOnLoginMyAccount() {
		LoginMyAccount.click();
	}

	public void clickOnProductReviews() {
		ProductReviews.click();
	}

	public void clickOnSellingonFlipkart() {
		SellingonFlipkart.click();
	}

	public void clickOnFlipkartFirst() {
		FlipkartFirst.click();
	}

	public void clickOnShipping() {
		Shipping.click();
	}

	public void clickOnOthersLink() {
		Otherslink.click();
	}

	public void clickOnPhonePe() {
		PhonePe.click();
	}

	public void clickOnWallet() {
		Wallet.click();
	}

	public void clickOnCreditCardNoCostEMI() {
		CreditCardNoCostEMI.click();
	}

	public void clickOnShopping() {
		Shopping.click();

	}

	public void clickOnHelpwithotherissueslink() {
		Helpwithyourorder.click();
	}

	public void clcikOnSBIPreapprovedloan() {
		SBIPreapprovedloan.click();
	}

	public void clickOnProduct() {
		productLink.click();
	}

	public void clickOnPayments() {
		Payment.click();
	}

	public void clickOnBajajFinservEMI() {
		BajajFinservEMI.click();
	}

	public void clickOnIwanttotrackmyorderlink() {
		Iwanttotrackmyorderlink.click();
	}

	public void clickOnCancellationsandReturns() {
		CancellationsandReturns.click();
	}

	public void clickOnHelpwithotherissues() {
		Helpwithotherissues.click();
	}

	public void clickOnIwanttomanagemyorder() {
		Iwanttomanagemyorder.click();
	}

	public void clickOnIwanthelpwithreturnsrefunds() {
		Iwanthelpwithreturnsrefunds.click();
	}

	public void clickOnIwanthelpwithotherissues() {
		Iwanthelpwithotherissues.click();
	}

	public void clickOnFlipkartPlus() {
		FlipkartPlus.click();
	}

	public void clickOnFlipkartSuperPartners() {
		FlipkartSuperPartners.click();
	}

	public void clickOnOrders() {
		Orders.click();
	}

}
