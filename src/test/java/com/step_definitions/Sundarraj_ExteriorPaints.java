package com.step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.driversetup.Sundarraj_SetUpDriver;
import com.pagefactory.Sundarraj_ExteriorPaintsPageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sundarraj_ExteriorPaints {
	
	WebDriver driver= Sundarraj_SetUpDriver.chromeDriver();
	Sundarraj_ExteriorPaintsPageFactory eppf;
	
	//------ Select_Exterior_paint ------
	
	@Given("User is on the Exterior paints page")
	public void user_is_on_the_Exterior_paints_page() throws InterruptedException {
		driver.navigate().to("https://www.asianpaints.com/");
		String url = driver.getCurrentUrl();
		System.out.println("Url: " + url );
		
		String Title = driver.getTitle();
		String Exp_Title = "Trusted Wall Painting, Home Painting & Waterproofing in India - Asian Paints";
		
		Assert.assertEquals(Title, Exp_Title);
		System.out.println("<<<<<<<<<< TITLE VERIFIED >>>>>>>>>>");
		System.out.println("TITLE: " + Title);
		
		System.out.println("------ User in the Home Page of Asian paint ------");
		Thread.sleep(1000);
		
	    eppf = new Sundarraj_ExteriorPaintsPageFactory(driver);
	    eppf=PageFactory.initElements(driver, Sundarraj_ExteriorPaintsPageFactory.class);
	    
	    eppf.exteriorPaintsPage();
	    
	    System.out.println("------ User in the Exterior Paints page ------");
	    Thread.sleep(2000);
	}

	@When("User click on Wall textures category")
	public void user_click_on_Wall_textures_category() throws InterruptedException {
	    eppf.wallTextures();
	    System.out.println("------ User in the Wall Textures page ------");
	    Thread.sleep(3000);
	}

	@When("User click on View Catalogue of product")
	public void user_click_on_View_Catalogue_of_product() throws InterruptedException {
	    eppf.viewCatalogue();
	    System.out.println("------ User in the Colour page ------");
	    Thread.sleep(3000);
	}

	@And("User select the colour")
	public void user_select_the_colour() throws InterruptedException {
	    eppf.colour();
	    System.out.println("------ Colour is Selected ------");
	    Thread.sleep(3000);
	}

	@Then("User able to see the description of the product")
	public void user_able_to_see_the_description_of_the_product() {
		System.out.println("------ Description of the colour is Displayed ------");
	    eppf.description();
	    	    
	    driver.close();
	    driver.quit();

	}
	
	//------ Search_the_Products ------

	@Given("User is in the Home Page")
	public void user_is_in_the_Home_Page() throws InterruptedException {
		driver.navigate().to("https://www.asianpaints.com/");
		String url = driver.getCurrentUrl();
		System.out.println("Url: " + url );
		
		String Title = driver.getTitle();
		String Exp_Title = "Trusted Wall Painting, Home Painting & Waterproofing in India - Asian Paints";
		
		Assert.assertEquals(Title, Exp_Title);
		System.out.println("<<<<<<<<<< TITLE VERIFIED >>>>>>>>>>");
		System.out.println("TITLE: " + Title);
		
		System.out.println("------ User in the Home Page of Asian paint ------");
		Thread.sleep(1000);
	}

	@When("User click on search box")
	public void user_click_on_search_box() {
		eppf=PageFactory.initElements(driver, Sundarraj_ExteriorPaintsPageFactory.class);
	    eppf.searchBox();
	    System.out.println("------ Search Box is Clicked ------");
	}

	@When("User enter the product name (.+)")
	public void user_enter_the_Ultima_floor_guard(String Pro_Name) {
		eppf.enterProduct(Pro_Name);
		System.out.println("------ Product Name is Entered ------");
	}

	@And("Click on search button")
	public void click_on_search_button() {
	    eppf.searchButton();
	    System.out.println("------ Search Button is Clicked ------");
	}

	@Then("User able to see the searched product")
	public void user_able_to_see_the_searched_product() throws InterruptedException {
	    eppf.productDescription();
	    
	    driver.close();
	    driver.quit();
	}
	
	//------ Search_the_Invalid_Products ------
	
	@Then("User able to see the error message")
	public void user_able_to_see_the_error_message() throws InterruptedException {
		System.out.println("------ Error Message is Displayed ------");
		Thread.sleep(3000);
	    eppf.errorMessage();
	    driver.close();
	    driver.quit();
	}
	
}
