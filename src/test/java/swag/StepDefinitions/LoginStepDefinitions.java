package swag.StepDefinitions;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import swag.Constants.Cons;
import swag.DriverManager.DriverManager;
import swag.PageObjects.CheckoutInfoPage;
import swag.PageObjects.HomePage;
import swag.PageObjects.LoginPage;

public class LoginStepDefinitions {

	@Given("User launched the application URL")
	public void user_launched_the_application_url() {
		DriverManager.getDriver().get(Cons.Url);

	}

	@When("User enters the username and password")
	public void user_enters_the_username_and_password() {
		LoginPage.getInstance().enterUserName("standard_user");
		LoginPage.getInstance().enterPassword("secret_sauc");
		
	}

	@When("User clicked the login button")
	public void user_clicked_the_login_button() {
		LoginPage.getInstance().clickLoginButon();
	}

	@Then("User can redirected to Homepage")
	public void user_can_redirected_to_homepage() {
		WebElement coprightText = HomePage.getInstance().getCoprightText();
		String text = coprightText.getText();
		System.out.println(text);

	}

}
