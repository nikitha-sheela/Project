package com.capgemini.plp.login;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.get("https://www.flipkart.com/");
		List<WebElement> w = c.findElements(By.xpath("//div[@id=\"container\"]"));
		for (int i = 0; i < w.size(); i++) {
			String s = w.get(i).getText();
			System.out.println(s);

			
		}
		c.close();

	}
}
