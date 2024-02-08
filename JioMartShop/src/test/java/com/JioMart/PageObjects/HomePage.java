package com.JioMart.PageObjects;

import java.util.List;

import javax.lang.model.util.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(css="a#nav_link_4") public WebElement electronicsLink;
	@FindBy(css="a#nav_link_757") public WebElement mobileAndTabletLink;
	@FindBy(xpath="//li[@class='header-nav-l1-item'][5]") public List<WebElement> listElectronics;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// mouse hover using actions class
	public void mouseHoverelectronicsLink()
	{
		Actions act=new Actions(driver);
		act.moveToElement(electronicsLink).perform();
	}
	
	// mouse hover using actions class
	public void mouseHovermobileAndTabletLink()
	{
		Actions act=new Actions(driver);
		act.moveToElement(mobileAndTabletLink).perform();
	}
	
	// Method to  count number of menu links
	public void countNumberOfMenuLinks()
	{   
			
		for(WebElement ele:listElectronics)
		{
			System.out.println(listElectronics.size());
		}
	}
	

}
