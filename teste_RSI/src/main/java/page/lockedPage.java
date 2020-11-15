package page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class lockedPage extends BasePage {
	
	final String LOGIN = "#user-name";
	final String SENHA = "#password";
	final String SUBMIT = "#login-button";

	public lockedPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void preencherLogin() {
		driver.findElement(By.cssSelector(LOGIN)).sendKeys("locked_user");
	}
	
	public void preencherSenha() {
		driver.findElement(By.cssSelector(SENHA)).click();
		driver.findElement(By.cssSelector(SENHA)).sendKeys("secret_sauce");
	}
	
	public void click() throws IOException {
		driver.findElement(By.cssSelector(SUBMIT)).click();
		takeScreenShot("locked_user"); //os arquivos do print vão para a pasta "output"
	}

}