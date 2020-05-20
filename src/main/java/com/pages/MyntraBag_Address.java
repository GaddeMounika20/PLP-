package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.MyntraBase;

public class MyntraBag_Address extends MyntraBase {

//	Declaring Element for Bag Icon	
	@FindBy(xpath = "//span[contains(text(),'Bag')]")
	WebElement bag;
//	Declaring Element for PlaceOrder Button  
	@FindBy(className = "button-base-button")
	WebElement plorder;
//	Declaring Element for Continue Button 
	@FindBy(id = "placeOrderButton")
	WebElement conti;

//  Initialization of Constructor	
	public MyntraBag_Address(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

//Utilization of Bag Icon
	public void bagIcon() {
		WebDriverWait wait = new WebDriverWait(driver, 20); // Waits up to 20seconds until elementToBeClickable
		wait.until(ExpectedConditions.elementToBeClickable(bag)).click();

	}

//Utilization of PlaceOrder Button
	public void placeOrder() {
		WebDriverWait wait = new WebDriverWait(driver, 30); // Waits up to 30seconds until elementToBeClickable
		wait.until(ExpectedConditions.elementToBeClickable(plorder)).click();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

//Utilization of Continue button
	public void continueOrder() {
		WebDriverWait wait = new WebDriverWait(driver, 30);// Waits up to 30seconds until elementToBeClickable
		wait.until(ExpectedConditions.elementToBeClickable(conti)).click();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

}
