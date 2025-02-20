package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import utilities.Helper;

public class LoginSteps extends BaseClass{
	
	
	@Given("User Launches Chrome Browser")
	public void user_launches_chrome_browser() {
		loginPage = new LoginPage(Helper.getDriver());
	   
	}

	@When("user opens facebook  portal link {string}")
	public void user_opens_facebook_portal_link(String string) {
	
	}

	@Then("User should see the  page title {string}")
	public void user_should_see_the_page_title(String string) {
	  
	}

	@When("User enters Username as {string} and Password as {string}")
	public void user_enters_username_as_and_password_as(String string, String string2) {
	   
	}

	@Then("User clicks on Login button with expected status as {string}")
	public void user_clicks_on_login_button_with_expected_status_as(String string) {
	  
	}

	@Then("User should see the Facebook Home page on successful login status {string}")
	public void user_should_see_the_facebook_home_page_on_successful_login_status(String string) {
	  
	}

	
	

}
