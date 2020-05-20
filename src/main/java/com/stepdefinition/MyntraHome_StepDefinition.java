package com.stepdefinition;

import java.util.concurrent.TimeUnit;


import com.base.MyntraBase;
import com.pages.MyntraHome;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyntraHome_StepDefinition extends MyntraBase {

	MyntraHome h;

	@When("^User Move cursor to Essentials$")
	public void user_Move_cursor_to_Essentials()  {
		h = new MyntraHome(driver);
        h.essHomeBtn();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

	}
	@Then("^Page Navigate to Essentials Page$")
	public void page_Navigate_to_Essentials_Page()  {
		String actual2 = driver.getTitle();
		if (actual2 != "Essentialspcc - Buy Essentialspcc online in India") {
			System.out.println("SearchPageTitle2 = " + actual2);
		} else
			System.out.println("PageTitle2 = " + actual2);
	}

	@Then("^Click on any one category$")
	public void click_on_any_one_category() throws Exception {
		h.styling();
		
	}

	@Then("^Move cursor to any one product$")
	public void move_cursor_to_any_one_product() throws InterruptedException {
		h.product();
	}
	@Then("^Move cursor to any product$")
	public void move_cursor_to_any_product() throws InterruptedException {
		h.product1();
	}

	@Then("^Click on Add to Bag and Select Size$")
	public void click_on_Add_to_Bag_and_Select_Size() {
		//h.size();
		//h.addToBagDone();
		
	}

	

}
