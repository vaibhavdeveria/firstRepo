package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import cucumber.api.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/java/Feature/login.feature",
		glue = "Stepdefinations",
		plugin= {"pretty" ,"html:test-output"},
		monochrome= true
		
		)
public class Testrunner {

}