package com.pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.asianpaints.coloursandtextures.stepDefinitions.Samrudhi_Browser;

public class Samrudhi_Paint_Budget
{
	//Change Xpath ....
	@FindBy(xpath="//*[@id=\"ColoursTextures\"]/li[4]/a")
	@CacheLookup
	WebElement paint_Budget_;

	//@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div[1]/div[1]/form/label[2]/span[1]")
	@FindBy(xpath="(//span[@class='form-global__custom-element form-radio-input__custom-element align-middle'])[2]")
	@CacheLookup
	WebElement re_Painting;

	//@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div[1]/div[2]/form/label[2]/span[1]")
	@FindBy(xpath="(//span[@class='form-global__custom-element form-radio-input__custom-element align-middle'])[4]")
	@CacheLookup
	WebElement exterior;

	//@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div[1]/form/div/div[1]/input")
	@FindBy(xpath="//input[@class='form-global__field form-text-input__field']")
	@CacheLookup
	WebElement carpet_Area;

	//@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div[1]/form/div/div[2]/a")
	@FindBy(xpath="//a[@class='ctaText text-uppercase js-calculate-now-ladingpage-btn']")
	@CacheLookup
	WebElement calc_Budget;

	//@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div[1]/form/div/div[3]/button")
	//@FindBy(name="RESET")
	@FindBy(xpath="//button[@class='ctaText DarkButton track-reset-btn']")
	@CacheLookup
	WebElement calc_Reset;

	public void paintBudget()
	{
		paint_Budget_.click();
	}

	public void rePainting() 
	{
		JavascriptExecutor js = (JavascriptExecutor) Samrudhi_Browser.driver;
		js.executeScript("arguments[0].click();", re_Painting);
		//re_Painting.click();
	}

	public void exterior() 
	{
		exterior.click();
	}

	public void  carpetArea(String carpet) 
	{
		carpet_Area.sendKeys(carpet);
	}

	public void calcBudget()
	{
		calc_Budget.click();
	}
	public void calcReset()
	{
		calc_Reset.click();
	}

}
