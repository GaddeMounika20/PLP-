package com.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//Location of feature file
@CucumberOptions(features = "G:\\CG_Automation_GaddeMounika\\AutomationTestingMyntra\\src\\main\\java\\com\\feature\\Payment_InvalidInput.feature",
//Location of stepDefinition
		glue = { "com\\stepdefinition" }, 
		
		dryRun = true,
		
		monochrome = true, 
		
		format = { "pretty",
				"html:target/cucumber-reports/cucumber-pretty" })

public class InvalidInput_EndToEnd_Runner extends AbstractTestNGCucumberTests {

}
