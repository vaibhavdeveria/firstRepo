package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.landingPage;
import PageObjects.loginPage;
import resources.base;

public class Landingtest extends base {

	public landingPage lp;
	public loginPage lop;
	
	@BeforeTest
	
	public void driver_initial() throws IOException {
		
	
    driver = intilization();
	
	driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void loginPageTitleTest() throws IOException {
		
		
	
	
	lp = new landingPage(driver);
	
    String text_name = lp.feature_course_title().getText();
	
    Assert.assertEquals(text_name, "Featured Courses");
    
	System.out.println("text name is  " +text_name);
		
	}
	
	
	@AfterTest
	public void driver_close() {
		
		driver.close();
	}
	
	
}
