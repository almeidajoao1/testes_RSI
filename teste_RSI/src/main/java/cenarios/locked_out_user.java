package cenarios;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.HomePage;
import page.lockedPage;

public class locked_out_user {
	
	WebDriver driver = new ChromeDriver();
	HomePage homepage;
	lockedPage locked;

	@Before
	public void abrirJanela() {
		driver.manage().window().maximize();
		homepage = new HomePage(driver);
		locked = new lockedPage(driver);
		homepage.abrirURL("https://www.saucedemo.com/");
		
	}
		
	@Test
	public void preencherLogin() throws InterruptedException, IOException {
		homepage.clicaLogin();
		locked.preencherLogin();
		locked.preencherSenha();
		locked.click();
		Thread.sleep(5000);
	}

	@After
	public void fecharPagina() {
		driver.quit();
	}
		
}