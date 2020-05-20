package com.pages;

import java.util.ArrayList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.MyntraBase;

public class MyntraSort_By extends MyntraBase {
//	Declaring Element for sortBy
	@FindBy(className = "sort-sortBy")
	WebElement sb;
//	Declaring Element for LowToHigh
	@FindBy(xpath = "//label[contains(text(),'Price: Low to High')]")
	WebElement ltoh;
//	Declaring Element for LowToHigh
	@FindBy(xpath = "//label[contains(text(),'Price: High to Low')]")
	WebElement htol;
//	Declaring Element for AddToBag
	@FindBy(xpath = "//body/div/div/div/main/div/div/div/div/section/ul/li[1]/a[1]/div[1]/div[1]")
	WebElement atobag;
//	Declaring Element for Size
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/main[1]/div[3]/div[2]/div[1]/div[2]/section[1]/ul[1]/li[1]/div[5]/div[2]/button[1]")
	WebElement sizzz;

//  Initialization of Constructor
	public MyntraSort_By(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

// Utilization of sortBy DropDown using Action Class
	public void sortBy() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(sb)); // Waits up to 30seconds until visibility Of element
		Actions action = new Actions(driver);
		action.moveToElement(sb).perform();

	}

// Utilization of LowToHigh option
	public void lowToHigh() throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 30); // Waits up to 30seconds until elementToBeClickable
		wait.until(ExpectedConditions.elementToBeClickable(ltoh)).click();
		Thread.sleep(2000);
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='product-price']"));

		int count = price.size();
		System.out.println("No of Items : " + count);// print count of products

		List<String> prices = new ArrayList<String>();
		for (WebElement e : price) {

			String s1 = e.getText().substring(4);
			char ch[] = s1.toCharArray();
			for (int i = 0; i < ch.length; i++) {

				if (ch[i] == '(' || ch[i] == 'R') {

					break;
				}

			}
			System.out.println("Rs : " + s1); // print price of the products
		}

		ArrayList<Integer> priceList = new ArrayList<Integer>();
		for (int i = 0; i < prices.size(); i = i + 1) {
			priceList.add(Integer.parseInt(prices.get(i)));
		}
		if (ascendingCheck(priceList)) {
			System.out.println("Low to High Sorted Prices are Displayed properly in Ascending order");
		} else
			System.out.println(" Not in Ascending order");
	}

	Boolean ascendingCheck(ArrayList<Integer> priceList) {
		for (int i = 0; i < priceList.size() - 1; i++) {
			if (priceList.get(i) > priceList.get(i + 1)) {
				return false;
			}
		}
		return true;
	}

// Utilization of LowToHigh option
	public void highToLow() throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 30); // Waits up to 30seconds until elementToBeClickable
		wait.until(ExpectedConditions.elementToBeClickable(htol)).click();
		Thread.sleep(2000);
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='product-price']"));

		int count = price.size();
		System.out.println("No of Items : " + count);// print count of products

		List<String> prices = new ArrayList<String>();
		for (WebElement e : price) {

			String s1 = e.getText().substring(4);
			char ch[] = s1.toCharArray();
			for (int i = 0; i < ch.length; i++) {

				if (ch[i] == '(' || ch[i] == 'R') {

					break;
				}

			}
			System.out.println("Rs : " + s1); // print price of the products
		}

		ArrayList<Integer> priceList = new ArrayList<Integer>();
		for (int i = 0; i < prices.size(); i = i + 1) {
			priceList.add(Integer.parseInt(prices.get(i)));
		}
		if (DescendingCheck(priceList)) {
			System.out.println("High to Low Sorted Prices are Displayed properly in Descending order");
		} else
			System.out.println(" Not in Descending order");
	}

	Boolean DescendingCheck(ArrayList<Integer> priceList) {
		for (int i = 0; i < priceList.size() - 1; i++) {
			if (priceList.get(i) < priceList.get(i + 1)) {
				return false;
			}
		}
		return true;
	}

// Utilization of addTobag
	public void newAddToBag() {
		WebDriverWait wait = new WebDriverWait(driver, 30); // Waits up to 30seconds until elementToBeClickable
		wait.until(ExpectedConditions.elementToBeClickable(atobag)).click();

	}

// Utilization of size
	public void sizeSelect() {
		WebDriverWait wait = new WebDriverWait(driver, 30); // Waits up to 30seconds until elementToBeClickable
		wait.until(ExpectedConditions.elementToBeClickable(sizzz)).click();

	}

}
