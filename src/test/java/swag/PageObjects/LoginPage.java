package swag.PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import swag.DriverManager.DriverManager;

public class LoginPage {
	WebDriver driver = DriverManager.getDriver();

	private static LoginPage loginInstance;

	private LoginPage() {

	}

	By USERNAME = By.id("user-name");
	By PASSWORD = By.id("password");
	By LOGINBTN = By.id("login-button");

	public void enterUserName(String username) {
		try {
			driver.findElement(USERNAME).sendKeys(username);
		} catch (NoSuchElementException e) {
			try {
				System.out.println("trying Once More");
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
				wait.until(ExpectedConditions.elementToBeClickable(USERNAME));
				
			} catch (Exception e2) {
				System.out.println("element not found ");
				
			}
		}
	}

	public void enterPassword(String password) {
		driver.findElement(PASSWORD).sendKeys(password);

	}

	public void clickLoginButon() {
		driver.findElement(LOGINBTN).click();

	}

	public static LoginPage getInstance() {
		if (loginInstance == null) {
			loginInstance = new LoginPage();

		}
		return loginInstance;

	}

}
