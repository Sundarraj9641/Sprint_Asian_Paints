package com.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import com.asianpaints.colors.pageFactory.Colours;
import com.asianpaints.colors.pageFactory.Contractor;
import com.asianpaints.colors.pageFactory.Interior_Texture;
import com.asianpaints.colors.pageFactory.Paint_Budget;
import com.asianpaints.colors.pageFactory.Paint_Selector;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Samarth_Browser {
	public static WebDriver driver;
	static ChromeOptions options;
	static Samarth_Contractor conPgObj;
	static Samarth_Colours colourPgObj;
	static Samarth_Interior_Texture interiorPgObj;
	static Samarth_Paint_Budget paintBudgetObj;
	static Samarth_Paint_Selector paintSelectorgObj;
	
	@Before
	public void openBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\SAMBHOSA\\\\eclipse-workspace\\\\SeleniumTesting\\\\src\\\\drive\\\\chromedriver1.exe");
		options = new ChromeOptions();
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-notifications");
		conPgObj =PageFactory.initElements(driver,Samarth_Contractor.class );
		colourPgObj =PageFactory.initElements(driver,Samarth_Colours.class );
		interiorPgObj =PageFactory.initElements(driver,Samarth_Interior_Texture.class );
		paintBudgetObj =PageFactory.initElements(driver,Samarth_Paint_Budget.class );
		paintSelectorgObj =PageFactory.initElements(driver,Samarth_Paint_Selector.class );
	}

	@Given("User is on Home Page")
	public void userIsOnHomePage() throws InterruptedException
	{
		System.out.println("User is on Home Page");
		driver = new ChromeDriver(options);
		conPgObj =PageFactory.initElements(driver,Samarth_Contractor.class );
		colourPgObj =PageFactory.initElements(driver,Samarth_Colours.class );
		interiorPgObj =PageFactory.initElements(driver,Samarth_Interior_Texture.class );
		paintBudgetObj =PageFactory.initElements(driver,Samarth_Paint_Budget.class );
		paintSelectorgObj =PageFactory.initElements(driver,Samarth_Paint_Selector.class );
		String url= "https://www.asianpaints.com/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		Thread.sleep(5000);
		options.addArguments("--disable-notifications");
//		colourPgObj.iUnderstand.click();
//		Thread.sleep(1000);
	}
	

	@When("User clics on Find a Contractor icon")
	public void userClicsOnFindAContractorIcon() throws InterruptedException
	{
		System.out.println("User clics on Find a Contractor icon");
		Samarth_Browser.conPgObj.contractorIcon();
		Thread.sleep(2000);
		
	}
	
	@Then("Find a Contractor page is displayed")
	public void findAContractorPageIsDisplayed()
	{
		System.out.println("Find a Contractor page is displayed");
	}
	
	@Given("User is on Find a Contractor page")
	public void userisonFindAContractorPage() 
	{
		System.out.println("User is on Find a Contractor page");
	}

	@When("User enters pincode (.+)")
	public void userEntersPinCode(String pin) throws InterruptedException 
	{
		System.out.println("User enters pincode");
		Samarth_Browser.conPgObj.enterPinCode(pin);
		Thread.sleep(2000);
	}

	@When("user clicks Search button")
	public void userClicksSearchButton()throws InterruptedException 
	{
		System.out.println("user clicks Search button");
		Samarth_Browser.conPgObj.contractorSubmit();
		Thread.sleep(2000);
	}

	@Then("Contractor Page is displayed")
	public void contractorPageIsDisplayed()throws InterruptedException 
	{
		System.out.println("Contractor Page is displayed");
		boolean isContractorPageDisplayed = Samarth_Browser.conPgObj.contractorPage.isDisplayed();
		assertTrue(isContractorPageDisplayed);
		Samarth_Browser.conPgObj.contractorClear();
		Thread.sleep(2000);
	}
	
	@Then("Unsuccesful pin Error Message is displayed")
	public void unsuccesfulPinErrorMessageIsDisplayed()throws InterruptedException 
	{
		System.out.println("Unsuccesful pin Error Message is displayed");
		System.out.println(Samarth_Browser.conPgObj.contractorErrorMsg());
		boolean isEnquirePinCodeDisplayed = Samarth_Browser.conPgObj.contractorErrorMsg.isDisplayed();
		assertTrue(isEnquirePinCodeDisplayed);
		Thread.sleep(2000);
	}

	@Given("User is on Contractor Page")
	public void userIsOnContractorPage() 
	{
		System.out.println("Contractor page is displayed");
	}

	
	@Then("Contractor Unsuccessful Error Message must be (.+)")
	public void errorMessageMustBeEnterAValidDigitZipCode(String expectedMsg) {
	    String actualMsg= Samarth_Browser.conPgObj.contractorErrorMsg.getText();
	    assertEquals(actualMsg, expectedMsg);
	}
	
	@After
	public void closeBrowser()
	{
		driver.close();
		driver.quit();
	}
	
}

