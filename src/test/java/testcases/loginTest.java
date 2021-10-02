package testcases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.landingPage;
import PageObjects.loginPage;
import resources.base;

public class loginTest extends base {

	public landingPage lp;
	public loginPage lop;
	
	@BeforeTest
	
	public void driver_initial() throws IOException {
     
		driver = intilization();
		
		
		
	}
	
	@Test(dataProvider="get_data")
	public void user_login(String UserName, String password) throws IOException {
		
		driver.get(prop.getProperty("url"));
		
		lp = new landingPage(driver);
		
		lop = new loginPage(driver);
		
		lp.Login_button_homePage().click();
		lop.user_email().sendKeys(UserName);
		lop.user_pwd().sendKeys(password);
		
	}
	@DataProvider
	public Object[][] get_data() {
		
		Object[][] data = new Object[2][2];
		data[0][1]  = "vaibhavdeveria09@gmail.com";
		data[0][1] = "Passw0rd";
		data[1][0] = "vaibhavdeveria23@gmail.com";
		data[1][1] = "password1";
		return data;
				
				
	}
	@AfterTest
	public void driver_close() {
		
		driver.close();
	}
}
