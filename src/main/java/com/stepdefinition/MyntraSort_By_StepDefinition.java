package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import com.base.MyntraBase;

import com.pages.MyntraSort_By;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyntraSort_By_StepDefinition extends MyntraBase {
	MyntraSort_By s;

	@Then("^Place the cursor on SORT BY$")
	public void place_the_cursor_on_SORT_BY() throws Exception {
		s = new MyntraSort_By(driver);
		s.sortBy();
	}

	@Then("^Click on LOW TO HIGH$")
	public void click_on_LOW_TO_HIGH() throws Exception {
		s.lowToHigh();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

	@Then("^Click on HIGH TO LOW$")
	public void click_on_HIGH_TO_LOW() throws Exception {
		s.highToLow();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

	@When("^Validate Sorted prices$")
	public void validate_Sorted_prices() {
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		
	}

	@Then("^Click on AddtoBag and Select Size$")
	public void click_on_AddtoBag_and_Select_Size() throws InterruptedException {
		s.newAddToBag();
		s.sizeSelect();
		

	}

}
