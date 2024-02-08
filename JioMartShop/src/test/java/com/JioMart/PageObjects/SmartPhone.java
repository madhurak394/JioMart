package com.JioMart.PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartPhone {
	
	WebDriver driver ; 
	JavascriptExecutor jse;
	
	@FindBy(css="a#nav_level3_777")public WebElement smartPhone ;
	@FindBy(xpath="//*[@id='avg_selling_price_filter']/div/div/div[4]") public WebElement slider;
	@FindBy(css="div#dropdownMenuButton") public WebElement dropdownMenu;
	@FindBy(xpath="//li[@class='jm-list'][1]") public WebElement radioPopularity;
	@FindBy(xpath="//li[@class='jm-list'][2]") public WebElement radioPriceHighToLow;
	@FindBy(xpath="//li[@class='jm-list'][3]") public WebElement radioPriceLowToHigh;
	@FindBy(xpath="//li[@class='jm-list'][4]") public WebElement radioDiscount;
	@FindBy(xpath="//li[@class='jm-list'][5]") public WebElement radioAllProducts;
	
	public SmartPhone(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickSmartPhonelink()
	{
		smartPhone.click();
	}
	/*public void ChangePrice() throws InterruptedException
	{
		Actions act=new Actions(driver);
	    
		// Drag and drop
		act.dragAndDropBy(slider, 15000, 0).build().perform();
		
			
	}
	*/
	
	public void sortByPopularity() throws InterruptedException
	{
		dropdownMenu.click();
		Thread.sleep(3000);
		radioPopularity.click();
	}	
	
	public void sortByPriceHighToLow() throws InterruptedException {
		dropdownMenu.click();
		Thread.sleep(3000);
		radioPriceHighToLow.click();
	}
	
	public void sortByPriceLowtoHigh() throws InterruptedException {
		dropdownMenu.click();
		Thread.sleep(3000);
		radioPriceLowToHigh.click();
	}
	
    public void sortByDiscount() throws InterruptedException {
    	dropdownMenu.click();
		Thread.sleep(3000);
		radioDiscount.click();
    }
    
    public void sortByAllProducts() throws InterruptedException {
    	dropdownMenu.click();
		Thread.sleep(3000);
		radioAllProducts.click();
    }
}
