package com.JioMart.Tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.JioMart.PageObjects.HomePage;
import com.JioMart.PageObjects.SmartPhone;
import com.JioMart.TestComponents.BaseTest;
import com.JioMart.Utilities.SetUp;

public class ValidTest extends BaseTest{
 static WebDriver driver;
 HomePage home;
 SmartPhone Phone;
   
    
	// Call Chrome Driver
 
    @Test(priority=1)
    public void initiateTest() throws IOException
    {   
    	// Calling chrome browser from config.properties
    	
    	try {
    	String Browser=SetUp.configureBrowser();
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\chromedriver.exe");
    	driver=new ChromeDriver();
    	
    	// Calling URL from from config.properties
    	String URL=SetUp.configureURL();
    	driver.get(URL);
    	
    	// opening browser window
    	
       	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(45000));
    	
    	}
    	
    	catch (Exception e)
    	{
    		e.getMessage();
    	}
    }
    
    @Test(priority=2)
    public void navigateToHomePage() throws Exception
    {  
    	try {
    	// Calling Home Page
    	home=new HomePage(driver);
    	
       	home.mouseHoverelectronicsLink();
    	boolean iselectronicslink=home.electronicsLink.isDisplayed();
    	// Assertion for electronics link is displayed
    	Assert.assertTrue(iselectronicslink);
    	Thread.sleep(3000);
    	
    	home.mouseHovermobileAndTabletLink();
    	boolean ismobileAndTabletLink=home.mobileAndTabletLink.isDisplayed();
    	Assert.assertTrue(ismobileAndTabletLink);
    	Thread.sleep(3000);
    	home.countNumberOfMenuLinks();
    	Thread.sleep(2000);
    	}
    	
    	catch (Exception ex)
    	{
    		ex.getMessage();
    	}
    }
    	
    @Test(priority=3)
    public void navigateToSmartPhonePage() throws Exception
	{   
    	try {
    	
    	Phone = new SmartPhone(driver);
    	Phone.clickSmartPhonelink();	
    	Thread.sleep(4000);
		
		// NAvigate to sort by Dropdown 
		Phone.sortByPriceHighToLow();
		Thread.sleep(2000);
    	}
    	
    	catch (Exception e1)
    	{
    		e1.getMessage();
    	}
    	
    	driver.quit();
	}
    	
		/*@Test
		public void terminate() throws Exception {
			
			driver.quit();
		}
		*/
	}
	
	
