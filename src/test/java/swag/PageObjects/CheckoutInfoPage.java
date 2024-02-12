package swag.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import swag.DriverManager.DriverManager;

public class CheckoutInfoPage {
	WebDriver driver = DriverManager.getDriver();

	By CHECKOUT_TITLE = By.xpath("//span[text()='Checkout: Your Information']");
	By FIRSTNAME = By.xpath("//input[@id='first-name']");
	By LASTNAME = By.xpath("//input[@id='last-name']");
	By POSTAL_CODE = By.xpath("//input[@id='postal-code']");
	By CONTINUE_BUTTON = By.xpath("//input[@id='continue']");
	By CANCEL_BUTTON = By.xpath("//input[@id='continue']");

	public void enterFirstName(String fname) {
		driver.findElement(FIRSTNAME).sendKeys(fname);

	}

	public void enterLastName(String lname) {
		driver.findElement(LASTNAME).sendKeys(lname);

	}

	public void enterPostalCode(String postalCode) {
		driver.findElement(POSTAL_CODE).sendKeys(postalCode);

	}

	public void clickContinueButton() {
		driver.findElement(CONTINUE_BUTTON).click();
	}

	public void clickCancelButton() {
		driver.findElement(CANCEL_BUTTON).click();

	}

	private static CheckoutInfoPage checkoutInfoInstance;

	private CheckoutInfoPage() {
		// TODO Auto-generated constructor stub
	}

	public static CheckoutInfoPage getInstance() {
		if (checkoutInfoInstance == null) {
			checkoutInfoInstance = new CheckoutInfoPage();
		}
		return checkoutInfoInstance;

	}

}
