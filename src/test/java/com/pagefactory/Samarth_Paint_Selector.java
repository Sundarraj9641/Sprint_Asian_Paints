package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Samarth_Paint_Selector 
{
//	@FindBy(xpath="//*[@id=\"ColoursTextures\"]/li[5]/a")
	@FindBy(xpath="(//a[@class='track_section nav-link dropdown-toggle iconTextLinks iconsWithText__wrap'])[1]")
	@CacheLookup
	WebElement paint_Select;

	@FindBy(xpath=" //*[@id=\"prodListing\"]/div[2]/div/div[1]/div/div[2]/div[2]/a")
	@CacheLookup
	WebElement paint_Selector_Product;
	
	@FindBy(xpath=" //div[@class='apPlpListing baseCTSpace aem-GridColumn aem-GridColumn--default--12']")
	@CacheLookup
	public WebElement paint_Select_page;
	
	//To click the Paint Selector tab
	public void painSelector() 
	{
		paint_Select.click();
	}

	//To Click the Paint Selector Product Image
	public void  paintSelectorProduct() 
	{
		paint_Selector_Product.click();
	}
}
