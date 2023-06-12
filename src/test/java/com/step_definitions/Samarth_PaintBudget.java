package com.step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Samarth_PaintBudget
{
	@When("User clicks Paint Budget Calculator tab")
	public void userClicksPaintBudgetCalculatorTab()
	{
		System.out.println("User clicks Paint Budget Calculator tab");
		Samarth_Browser.paintBudgetObj.paintBudget();
	}

	@Then("Paint Budget Calculator is displayed")
	public void paintBudgetCalculatorIsDisplayed()
	{
		System.out.println("Paint Budget Calculator is displayed");
	}

	@Given("User is on Paint Budget Calculator page")
	public void userIsOnPaintBudgetCalculatorPage()
	{
		System.out.println("User is on Paint Budget Calculator page");
	}

	@When("User clicks Re-painting radio button")
	public void userClicksRePaintingRadiobutton() throws InterruptedException 
	{
		System.out.println("Before RePainting");
		Thread.sleep(5000);
		System.out.println("User clicks Re-painting radio button");
		Samarth_Browser.paintBudgetObj.rePainting();
		Thread.sleep(3000);
		System.out.println("After Repainting");

	}

	@When("User clicks Exterior radio button")
	public void userClicksExteriorRadioButton() throws InterruptedException 
	{
		System.out.println("User clicks Exterior radio button");
		Samarth_Browser.paintBudgetObj.exterior();
		Thread.sleep(3000);
	}

	@When("User enters Carpet Area (.+)")
	public void userEntersCarpetArea(String carpet) throws InterruptedException 
	{
		System.out.println("User enters Carpet Area ");
		Samarth_Browser.paintBudgetObj.carpetArea(carpet);
		Thread.sleep(3000);
	}

	@When("User clicks Calculate button")
	public void userClicksCalculateButton()throws InterruptedException 
	{
		System.out.println("User clicks Calculate button");
		Samarth_Browser.paintBudgetObj.calcBudget();
		Thread.sleep(3000);
		System.out.println("After Calculation");
	}

	@Then("Budget calculated is displayed")
	public void budgetCalculatedIsDisplayed() throws Exception
	{
		System.out.println("Budget calculated is displayed");
		//Browser.paintBudgetObj.calcReset();
		Thread.sleep(2000);
		System.out.println("After Reset");
	}

	@Then("Error Message is displayed")
	public void errorMessageIsDisplayed()
	{
		System.out.println("Error Message is displayed");
	}
	
	@Given("User is on Paint Budget Calculator Page")
	public void userIsOnPaintBudgetCalculatorPage1() {
		System.out.println("");
	}
}
