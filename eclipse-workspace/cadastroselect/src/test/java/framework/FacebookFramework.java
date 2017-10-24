package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookFramework {

	static WebDriver driver;

	public static WebDriver setUpDriver(String navegador) {

		if (navegador == "chrome") {

			System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		} else if (navegador == "firefox") {

			System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
			driver = new FirefoxDriver();

		} else {

		}

		driver.get("https://www.facebook.com/");
		return driver;

		// facebookPage = new FacebookPage(driver);

	}

}
