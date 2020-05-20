package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import com.base.MyntraBase;
import com.pages.MyntraHome;
import com.pages.MyntraLogin;
import com.pages.MyntraWishlist;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyntraWishlist_StepDefinition extends MyntraBase {

	// WISHLIST
	MyntraWishlist w;
	MyntraLogin l;
	MyntraHome h;

	@Then("^Click on WISHLIST$")
	public void click_on_WISHLIST() {
		w = new MyntraWishlist(driver);
		w.addWishlist();

	}
	@Then("^Click WISHLIST$")
	public void click_WISHLIST() {
		w = new MyntraWishlist(driver);
		w.addWishlist1();
		
	}

	@Then("^Move cursor to Profile and Click on Wishlist$")
	public void move_cursor_to_Profile_and_Click_on_Wishlist() {
		l = new MyntraLogin(driver);
		l.profileBtn();
		w.clickWishlist();
	}
	
	@When("^Click on MOveToBag Select Size and Click on Done$")
	public void click_on_MOveToBag_Select_Size_and_Click_on_Done() {
		h = new MyntraHome(driver);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // waits until page loads up to 40 seconds
		w.moveToBag();
		String actual4 = driver.getTitle();
		Assert.assertEquals(actual4, "Wishlist"); // Validating Actual Title and Expected Title
		System.out.println("PageTitle4 = " + actual4);
		h.size();
		h.addToBagDone();
	}

}