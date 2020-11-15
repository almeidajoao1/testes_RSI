package cenarios;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.HomePage;
import page.standardPage;

public class standard_user {
	
	WebDriver driver = new ChromeDriver();
	HomePage homepage;
	standardPage standard;

	@Before
	public void abrirJanela() {
		driver.manage().window().maximize();
		homepage = new HomePage(driver);
		standard = new standardPage(driver);
		homepage.abrirURL("https://www.saucedemo.com/");
		
	}
		
	@Test
	public void preencherLogin() throws InterruptedException, IOException {
		homepage.clicaLogin();
		standard.preencherLogin();
		standard.preencherSenha();
		standard.click();
		Thread.sleep(5000);
	}

	@After
	public void fecharPagina() {
		driver.quit();
	}
		
}