package com.step_definitions;

import static org.testng.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Samrudhi_Interior
{

	@When("User clicks Interior Textures  tab")
	public void userClicksInteriorTexturesTab() 
	{
		System.out.println("User clicks Interior Textures  tab");
		Samrudhi_Browser.interiorPgObj.interior();
	}

	@Then("Interior Texture page is displayed")
	public void interiorTexturePageIsDisplayed() 
	{
		System.out.println("Interior Texture page is displayed");
		boolean isinteriorPageDisplayed = Samrudhi_Browser.interiorPgObj.interiorPage.isDisplayed();
		assertTrue(isinteriorPageDisplayed);
	}

	@Given("User is on Interior Textures Page")
	public void userIsOnInteriorTexturesPage()
	{
		System.out.println("User is on Interior Textures Page");
	}

	@When("User clicks on the Interior Textures product")
	public void userClicksOnTheInteriorTexturesProduct() 
	{
		System.out.println("User clicks on the Interior Textures product");
		Samrudhi_Browser.interiorPgObj.interiorProd();
	}

	@Then("Interior Textures Product page is displayed")
	public void interiorTexturesProductPageIsDisplayed()
	{
		System.out.println("Interior Textures Product page is displayed");
	}

	@Given("User is on Interior Textures Product Page")
	public void userIsOnInteriorTexturesProductPage() 
	{
		System.out.println("");
	}

}
