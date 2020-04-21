package com.capgemini.plp.login;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_10 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.get("https://www.flipkart.com/");
		c.findElement(By.xpath("//input[@class=\"_2zrpKA _1dBPDZ\"]")).sendKeys("9182681329");
		c.findElement(By.xpath("//a[@class=\"_21JmK0 _1__46T\"]")).click();
		c.close();
	}

}
