package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.ExtentReportTestNg;
import resources.base;

public class Listeners extends base implements ITestListener {
	ExtentTest test;
	    ExtentReports extent = ExtentReportTestNg.getReportObject();
	    
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		 test = extent.createTest(result.getMethod().getMethodName());
		
	}
		
	

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.PASS, "Test Passed");
		
	}

	/*public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		test.fail(result.getThrowable());
		WebDriver driver = null;
		String testmethodname = result.getMethod().getMethodName();
		try {
			
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e) {
			
			
		
		}
		
		try {
			
			get_screenShot(testmethodname,driver);
			
		} catch (IOException e) {
			
		}
		
	}*/

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	

}
