package com.JioMart.TestComponents;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.JioMart.Utilities.Reports;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class TestListen extends BaseTest implements ITestListener{
	
ExtentReports report=Reports.getReportObjects()	;
ExtentTest test;

@Override
public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	test=report.createTest(result.getMethod().getMethodName());
}

@Override
public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	test.log(Status.PASS, "Test Is Passed");
}

@Override
public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	
}

@Override
public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	report.flush();
}

@Override
public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
	test.fail(result.getThrowable());
	
	try {
		driver=(WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
	}
	String filePath = null;
	try {
		filePath=captureScreenshots(result.getMethod().getMethodName(), driver);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	test.addScreenCaptureFromPath(filePath, result.getMethod().getMethodName());
}




}
