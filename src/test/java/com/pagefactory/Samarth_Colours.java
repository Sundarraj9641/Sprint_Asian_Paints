package com.pagefactory;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Samarth_Colours 
{
	

//	//I understand tab 
//	@FindBy(xpath="//*[text() = 'I understand']")
//	public  WebElement iUnderstand;
	
	
	//Paint and Texture Tab
	@FindBy(xpath="(//span[@class=\"iconTextLinks__text visible-in-Desktop\"])[1]")
	@CacheLookup
	WebElement paintAndTexture;
	
	//Colors Tab
	@FindBy(linkText="")
	@CacheLookup
	WebElement colours_2200;

	//Enquire Now button
	@FindBy(xpath="//span[@class='enquire-now--text']")
	@CacheLookup
	WebElement form_Enquire;

	//Name Text Box
	@FindBy(xpath="((//input[@class='form-global__field form-text-input__field commonTextComp'])[3]")
	@CacheLookup
	static WebElement  form_Name;

	//Email Text Box
	@FindBy(xpath="(//input[@class='form-global__field form-text-input__field commonTextComp'])[4]")
	@CacheLookup
	static WebElement form_Email;

	//MobileNumber Text Box
	@FindBy(xpath="((//input[@class='form-global__field form-text-input__field commonTextComp'])[5]")
	@CacheLookup
	static WebElement form_Mobile;

	//Pin Code Text Box
	@FindBy(xpath="((//input[@class='form-global__field form-text-input__field commonTextComp'])[6]")
	@CacheLookup
	static WebElement form_Pincode;

	//Enquire Now submission button
	@FindBy(xpath="(//button[@class='ctaText enquireForm--step-1-submit track_form_submit'])[1]")
	@CacheLookup
	WebElement paint_Enquire_Button;

	//Colour_2200 Product Image
	@FindBy(xpath="//*[@id=\"colorCatalogueList\"]/div/div[2]/div[1]/ul/li[6]/a/div")
	@CacheLookup
	WebElement paint_Colour_2200_Product;

	//Invalid Name Error Message
	@FindBy(xpath="(//div[@class='form-global__field-message form-text-input__field-message'])[1]")
	public WebElement colourNameErrorMsg;

	//Invalid Email Error Message
	@FindBy(xpath="(//div[@class='form-global__field-message form-text-input__field-message'])[2]")
	public WebElement colourEmailErrorMsg;

	//Invalid Mobile Number Error Message
	@FindBy(xpath="(//div[@class='form-global__field-message form-text-input__field-message'])[3]")
	public WebElement colourMobileErrorMsg;

	//Invalid Pin Code Error Message
	@FindBy(xpath="(//div[@class='form-global__field-message form-text-input__field-message'])[4]")
	public WebElement colourpinErrorMsg;


	//To return Paint and Texture WebElement
	public WebElement getPaintAndTextureWE()
	{
		return this.paintAndTexture;
	}

	//To click Colours_2200 tab
	public  void colour_2200()
	{
		colours_2200.click();
	}

	//To click Enquire-now button
	public  void enquireNowButton()
	{
		form_Enquire.click();
	}

	//To enter Name
	public  void enterName(String name)
	{
		form_Name.sendKeys(name);
	}

	//To enter EmailID
	public  void enterEmail(String email)
	{
		form_Email.sendKeys(email);
	}

	//To enter Mobile Number
	public  void enterMobile(String mobile)
	{
		form_Mobile.sendKeys(mobile);
	}

	//To enter PinCode
	public  void enterPincode(String pin)
	{
		form_Pincode.sendKeys(pin);
	}

	//To click EnquireNow button in form
	public  void  paintEnquireButton()
	{
		paint_Enquire_Button.click();
	}

	//To clear the data in the form
	public void colourClear()
	{
		form_Name.clear();
		form_Email.clear();
		form_Mobile.clear();
		form_Pincode.clear();
	}

	//To get the Invalid Name Error Message
	public String colourNameErrorMsg()
	{
		return colourNameErrorMsg.getText();
	}

	//To get the Invalid Email Error Message
	public String colourEmailErrorMsg()
	{
		return colourEmailErrorMsg.getText();
	}

	//To get the Invalid Mobile Message
	public String colourMobileErrorMsg()
	{
		return colourMobileErrorMsg.getText();
	}

	//To get the Invalid PinCode Message
	public String colourPinErrorMsg()
	{
		return colourpinErrorMsg.getText();
	}

}
