package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportTestNg {

	public static ExtentReports extent;
	
	//ExtentSparkReporter , ExtentReports
	public  static ExtentReports getReportObject() {
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		
		ExtentSparkReporter reporter  = new ExtentSparkReporter(path);
		
		reporter.config().setReportName("TestNG Automation report");
		reporter.config().setReportName("Test Results");
		
		 extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Vaibhv");
		
		return extent;
	}
}
