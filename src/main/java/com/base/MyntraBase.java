package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraBase {
	public static WebDriver driver;

	static {
		// Configuring the system properties of chromeDriver 
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void browser() {

		// Initializing the browser driver
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		// It will wait up to 40seconds until page loads
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		// waits up to 40 seconds until find element/find elements
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

}
