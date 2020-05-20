package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.MyntraBase;

import cucumber.api.DataTable;

public class MyntraLogin extends MyntraBase {
//	Declaring Element for Log/SignIn
	@FindBy(xpath = "//a[@class='desktop-linkButton']")
	WebElement logsign;
//	Declaring Element for login number
	@FindBy(xpath = "//input[@class='form-control mobileNumberInput']")
	WebElement lognumber;
//	Declaring Element for continue
	@FindBy(xpath = "//div[@class='submitBottomOption']")
	WebElement con;
//	Declaring Element for forgot password
	@FindBy(xpath = "//span[contains(text(),'Password')]")
	WebElement fpass;
//	Declaring Element for Email/Mobile
	@FindBy(id = "mobileNumberPass")
	WebElement mobile;
//	Declaring Element for Password
	@FindBy(xpath = "//input[@class='form-control has-feedback']")
	WebElement pass;
//	Declaring Element for Login Button
	@FindBy(xpath = "//button[contains(@class,'lg block submitButton')]")
	WebElement login;
//	Declaring Element for Logout button
	@FindBy(xpath = "//div[contains(text(),'Logout')]")
	WebElement logout;
//	Declaring Element for profile
	@FindBy(xpath = "//span[contains(text(),'Profile')]")
	WebElement profile;

//  Initialization of Constructor
	public MyntraLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

//Utilization of Log/SignIn 
	public void logSignin() {

		WebDriverWait wait = new WebDriverWait(driver, 30);// Waits up to 30seconds until elementToBeClickable
		wait.until(ExpectedConditions.elementToBeClickable(logsign)).click();

	} 

// Utilization of Login number
	public void loginNumber(String string) {
		WebDriverWait wait = new WebDriverWait(driver, 30);// Waits up to 30seconds until Visibility of element
		wait.until(ExpectedConditions.visibilityOf(lognumber)).sendKeys(string);

	}

// Utilization of Continue button
	public void continueLogin() {
		WebDriverWait wait = new WebDriverWait(driver, 30);// Waits up to 30seconds until elementToBeClickable
		wait.until(ExpectedConditions.elementToBeClickable(con)).click();

	}

// Utilization of forgot password
	public void forgotPass() {

		WebDriverWait wait = new WebDriverWait(driver, 30);// Waits up to 30seconds until elementToBeClickable
		wait.until(ExpectedConditions.elementToBeClickable(fpass)).click();
	}

//Utilization of Email/Mobile
	public void email(String string) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(mobile)).clear();// Waits up to 30seconds until Visibility of element
		wait.until(ExpectedConditions.visibilityOf(mobile)).sendKeys(string);

	}

//Utilization of password
	public void password(String string) {
		WebDriverWait wait = new WebDriverWait(driver, 30);// Waits up to 30seconds until Visibility of element
		wait.until(ExpectedConditions.visibilityOf(pass)).sendKeys(string);

	}

//Utilization of Login
	public void login() {
		WebDriverWait wait = new WebDriverWait(driver, 30);// Waits up to 30seconds until elementToBeClickable
		wait.until(ExpectedConditions.elementToBeClickable(login)).click();

	}

//Utilization of Logout
	public void logoutBtn() {
		WebDriverWait wait = new WebDriverWait(driver, 30);// Waits up to 30seconds until elementToBeClickable
		wait.until(ExpectedConditions.elementToBeClickable(logout)).click();

	}

//Utilization of profile using Action Class
	public void profileBtn() {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(profile)); // Waits up to 30seconds until Visibility of element
		Actions action = new Actions(driver);
		action.moveToElement(profile).perform();
	}

//Utilization of Email and Password using Data Tables

	public void emailPassword(DataTable arg1) {
		List<List<String>> ele = arg1.raw();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(mobile)).clear();// Waits up to 30seconds until Visibility of element
		wait.until(ExpectedConditions.visibilityOf(mobile)).sendKeys(ele.get(1).get(0));
		wait.until(ExpectedConditions.visibilityOf(pass)).sendKeys(ele.get(1).get(1));
	}
	
// Utilization of Email/Mobile using ExcelSheet
	
	public void email2(String string) {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(mobile)).clear();// Waits up to 30seconds until Visibility of element
		wait.until(ExpectedConditions.visibilityOf(mobile)).sendKeys(string);

	}

	// Utilization of password
	public void password2(String string) {
		WebDriverWait wait = new WebDriverWait(driver, 30);// Waits up to 30seconds until Visibility of element
		wait.until(ExpectedConditions.visibilityOf(pass)).sendKeys(string);

	}

}
