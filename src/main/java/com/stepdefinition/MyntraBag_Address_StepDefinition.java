package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import com.base.MyntraBase;
import com.pages.MyntraBag_Address;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyntraBag_Address_StepDefinition extends MyntraBase {

	MyntraBag_Address b;
	// BAG

	@When("^User Click on Bag$")
	public void user_Click_on_Bag() {
		b = new MyntraBag_Address(driver);
		b.bagIcon();

	}

	@Then("^Page Navigate to Bag page$")
	public void page_Navigate_to_Bag_page()  {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			
		} // Sleep for 2 seconds
		String actual3 = driver.getTitle();
		Assert.assertEquals(actual3, "SHOPPING BAG"); // Validating Actual and Expected Text
		System.out.println("PageTitle3 = " + actual3);
	}

	@Then("^Click on PLACE ORDER$")
	public void click_on_PLACE_ORDER()  {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			
		} // Sleep for 3 seconds
		b.placeOrder();
		
	}

	@Then("^Page Navigate to Address Page$")
	public void page_Navigate_to_Address_Page()  {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			
		} // Sleep for 3 seconds
		String actual4 = driver.getTitle();
		Assert.assertEquals(actual4, "ADDRESS"); // Validating Actual and Expected Text
		System.out.println("PageTitle4 = " + actual4);

	}

	@Then("^Click on CONTINUE$")
	public void click_on_CONTINUE() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			
		} // Sleep for 2 seconds

		b.continueOrder();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // waits until page loads up to 40 seconds
		
	}

}
