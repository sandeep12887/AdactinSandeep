package com.adactin.stepDef;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;


import com.helper.PageObjectManager;
import com.helper.PropertyReaderManager;
import com.runner.TestRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition extends BaseClass {
	public WebDriver driver = TestRunner.driver;
	PageObjectManager pm=new PageObjectManager(driver);

	@Given("^User should launch the adactin application$")
	public void user_should_launch_the_adactin_application() throws Throwable {
	
		driver.get(PropertyReaderManager.getInstance().getPr().getUrl());
		//new entry
 
	}

	@Then("^User should Validate the login page$")
	public void user_should_Validate_the_login_page() throws Throwable {
	    
	    
	}

	@Then("^User enter the username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enter_the_username_and_password(String arg1, String arg2) throws Throwable {
	    
	    
	}

	@Then("^User enter the login button$")
	public void user_enter_the_login_button() throws Throwable {
	    
	    
	}

	@Then("^user should validate the username$")
	public void user_should_validate_the_username() throws Throwable {
	    
	    
	}

	@Then("^user click the logout Button$")
	public void user_click_the_logout_Button() throws Throwable {
	    
	    
	}

	@Then("^User verify that correct username is displayed on the login page$")
	public void user_verify_that_correct_username_is_displayed_on_the_login_page() throws Throwable {
	    
	    
	}

	@Then("^User should location as in test data \"([^\"]*)\"$")
	public void user_should_location_as_in_test_data(String arg1) throws Throwable {
	    
	    
	}

	@Then("^User should hotel as in test data \"([^\"]*)\"$")
	public void user_should_hotel_as_in_test_data(String arg1) throws Throwable {
	    
	    
	}

	@Then("^User should room type as in test data \"([^\"]*)\"$")
	public void user_should_room_type_as_in_test_data(String arg1) throws Throwable {
	    
	    
	}

	@Then("^User should no-of-rooms as in test data \"([^\"]*)\"$")
	public void user_should_no_of_rooms_as_in_test_data(String arg1) throws Throwable {
	    
	    
	}

	@Then("^User Enter check-in-date as in test data \"([^\"]*)\"$")
	public void user_Enter_check_in_date_as_in_test_data(String arg1) throws Throwable {
	    
	    
	}

	@Then("^User Enter check-out-date as in test data \"([^\"]*)\"$")
	public void user_Enter_check_out_date_as_in_test_data(String arg1) throws Throwable {
	    
	    
	}

	@Then("^User Verify that system gives an error message for check in date$")
	public void user_Verify_that_system_gives_an_error_message_for_check_in_date() throws Throwable {
	    
	    
	}

	@Then("^User Verify that system gives an error message for check out date$")
	public void user_Verify_that_system_gives_an_error_message_for_check_out_date() throws Throwable {
	    
	    
	}

	@Then("^User click the search button$")
	public void user_click_the_search_button() throws Throwable {
	    
	    
	}
}