package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features",
		glue = {"stepDefinitions"},
		tags = "@activity5",
	    plugin = {"pretty"},
	    monochrome = true
	)
public class ActivitiesRunner_Activity6_Pretty {

}
