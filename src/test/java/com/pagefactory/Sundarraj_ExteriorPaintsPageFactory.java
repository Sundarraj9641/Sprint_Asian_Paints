package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.screenshot.Sundarraj_ScreenshotCapture;

public class Sundarraj_ExteriorPaintsPageFactory {
	WebDriver driver;
	static WebDriverWait wait;
	Actions ep;
	Sundarraj_ScreenshotCapture sc;
	
	//------ Select_Exterior_paint ------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"headerNav\"]/div[1]/ul/li[1]/a[2]")
	WebElement Paints_Colours;
	
	@FindBy(how=How.LINK_TEXT, using="Exterior Paints")
	WebElement Exterior_paints;
	
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div/div[2]/div/div[3]/div/div/div/div[2]/div[2]/a/div[2]/div/div/h3")
	WebElement Wall_Textures;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"prodListing\"]/div[3]/div/div[2]/div/div/div[2]/div/div[2]/a")
	WebElement View_Catalogue;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"plpListing\"]/section[2]/div[2]/ul/li[2]/a/span")
	WebElement Colour;
	
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div/div[2]/div/div[2]/div/div[3]/h2")
	WebElement Description;
	
	//------ Search_the_Products ------
	
	@FindBy(how=How.XPATH, using="//div[@class ='textInputWrap search-widget']")
	WebElement Search_Box;
	
	@FindBy(how=How.NAME, using="q")
	WebElement Product_Name;
	
	@FindBy(how=How.XPATH, using="//button[@class='js-header-search-handle']")
	WebElement Search_Button;
	
	@FindBy(how=How.XPATH, using="//a[@class='custom-link-btn track_read_more']")
	WebElement Read_More;
	
	@FindBy(how=How.XPATH, using="//div[@class='compTitle']")
	WebElement Product_Description;
	
	//------ Search_the_Invalid_Products ------
	
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div[1]/div[2]/div/div/section/div[2]/div/div/div[2]/h2")
	WebElement Error_Message;
	
	
	//------ Select_Exterior_paint ------
	
	public Sundarraj_ExteriorPaintsPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void exteriorPaintsPage() {
		ep = new Actions(driver);
		ep.moveToElement(Paints_Colours).build().perform();
		ep.moveToElement(Exterior_paints).click().build().perform();
	}
	
	public void wallTextures() {
		Wall_Textures.click();
	}
	
	public void viewCatalogue() {
		View_Catalogue.click();
	}
	
	public void colour() {
		Colour.click();
	}
	
	public void description() {
//		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
//		jsExecutor.executeScript("arguments[0].click();", Description);
		String name = Description.getText();
		System.out.println("The Name Of the Selected Colour is: " + name);
	}
	
	//------ Search_the_Products ------
	
	public void searchBox() {
		Search_Box.click();	
	}
	
	public void enterProduct(String Pro_name) {
		Product_Name.sendKeys(Pro_name);
	}
	
	public void searchButton() {
		Search_Button.click();
	}
	
	public void productDescription() throws InterruptedException {
		Read_More.click();
		Thread.sleep(3000);
		String Title = driver.getTitle();
		System.out.println("TITLT: " + Title);
		String description = Product_Description.getText();
		System.out.println("****** " + description + " ******");
	}
	
	//------ Search_the_Invalid_Products ------
	
	public void errorMessage() {
		String error_Message = Error_Message.getText();
		System.out.println(error_Message);
		sc= new Sundarraj_ScreenshotCapture(driver);
		sc.capture();
	}
	
}
