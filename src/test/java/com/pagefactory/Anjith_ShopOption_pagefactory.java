package com.pagefactory;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Anjith_ShopOption_pagefactory {

	WebDriver driver;
	static WebDriverWait wait;
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div[1]/div/div/header/div[2]/div[2]/div[1]/a[1]/span")
	WebElement profile_button;

	@FindBy(how=How.XPATH,using="//*[@id=\"loginMobile\"]")
	WebElement mobile_number;

	@FindBy(how=How.XPATH,using="//button[@class=\"ctaText modal__variant-login--submit\"]")
	WebElement mobile_number_submit;

	@FindBy(how=How.XPATH,using="//button[@class=\"ctaText validate-login  modal__variant-login--submit\"]")
	WebElement otp_number_submit;


	@FindBy(how=How.XPATH,using="//a[@class='iconLinks iconLinks__profile profile-js-handle isLoggedIn']")
	WebElement My_Profile;

	@FindBy(how=How.XPATH, using = "//*[@id=\"loginDropdown\"]/div/ul/li[2]/a")
	WebElement My_Profile_clicks;

	

	public Anjith_ShopOption_pagefactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void profilebutton() {
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(profile_button));
		profile_button.click();

	}

	public void mobilenumber() throws InterruptedException {
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(mobile_number));
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(mobile_number_submit));
		// mobile_number.click();
		mobile_number.sendKeys("7036927036");
		Thread.sleep(2000);
		mobile_number_submit.click();
		Thread.sleep(30000);
	}

	public void otpnumber() {
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable( otp_number_submit));
		otp_number_submit.click();

	}
	public void myprofile() {
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(My_Profile));
		My_Profile.click();

		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(My_Profile_clicks));
		My_Profile_clicks.click();

	}

	public void navigate_profile() {
		String Title = driver.getTitle();
		System.out.println("The Title of current page is:" +Title);
	}

	

//---------------------------------------------------------------------------------------------------------------------------------------------------------------


	@FindBy(how=How.XPATH, using = "//*[@id=\"headerNav\"]/div[1]/ul/li[6]/a[2]/span[1]")
	WebElement Shop_option_actions;


	@FindBy(how=How.XPATH, using = "//*[@id=\"SHOP\"]/div[2]/div/div/div[1]/ul/li[1]/a")
	WebElement Shop_clicks_wallstickers ;


	@FindBy(how=How.XPATH, using = "//*[@id=\"container\"]/div[4]/div[2]/section/div/div/div[2]/div[1]/h2")
	WebElement Display_wallstickers ;

	public void shops_actions() {


		Actions actions=new Actions(driver);
		actions.moveToElement(Shop_option_actions).build().perform();
		wait=new WebDriverWait(driver,30);
	}

	public void wall_stickers_clicking() {
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(Shop_clicks_wallstickers));
		Shop_clicks_wallstickers.click();
	}

	public void Wll_stickers_display() {
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(Display_wallstickers));
		String display=Display_wallstickers.getText();
		System.out.println(display);



	}

	//---------------------------------------------------------------------------------------------------------------------------------------------------------------


	@FindBy(how=How.XPATH, using = "//*[@id=\"container\"]/div[4]/div[2]/section/div/div/div[2]/div[2]/div[1]/div[2]/a")
	WebElement LoadMore;



	public void Load_More() {
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(LoadMore));
		while(true) {
			if(LoadMore.isDisplayed()) {
				LoadMore.click();
			}
			else 
			{
				break;
			}
		}}


	//---------------------------------------------------------------------------------------------------------------------------------------------------------------

	@FindBy(how=How.XPATH, using = "//*[@id=\"thin-banner-info\"]/ul/li[18]/a/p")
	WebElement productselecting;

	@FindBy(how=How.XPATH, using = "//*[@id=\"productPincode\"]")
	WebElement pincode_clicking;

	@FindBy(how=How.XPATH, using = "//*[@id=\"main-content\"]/div[1]/div/div[2]/div/div[5]/div/label")
	WebElement pincode_checking;


	@FindBy(how=How.XPATH, using = "//*[@id=\"productInputQtyBox\"]/label[3]")
	WebElement adding_quantity;


	public void selecting_product() {
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(productselecting));
		productselecting.click();

	}


	public void pincode_validating() {
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(pincode_clicking));
		pincode_clicking.click();

		wait.until(ExpectedConditions.elementToBeClickable(pincode_checking));
		pincode_checking.sendKeys("534305");

	}

	public void addingquantity() {
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(adding_quantity));
		adding_quantity.click();

	}

	

	

	//---------------------------------------------------------------------------------------------------------------------------------------------------------------

	@FindBy(how=How.XPATH, using = "//*[@id=\"filterSectionWp\"]/div/div/div[1]/h4/div")
	WebElement select_size;

	@FindBy(how=How.XPATH, using = "//div[@class='form-indicator']")
	WebElement selecting_medium;

	@FindBy(how=How.XPATH, using = "//*[@id=\"filterSectionWp\"]/div/div/div[2]")
	WebElement select_price;

	@FindBy(how=How.XPATH, using = "//*[@id=\"filterSectionWp\"]/div/div/div[2]/div/div/ul/li[4]/div/label/div")
	WebElement selecting_uptoprice;

	@FindBy(how=How.XPATH, using = "//*[@id=\"sort-products\"]")
	WebElement sortby;

	@FindBy(how=How.XPATH, using = "//*[@id=\"thin-banner-info\"]/ul/li[229]/a/p")
	WebElement name;

	public void size_selecting() {
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(select_size));
		select_size.click();

		wait.until(ExpectedConditions.elementToBeClickable(selecting_medium));
		selecting_medium.click();

		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(select_price));
		select_price.click();

		wait.until(ExpectedConditions.elementToBeClickable(selecting_uptoprice));
		selecting_uptoprice.click();


	}
	public void sorting() throws InterruptedException {
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(sortby));
		sortby.click();

		Select s1 = new Select(sortby);
		s1.selectByVisibleText("Price - Low to High");
		Thread.sleep(3000);

		String Name = name.getText();

		System.out.println("The name of the product : " +Name );
		//    	 wait.until(ExpectedConditions.elementToBeClickable(lowtohigh_sortby));
		//    	 lowtohigh_sortby.click();
	}

	//---------------------------------------------------------------------------------------------------------------------------------------------------------------

	@FindBy(how=How.XPATH, using = "//*[@id=\"thin-banner-info\"]/ul/li[1]/a/p")
	WebElement wall_sticker ;

	@FindBy(how=How.XPATH, using = "//*[@id=\"productPincode\"]")
	WebElement pin_code_Text ;

	@FindBy(how=How.XPATH, using = "//*[@id=\"checkout\"]")
	WebElement Buy_now ;

	@FindBy(how=How.XPATH, using = "//*[@id=\"responseMessage\"]")
	WebElement error_msg ;


	public void clickOnWallSticker() {
		wall_sticker.click();
	}

	public void enterPinCode() throws InterruptedException {
		Set<String> win = driver.getWindowHandles();
		Iterator <String> it = win.iterator();

		String mainWin=it.next();
		String subWin=it.next();

		Thread.sleep(2000);
		driver.switchTo().window(subWin);
		pin_code_Text.sendKeys("123");
	}

	public void clickOnBuyNow() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		jsExecutor.executeScript("arguments[0].click();", Buy_now);
		Buy_now.click();
	}

	public void errorMessage() {

		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		jsExecutor.executeScript("arguments[0].click();", error_msg);
		String error = error_msg.getText();

		System.out.println(error);
	}

	//---------------------------------------------------------------------------------------------------------------------------------------------------------------

	public void pin(String Pin_Code) throws InterruptedException {
		Set<String> win = driver.getWindowHandles();
		Iterator <String> it = win.iterator();

		String mainWin=it.next();
		String subWin=it.next();

		Thread.sleep(2000);
		driver.switchTo().window(subWin);

		pin_code_Text.sendKeys(Pin_Code);
	}
	
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"main-content\"]/div[1]/div/div[2]/div/div[1]/div/span[1]")
	WebElement WishList ;

	@FindBy(how=How.XPATH, using = "//*[@id=\"container\"]/header/div[2]/div[3]/div[2]/a[2]")
	WebElement Wish_List_Icon ;
	
	public void wishList() throws InterruptedException {
		Set<String> win = driver.getWindowHandles();
		Iterator <String> it = win.iterator();

		String mainWin=it.next();
		String subWin=it.next();

		Thread.sleep(2000);
		driver.switchTo().window(subWin);
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		jsExecutor.executeScript("arguments[0].click();", WishList);
		WishList.click();
	}
	
	public void wishListIcon() {
//		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
//		jsExecutor.executeScript("arguments[0].click();", Wish_List_Icon);
		Wish_List_Icon.click();
	}
	
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"footerContent\"]/div[1]/div[1]/form/div/input")
	WebElement mail_txt ;

	@FindBy(how=How.XPATH, using = "//*[@id=\"footerContent\"]/div[1]/div[1]/form/div/button")
	WebElement subscribe ;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"footerContent\"]/div[1]/div[1]/form/label")
	WebElement errMsg ;
	
	public void Mail(String mail) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		jsExecutor.executeScript("arguments[0].click();", mail_txt);
		mail_txt.sendKeys(mail);
	}
	
	public void subscribe() {
//		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
//		jsExecutor.executeScript("arguments[0].click();", Wish_List_Icon);
		subscribe.click();
	}
	
	public void errmsg() throws InterruptedException {
		Thread.sleep(3000);
		String err = errMsg.getText();
		System.out.println(err);
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"headerNav\"]/div[1]/ul/li[6]/a[2]/span[1]")
	WebElement clicking_shop ;
	

	@FindBy(how=How.XPATH, using = "/html/body/div[1]/div/div[2]/div/div[8]/div/div/div/div[2]/div/a")
	WebElement clicking_Explorenow ;
	
	@FindBy(how=How.XPATH, using = "//h2[@class='h2 section-header']")
	WebElement current_text;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"container\"]/div[5]/div/div/a[5]")
	WebElement Terms_conditions;

	public void shop_clicking() {
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable( clicking_shop));
		 clicking_shop.click();
		
		
		
	}
	public void Explore_now() {
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable( clicking_Explorenow));
		clicking_Explorenow.click();
	}
	
	public void Text() {
		String get_title = current_text.getText();
		System.out.println(get_title);
	}
	
	public void Terms_conditions() {
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(Terms_conditions));
		Terms_conditions.click();
	
	
	
	}
	
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"loginDropdown\"]/div/ul/li[3]/a")
	WebElement Logout;
  
	public void My_profile() {
	    	 wait=new WebDriverWait(driver,30);
	    	 
	
	    	 wait=new WebDriverWait(driver,30);
	    	 wait.until(ExpectedConditions.elementToBeClickable(Logout));
	    	 Logout.click();
	    	
	    	 
	    	 
	     }	
	
	//------------------------------------------------------------------------------------------------------------------------------------------------------------
	

	public void pages() {
		wait=new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.elementToBeClickable( automotive_refinishing));

		//automotive_refinishing.click();
		
		// Get the initial page title
        String initialTitle = driver.getTitle();
        System.out.println("Initial Page Title: " + initialTitle);

     

        driver.navigate().refresh(); 

     
        String refreshedTitle = driver.getTitle();
        System.out.println("Refreshed Page Title: " + refreshedTitle);

       
        if (!initialTitle.equals(refreshedTitle)) {
            System.out.println("Refresh is working correctly.");
        } else {
            System.out.println("Refresh is not working as expected.");
        }

        driver.navigate().back();

      
        String backTitle = driver.getTitle();
        System.out.println("Page Title After Going Back: " + backTitle);

       
        if (!initialTitle.equals(backTitle)) {
            System.out.println("Going back is working correctly.");
        } else {
            System.out.println("Going back is not working as expected.");
        }

        driver.navigate().forward();

      
        String forwardTitle = driver.getTitle();
        System.out.println("Page Title After Going Forward: " + forwardTitle);

       
        if (!backTitle.equals(forwardTitle)) {
            System.out.println("Going forward is working correctly.");
        } else {
            System.out.println("Going forward is not working as expected.");
        }

        driver.quit();
    
	}    
        public void pages_displays() {
        	System.out.println("****All the Scenario from @Login_Logout to  @Chrome_options are working fine****");
        	
        }

		
	
	
      //---------------------------------------------------------------------------------------------------------------------------------------------------------------
	
  
 }
