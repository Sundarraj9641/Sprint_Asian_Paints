package com.step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.driver.driver_set;

import Page_factory.Asianpaint_pagefactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Shradha_step_defination
{
	WebDriver driver = driver_set.chromeDriver();
	Shradha_Asianpaint_pagefactory obj;
	
	@Given("User is on Home Page")
	public void user_is_on_Home_Page() throws Exception {
	    driver.get("https://www.asianpaints.com/");
	    obj=new Shradha_Asianpaint_pagefactory(driver);
	  obj=PageFactory.initElements(driver,Shradha_Asianpaint_pagefactory.class);
	    
	    Thread.sleep(3000);
	    
	}

	@When("User Navigate to LogIn Page")
	public void user_Navigate_to_LogIn_Page() {
	 
		// driver.get("https://www.asianpaints.com/");
		obj=PageFactory.initElements(driver,Shradha_Asianpaint_pagefactory.class);
	    obj.login_page();
	}

	@When("User enters UserName")
	public void user_enters_UserName() throws Exception {
	    obj.Mobile_number("7774984921");
	}
	

	@When("User click on submit button")
	public void user_click_on_submit_button() throws Exception {
	    obj.Submit_button();
	}

	@Then("User enters otp and clicks on otp_submit button")
	public void user_enters_otp_and_clicks_on_otp_submit_button() throws Exception {
	    obj.Submit_otp_button();
	}
	
	@Then("Login Successfully")
	public void login_Successfully() throws Exception {
	 //  obj.Submit_button();
		System.out.println("login successful");
	   driver.quit();
	}

	@When("User Clicks on SignOut")
	public void user_Clicks_on_SignOut() {
		obj=PageFactory.initElements(driver,Shradha_Asianpaint_pagefactory.class);
	    obj.Signout();
	    
	}

	@Then("User Logout Successfully")
	public void user_Logout_Successfully() {
	    System.out.println("***logout successfully***");
	    driver.quit();
	}

	@When("User clicks on Find a Contractor icon")
	public void user_clicks_on_Find_a_Contractor_icon() throws Exception {
		 obj=new Shradha_Asianpaint_pagefactory(driver);
		  obj=PageFactory.initElements(driver,Shradha_Asianpaint_pagefactory.class);
		    
	   obj.Findcontractor();
	}

	@Then("Find a Contractor page is displayed")
	public void find_a_Contractor_page_is_displayed() {
		 System.out.println("***Contractor page displayed***");
		 driver.quit();
	}

	@Given("User is on Find a Contractor page")
	public void user_is_on_Find_a_Contractor_page() {
		 System.out.println("**User is on Find a Contractor page**");
	}

	@When("User enters pincode {int}")
	public void user_enters_pincode(Integer int1) {
	    obj.Search_contractor_by_pincode("560");
	    
	}

	@When("user clicks Search button")
	public void user_clicks_Search_button() {
	   obj.submit_pincode();
	}

	@Then("Unsuccesful pin Error Message is displayed")
	public void unsuccesful_pin_Error_Message_is_displayed() {
	    System.out.println("Unsuccesful pin Error Message is displayed");
	    driver.quit();
	}

	@Then("Contractor Unsuccessful Error Message must be Enter a valid {int} digit Zip Code")
	public void contractor_Unsuccessful_Error_Message_must_be_Enter_a_valid_digit_Zip_Code(Integer int1) {
	   
	}

	@Then("Contractor Page is displayed")
	public void contractor_Page_is_displayed() {
		driver.quit();
	    
	}


}
