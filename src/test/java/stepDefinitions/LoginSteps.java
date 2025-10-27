package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver;
	
	
	@Given ("el usuario abre el navegador")
	public void abrirNavegador() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@When ("navega al sitio {string}")
	public void navegarAlSitio(String url) {
		driver.get(url);
	}
	
	@When ("ingresa usuario {string} y contraseña {string}")
	public void ingresarCredenciales(String user, String pass) {
		driver.findElement(By.id("user-name")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("login-button")).click();
	}
	
	@Then ("deberia ver el titulo {string}")
	public void verificarTitulo(String tituloEsperado) {
		String titulo = driver.getTitle();
		System.out.println("Titulo actual:" + titulo);
		driver.quit();
	}
	
	
}
