package com.capgemini.plp.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_14 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.get("https:www.flipkart.com");
//		Thread.sleep(5000);
		c.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		WebElement e = c.findElement(By.xpath("//div[@class=\"_1jcwFN _3dmQRh\"]"));
		Actions a = new Actions(c);
		a.moveToElement(e);
		Thread.sleep(5000);

		c.findElement(By.xpath("//div[@class=\"_2HFOTA\"]")).click();

	}

}
