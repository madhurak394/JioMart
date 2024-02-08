package com.JioMart.TestComponents;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BaseTest {
	
static WebDriver driver;
	
	public String captureScreenshots(String testCase,WebDriver driver) throws IOException
	{   
		// convert webdriver object to takescreenshot
		
		TakesScreenshot scr= ((TakesScreenshot)driver);
		
		// Call GetScreenshotAs method to capture screenshot
		
		File scrFile=scr.getScreenshotAs(OutputType.FILE);
		
		// Copy file to Desired location
		
		File DestFile = new File("user.dir"+"/Screenshots/");
		
		FileUtils.copyFile(scrFile, DestFile);
		return testCase;
	}  
	
	
		/*public static WebDriver closeBrowser(WebDriver driver) 
		{
			try {
				driver.quit();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			return driver;
			
					}
         */
}
