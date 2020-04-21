package com.capgemini.plp.wishlist;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	public static WebDriver c;

	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		c = new ChromeDriver();
		c.get("https://www.flipkart.com/");
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public void login() {
		c.findElement(By.xpath("//input[@class=\"_2zrpKA _1dBPDZ\"]")).sendKeys("9182681329");

		c.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("nikitha123");
		c.findElement(By.xpath("//button[@class=\"_2AkmmA _1LctnI _7UHT_c\"]")).click();

	}

	public void logout() throws InterruptedException {
		Thread.sleep(5000);
		Actions a = new Actions(c);
		WebElement w = c.findElement(By.xpath("//div[@class=\"dHGf8H\"]"));
		a.moveToElement(w).build().perform();
		Thread.sleep(5000);
		c.findElement(By.xpath("//a[contains(@href, '#')]")).click();

	}

	public void closeBrowser() {
		c.close();

	}

}
