package swag.Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import swag.Constants.Cons;
import swag.DriverManager.DriverManager;
import swag.PageObjects.HomePage;
import swag.PageObjects.LoginPage;

public class CommonUtils {

	public static void loadProperties() {
		FileReader file = null;
		try {
			file = new FileReader("src/test/resources/Config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties p = new Properties();
		try {
			p.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Cons.BrowserName = p.getProperty("Browser");
		Cons.Url = p.getProperty("Url");

	}
	
	public static void initWebElement() {
		PageFactory.initElements(DriverManager.getDriver(), LoginPage.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), HomePage.getInstance());

	}
	
	public static void takeScreenshot() throws IOException {
		TakesScreenshot screenshot= (TakesScreenshot)DriverManager.getDriver();
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("screenshot.png"));
	}
	

}
