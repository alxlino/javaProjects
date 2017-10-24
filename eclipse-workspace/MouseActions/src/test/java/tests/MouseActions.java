package tests;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.MouseActionsPage;

public class MouseActions {
	
	static WebDriver driver;
	static MouseActionsPage mouseActionsPage;


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://jqueryui.com/droppable/");
		//driver.get("https://jqueryui.com/resizable/");
		//driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.get("http://demo.automationtesting.in/Register.html");
		mouseActionsPage = new MouseActionsPage(driver);
		
	}


	@Test
	public void test() throws Exception {

		//mouseActionsPage.DragAndDropAction();
		//mouseActionsPage.ResizeAction();
		//mouseActionsPage.SliderAction();
		//mouseActionsPage.FileUploadAction();
		

	}

}
