package com.step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.driversetup.Sundarraj_SetUpDriver;
import com.pagefactory.Sundarraj_ColoursAndPaintsPageFactory;
import com.screenshot.Sundarraj_ScreenshotCapture;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sundarraj_Colour_Catalogue {
	WebDriver driver = Sundarraj_SetUpDriver.chromeDriver();
	Sundarraj_ColoursAndPaintsPageFactory cpf;
	Sundarraj_ScreenshotCapture sc;
	
	//------------------ Display_the_list -------------------
	
	@Given("User is on the Home Page of Asian Paints")
	public void user_is_on_the_Home_Page() throws InterruptedException {
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
	
	@When("User hover the mouse on paints and colour")
	public void user_hover_the_mouse_on_paints_and_colour() throws Exception {
		cpf = new Sundarraj_ColoursAndPaintsPageFactory(driver);
		cpf=PageFactory.initElements(driver, Sundarraj_ColoursAndPaintsPageFactory.class);
	    cpf.paintsColours();
	    System.out.println("------ Hover on the Paints and Colours ------");
	    Thread.sleep(2000);
	}

	@Then("Paints and colours list is displayed")
	public void paints_and_colours_list_is_displayed() {
		System.out.println("------ List of paints and Colours are Displayed ------");
		driver.close();
	}
	
	//----------------- Add_product_to_wishlist -------------------
	
	@Given("User is on the paints and colours List")
	public void user_is_on_the_paints_and_colours_List() {
		driver.navigate().to("https://www.asianpaints.com/");
		
		String url = driver.getCurrentUrl();
		System.out.println("Url: " + url );
		
		String Title = driver.getTitle();
		String Exp_Title = "Trusted Wall Painting, Home Painting & Waterproofing in India - Asian Paints";
		
		Assert.assertEquals(Title, Exp_Title);
		System.out.println("<<<<<<<<<< TITLE VERIFIED >>>>>>>>>>");
		System.out.println("TITLE: " + Title);
		
	    System.out.println("----- Paints and colours list is Displayed -----");
	}

	@When("User click on the colour catalogue")
	public void user_click_on_the_colour_catalogue() throws InterruptedException {
	   cpf=PageFactory.initElements(driver, Sundarraj_ColoursAndPaintsPageFactory.class);
	   cpf.colourCatalogue();
	   System.out.println("------ Colour Catalogue is Clicked ------");
	   Thread.sleep(2000);
	}

	@When("user click on colour")
	public void user_click_on_colour() {
		System.out.println("------ Colour is selected ------");
	    cpf.selectColour();
	}

	@And("Click on wishlist icon")
	public void click_on_wishlist_icon() throws InterruptedException {
		Thread.sleep(2000);
	    cpf.wishListIcon();
	}

	@Then("Paint catalogue is added to the wishlist")
	public void paint_catalogue_is_added_to_the_wishlist() throws InterruptedException {
		cpf.logIn("7339433732");
	    System.out.println("------ The catalogue is added to Wishlist ------");
	    Thread.sleep(5000);
	    driver.close();
	}
	
	//------------------ Log_out -------------------
	
		@When("User click on the profile icon")
		public void user_click_on_the_profile_icon() {
			cpf=PageFactory.initElements(driver, Sundarraj_ColoursAndPaintsPageFactory.class);
		    cpf.profileIcon();
		    System.out.println("------ Profile Icon is Clicked ------");
		    
		}

		@And("Click on sign out")
		public void click_on_sign_out() {
		    cpf.signOut();
		    System.out.println("------ Sign Out is Clicked ------");
		}

		@Then("Account is Log Out Successfully")
		public void account_is_Log_Out_Successfuly() {
			System.out.println("------ Signed Out Successfully ------");
		    driver.close();
		    driver.quit();
		}
	
	//----------------- Buy_Now -------------------
	
	@When("User login to the application")
	public void user_login_to_the_application() throws InterruptedException {
		cpf=PageFactory.initElements(driver, Sundarraj_ColoursAndPaintsPageFactory.class);
	    cpf.log_In_Buy_Now("7339433732");
	    System.out.println("------ Application is Log in Successfully ------");
	}

	@When("Click on Wishlist icon")
	public void click_on_Wishlist_icon() throws InterruptedException {
	    cpf.clickOnWishListIcon();
	    System.out.println("------ Wishlist Icon is Clicked ------");
	}

	@When("User click on the product")
	public void user_click_on_the_product() {
	    cpf.clickOnProduct();
	    System.out.println("------ Product is Selected ------");
	}

	@When("User enter the pincode")
	public void user_enter_the() throws InterruptedException {
	    cpf.PinCode("639004");
	    System.out.println("------ Pincode is Entered ------");
	}

	@And("Click on buy now button")
	public void click_on_buy_now_button() {
	    cpf.buyNowButton();
	    System.out.println("------ Buy Now Button is Clicked ------");
	}

	@Then("User able to see the delivery address page")
	public void user_able_to_see_the_delivery_address_page() {
	    cpf.paymentDetails();
	    driver.close();
	}
	
	
	//----------------- Filter_the_Products -------------------
	
	@Given("User is on the Colours Catalogue page")
	public void user_is_on_the_Colours_Catalogue_page() throws InterruptedException {
		driver.navigate().to("https://www.asianpaints.com/catalogue/colour-catalogue.html");
		
		String url = driver.getCurrentUrl();
		System.out.println("Url: " + url );
		
		String Title = driver.getTitle();
		String Exp_Title = "Wall Paint Colour Catalogue, Combination & Latest Colour Shade Card - Asian Paints";
		
		Assert.assertEquals(Title, Exp_Title);
		System.out.println("<<<<<<<<<< TITLE VERIFIED >>>>>>>>>>");
		System.out.println("TITLE: " + Title);
		
		System.out.println("------ User in the Colours Catalogue page ------");
		Thread.sleep(1000);
	}

	@When("User apply the filters")
	public void user_apply_the_filters() throws InterruptedException {
		cpf=PageFactory.initElements(driver, Sundarraj_ColoursAndPaintsPageFactory.class);
	    cpf.filters();
	    System.out.println("------ Filters are Applied ------");
	}

	@Then("User able to see the filtered products")
	public void user_able_to_see_the_filtered_products() throws InterruptedException {
		System.out.println("------ Product Details ------");
		cpf.filteredProducts();
	
	}

	
	//----------------- Enquiry_Now -------------------
	
	@When("User Enters the Name (.+)")
	public void user_Enters_the_Name(String name) {
	   cpf=PageFactory.initElements(driver, Sundarraj_ColoursAndPaintsPageFactory.class);
	   cpf.enquiryName(name);
	   System.out.println("------ Name is Entered ------");
	}

	@When("User Enter Email (.+)")
	public void user_Enter_Email(String email) throws InterruptedException {
	   Thread.sleep(1000);
	   cpf.enquiryEmail(email);
	   System.out.println("------ Email is Entered ------");
	}

	@When("User Enter Mobile Number (.+)")
	public void user_Enter_Mobile_Number(String mobile) throws InterruptedException {
		Thread.sleep(1000);
	    cpf.enquiryMobile(mobile);
	    System.out.println("------ Mobile Number is Entered ------");
	}

	@When("User Enter Pincode (.+)")
	public void user_Enter_Pincode(String pincode) throws InterruptedException {
		Thread.sleep(1000);
	    cpf.enquiryPincode(pincode);
	    System.out.println("------ Pincode is Entered ------");
	}

	@And("Click on Enquire Now button")
	public void click_on_Enquire_Now_button() throws InterruptedException {
		Thread.sleep(1000);
	    cpf.enquiryButton();
	    Thread.sleep(2000);
	    System.out.println("------ Enquiry Now Button is Clicked ------");
	}

	@Then("Successful Completion message is displayed")
	public void successful_Completion_message_is_displayed() throws InterruptedException {
	    System.out.println("--------- successfully completed ----------");
	    cpf.thankyouMessage();
	    
	    driver.close();
	    driver.quit();
	}
	
	//----------------- Enquiry_Now_unsuccessful -------------------
	
	@Then("Error message is displayed")
	public void error_message_is_displayed() throws InterruptedException {
	    
		System.out.println("------  Error Messages ------");
		
		cpf=PageFactory.initElements(driver, Sundarraj_ColoursAndPaintsPageFactory.class);
		sc = new Sundarraj_ScreenshotCapture(driver);
		sc.capture();
		cpf.pincodeErrorMsg();
		driver.close();
	    driver.quit();
		
	}
	


}