package com.driversetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;


public class Sundarraj_SetUpDriver {
	
	public static WebDriver driver;
	public static ChromeOptions options;
	
	//Chrome Browser
	public static WebDriver chromeDriver() {
		System.out.println("Launching Chrome Browser");
		String userProfile ="C:\\Users\\SUMAHALI\\AppData\\Local\\Google\\Chrome\\User Data";
		//System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUMAHALI\\Asian Paints\\AsianPaintsWebApp\\src\\test\\resources\\Driver\\chromedriver.exe");

		options = new ChromeOptions();
		options.addArguments("--user-data-dir="+userProfile);
		options.addArguments("--profile-directory=Default");
		options.addArguments("--start-maximized");
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		return driver;
	}
	
	//Edge Browser
	public static WebDriver edgeDriver() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\SUMAHALI\\Asian Paints\\AsianPaintsWebApp\\src\\test\\resources\\Driver\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        System.out.println("Launching Edge Browser");
        
        return driver;
    }

    public static void teardown() throws Exception {
    	System.out.println("i m in teardown");
    	Thread.sleep(5000);
    	
        driver.close();
        driver.quit();
    }
}
