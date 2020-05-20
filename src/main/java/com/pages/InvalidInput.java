package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.base.MyntraBase;

public class InvalidInput extends MyntraBase {

//	Declaring Element for CardNumber
	@FindBy(xpath = "//input[@id='cardNumber']")
	WebElement cardnum;
//	Declaring Element for CardNumber Error Message	
	@FindBy(xpath = "//div[contains(text(),'Invalid Card')]")
	WebElement invalid;

//  Initialization of Constructor	
	public InvalidInput(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

//Utilization of CardNumber TextFeild
	public void cardNumber(String cardnumber) {
		WebDriverWait wait = new WebDriverWait(driver, 30); // Waits up to 30seconds until Visibility of element
		wait.until(ExpectedConditions.visibilityOf(cardnum)).sendKeys(cardnumber);

	}

//Utilization of CardNumber Error Message	
	public void cardNumber1() {
		WebDriverWait wait = new WebDriverWait(driver, 10); // Waits up to 30seconds until Visibility of element
		String Errormessage = wait.until(ExpectedConditions.visibilityOf(invalid)).getText();
		// Validating Actual and Expected Error Message
		Assert.assertEquals(Errormessage, "Invalid Card");
		System.out.println("Error Message = " + Errormessage);

	}

}
