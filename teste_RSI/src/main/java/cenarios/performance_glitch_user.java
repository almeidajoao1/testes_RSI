package cenarios;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.HomePage;
import page.performancePage;

public class performance_glitch_user {
	
	WebDriver driver = new ChromeDriver();
	HomePage homepage;
	performancePage performarce;

	@Before
	public void abrirJanela() {
		driver.manage().window().maximize();
		homepage = new HomePage(driver);
		performarce = new performancePage(driver);
		homepage.abrirURL("https://www.saucedemo.com/");
		
	}
		
	@Test
	public void preencherLogin() throws InterruptedException, IOException {
		homepage.clicaLogin();
		performarce.preencherLogin();
		performarce.preencherSenha();
		performarce.click();
		Thread.sleep(5000);
	}

	@After
	public void fecharPagina() {
		driver.quit();
	}
		
}