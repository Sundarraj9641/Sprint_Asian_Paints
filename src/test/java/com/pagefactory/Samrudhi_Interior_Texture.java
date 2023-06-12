package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Samrudhi_Interior_Texture 
{
	//Interior Texture Tab from Drop Down List
	@FindBy(xpath="//*[@id=\"ColoursTextures\"]/li[2]/a")
	@CacheLookup
	WebElement int_texture;

	//Interior Product Image
	@FindBy(xpath="//*[@id=\"prodListing\"]/section[2]/div[2]/ul/li[1]/a/span")
	@CacheLookup
	WebElement interior_Product;
	
	//Interior Page
	@FindBy(id="prodListing")
	public WebElement interiorPage;

	//To click the Interior Texture tab
	public void interior() 
	{
		int_texture.click();
	}

	//To Click the Interior Texture Product Image
	public void interiorProd() 
	{
		interior_Product.click();
	}

}
