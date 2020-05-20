package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.MyntraBase;

public class MyntraWishlist extends MyntraBase {
//	Declaring Element for wishList
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/main[1]/div[3]/div[2]/div[1]/div[2]/section[1]/ul[1]/li[1]/div[4]/span[1]")
	WebElement wish;
//	Declaring Element for wishList
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/main[1]/div[3]/div[2]/div[1]/div[2]/section[1]/ul[1]/li[1]/div[3]/span[1]")
	WebElement wish1;
//	Declaring Element for wishList Link
	@FindBy(xpath = "//div[contains(text(),'Wishlist')]")
	WebElement wishlink;
//	Declaring Element for Move to Bag
	@FindBy(xpath = "//div//div//div//div//div//div//div[1]//div[2]//div[2]//span[1]//a[1]")
	WebElement mtbag;

//  Initialization of Constructor
	public MyntraWishlist(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

// Utilization of wishList
	public void addWishlist() {
		WebDriverWait wait = new WebDriverWait(driver, 30); // Waits up to 30seconds until elementToBeClickable
		wait.until(ExpectedConditions.elementToBeClickable(wish)).click();

	}
// Utilization of wishList
	public void addWishlist1() {
		WebDriverWait wait = new WebDriverWait(driver, 30); // Waits up to 30seconds until elementToBeClickable
		wait.until(ExpectedConditions.elementToBeClickable(wish1)).click();
		
	}

// Utilization of wishList link
	public void clickWishlist() {
		WebDriverWait wait = new WebDriverWait(driver, 30); // Waits up to 30seconds until elementToBeClickable
		wait.until(ExpectedConditions.elementToBeClickable(wishlink)).click();

	}

// Utilization of Move to Bag
	public void moveToBag() {
		WebDriverWait wait = new WebDriverWait(driver, 30); // Waits up to 30seconds until elementToBeClickable
		wait.until(ExpectedConditions.elementToBeClickable(mtbag)).click();

	}

}
