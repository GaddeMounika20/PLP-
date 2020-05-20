package com.runner;

import cucumber.api.CucumberOptions;


import cucumber.api.testng.AbstractTestNGCucumberTests;

// Location of feature file
@CucumberOptions(features = "G:\\CG_Automation_GaddeMounika\\AutomationTestingMyntra\\src\\main\\java\\com\\feature",
// Location of stepDefinition
		glue = { "com\\stepdefinition" },
		 
	tags = {"@CreditCard"},
			
// @CreditCard, @NetBanking, @PhonePe, @InvalidCreditCard, @lowToHigh, @HighToLow, @Wishlist.
		dryRun = false,

		monochrome = true, format = { "pretty", "html:target/cucumber-reports/cucumber-pretty" },
   plugin = {"html:target/cucumber-html-report"})
public class EndToEnd_Runner extends AbstractTestNGCucumberTests {

}
