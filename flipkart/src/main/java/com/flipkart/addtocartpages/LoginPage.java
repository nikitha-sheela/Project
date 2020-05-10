package com.flipkart.addtocartpages;

import static org.testng.Assert.assertTrue;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;

import com.flipkart.pages.BaseClass;

public class LoginPage {

	HomePaage home = new HomePaage();

	public void enterUsername() {
		BaseClass.driver.findElement(By.xpath(home.readDataFromXml("//elements//LoginPageElements/username")))
				.sendKeys(BaseClass.readdata("Sheet1", 1, 1));
	}

	public void enterPassword() {
		BaseClass.driver.findElement(By.xpath(home.readDataFromXml("//elements//LoginPageElements/password")))
				.sendKeys(BaseClass.readdata("Sheet1", 1, 2));
	}

	public void clickOnLoginButton() {
		BaseClass.driver.findElement(By.xpath(home.readDataFromXml("//elements//LoginPageElements/loginButton")))
				.click();
	}

	public void clickOnCloseButton() {
		BaseClass.driver.findElement(By.xpath(home.readDataFromXml("//elements//LoginPageElements/closeButton")))
				.click();
	}

	public void validateWithLoginText() {
		assertTrue(BaseClass.driver
				.findElement(By.className(home.readDataFromXml("//elements//LoginPageElements/logintext")))
				.isDisplayed(), "User not navigated to LoginPage");
		System.out.println("User navigated to login page");
	}
	
	

}
