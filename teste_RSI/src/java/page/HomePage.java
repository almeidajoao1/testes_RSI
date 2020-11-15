package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
	
	final String CLICK = "#user-name";

	public HomePage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Este método manda os dados para Login e senha
	 */
	public void clicaLogin() {
		driver.findElement(By.cssSelector(CLICK)).click();
	}
}