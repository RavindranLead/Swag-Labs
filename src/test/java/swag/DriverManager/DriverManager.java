package swag.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import swag.Constants.Cons;

public class DriverManager {
	private static WebDriver driver=null;
	
	
	public static WebDriver getDriver() {
		return driver;
	}


	public static void launchBrowser() {
		switch (Cons.BrowserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		}

}
}
