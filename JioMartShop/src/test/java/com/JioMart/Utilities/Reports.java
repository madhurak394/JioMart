package com.JioMart.Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	
	static ExtentReports report;
	
	public static ExtentReports getReportObjects() 
	{
		String path=System.getProperty("user.dir")+"\\reports\\extentreports.html";
    	ExtentSparkReporter spark = new ExtentSparkReporter(path);
    	spark.config().setReportName("JioMart Shop") ;  
    	spark.config().setDocumentTitle("TestResults");
    	
    	report=new ExtentReports();
    	report.attachReporter(spark);
		return report;
    	
    	
	}

	

}
