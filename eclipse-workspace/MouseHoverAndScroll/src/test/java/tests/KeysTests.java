package tests;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.KeysPage;

public class KeysTests {
	
	
	static WebDriver driver;
	static KeysPage keysPage;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		keysPage = new KeysPage(driver);
	}


	@Test
	public void test() throws Exception {
		
		keysPage.mouseHoverScroll();
		
	}

}
