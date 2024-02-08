package com.JioMart.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SetUp {
	
 static Properties prop;
	
	public static String configureURL() throws IOException
	{
		try {
			prop=new Properties();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\SeleniumTraining\\JioMartShop\\Configuration\\config.properties");
		prop.load(fis);
		String URL=prop.getProperty("url");
		return URL;
	}
	
	public static String configureBrowser() throws IOException  
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\SeleniumTraining\\JioMartShop\\Configuration\\config.properties");
		prop.load(fis);
		String Browser=prop.getProperty("browser");
		return Browser;
	}

}
