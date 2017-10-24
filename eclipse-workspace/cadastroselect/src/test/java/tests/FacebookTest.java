package tests;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import framework.FacebookFramework;
import pages.FacebookPage;

public class FacebookTest {

	static WebDriver driver;
	static FacebookPage facebookPage;
	static FacebookFramework facebookFrameWork;
	static FacebookBrowser fbbrowser;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		//System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		
		//driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		//driver.get("https://www.facebook.com/");
		
		//facebookWebDriver = new FacebookWebDriver();
		
		//facebookWebDriver.setUpDriver("firefox");
		
		//facebookFrameWork = new FacebookFramework();
		
		FacebookTest.setFbbrowser(FacebookBrowser.FIREFOX);
		driver = FacebookFramework.setUpDriver(fbbrowser.getDescricao());
		
		facebookPage = new FacebookPage(driver);
		
	}

	
	public static void setFbbrowser(FacebookBrowser fbbrowser) {
		FacebookTest.fbbrowser = fbbrowser;
	}


	@Test
	public void test() throws Exception {
		
		facebookPage.preencherCombobox();
	}
	
}	
