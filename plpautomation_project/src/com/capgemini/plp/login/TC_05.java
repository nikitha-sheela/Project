package com.capgemini.plp.login;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_05 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.get("https://www.flipkart.com/");
		c.findElement(By.xpath("//input[@class=\"_2zrpKA _1dBPDZ\"]")).sendKeys("sheela,nikif");
		c.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("nikirtte5h23");
		c.findElement(By.xpath("//button[@class=\"_2AkmmA _1LctnI _7UHT_c\"]")).click();
		Thread.sleep(5000);
		String n = c.findElement(By.xpath("//span[@class=\"ZAtlA-\"]")).getText();
		System.out.println(n);
		c.close();
	}

}
