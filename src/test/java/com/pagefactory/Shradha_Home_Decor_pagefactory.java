package com.pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shradha_Home_Decor_pagefactory {
	WebDriver driver;
	static WebDriverWait wait;	
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"headerNav\"]/div[1]/ul/li[5]/a[2]/span[1]")

	  WebElement home_decor_action;

	  

	  @FindBy(how=How.XPATH, using = "//*[@id=\"KITCHENSBATHROOMS\"]/li[1]/a")

	  WebElement click_MK;

	  

	  @FindBy(how=How.XPATH, using = "//*[@id=\"123\"]/div/div/div[1]/h2")

	  WebElement get_text;

	  
	  public Shradha_Home_Decor_pagefactory(WebDriver driver)
	  {
		  this.driver=driver;
		  PageFactory.initElements(driver, this);
	  }
	  

	  public void Home_Decor_Action() {

	      Actions actions = new Actions(driver);

	      actions.moveToElement(home_decor_action).build().perform();

	      wait = new WebDriverWait(driver, 30);

	  }

	  

	  public void Click_MK() {

	      wait = new WebDriverWait(driver, 30);

	      wait.until(ExpectedConditions.elementToBeClickable(click_MK));

	      click_MK.click();

	      

	  }

	  public void Get_Text() {

	        wait=new WebDriverWait(driver,30);

	        wait.until(ExpectedConditions.elementToBeClickable(get_text));

	          String Text_home_decor = get_text.getText();

	      System.out.println(Text_home_decor);

	        String URL = driver.getCurrentUrl();

	        System.out.println(URL);

	  }
	  
	  
	  
//--------------------------------------------------------------****Explore-Now****--------------------------------------------------------------------------
	 
	  
	  @FindBy(how=How.XPATH, using = "//*[@class='ctaText trackCTA']")

	    WebElement clicks_explore;

	    

	    public void clicks_on_explore() {

	        wait=new WebDriverWait(driver,30);
	        wait.until(ExpectedConditions.elementToBeClickable(clicks_explore));
	        JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
	    	jsExecutor.executeScript("arguments[0].click();", clicks_explore);
	       clicks_explore.click();

	    }

	    
	  



//-------------------------------------------------****Project****-------------------------------------------------------------------------------------------------------------------------------------
       
	     @FindBy(how=How.XPATH, using = "//a[text()='projects']")

          WebElement clicks_project;

	     public void Click_project() {

		        wait=new WebDriverWait(driver,30);
		        wait.until(ExpectedConditions.elementToBeClickable(clicks_project));
//		        JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
//		    	jsExecutor.executeScript("arguments[0].click();", clicks_project);
		    	clicks_project.click();

		    }
	     
	     
//---------------------------------------------*Store_locator*----------------------------------------------------------------------------------------------------------------------------------------

	     @FindBy(how=How.XPATH, using = "//a[text()='store locator']")

         WebElement clicks_store_loc;

	     public void Store_locator() {

		        wait=new WebDriverWait(driver,30);
		        wait.until(ExpectedConditions.elementToBeClickable(clicks_store_loc));
//		        JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
//		    	jsExecutor.executeScript("arguments[0].click();", clicks_store_loc);
		    	clicks_store_loc.click();

		    }
	     
	     
	     
//----------------------------------------------------storeslocated_on_map----------------------------------------------------------------------------------------------------------------------------
	     @FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div[1]/div[2]/div/div/div[1]/div/div[1]/div/ul/li[2]/a")
	 	WebElement storelocator_tab;
	 	
//	 	@FindBy(how = How.XPATH, using = "//*[@class='css-label radGroup2']")
//	 	WebElement radio_city;
	 	
	 	@FindBy(how = How.XPATH, using = "//*[@id='cityTextbox']")
	 	WebElement city_locat;
	 	
	 	
	 	@FindBy(how = How.XPATH, using = "//*[@id='locatebtn']")
	 	WebElement locate_button;
	     
	     
	     public void Store_locator_tab() {
//	 		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//	 		jsExecutor.executeScript("arguments[0].click();",storelocator_tab );
	 		storelocator_tab.click();
	 	}
	 	
	 	public void City_radio() {
	 		//JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	 	//	jsExecutor.executeScript("arguments[0].click();",radio_city );
	 		//radio_city.click();
	 	}
	 	
	 	public void City_locate() {
	 		//JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	 		//jsExecutor.executeScript("arguments[0].click();",city_locat );
	 		city_locat.sendKeys("Banglore");
	 	}
	 	public void Locate_button() {
	 		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	 		jsExecutor.executeScript("arguments[0].click();",city_locat );
	 		locate_button.click();
	 	}
}  
