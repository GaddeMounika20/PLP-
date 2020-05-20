package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import com.base.MyntraBase;
import com.base.MyntraData;
import com.pages.MyntraPayment;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyntraPayment_StepDefinition extends MyntraBase {

	MyntraPayment p;
	MyntraData d;
	// CREDIT/DEBIT card payment

	@Then("^Page Navigate to Payment Page$")
	public void page_Navigate_to_Payment_Page() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {

		}
		p = new MyntraPayment(driver);
		p.creditCard();

	}

	@When("^User Click on CREDIT/DEBIT card field$")
	public void user_Click_on_CREDIT_DEBIT_card_field() {

		String actual5 = driver.getTitle();
		Assert.assertEquals(actual5, "PAYMENT"); // Validating Actual Title and Expected Title
		System.out.println("PageTitle5 = " + actual5);

	}

	@Then("^Enter validCardNumber \"([^\"]*)\"$")
	public void enter_validCardNumber(String arg1) {

		p.cardNum(arg1);
	}

	@Then("^Enter validCardName \"([^\"]*)\"$")
	public void enter_validCardName(String arg1) {
		p.cardName(arg1);
	}

	@Then("^Click on Expiry month dropdown and Select month$")
	public void click_on_Expiry_month_dropdown_and_Select_month() {
		p.expiryMonth();
	}

	@Then("^Click on Expiry year and Select year$")
	public void click_on_Expiry_year_and_Select_year() {
		p.expiryYear();
	}

	@Then("^Enter validCvv \"([^\"]*)\"$")
	public void enter_validCvv(String arg1) throws Exception {

		p.cvvNum(arg1);

	}

	@Then("^Click on PAY NOW button$")
	public void click_on_PAY_NOW_button() {
		p.paymentBtn();

	}

	@Then("^Page Navigate to Payment Processing Page$")
	public void page_Navigate_to_Payment_Processing_Page() {
		try {
			Thread.sleep(4000);
		} catch (Exception e) {

		} // sleep for 3 seconds
		/*
		 * String actual6 = driver.getTitle(); // Validating Actual Title and Expected
		 * Title Assert.assertEquals(actual6, "Purchase has been prevented");
		 * System.out.println("PageTitle6 = " + actual6);
		 */
	}

	// NET BANKING steps
	@When("^User Click on NET BANKING$")
	public void user_Click_on_NET_BANKING() {
		p = new MyntraPayment(driver);

		p.netBank();
	}

	@Then("^Select any one bank$")
	public void select_any_one_bank() throws Exception {
		String actual5 = driver.getTitle();
		Assert.assertEquals(actual5, "PAYMENT"); // Validating Actual Title and Expected Title
		System.out.println("PageTitle5 = " + actual5);

		p.sbiBank();

	}

	@When("^Click on Net Banking PAY NOW button$")
	public void click_on_Net_Banking_PAY_NOW_button() {
		p.payFromBank(); // waits until page loads up to 50 seconds
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	}

	@Then("^Page Navigate to Bank Page$")
	public void page_Navigate_to_Bank_Page() {

		// String actual6 = driver.getTitle();
		// Assert.assertEquals(actual6, "STATE BANK OF INDIA"); // Validating Actual
		// Title and Expected Title
		// System.out.println("PageTitle6 = " + actual6);
	}

	// PHONEPE PAYMENT
	@When("^User Click on PHONEPE$")
	public void user_Click_on_PHONEPE() {
		p = new MyntraPayment(driver);
		p.phnPeBtn();
	}

	@When("^Select Phonepe option$")
	public void select_Phonepe_option() throws Throwable {
		p.selectPhnPe();
		String actual5 = driver.getTitle();
		Assert.assertEquals(actual5, "PAYMENT"); // Validating Actual Title and Expected Title
		System.out.println("PageTitle5 = " + actual5);

	}

	@Then("^Click on PHONEPE PAY NOW button$")
	public void click_on_PHONEPE_PAY_NOW_button() {
		p.phnPePay();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	}

	@Then("^page Navigate to Phonepe page$")
	public void page_Navigate_to_Phonepe_page() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {

		} // Sleep for 2 seconds
			// String actual6 = driver.getTitle();
			// Assert.assertEquals(actual6, "PhonePe | India's Payments App");
			// System.out.println("PageTitle6 = " + actual6); // Validating Actual Title and
			// Expected Title
	}

	// using Excel sheet

	@Then("^Enter valid CardNumber$")
	public void enter_valid_CardNumber() throws Exception {
		d = new MyntraData();
		p.cardNum2(d.data(1, 2));

	}

	@Then("^Enter valid CardName$")
	public void enter_valid_CardName() throws Exception {
		p.cardName2(d.data1(1, 3));

	}

	@Then("^Enter valid Cvv$")
	public void enter_valid_Cvv() throws Exception {
		p.cvvNum2(d.data(1, 4));

	}

}
