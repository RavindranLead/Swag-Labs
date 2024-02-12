package swag.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="@target/failedscenario.txt",
		glue= {"swag.StepDefinitions","hooks"},
		dryRun=!true,
		stepNotifications=true,
		monochrome=true
	
		)
public class ReRunner {

}
