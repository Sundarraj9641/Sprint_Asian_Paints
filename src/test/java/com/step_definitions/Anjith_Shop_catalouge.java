package com.step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.driversetup.Sundarraj_SetUpDriver;
import com.pagefactory.Anjith_ShopOption_pagefactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Anjith_Shop_catalouge {
	WebDriver driver;
	Anjith_ShopOption_pagefactory aj;

@Given("User is on the Asian Paints application")
public void user_is_on_the_Asian_Paints_application() {
	driver=Sundarraj_SetUpDriver.chromeDriver();
	driver.navigate().to("https://www.asianpaints.com/");
    
}

@When("User clicks on profile button")
public void user_clicks_on_profile_button() {
	aj=new Anjith_ShopOption_pagefactory(driver);
	aj=PageFactory.initElements(driver, Anjith_ShopOption_pagefactory.class);
    aj.profilebutton();
}

@When("User clicks and enters mobile and clicks on submit")
public void user_clicks_and_enters_mobile_and_clicks_on_submit() throws InterruptedException {
	aj=new Anjith_ShopOption_pagefactory(driver);
	aj=PageFactory.initElements(driver, Anjith_ShopOption_pagefactory.class);
    aj.mobilenumber();
}

@When("User clicks on and enters otp and clicks on submit")
public void user_clicks_on_and_enters_otp_and_clicks_on_submit() {
    aj.otpnumber();
}

@And("Clicks on Myprofile")
public void clicks_on_Myprofile() {
	aj.myprofile();
	aj.navigate_profile();
	
}


@Then("User able to see the profile")
public void able_to_signout() {
   //aj.logout();
   
   driver.close();
   driver.quit();
}
	
//---------------------------------------------------------------------------------------------------------------------------------------------------------------



@When("user hovers  mouse on shop")
public void user_hovers_mouse_on_shop() {
	aj=new Anjith_ShopOption_pagefactory(driver);
	aj=PageFactory.initElements(driver, Anjith_ShopOption_pagefactory.class);
	aj.shops_actions();
    
}

@And("click on wallstickers")
public void click_on_wallstickers() {
	
	
	aj.wall_stickers_clicking();
}

@Then("Sould able to navigate and display wall stickers name")
public void sould_able_to_navigate_and_display_wall_stickers_name() {
	aj.Wll_stickers_display();
	
	driver.close();
	driver.quit();
   
//---------------------------------------------------------------------------------------------------------------------------------------------------------------
}
@When("clicks on loadmore")
public void clicks_on_loadmore() {
	aj=PageFactory.initElements(driver, Anjith_ShopOption_pagefactory.class);
	aj.Load_More();
}

@Then("Displays all the stickers in that page")
public void displays_all_the_stickers_in_that_page() {
	String url = driver.getCurrentUrl();
	System.out.println("URL: " + url);
	
	driver.close();
	driver.quit();
    
}
//---------------------------------------------------------------------------------------------------------------------------------------------------------------

@Given("User is on the Wall Stickers page")
public void user_is_on_the_Wall_Stickers_page() {
	driver=Sundarraj_SetUpDriver.chromeDriver();
	driver.navigate().to("https://www.asianpaints.com/online-shop/wall-stickers.html");
}

@When("User click on wall sticker")
public void user_click_on_wall_sticker() {
	aj=PageFactory.initElements(driver, Anjith_ShopOption_pagefactory.class);
	aj.clickOnWallSticker();
}

@When("User enter the pincode")
public void user_enter_the_pincode() throws InterruptedException {
    aj.enterPinCode();
}

@When("Click on buy now button")
public void click_on_buy_now_button() {
   aj.clickOnBuyNow();
}

@Then("Error message is displayed")
public void error_message_is_displayed() {
    aj.errorMessage();
    driver.close();
    driver.quit();
}

//---------------------------------------------------------------------------------------------------------------------------------------------------------------


@When("clicks on filters and selects")
public void clicks_on_filters_and_selects() {
	aj=PageFactory.initElements(driver, Anjith_ShopOption_pagefactory.class);
    aj.size_selecting();
}

@And("clicks on sortby and select one")
public void clicks_on_sortby_and_select_one() throws InterruptedException {
    aj.sorting();
}

@Then("User able to see the filtered products")
public void user_able_to_see_the_filtered_products() {
    driver.close();
    driver.quit();
}

//---------------------------------------------------------------------------------------------------------------------------------------------------------------

@When("User enters the pincode (.+)")
public void user_enter_the_pincode(String pincode) throws InterruptedException {
	aj=PageFactory.initElements(driver, Anjith_ShopOption_pagefactory.class);
    aj.pin(pincode);
}

@Then("User able to see the payment page")
public void user_able_to_see_the_payment_page() {
	 driver.close();
     driver.quit();
}

//---------------------------------------------------------------------------------------------------------------------------------------------------------------

@When("User click on wishlist button")
public void user_click_on_wishlist_button() throws InterruptedException {
	aj=PageFactory.initElements(driver, Anjith_ShopOption_pagefactory.class);
    aj.wishList();
}

@And("Click on WishList Icon on the top")
public void click_on_WishList_Icon_on_the_top() {
	 aj.wishListIcon();
}
   

@Then("User able to see the product is added to the wishlist")
public void user_able_to_see_the_product_is_added_to_the_wishlist() {
    
	driver.close();
	driver.quit();
}

//---------------------------------------------------------------------------------------------------------------------------------------------------------------

@When("User enter mail in textbox (.+)")
public void user_enter_mail_in_textbox_anjith_mail_com(String mail) {
	aj=PageFactory.initElements(driver, Anjith_ShopOption_pagefactory.class);
    aj.Mail(mail);
}

@When("User click on Subscribe button")
public void user_click_on_Subscribe_button() {
    aj.subscribe();
}

@Then("Successful Message is shown")
public void error_Message_is_shown() throws InterruptedException {
    aj.errmsg();
    
    driver.close();
    driver.quit();
}

//---------------------------------------------------------------------------------------------------------------------------------------------------------------


@When("User clciks on shop option")
public void user_clciks_on_shop_option() {
	aj=PageFactory.initElements(driver, Anjith_ShopOption_pagefactory.class);
	aj.shop_clicking();    
}

@And("User clciks on EXPLORE NOW and displays Mechanized Tools & Spares")
public void user_clciks_on_EXPLORE_NOW_and_displays_Mechanized_Tools_Spares() {
	aj.Explore_now();
	aj.Text();
}

@And("user clicks on Terms & Conditions")
public void user_clicks_on_Terms_Conditions() {
	aj.Terms_conditions(); 
}

@Then("displays terms and conditions")
public void displays_terms_and_conditions() {
	driver.close();
    driver.quit();
}

//---------------------------------------------------------------------------------------------------------------------------------------------------------------


@And("clicks on signout")
public void licks_on_signout() {
	aj=PageFactory.initElements(driver, Anjith_ShopOption_pagefactory.class);
	aj.My_profile();
}

@Then("able to sign out")
public void able_to_sign_out() {
	driver.close();
    driver.quit();
}


//---------------------------------------------------------------------------------------------------------------------------------------------------------------

@When("able to go to previous page,nexr page,refresh")
public void able_to_go_to_previous_page_nexr_page_refresh() {
    aj.pages();
    }

@Then("able to show user functions are working")
public void able_to_show_user_functions_are_working() {
    aj.pages_displays();
    }








}





