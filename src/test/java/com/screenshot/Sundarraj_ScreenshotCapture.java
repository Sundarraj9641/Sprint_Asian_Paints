package com.screenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Sundarraj_ScreenshotCapture {
	WebDriver driver;
	
	public Sundarraj_ScreenshotCapture(WebDriver driver) {
		this.driver=driver;
	}
	
	public void capture() {
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(src, new File("C:\\Users\\SUMAHALI\\Asian Paints\\AsianPaintsWebApp\\src\\test\\resources\\Screenshots\\" +timestamp()+ " " + "Asian_paints.png"));
		} catch (IOException e) {

			e.printStackTrace();
		}
	
		
	}
	
	public String timestamp() {
		
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
}
