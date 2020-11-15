package cenarios;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.HomePage;
import page.problemPage;

public class problem_user {
	
	WebDriver driver = new ChromeDriver();
	HomePage homepage;
	problemPage problem;

	@Before
	public void abrirJanela() {
		driver.manage().window().maximize();
		homepage = new HomePage(driver);
		problem = new problemPage(driver);
		homepage.abrirURL("https://www.saucedemo.com/");
		
	}
		
	@Test
	public void preencherLogin() throws InterruptedException, IOException {
		homepage.clicaLogin();
		problem.preencherLogin();
		problem.preencherSenha();
		problem.click();
		Thread.sleep(5000);
	}

	@After
	public void fecharPagina() {
		driver.quit();
	}
		
}