package pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsPage {

	static WebDriver driver;

	public MouseActionsPage(WebDriver driver) {

		MouseActionsPage.driver = driver;

	}

	public void DragAndDropAction() throws Exception {

		WebElement iframe = driver.findElement(By.className("demo-frame"));

		driver.switchTo().frame(iframe);

		Actions acaoDragDrop = new Actions(driver);

		WebElement drag = driver.findElement(By.xpath(".//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.id("droppable"));

		// acaoDragDrop.dragAndDrop(drag, drop).perform();

		acaoDragDrop.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();

		Thread.sleep(3000);

		driver.quit();

	}

	public void ResizeAction() throws Exception {
		
		WebElement iframe = driver.findElement(By.className("demo-frame"));

		driver.switchTo().frame(iframe);

		Actions acaoResize = new Actions(driver);
		
		WebElement drag = driver.findElement(By.xpath(".//div[@id='resizable']/div[3]"));
		
		acaoResize.clickAndHold(drag).moveByOffset(150, 30).release(drag).build().perform();

		Thread.sleep(3000);

		driver.quit();

	}
	
	public void SliderAction() throws Exception {
		
		WebElement iframe = driver.findElement(By.className("demo-frame"));

		driver.switchTo().frame(iframe);

		Actions  acaoSlider = new Actions(driver);
		
		WebElement drag = driver.findElement(By.xpath(".//div[@id='red']/span"));
		
		acaoSlider.clickAndHold(drag).moveByOffset(-70, 0).release(drag).build().perform();
		
		Thread.sleep(3000);

		driver.quit();
		
	}
	
	
	public void FileUploadAction() throws Exception {
		
		Robot robot = new Robot();
		
		WebElement fileUpload = driver.findElement(By.id("imagesrc"));
		fileUpload.click();
		
		robot.setAutoDelay(2000);
		
		StringSelection strSelec = new StringSelection("C:\\Users\\Alexandre Lino\\Documents\\arqteste.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelec,null);
		
		robot.setAutoDelay(2000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.setAutoDelay(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		robot.setAutoDelay(2000);
		
		driver.quit();
		
	}

}
