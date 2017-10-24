package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroPages {

	static WebDriver driver;

	private WebElement nome;
	private WebElement sobrenome;
	private WebElement email;
	private WebElement password;
	private WebElement mes;
	private WebElement mesAgosto;
	private WebElement sexo;
	private WebElement sexoMasc;

	public CadastroPages(WebDriver driver) {

		this.driver = driver;
		
		this.nome = driver.findElement(By.id("FirstName"));
		
		this.sobrenome = driver.findElement(By.name("LastName"));
		
		this.email = driver.findElement(By.id("GmailAddress"));
		
		this.password = driver.findElement(By.name("Passwd"));
		
		this.mes = driver.findElement(By.xpath(".//*[@id='BirthMonth']/div[1]"));
		
		this.sexo = driver.findElement(By.xpath(".//*[@id='Gender']/div"));

	}

	public void preencherCampos() {

		this.nome.sendKeys("Alexandre");
		
		this.sobrenome.sendKeys("Lino");

		this.email.sendKeys("lino.alexfulano");

		this.password.sendKeys("qwerty1234!");

		this.mes.click();

		this.mesAgosto = driver.findElement(By.xpath(".//*[@id=':8']"));
		this.mesAgosto.click();

		this.sexo.click();

		this.sexoMasc = driver.findElement(By.xpath(".//*[@id=':f']"));
		this.sexoMasc.click();

	}

}
