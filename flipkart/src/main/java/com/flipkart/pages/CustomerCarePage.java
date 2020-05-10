package com.flipkart.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerCarePage {
	WebDriver driver;
	By Helpwithyourorder = By.xpath(readDataFile("Helpwithyourorder"));
	By Product = By.className(readDataFile("Product"));
	By Status = By.xpath(readDataFile("Status"));
	By Orders = By.xpath(readDataFile("Orders"));
	By Qusetion = By.xpath(readDataFile("Qusetion"));
	By answer = By.xpath(readDataFile("answer"));

	public CustomerCarePage() {
		this.driver = BaseClass.driver;

	}

	public void clickOnOrders() {
		driver.findElement(Orders).click();
	}

	public void clickOnAnyQusetion() {
		driver.navigate().refresh();
		driver.findElement(Qusetion).click();
	}

	public void retriveAnswer() {
		String s = driver.findElement(answer).getText();
		System.out.println(s);
	}

	public void retriveStatus() {
		String s = driver.findElement(Status).getText();
		System.out.println(s);
	}

	public void clickOnHelpWithYourOrders() {
		driver.findElement(Helpwithyourorder).click();
	}

	public void clickOnProduct() {
		driver.findElement(Product).click();
	}

	public static String readDataFile(String Key) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("./src\\test\\resources\\testdata\\datafile.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties pro = new Properties();
		try {
			pro.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String value = pro.getProperty(Key);
		return value;

	}

}
