package com.pagefactory;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public  class Samrudhi_Contractor
{
	//Contractor Icon
	@FindBy(xpath="(//span[@class='iconTextLinks__text'])[2]")
	@CacheLookup
	public  WebElement contractor_Icon;

	//Contractor Pin
	@FindBy(xpath="//*[@id=\"ctaPincode\"]")
	//@CacheLookup
	public  WebElement contractor_Pin;

	//Contractor Submit Button
	@FindBy(xpath="(//button[@class='ctaText baseBtn'])[1]")
	//@CacheLookup
	public  WebElement contractor_Submit;

	//Invalid Pin Code Error Message
	@FindBy(xpath="(//div[@class='form-global__field-message form-text-input__field-message'])[1]")
	public WebElement contractorErrorMsg;
	
	//Contractor_Page
	////body[contains(@class,'page')]
	@FindBy(xpath="//div[@class='responsivegrid contractor-listing-search-area aem-GridColumn aem-GridColumn--default--12']")
	//@CacheLookup
	public WebElement contractorPage;
	
	//To click Contractor Icon
	public  void contractorIcon()
	{
		contractor_Icon.click();
	}
	//(//button[contains(@class, 'ctaText')])[2]
	//To send Pincode
	public void enterPinCode(String pin)
	{
		contractor_Pin.sendKeys(pin);
	}

	//To click Submit Button
	public  void contractorSubmit()
	{
		contractor_Submit.click();
	}

	//To clear the Contents in Pincode
	public  void contractorClear()
	{
		contractor_Pin.clear();
	}

	//To get the Contractor Error Message
	public String contractorErrorMsg()
	{

		return contractorErrorMsg.getText();
	}

}
