package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class Sundarraj_ColoursAndPaintsPageFactory {
	WebDriver driver;
	static WebDriverWait wait;
	Actions pc;
	//------------------ Display_the_list -------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"headerNav\"]/div[1]/ul/li[1]/a[2]")
	@CacheLookup
	WebElement Paints_Colours;
	
	//----------------- Add_product_to_wishlist -------------------
	
	@FindBy(how=How.LINK_TEXT, using="Colour Catalogue")
	@CacheLookup
	WebElement Colours_Catalogue;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"colorCatalogueListForm-apRvm\"]/li[1]/ul/li[2]/div/div[1]")
	@CacheLookup
	WebElement Colour_picking;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"js-shade-palette-append\"]/div/div[1]/div[2]/p")
	@CacheLookup
	WebElement Colour_Code;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"img7\"]/picture/span")
	@CacheLookup
	WebElement WishList_Button;
	
	@FindBy(how=How.ID, using="loginMobile")
	WebElement Mobile_number;
	
	@FindBy(how=How.XPATH, using="//button[@class='ctaText modal__variant-login--submit']")
	WebElement Submit_Button_MobileNo;
	
	@FindBy(how=How.XPATH, using="//button[@class='ctaText validate-login  modal__variant-login--submit']")
	WebElement Submit_Button_Otp;
	
	//------------------ Log_out -------------------
	
	@FindBy(how=How.XPATH, using="//a[contains(@class, 'logout-link')]")
	WebElement Sign_Out;
	
	//----------------- Buy_Now -------------------
	
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div/div[1]/div/div/header/div[2]/div[2]/div[1]/a[1]")
	WebElement Login_Icon;
	
	@FindBy(how=How.XPATH, using="//span[@class='spriteIcon-Firstfold wishListIcon']")
	WebElement Click_On_WishList;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"ap-wishlist\"]/div/div[2]/div/div[2]/div/div/div/a[2]/div")
	WebElement Click_On_Product;
	
	@FindBy(how=How.ID, using="checkPincode")
	WebElement pincode;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"buy-now-click\"]")
	WebElement Buy_Now_Button;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"checkOutTab-1\"]/div/div[2]/div/div[4]/div[1]/ul[2]/li/span")
	WebElement Payment_Details;
	
	
	//----------------- Filter_the_Products -------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"cc-listing\"]/section[2]/div[2]/div[1]/div/div/div[1]/ul[1]/li[2]/span")
	WebElement Temperature_Filter;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"cc-listing\"]/section[2]/div[2]/div[1]/div/div/div[1]/ul[2]/li[6]/span")
	WebElement Room_Filter;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"colorCatalogueListForm-apRvm\"]/li[1]/ul/li[1]/div/div[1]")
	WebElement pick_colour;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"js-shade-palette-append\"]/div/div[1]/div[2]/h3")
	WebElement Colour_Name;
	
	//----------------- Enquiry_Now -------------------
	
	@FindBy(how=How.ID, using="enquire-name")
	WebElement Enquiry_name;
	
	@FindBy(how=How.NAME, using="ENQUIRE_EMAIL")
	WebElement Enquiry_email;
	
	@FindBy(how=How.NAME, using="ENQUIRE_MOBILE")
	WebElement Enquiry_mobile;
	
	@FindBy(how=How.ID, using="enquire-pincode")
	WebElement Enquiry_pincode;
	
	@FindBy(how=How.XPATH, using="//button[@class='ctaText enquireForm--step-1-submit track_form_submit']")
	WebElement Enquiry_Now_Button;
	
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[1]")
	WebElement Thankyou_message;
	
	//----------------- Enquiry_Now_unsuccessful -------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"pdp-request-call-back-form\"]/div[1]/div[1]/div")
	WebElement ErrorMsg_Name;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"pdp-request-call-back-form\"]/div[1]/div[3]/div")
	WebElement ErrorMsg_MobileNo;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"pdp-request-call-back-form\"]/div[1]/div[4]/div")
	WebElement ErrorMsg_Pincode;
	
	//------------------ Display_the_list -------------------
	
	public Sundarraj_ColoursAndPaintsPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void paintsColours() {
		pc = new Actions(driver);
		pc.moveToElement(Paints_Colours).build().perform();
		
	}
	
	//----------------- Add_product_to_wishlist -------------------
	
	public void colourCatalogue() {
		pc = new Actions(driver);
		pc.moveToElement(Paints_Colours).build().perform();
		pc.moveToElement(Colours_Catalogue).click().build().perform();
    	
	}
	
	public void selectColour() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		jsExecutor.executeScript("arguments[0].click();", Colour_picking);
		
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(Colour_Code));
			
		String colour_Code = Colour_Code.getText();
		System.out.println("Selected: " + colour_Code);
	}
	
	public void wishListIcon() {
		WishList_Button.click();
	}
	
	public void logIn(String MobileNo) throws InterruptedException {
		Thread.sleep(2000);
		Mobile_number.sendKeys(MobileNo);
		Submit_Button_MobileNo.click();
		Thread.sleep(17000);
		Submit_Button_Otp.click();
	}
	
	//------------------ Log_out -------------------
	
	public void profileIcon() {
		Login_Icon.click();
	}
	
	public void signOut() {
		Sign_Out.click();
	}
	
	//----------------- Buy_Now -------------------
	
	public void log_In_Buy_Now(String MobileNo) throws InterruptedException {
		Thread.sleep(1000);
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(Login_Icon));
		Login_Icon.click();
		Sign_Out.click();
		Thread.sleep(1000);
		Login_Icon.click();
		Mobile_number.sendKeys(MobileNo);
		Submit_Button_MobileNo.click();
		Thread.sleep(17000);
		Submit_Button_Otp.click();
	}
	
	public void clickOnWishListIcon() throws InterruptedException {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(Click_On_WishList));
		Thread.sleep(2000);
		Click_On_WishList.click();
	}
	
	public void clickOnProduct() {
		Click_On_Product.click();
	}
	
	public void PinCode(String pin_code) throws InterruptedException {
//		wait = new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.elementToBeClickable(pincode));
//		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
//		jsExecutor.executeScript("windows.scrollBy(0,150)");
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		jsExecutor.executeScript("arguments[0].click();", pincode);
		Thread.sleep(1000);
		pincode.sendKeys(pin_code);
	}
	
	public void buyNowButton() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(Buy_Now_Button));
		Buy_Now_Button.click();
	}
	
	public void paymentDetails() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		jsExecutor.executeScript("arguments[0].click();", Payment_Details);
		String Payment_detail = Payment_Details.getText();
		System.out.println(Payment_detail);
	}
	
	
	
	//----------------- Filter_the_Products -------------------
	
	public void filters() throws InterruptedException {
		Temperature_Filter.click();
//		Thread.sleep(2000);
//		Room_Filter.click();
		
	}
	
	public void filteredProducts() throws InterruptedException {
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		jsExecutor.executeScript("arguments[0].click();", pick_colour);
		pick_colour.click();
		Thread.sleep(2000);
		String colourname = Colour_Name.getText();
		System.out.println("Colour is: " + colourname);
		driver.close();
		driver.quit();
	}
	
	//----------------- Enquiry_Now -------------------
	
	public void enquiryName(String name) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		jsExecutor.executeScript("arguments[0].click();", Enquiry_name);
		Enquiry_name.clear();
		Enquiry_name.sendKeys(name);
	}
	
	public void enquiryEmail(String email) {
		Enquiry_email.clear();
		Enquiry_email.sendKeys(email);
	}
	
	public void enquiryMobile(String mobile) {
		Enquiry_mobile.clear();
		Enquiry_mobile.sendKeys(mobile);
	}
	
	public void enquiryPincode(String pincode) {
		Enquiry_pincode.clear();
		Enquiry_pincode.sendKeys(pincode);
	}
	
	public void enquiryButton() {
		Enquiry_Now_Button.click();
//		String message = Thankyou_message.getText();
//		System.out.println(message);
		}
	
	public void thankyouMessage() throws InterruptedException {
		Thread.sleep(2000);
		String message = Thankyou_message.getText();
		System.out.println(message);
		}
	
	//----------------- Enquiry_Now_unsuccessful -------------------
	
	public void pincodeErrorMsg() {
		String pincodeError = ErrorMsg_Pincode.getText();
		String pincodeExpt = "Enter a valid 6 digit Zip Code";
		Assert.assertEquals(pincodeError, pincodeExpt);
		System.out.println(pincodeError);
		
		}
	
	
}
