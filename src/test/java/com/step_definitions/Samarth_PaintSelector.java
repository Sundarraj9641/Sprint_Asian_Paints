package com.step_definitions;

import static org.testng.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Samarth_PaintSelector 
{
	@When("User clicks Paint Selector  tab")
	public void userClicksPaintSelectorTab() 
	{
		System.out.println("User clicks Paint Selector  tab");
		Samarth_Browser.paintSelectorgObj.painSelector();
	}

	@Then("Paint Selector page is displayed")
	public void paintSelectorPageIsDisplayed()
	{
		System.out.println("Paint Selector page is displayed");
	}

	@Given("User is on Paint Selector Page")
	public void userIsOnPaintSelectorPage() 
	{
		System.out.println("User is on Paint Selector Page");
		boolean isPaintSelectPageDisplayed = Samarth_Browser.paintSelectorgObj.paint_Select_page.isDisplayed();
		assertTrue(isPaintSelectPageDisplayed);
	}

	@When("User clicks on the Paint Selector product")
	public void userClicksOnThePaintSelectorProduct() 
	{
		System.out.println("User clicks on the Paint Selector product");
	}

	@Then("Paint Selector product  page is displayed")
	public void paintSelectorProductPageIsDisplayed()
	{
		System.out.println("Paint Selector product  page is displayed");
		Samarth_Browser.paintSelectorgObj.paintSelectorProduct();
	}

	@Given("User is on Paint Selector product Page")
	public void userIsOnPaintSelectorProductPage() 
	{
		System.out.println("");
	}
}
