package swag.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="src/test/resources/FeatureFiles",
		glue= {"swag.StepDefinitions","hooks"},
		dryRun=!true,
		stepNotifications=true,
		monochrome=true,
//		plugin= {"rerun:target/failedscenario.txt"}
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}


		)

public class RunnerClass {

}
