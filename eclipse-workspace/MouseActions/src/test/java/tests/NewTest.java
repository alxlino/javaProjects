package tests;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import framework.GetScreenShot;

public class NewTest {
  

	static ExtentReports extent;
	static ExtentTest test;
	static WebDriver driver;
	ITestResult result; 
	
	@BeforeTest
	public static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.automationtesting.in");
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentScreenshot.html");
	}

	
	@Test
	public void captureScreenshot() throws IOException {
		
		test = extent.startTest("captureScreenshot");
		String title = driver.getTitle();
		Assert.assertEquals("ERRO",title);		
		String screenshotPath = GetScreenShot.capture(driver, "screenshotForExtentReport");
		test.log(LogStatus.PASS,"Teste Passou os titulos sao iguais: " + test.addScreenCapture(screenshotPath));
	
	}

	
	@AfterMethod
	public void getResult(ITestResult result) throws IOException {
		
		if (result.getStatus() == ITestResult.FAILURE) {
			
			String screenshotPath = GetScreenShot.capture(driver, "screenshotForExtentReport");
			test.log(LogStatus.FAIL, result.getThrowable());
			test.log(LogStatus.FAIL, "Screenshot Abaixo: " + test.addScreenCapture(screenshotPath));
		}
	}

	
	@AfterTest
	public static void endReport() throws Exception {
		
		extent.endTest(test);
		driver.quit();
		extent.flush();
		extent.close();
		
	}
	
	
	
}
