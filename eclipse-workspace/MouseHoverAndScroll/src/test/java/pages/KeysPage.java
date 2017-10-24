package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeysPage {
	
	static WebDriver driver;

	public KeysPage(WebDriver driver) {
		
		KeysPage.driver = driver;

	}
	
	public void mouseHoverScroll() throws Exception {
		
		Actions acaoMenu = new Actions(driver);
		
		WebElement menuInteractions = driver.findElement(By.cssSelector("a[href=\"Interactions.html\"]"));
		acaoMenu.moveToElement(menuInteractions).perform();
		
		Thread.sleep(5000);
		
		WebElement subMenuInteractions = driver.findElement(By.cssSelector("a[href=\"Selectable.html\"]"));
		acaoMenu.moveToElement(subMenuInteractions).perform();
		
		Thread.sleep(5000);
		
		WebElement subMenuDragAndDrop = driver.findElement(By.xpath(".//*[@id='header']/nav/div/div[2]/ul/li[6]/ul/li[1]/a"));
		acaoMenu.moveToElement(subMenuDragAndDrop).perform();
		
		Thread.sleep(5000);
		
		WebElement subMenuStatic = driver.findElement(By.cssSelector("a[href=\"Static.html\"]"));
		acaoMenu.moveToElement(subMenuStatic).click().build().perform();
		
		Thread.sleep(5000);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,300)");
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}
	
	
}
