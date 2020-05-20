package com.stepdefinition;

import com.base.MyntraBase;
import com.pages.InvalidInput;

import cucumber.api.java.en.Then;

public class InvalidInput_StepDefinition extends MyntraBase {
	
	 InvalidInput i;
	
	@Then("^Enter InvalidCardNumber \"([^\"]*)\"$")
	public void enter_InvalidCardNumber(String cardnumber)  {
	 i = new InvalidInput(driver);   
	 i.cardNumber(cardnumber);
	 
	 
	} 

	@Then("^Error Message should display under CardNumber Textfield$")
	public void error_Message_should_display_under_CardNumber_Textfield() {
	   i.cardNumber1();
	}


}
