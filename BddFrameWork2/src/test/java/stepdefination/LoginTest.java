package stepdefination;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {

	WebDriver c = null;

	@Given("^user is on home page$")
	public void user_is_on_home_page() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		c = new ChromeDriver();

	}

	@When("^i have on login page$")
	public void i_have_on_login_page() {
		c.get("https://www.flipkart.com/");

	}
	//this by using scenerio ouline and examples
	// this is one used for with out using examples

//	@Then("^user enter \"([^\"]*)\" and \\\"([^\\\"]*)\\\"$")
//	public void user_enter_username_and_password(String username, String password) throws InterruptedException {
//		c.findElement(By.xpath("//input[@class=\"_2zrpKA _1dBPDZ\"]")).sendKeys(username);
//		Thread.sleep(5000);
//		c.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(password);
//
//	}
	
	
	//this is for the normal use without using data driven testing and the usename and password is hardcoded
	
//	@Then("^user enter username and password$")
//	public void user_enter_username_and_password() throws InterruptedException {
//		c.findElement(By.xpath("//input[@class=\"_2zrpKA _1dBPDZ\"]")).sendKeys("9182681329");
//		Thread.sleep(5000);
//		c.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("nikitha123");
//
//	}
	@Then("^user enter username and password$")
	public void user_enter_username_and_password(DataTable credentials) throws InterruptedException  {
	java.util.List<java.util.List<String>> data=	credentials.raw();
	
		c.findElement(By.xpath("//input[@class=\"_2zrpKA _1dBPDZ\"]")).sendKeys(data.get(0).get(0));
		Thread.sleep(5000);
		c.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(data.get(0).get(1));

	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() {
		c.findElement(By.xpath("//button[@class=\"_2AkmmA _1LctnI _7UHT_c\"]")).click();

	}

	@Then("^validate the scenario$")
	public void validate_the_scenario() throws InterruptedException {
		Thread.sleep(5000);
		Actions a = new Actions(c);
		WebElement w = c.findElement(By.xpath("//div[@class=\"dHGf8H\"]"));
		a.moveToElement(w).build().perform();
		Thread.sleep(5000);
		c.findElement(By.xpath("//a[contains(@href, '#')]")).click();
		c.close();

	}

}
