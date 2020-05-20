package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.MyntraBase;
import com.base.MyntraData;

public class MyntraPayment extends MyntraBase {
// CREDIT/DEBIT CARD

//	Declaring Element for Credit option	
	@FindBy(xpath = "//span[contains(text(),'CREDIT')]")
	WebElement credit;
//	Declaring Element for cardNumber
	@FindBy(xpath = "//input[@id='cardNumber']")
	WebElement cnum;
//	Declaring Element for cardName
	@FindBy(id = "cardName")
	WebElement cname;
//	Declaring Element for expiryMonth
	@FindBy(id = "expiryMonth")
	WebElement emon;
//	Declaring Element for expiryYear
	@FindBy(id = "expiryYear")
	WebElement eyr;
//	Declaring Element for Cvv
	@FindBy(id = "cvv")
	WebElement cvvnum;
//	Declaring Element for payNow
	@FindBy(className = "payNowForm-base-action")
	WebElement pnow;

	// NET BANKING
	
//	Declaring Element for netBanking option
	@FindBy(xpath = "//div[@id='netbanking']")
	WebElement net;
//	Declaring Element for SBI
	@FindBy(xpath = "//div[@class='sprite-wallet-sbi netBanking-base-bankIcon']")
	WebElement sbi;
//	Declaring Element for PayNow from SBI
	@FindBy(className = "payNowForm-base-action")
	WebElement payfrmsbi;

	// PHONEPE
	
//	Declaring Element for PhonePe Option
	@FindBy(xpath = "//span[contains(text(),'PHONEPE')]")
	WebElement phnpe;
//	Declaring Element for PhonePe 
	@FindBy(id = "upiApp-59")
	WebElement ph;
//	Declaring Element for PhonePe payNow
	@FindBy(xpath = "//button[@id='action-upi']")
	WebElement phnpay;

//  Initialization of Constructor
	public MyntraPayment(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	MyntraData d;
// CREDIT/DEBIT card payment

// Utilization of Credit option
	public void creditCard() {
		WebDriverWait wait = new WebDriverWait(driver, 30);// Waits up to 30seconds until elementToBeClickable
		wait.until(ExpectedConditions.elementToBeClickable(credit)).click();

	}

// Utilization of cardNumber
	public void cardNum(String cardnumber) {
		WebDriverWait wait = new WebDriverWait(driver, 30); // Waits up to 30seconds until Visibility of element
		wait.until(ExpectedConditions.visibilityOf(cnum)).sendKeys(cardnumber);

	}

// Utilization of cardName
	public void cardName(String cardname) {

		WebDriverWait wait = new WebDriverWait(driver, 30); // Waits up to 30seconds until Visibility of element
		wait.until(ExpectedConditions.visibilityOf(cname)).sendKeys(cardname);

	}

// Utilization of expiryMonth using Select class
	public void expiryMonth() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(emon));// Waits up to 30seconds until Visibility of element
		Select s = new Select(emon);
		s.selectByIndex(3);
	}

// Utilization of expiryYear using Select Class
	public void expiryYear() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(eyr)); // Waits up to 30seconds until Visibility of element
		Select s = new Select(eyr);
		s.selectByIndex(4);
	}

// Utilization of cvv
	public void cvvNum(String cvv) {
		WebDriverWait wait = new WebDriverWait(driver, 30);// Waits up to 30seconds until Visibility of element
		wait.until(ExpectedConditions.visibilityOf(cvvnum)).sendKeys(cvv);

	}

// Utilization of PayNow Button
	public void paymentBtn() {
		WebDriverWait wait = new WebDriverWait(driver, 30);// Waits up to 30seconds until elementToBeClickable
		wait.until(ExpectedConditions.elementToBeClickable(pnow)).click();
	}

// NET BANKING payment

// Utilization of NetBanking option
	public void netBank() {
		WebDriverWait wait = new WebDriverWait(driver, 30);// Waits up to 30seconds until elementToBeClickable
		wait.until(ExpectedConditions.elementToBeClickable(net)).click();

	}

// Utilization of SBI
	public void sbiBank() {
		WebDriverWait wait = new WebDriverWait(driver, 30);// Waits up to 30seconds until elementToBeClickable
		wait.until(ExpectedConditions.elementToBeClickable(sbi)).click();

	}

//Utilization of PayNow from SBI
	public void payFromBank() {
		WebDriverWait wait = new WebDriverWait(driver, 30);// Waits up to 30seconds until elementToBeClickable
		wait.until(ExpectedConditions.elementToBeClickable(payfrmsbi)).click();

	}

// PHONEPE

//Utilization of phonePe option
	public void phnPeBtn() {
		WebDriverWait wait = new WebDriverWait(driver, 30);// Waits up to 30seconds until elementToBeClickable
		wait.until(ExpectedConditions.elementToBeClickable(phnpe)).click();

	}

//Utilization of phonePe
	public void selectPhnPe() {
		WebDriverWait wait = new WebDriverWait(driver, 30);// Waits up to 30seconds until elementToBeClickable
		wait.until(ExpectedConditions.elementToBeClickable(ph)).click();

	}

//Utilization of phonePe payNow
	public void phnPePay() {
		WebDriverWait wait = new WebDriverWait(driver, 30);// Waits up to 30seconds until elementToBeClickable
		wait.until(ExpectedConditions.elementToBeClickable(phnpay)).click();

	}
	// using Excel sheet

	// Utilization of cardNumber
	public void cardNum2(String string) {
		
		WebDriverWait wait = new WebDriverWait(driver, 30); // Waits up to 30seconds until Visibility of element
		wait.until(ExpectedConditions.visibilityOf(cnum)).sendKeys(string);

	}

	// Utilization of cardName
	public void cardName2(String string) {

		WebDriverWait wait = new WebDriverWait(driver, 30); // Waits up to 30seconds until Visibility of element
		wait.until(ExpectedConditions.visibilityOf(cname)).sendKeys(string);
	}

	// Utilization of Cvv
	public void cvvNum2(String string) {
		WebDriverWait wait = new WebDriverWait(driver, 30);// Waits up to 30seconds until Visibility of element
		wait.until(ExpectedConditions.visibilityOf(cvvnum)).sendKeys(string);
	}
}
