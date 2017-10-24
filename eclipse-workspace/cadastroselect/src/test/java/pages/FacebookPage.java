package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import framework.FacebookGenerator;

public class FacebookPage {

	static WebDriver driver;
	//static FacebookGenerator facebookGenerator;
	
	private Select selectDia;
	private Select selectMes;
	private Select selectAno;
	private WebElement chkSexoF;
	private WebElement chkSexoM;
	private WebElement nome;
	private WebElement sobrenome;

	public FacebookPage(WebDriver driver) {
		
		FacebookPage.driver = driver;
		this.nome = driver.findElement(By.name("firstname"));
		this.sobrenome = driver.findElement(By.name("lastname"));
		this.selectDia = new Select(driver.findElement(By.id("day")));
		this.selectMes = new Select(driver.findElement(By.id("month")));
		this.selectAno = new Select(driver.findElement(By.id("year")));
		this.chkSexoF =  driver.findElement(By.id("u_0_4"));
		this.chkSexoM = driver.findElement(By.id("u_0_5"));
		
	}
	
	
	public void preencherCombobox() throws Exception {
		
		FacebookGenerator facebookGenerator = new FacebookGenerator();
		
		facebookGenerator.geradorDeMassa();
		this.nome.sendKeys(facebookGenerator.getFirstName());
		this.sobrenome.sendKeys(facebookGenerator.getLastName());
			
		//this.nome.sendKeys("Alexandre");
		//this.sobrenome.sendKeys("Lino");
		
		//Select selectDia = new Select(driver.findElement(By.id("day")));
		this.selectDia.selectByValue("28");
		
		//Select selectMes = new Select(driver.findElement(By.id("month")));
		//selectMes.selectByVisibleText("Jul");
		this.selectMes.selectByVisibleText("Jul");
		
		//Select selectAno = new Select(driver.findElement(By.id("year")));
		this.selectAno.selectByValue("1985");
		
		//WebElement chkSexoF = driver.findElement(By.id("u_0_4"));
		this.chkSexoF.click();
		Thread.sleep(2000);
		
		//WebElement chkSexoM = driver.findElement(By.id("u_0_5"));
		this.chkSexoM.click();
		
	}
	
}
