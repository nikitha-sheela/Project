package com.capgemini.plp.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_06 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c.get("https://www.flipkart.com/");
		
		c.findElement(By.xpath("//input[@class=\"_2zrpKA _1dBPDZ\"]")).sendKeys("9182681329");
		Thread.sleep(5000);
		c.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("nikitha123");
		
		c.findElement(By.xpath("//button[@class=\"_2AkmmA _1LctnI _7UHT_c\"]")).click();
		Thread.sleep(5000);
		Actions a=new Actions(c);
	WebElement w=	c.findElement(By.xpath("//div[@class=\"dHGf8H\"]"));
		a.moveToElement(w).build().perform();
		Thread.sleep(5000);
		c.findElement(By.xpath("//a[contains(@href, '#')]")).click();
	c.close();// 9505305540//Upenderleo2
	}

}
