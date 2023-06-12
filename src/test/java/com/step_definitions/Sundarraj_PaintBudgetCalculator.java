package com.step_definitions;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.driversetup.Sundarraj_SetUpDriver;
import com.pagefactory.Sundarraj_PaintBudgetCalculatorPagefactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sundarraj_PaintBudgetCalculator {

	WebDriver driver = Sundarraj_SetUpDriver.chromeDriver();
	Sundarraj_PaintBudgetCalculatorPagefactory pbcp;
	
	

	//------ Background ------

	@Given("user in the Home page")
	public void user_in_the_Home_page() throws InterruptedException {
		driver.navigate().to("https://www.asianpaints.com/");
		String Title = driver.getTitle();
		System.out.println("TITLE: " + Title);
		System.out.println("------ User in the Home Page of Asian paint ------");
		Thread.sleep(1000);
	}

	@When("User hover the mouse on Paints and Colours")
	public void user_hover_the_mouse_on_Paints_and_Colours() throws InterruptedException {
		pbcp = new Sundarraj_PaintBudgetCalculatorPagefactory(driver);
		pbcp=PageFactory.initElements(driver, Sundarraj_PaintBudgetCalculatorPagefactory.class);
		pbcp.paints_Colours();
		System.out.println("------ Hover on the Paints and Colours ------");
		Thread.sleep(2000);
	}

	@And("Click on Paint Budget Calculator")
	public void click_on_Panit_Budget_Calculator() {
		pbcp.Paint_budget_calculator();
		System.out.println("------ Paint Budget Calculator is Clicked ------");
	}

	@Then("Calculator page is Visible")
	public void calculator_page_is_Visible() {
		System.out.println("------ Paint Budget Calculator is Visible ------");
	}

	//------ Quick_Calculator ------

	@When("User select the Specification of Home")
	public void user_select_the_Specification_of_Home() {
		pbcp=PageFactory.initElements(driver, Sundarraj_PaintBudgetCalculatorPagefactory.class);
		pbcp.Specification();
		System.out.println("------ Specifications are Selected ------");
	}

	@When("User enter the Carpet Area")
	public void user_enter_the_Carpet_Area() throws IOException, InterruptedException {
		pbcp.carpetArea();
		System.out.println("------ Area is Entered ------");
	}

	@And("Click on Calculate Now Button")
	public void click_on_Calculate_Now_Button() throws InterruptedException {
		pbcp.calculateNow();
		System.out.println("------ Calculate Now Button is Clicked ------");
	}

	@Then("User able to see litres of Paint and Price of Paint")
	public void user_able_to_see_litres_of_Paint_and_Price_of_Paint() throws InterruptedException {
		System.out.println("------ Litres and Price ------");
		pbcp.litresAndPrice();
		driver.close();
		driver.quit();
	}


	//------ Advanced_Calculator ------


	@When("User Select the advanced calculator")
	public void user_Select_the_advanced_calculator() throws InterruptedException {
		pbcp=PageFactory.initElements(driver, Sundarraj_PaintBudgetCalculatorPagefactory.class);
		pbcp.advanceCalculator();
		System.out.println("------ Advanced Calculator is Clicked ------");
	}

	@When("User enter the measurements of the home")
	public void user_enter_the_measurements_of_the_home() throws InterruptedException, IOException {
		pbcp.measurements("22", "30", "15", "4", "2");
		System.out.println("------ Measurements are Entered ------");
	}

	@When("Click on Calculate Button")
	public void click_on_Calculate_Button() {
		pbcp.CalculateButton();
		System.out.println("------ Calculate Now button is Clicked ------");
	}

	@Then("User able to see the total price to paint their home")
	public void user_able_to_see_the_total_price_to_paint_their_home() throws IOException {
		System.out.println("------ Price Details ------");
		pbcp.priceDetails();
		driver.close();
		driver.quit();
	}


}
