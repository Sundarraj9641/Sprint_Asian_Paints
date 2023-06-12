package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Samrudhi_Exterior_Texture 
{
	//Exterior Texture tab from Drop Down Box
	@FindBy(xpath="//*[@id=\"ColoursTextures\"]/li[3]/a")
	@CacheLookup
	WebElement ext_Texture;

	//Exterior Product Image
	@FindBy(xpath="//*[@id=\"prodListing\"]/section[2]/div[2]/ul/li[1]/a/span")
	@CacheLookup
	WebElement exterior_Product;

	//To click the Exterior Texture tab
	public void exterior() 
	{
		ext_Texture.click();
	}

	//To Click the Exterior Texture Product Image
	public void exteriorProd() 
	{
		exterior_Product.click();
	}

}
