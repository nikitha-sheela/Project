package pom.eBay.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
protected static WebDriver driver =null;
	
	@FindBy(xpath = "//a[text()='Sign in']")
	private WebElement SignIn;

	@FindBy(id = "userid")
	private WebElement userid;

	@FindBy(id = "pass")
	private WebElement password;

	@FindBy(id = "sgnBt")
	private WebElement SignInBtn;

	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this.driver);
		
		
		
	}
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com");
	}

	public void login() {
		SignIn.click();
		userid.sendKeys("upender.ramidi.urr@gmail.com");
		password.sendKeys("Upender@1");
		SignInBtn.click();
	}

	public void logout() throws InterruptedException {
		Thread.sleep(5000);
		Actions a = new Actions(driver);
		WebElement w = driver.findElement(By.className("gh-t"));
		a.moveToElement(w).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Sign out')]")).click();
	}

	public void closebrowser() {
		driver.close();
	}

}