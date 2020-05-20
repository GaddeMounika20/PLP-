package com.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.MyntraBase;

public class MyntraHome extends MyntraBase {
//	Declaring Element for Essentials 
	@FindBy(xpath = "//a[contains(text(),'Essentials')]")
	WebElement ess;
//	Declaring Element for Styling button
	@FindBy(xpath = "//a[contains(text(),'Hair Styling')]")
	WebElement style;
//	Declaring Element for Product(LowToHigh)
	@FindBy(xpath = "//body/div/div/div/main/div/div/div/div/section/ul/li[1]/a[1]/div[1]/div[1]")
	WebElement prod;
//	Declaring Element for Product(HighToLow)
	@FindBy(xpath = "//li[1]//a[1]//div[1]//div[1]//div[1]//div[1]//picture[1]//img[1]")
	WebElement prod1;
//	Declaring Element for AddToBag
	@FindBy(xpath = "//div[contains(text(),'Done')]")
	WebElement done;
//	Declaring Element for Size
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/div[1]/div[2]/div[1]/div[1]/div[3]/button[1]/b[1]")
	WebElement siz;

//  Initialization of Constructor
	public MyntraHome(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

//Utilization of Essentials Using Action Class
	public void essHomeBtn() {
		WebDriverWait wait = new WebDriverWait(driver, 30); // Waits up to 30seconds until Visibility of element
		wait.until(ExpectedConditions.visibilityOf(ess));
		Actions action = new Actions(driver);
		action.moveToElement(ess).perform();
	}

//Utilization of Styling button
	public void styling() {
		WebDriverWait wait = new WebDriverWait(driver, 30);// Waits up to 30seconds until elementToBeClickable
		wait.until(ExpectedConditions.elementToBeClickable(style)).click();

	}

//Utilization of Product Using Action Class
	public void product() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(prod));// Waits up to 30seconds until Visibility of element
		Actions action = new Actions(driver);
		action.moveToElement(prod).perform();

	}
//Utilization of Product Using Action Class
	public void product1() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(prod));// Waits up to 30seconds until Visibility of element
		Actions action = new Actions(driver);
		action.moveToElement(prod1).perform();
		
	}

//Utilization of AddToBag
	public void addToBagDone() {

		WebDriverWait wait = new WebDriverWait(driver, 30);// Waits up to 30seconds until elementToBeClickable
		wait.until(ExpectedConditions.elementToBeClickable(done)).click();

	}

//Utilization of Size
	public void size() {
		WebDriverWait wait = new WebDriverWait(driver, 30);// Waits up to 30seconds until elementToBeClickable
		wait.until(ExpectedConditions.elementToBeClickable(siz)).click();

	}

}
