package swag.StepDefinitions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import swag.Constants.Cons;
import swag.DriverManager.DriverManager;
import swag.PageObjects.HomePage;
import swag.PageObjects.LoginPage;
import swag.Utilities.CommonUtils;

public class AddToCartStepDef {
	@Given("User launches the URL")
	public void user_launches_the_url() {
		DriverManager.getDriver().get(Cons.Url);

	}

	@When("User enters the {string} and {string}")
	public void user_enters_the_and(String uname, String pass) {
		try {
			LoginPage.getInstance().enterUserName("standard_user");
			LoginPage.getInstance().enterPassword("secret_sauce");
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	@And("User clicked the login Btn")
	public void user_clicked_the_login_btn() {
		try {
			LoginPage.getInstance().clickLoginButon();
		} catch (Exception e) {
		}
	}

	@And("User clicked the add to cart for any one of the product")
	public void user_clicked_the_add_to_cart_for_any_one_of_the_product() {
		HomePage.getInstance().getBackPackCartBtn().click();

	}

	@Then("User should see the product count in the cartbadge")
	public void user_should_see_the_product_count_in_the_cartbadge() {
		String badgeText = HomePage.getInstance().getCartBadge().getText();
		System.out.println(badgeText);

	}

}
