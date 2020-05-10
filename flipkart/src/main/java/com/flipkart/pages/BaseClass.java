package com.flipkart.pages;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {

	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./src/main/resources/drivers/geckodriver.exe");
	}
	// Declare the WebDriver
	public static WebDriver driver;

	// these method open the browser
	public void openbrowser() {

		// declaration of a variable for browser
		String browser = "chrome";
		// check if parameter passed is 'chrome'
		if (browser.equalsIgnoreCase("chrome")) {
			// create chrome instance
			driver = new ChromeDriver();
			// set path to chromedriver.exe

			// check if parameter passed is 'firefox'
		} else if (browser.equalsIgnoreCase("firefox")) {
			// create firefox instance
			driver = new FirefoxDriver();
			// set path to firefox.exe
		} else { // if no browser passed throw exception throw new
			System.out.println("Browser is not correct");
		}
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// maximize the browser
		driver.manage().window().maximize();

		// it will delete all cookies which are opened in the web page
		driver.manage().deleteAllCookies();

	}

	// this method will enter the url on the browser
	public void EnterURL() {

		driver.get(readdata("Sheet1", 1, 0));
	}

	// This method will get tittle of web application
	public void GetTitle() {
		String s = driver.getTitle();
		System.out.println(s);
	}

	// this method will execute after each test tag
	public void closebrowser() {
		// quit method will close all the windows
		driver.quit();
	}
	/*
	 * these method will read data from excel
	 * 
	 * @param sheet -the sheet of excel
	 * 
	 * @param row- row number in the excelsheet
	 * 
	 * @param cellnum-cell number in the excelsheet
	 * 
	 * return string
	 */

	public static String readdata(String sheet, int rownum, int cellnum) {
		/*
		 * we suspect that this block of statement can throw exception so we handled it
		 * by placing these statements inside try and handled the exception in catch
		 * block
		 */
		try {
			// creat an object of fileinputstream class to read excel file
			FileInputStream fis = new FileInputStream("./src/test/resources/testdata/userdata.xlsx");
			// the creat method is used to copy the exce
			Workbook w1 = WorkbookFactory.create(fis);
			// get the sheet and getrow and getcell and getvalue which we want read
			String s = w1.getSheet(sheet).getRow(rownum).getCell(cellnum).getStringCellValue();
			System.out.println(s);
			return s;
		}
		// this block will only excute if any exception occurs in try block
		catch (Exception e) {
			return "invalid data";
		}
	}

	public void logout() throws InterruptedException {
		Thread.sleep(5000);
		Actions a = new Actions(driver);
		WebElement w = driver.findElement(By.xpath("//div[@class=\"dHGf8H\"]"));
		a.moveToElement(w).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@href, '#')]")).click();

	}

}