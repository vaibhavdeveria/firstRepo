package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class landingPage {

	public WebDriver driver; 
	
	//element locator
	
	private By login = By.xpath("//*[@href='http://qaclickacademy.usefedora.com/sign_in']");
	private By feature_title = By.xpath("//*[@id='block-1743715']/div/h2");
	
	//driver initilization
	
		public landingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	//action class
	
	public WebElement Login_button_homePage() {
		
		return  driver.findElement(login);
	}
	
	public WebElement feature_course_title() {
		
		return driver.findElement(feature_title);
	}
}
