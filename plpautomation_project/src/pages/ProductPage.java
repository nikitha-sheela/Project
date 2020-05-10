package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProductPage {
	@FindBy(className = "_3wU53n")
	private WebElement productTextToVerify;
	@FindBy(className = "DsQ2eg")
	private WebElement wishlistLink;
	
	

	public ProductPage() {
		PageFactory.initElements(BaseClass.c, this);

	}

	public void clickOnWishlist() {
		wishlistLink.click();
	}

	public String getTextOfProduct() {
		String s = productTextToVerify.getText();
		return s;

	}

}
