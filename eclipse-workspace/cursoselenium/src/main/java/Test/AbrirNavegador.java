package Test;

import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbrirNavegador {

	static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");

		// driver = new FirefoxDriver();
		driver = new ChromeDriver();

		driver.get("https://ninjainvoices.herokuapp.com/home_private");

	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {

		driver.close();

	}

}
