package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	public WebDriver driver;
	
	//define locator
	
	private By Email = By.xpath("//*[@name= 'email']");
	private By Password = By.xpath("//*[@id='password']");
	
	//initiliaze locator
	
	
	//action methods
	
	public loginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement user_email() {
		
		return driver.findElement(Email);
		
	}
	
	public WebElement user_pwd() {
		
		 return driver.findElement(Password);
	}
	
}

