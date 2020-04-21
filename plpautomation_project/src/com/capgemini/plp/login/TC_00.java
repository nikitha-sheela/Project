package com.capgemini.plp.login;

import org.openqa.selenium.chrome.ChromeDriver;

public class TC_00 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.get("https://www.flipkart.com/");
		c.close();

	}

}
