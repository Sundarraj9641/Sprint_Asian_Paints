package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Sundarraj_LoginPageFactory {
	
	WebDriver driver;
	static WebDriverWait wait;
	@FindBy(how=How.XPATH, using="//a[@class='iconLinks iconLinks__profile profile-js-handle']")
	WebElement Login_Icon;
	
	@FindBy(how=How.ID, using="loginMobile")
	WebElement Mobile_number;
	
	@FindBy(how=How.XPATH, using="//button[@class='ctaText modal__variant-login--submit']")
	WebElement Submit_Button_MobileNo;
	
	@FindBy(how=How.XPATH, using="//button[@class='ctaText validate-login  modal__variant-login--submit']")
	WebElement Submit_Button_Otp;
	
	
	
	
	public Sundarraj_LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginIcon() {
		//wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.elementToBeClickable(Login_Button));
		Login_Icon.click();
	}
	
	public void mobilenumber(String mobileNo) {
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.elementToBeClickable(Email));
		Mobile_number.sendKeys(mobileNo);
	}
	
	public void submitButtonMobile() {
		//wait.until(ExpectedConditions.elementToBeClickable(Continue_Button));
		Submit_Button_MobileNo.click();
	}

	
	public void submitButtonOtp() throws InterruptedException {
		Thread.sleep(17000);
		Submit_Button_Otp.click();
	}

	

	

}
