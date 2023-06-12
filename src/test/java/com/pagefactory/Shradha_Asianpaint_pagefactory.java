package com.pagefactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

 

public class Shradha_Asianpaint_pagefactory {
    WebDriver driver;
    static WebDriverWait wait;

    @FindBy(how=How.XPATH,using="//a[@class='iconLinks iconLinks__profile profile-js-handle']")
    WebElement login;

    @FindBy(how=How.XPATH,using="//*[@id='loginMobile']")
    WebElement Mobile_No;

    @FindBy(how=How.XPATH,using="//button[@class='ctaText modal__variant-login--submit']")
    WebElement submit_mobile;
    
    @FindBy(how=How.XPATH,using="//*[@class='ctaText validate-login  modal__variant-login--submit']")
    WebElement submit_otp;
    
    @FindBy(how=How.XPATH,using="//*[@class='logout-link']")
    WebElement signout;
    
    @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div[1]/div/div/header/div[1]/div/div[1]/a[2]/span[2]")
    WebElement findcontractor_icon;

    @FindBy(how=How.XPATH,using="//*[@class='form-global form-text-input cpListing-pincode--div form-global--error form-text-input--error']")
    WebElement Contractor_search ;

    @FindBy(how=How.XPATH,using="//button[@class='ctaText baseBtn track-store js-pincode-cta']']")
    WebElement search_contractor_button ;


//**************************************************************************************PUBLIC_METHODS***********************************************************************************************
    
    public Shradha_Asianpaint_pagefactory(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    
    
    
   //----------------------------------------------------------------------------Login_page-------------------------------------------------------------------------------------------------------------------------
    public void login_page() {
    	JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
    	jsExecutor.executeScript("arguments[0].click();", login);
        login.click();
    }
    
    public void Mobile_number(String Num) throws Exception {
    	JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
        jsExecutor.executeScript("arguments[0].click();", login);
   	 
        Mobile_No.sendKeys(Num);
        Thread.sleep(3000);
    }
    
    public void Submit_button() throws Exception {
    	submit_mobile.click();
       Thread.sleep(14000);
    }
    
    public void Submit_otp_button() throws Exception {
    	submit_otp.click();
       Thread.sleep(14000);
    }
    
 //-------------------------------------------------------------------------------Signout-------------------------------------------------------------------------------------------------------------------------   
    
    public void Signout() {
    	JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
        jsExecutor.executeScript("arguments[0].click();", signout);
               signout.click();
    }
    
 //-------------------------------------------------------------------------------Find contractor----------------------------------------------------------------------------------------------------------------------------------------------------
    
    public void Findcontractor() throws Exception
    {
    	findcontractor_icon.click();
    	Thread.sleep(3000);
    }
    
    public void Search_contractor_by_pincode(String pincode)
    {
    	Contractor_search.sendKeys(pincode);
    }
    
    public void submit_pincode()
    {
    	search_contractor_button.click();
    }
    
    
 //----------------------------------------------------------------
    
   
    
}