package hooks;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import swag.DriverManager.DriverManager;
import swag.Utilities.CommonUtils;

public class Hooks {

	@Before
	public void beforeScenario() {
		CommonUtils.loadProperties();
		if (DriverManager.getDriver() == null) {
			DriverManager.launchBrowser();
			DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			CommonUtils.initWebElement();
		}

	}
	@AfterStep
	public static void takeScreenshot(Scenario scenario) {
		String scenarioName = scenario.getName();
		if(scenario.isFailed()) {
			byte[] screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "Failed Scenario" + scenarioName); 
		}   

	}
}


