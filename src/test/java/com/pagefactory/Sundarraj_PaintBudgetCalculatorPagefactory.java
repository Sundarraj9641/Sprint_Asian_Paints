package com.pagefactory;


import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sundarraj_PaintBudgetCalculatorPagefactory {

	WebDriver driver;
	static WebDriverWait wait;
	Actions Cal;
	Sundarraj_ColoursAndPaintsPageFactory cpf;
	

	//------ Background ------

	@FindBy(how=How.XPATH, using="//*[@id=\"headerNav\"]/div[1]/ul/li[1]/a[2]")
	@CacheLookup
	WebElement Paints_Colours;

	@FindBy(how=How.LINK_TEXT, using="Paint Budget Calculator")
	@CacheLookup
	WebElement Paint_Budget_Calculator;

	//------ Quick_Calculator ------

	@FindBy(how=How.XPATH, using="//*[@id=\"budget-calculator-comp\"]/div/div[2]/div[1]/div/div/div[1]/div[1]/div[1]/form/label[2]/span[1]")
	WebElement Type_of_Project;

	@FindBy(how=How.XPATH, using="//*[@id=\"budget-calculator-comp\"]/div/div[2]/div[1]/div/div/div[1]/div[1]/div[2]/form/label[1]/span[1]")
	WebElement Space;

	@FindBy(how=How.XPATH, using="//*[@id=\"budget-calculator-comp\"]/div/div[2]/div[1]/div/div/div[1]/div[1]/div[3]/form/label[2]/span[1]")
	WebElement Size_Of_Home;

	@FindBy(how=How.XPATH, using="//input[@name='SQ_FT_VALUE']")
	WebElement Carpet_Area;

	@FindBy(how=How.XPATH, using="//*[@id=\"budget-calculator-comp\"]/div/div[2]/div[1]/div/div/div[1]/div[1]/form/div/div[2]/a")
	WebElement Calculate_Now;

	@FindBy(how=How.XPATH, using="//*[@id=\"exitPopupmodal\"]/div/div/div/div/div[2]/div[1]/a")
	WebElement Cross_mark;

	@FindBy(how=How.XPATH, using="//*[@id=\"budget-calculator-comp\"]/div/div[2]/div[1]/div/div/div[1]/div[2]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/h2")
	WebElement Litres;

	@FindBy(how=How.XPATH, using="//*[@id=\"budget-calculator-comp\"]/div/div[2]/div[1]/div/div/div[1]/div[2]/div[2]/div/div/div/div/div[1]/div[2]/div[2]/h2")
	WebElement Price;

	@FindBy(how=How.XPATH, using="//button[@class='ctaText DarkButton track-reset-btn']")
	WebElement Reset;
	
	//------ Advanced_Calculator ------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"budget-calculator-comp\"]/div/div[1]/ul/li[2]/a")
	WebElement Advanced_Calculator;
	
	@FindBy(how=How.ID, using="Width")
	WebElement Width;
	
	@FindBy(how=How.NAME, using="Length")
	WebElement Length;
	
	@FindBy(how=How.ID, using="Height")
	WebElement Height;
	
	@FindBy(how=How.NAME, using="door")
	WebElement Doors;
	
	@FindBy(how=How.NAME, using="window")
	WebElement Windows;
	
	@FindBy(how=How.NAME, using="WALLA")
	WebElement WallA;
	
	@FindBy(how=How.XPATH, using="//a[text()='Paint']")
	WebElement PaintA;
	
	@FindBy(how=How.NAME, using="WALLB")
	WebElement WallB;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"budget-calculator-comp\"]/div/div[2]/div[2]/div/div/div[1]/div[2]/form/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/ul/li[1]/a")
	WebElement PaintB;
	
	@FindBy(how=How.NAME, using="WALLC")
	WebElement WallC;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"budget-calculator-comp\"]/div/div[2]/div[2]/div/div/div[1]/div[2]/form/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/ul/li[1]/a")
	WebElement PaintC;
	
	@FindBy(how=How.NAME, using="WALLD")
	WebElement WallD;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"budget-calculator-comp\"]/div/div[2]/div[2]/div/div/div[1]/div[2]/form/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/div[4]/div[1]/ul/li[1]/a")
	WebElement PaintD;
	
	@FindBy(how=How.XPATH, using="//button[@class='ctaText']")
	WebElement Calculate_Button;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"budgetEstimationSummary\"]/div[1]/div[2]/div[1]/p")
	WebElement Paint_cost;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"budgetEstimationSummary\"]/div[1]/div[2]/div[2]/p")
	WebElement Labour_Cost;


	public Sundarraj_PaintBudgetCalculatorPagefactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//------ Background ------

	public void paints_Colours() {
		Cal = new Actions(driver);
		Cal.moveToElement(Paints_Colours).build().perform();

	}

	public void Paint_budget_calculator() {
		Cal= new Actions(driver);
		Cal.moveToElement(Paints_Colours).build().perform();
		Cal.moveToElement(Paint_Budget_Calculator).click().build().perform();

	}

	//------ Quick_Calculator ------

	public void Specification() {

		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		jsExecutor.executeScript("arguments[0].click();", Type_of_Project);

		if(!Type_of_Project.isSelected()) {
			Type_of_Project.click();
		}

		if(!Space.isSelected()) {
			Space.click();
		}

		if(!Size_Of_Home.isSelected()) {
			Size_Of_Home.click();
		}

	}

	public void carpetArea() throws InterruptedException{
		
		if(Reset.isDisplayed()) {
			Reset.click();
		}
		Thread.sleep(2000);
		Carpet_Area.sendKeys("1350");
	}

	public void calculateNow() throws InterruptedException {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(Calculate_Now));
		Calculate_Now.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(Cross_mark));
		if(Cross_mark.isEnabled()) {
			Cross_mark.click();
		}
		
//		Reset.click();
//		Carpet_Area.sendKeys("1350");
//		wait = new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.elementToBeClickable(Calculate_Now));
		Calculate_Now.click();
	}
	
	public void litresAndPrice() throws InterruptedException{
		Thread.sleep(2000);
		String litre = Litres.getText(); 
		String price = Price.getText();
		
		System.out.println("Litres: " + litre);
		System.out.println("Price: " + price);
	}
	
	//------ Advanced_Calculator ------
	
	public void advanceCalculator() throws InterruptedException{
		Thread.sleep(2000);
		Advanced_Calculator.click();
	}
	public void measurements(String width, String height, String length, String windows,String doors) throws InterruptedException, IOException{
		Thread.sleep(1000);
		Width.sendKeys(width);
		Height.sendKeys(height);
		Length.sendKeys(length);
		Windows.sendKeys(windows);
		Doors.sendKeys(doors);
		
		WallA.click();
		PaintA.click();
		
		WallB.click();
		PaintB.click();
		
		WallC.click();
		PaintC.click();
		
		WallD.click();
		PaintD.click();
		

	}
	
	public void CalculateButton() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(Calculate_Button));
		Calculate_Button.click();
		wait.until(ExpectedConditions.elementToBeClickable(Cross_mark));
		if(Cross_mark.isEnabled()) {
			Cross_mark.click();
		}
		
		Calculate_Button.click();
		
	}
	
	public void priceDetails() throws IOException {
		String Paint_Cost = Paint_cost.getText();
		System.out.println("Paint Cost: " + Paint_Cost);
		
		String Labour_cost = Labour_Cost.getText();
		System.out.println("Labour Cost: " + Labour_cost);
		
	}

}
