package com.step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.driver.driver_set;
import Page_factory.Home_Decor_pagefactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Shradha_Home_Decor_defination {

	WebDriver driver=driver_set.chromeDriver(); ;
	Shradha_Home_Decor_pagefactory obj2;
	
	//@HomeDecor_Selector
	@Given("User is on the Asian Paints application")

	public void user_is_on_the_Asian_Paints_application() {


	    driver.navigate().to("https://www.asianpaints.com/");

	    

	}

	@When("User hovers over Home Decor Tab")

	public void user_hovers_over_Home_Decor_Tab() {

		obj2=new Shradha_Home_Decor_pagefactory(driver);

		obj2=PageFactory.initElements(driver, Shradha_Home_Decor_pagefactory.class);

		obj2.Home_Decor_Action();

		obj2.Click_MK();

	}

	 

	@Then("Home Decor Drop down is displayed")

	public void home_Decor_Drop_down_is_displayed() {

		obj2.Get_Text();

	}
	
	//-------------------------------------------------****Explore-Now****----------------------------------------------------------------------------
	
	@Given("User is on modular kitchen page")

	public void user_is_on_modular_kitchen_page() {

	    //driver=driver_set.chromeDriver();
		obj2=new Shradha_Home_Decor_pagefactory(driver);

		obj2=PageFactory.initElements(driver, Shradha_Home_Decor_pagefactory.class);

	    driver.navigate().to("https://www.asianpaints.com/home-decor/kitchen.html");

	}

	 

	@When("User clicks on explore now tab")

	public void user_clicks_on_explore_now_tab() {
		obj2=new Shradha_Home_Decor_pagefactory(driver);

		obj2=PageFactory.initElements(driver, Shradha_Home_Decor_pagefactory.class);
//		obj2=PageFactory.initElements(driver,Home_Decor_pagefactory.class);

		obj2.clicks_on_explore();

	}

	 

	@Then("Explorer page is displayed")

	public void explorer_page_is_displayed() {

	    

	}
	
	

//-----------------------------------------****Project****--------------------------------------------------------------------------------------
	@Given("User is on explorer page")
	public void user_is_on_explorer_page() {
		  //driver=driver_set.chromeDriver();
		 driver.navigate().to("https://www.sleekworld.com/kitchens.html");
	}

	@When("User clicks on project tab")
	public void user_clicks_on_project_tab() {
		obj2=PageFactory.initElements(driver,Shradha_Home_Decor_pagefactory.class);
		obj2.Click_project();
	}

	@Then("project overview is displayed")
	public void project_overview_is_displayed() {
	   
	}
	

//---------------------------------------------*Store_locator_tab*----------------------------------------------------------------------------------------------------------------------------------
	
	@Given("User is on project page")
	public void user_is_on_project_page() {
		driver.navigate().to("https://www.sleekworld.com/kitchens.html");
	}

	@When("User clicks on store_locator")
	public void user_clicks_on_store_locator() {
		obj2=PageFactory.initElements(driver,Shradha_Home_Decor_pagefactory.class);
		obj2.Store_locator();
	}

	@Then("Store locator page displayed")
	public void store_locator_page_displayed() {
	    
	}

//--------------------------------------------------------Successful_&_unsuccessful_storelocator---------------------------------------------------------------------------------------------------
	@Given("User is on Store_locator page")
	public void user_is_on_Store_locator_page() {
		//driver=driver_set.chromeDriver();
		obj2=new Shradha_Home_Decor_pagefactory(driver);

		obj2=PageFactory.initElements(driver, Shradha_Home_Decor_pagefactory.class);
		  driver.navigate().to("https://www.sleekworld.com/retail/store-locator.html");
		  
	}

	@When("User clicks on city")
	public void user_clicks_on_city() {
		//obj2.City_radio();
	}

	@When("User enters wrong city")
	public void user_enters_wrong_city() {
	   
		 obj2. City_locate();
	}

	@When("Clicks on locator button")
	public void clicks_on_locator_button() {
		 obj2.Locate_button();
		
	}

	@Then("Message displayed as Record not found")
	public void message_displayed_as_Record_not_found() {
	  System.out.println("No Record Found");
	}

	@When("User enters correct city")
	public void user_enters_correct_city() {
		//obj2.City_locate();
		
	}

	@Then("stores are shown on map")
	public void stores_are_shown_on_map() {
	   driver.quit();
	}


}
