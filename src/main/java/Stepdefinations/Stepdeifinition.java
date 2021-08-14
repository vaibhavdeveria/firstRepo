package Stepdefinations;

import io.cucumber.java.en.Given;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Stepdeifinition {

	WebDriver driver;
	@Given("^User is already on Login Page$")
	public void user_already_on_login_page(){
		System.setProperty("webdriver.chrome.driver", "C:/Users/vaibh/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com");
		System.out.println(driver.getTitle());
		
		
	}
	

	@When("^Title of Login Page is Free CRM$")
	public void title_of_login_page_is_free_crm() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Title page");
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("^user Enters username and password$")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is on login page");
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("^user clicks on Login button$")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is on login button");
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("^user is on home page$")
	public void user_is_on_home_page() {
	  // Write code here that turns the phrase above into concrete actions
		System.out.println("User is on home Page");
	    //throw new io.cucumber.java.PendingException();
	}



}
