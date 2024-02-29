package cucumberXserenityStepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.AfterAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CucumberXserenityStepDef {
	
	WebDriver driver;
	
	
	@Given("open a page with url in  browser")
	public void open_url() {
		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

	}


	@When("enter login  credentials")
	public void meth() {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@your");
		Assert.fail();

	}
	@And("click on login")
	public void login() {

		driver.findElement(By.id("Password")).clear();
		
	}
	 
}
