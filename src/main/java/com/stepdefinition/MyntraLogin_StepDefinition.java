package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import com.base.MyntraBase;
import com.base.MyntraData;

import com.pages.MyntraLogin;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyntraLogin_StepDefinition extends MyntraBase {

	MyntraLogin l;
	MyntraData d;

	@Given("^User is on Chrome Browser$")
	public void user_is_on_Chrome_Browser() {
		MyntraBase.browser();

	}

	@When("^Enter URL for the Website$")
	public void enter_URL_for_the_Website() {

		// Navigating through a MyntraWebsite
		driver.get("https://www.myntra.com/");

	}

	@Then("^Page Navigate to Home Page$")
	public void page_Navigate_to_Home_Page()  {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			
		} // Sleep for 1 seconds
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		String actual = driver.getTitle(); // Validating Actual Title and Expected Title
		Assert.assertEquals(actual, "Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra");
		System.out.println("PageTitle = " + actual);
	}

	@Then("^Move cursor to profile$")
	public void move_cursor_to_profile() {
		l = new MyntraLogin(driver);
		d = new MyntraData();
		l.profileBtn();
	}

	@Then("^Click on login/Signup$")
	public void click_on_login_Signup() {
		l.logSignin();

	}

	@Then("^Enter mobile number and Click on Continue$")
	public void enter_mobile_number_and_Click_on_Continue() {
		l.loginNumber(d.number());
		l.continueLogin();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // waits until page loads up to 40 seconds
	}

	@Then("^User credentials are wrong$")
	public void user_credentials_are_wrong() {

		String actual1 = driver.getTitle();
		Assert.assertEquals(actual1, "Myntra"); // Validating Actual Title and Expected Title
		System.out.println("PageTitle1 = " + actual1);
	}

	@Then("^Click on Forgot PasswordLink$")
	public void click_on_Forgot_PasswordLink() {
		l.forgotPass();
	}

	@Then("^Enter validEmail \"([^\"]*)\"$")
	public void enter_validEmail(String arg1) {
		l.email(arg1);

	}

	@Then("^Enter validPassword \"([^\"]*)\"$")
	public void enter_validPassword(String arg1) {

		l.password(arg1);
	}

	@When("^User Click on LOG IN$")
	public void user_Click_on_LOG_IN() throws Exception {
		l.login();
		System.out.println("Login Successfully");

	}
	// Back to home page and logout steps

	@Then("^Navigate to Home Page and LogOut$")
	public void navigate_to_Home_Page_and_LogOut() {

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);// waits until page loads up to 40 seconds
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back(); // navigates to Home Page

		l.profileBtn();
		l.logoutBtn();
		driver.close(); // Close the browser
	}

// using Data Table
	
	@Then("^Enter valid Email and valid Password$")
	public void enter_valid_Email_and_valid_Password(DataTable arg1) {
		l.emailPassword(arg1);
	}
// using ExcelData
	
	@Then("^Enter validEmail$")
	public void enter_validEmail() throws Exception  {
		
		l.email2(d.data1(1, 0));
	    
	}

	@Then("^Enter validPassword$")
	public void enter_validPassword() throws Exception   {
		l.password2(d.data1(1, 1));
	  
	}
}
