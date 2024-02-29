package entireHybridSDET;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HybridStepDefinition {
	
//	WebDriver driver;
//	
//	@Before
//	public void setUp() {
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//	}
//	
//	@After
//	private void tearDown() {
//		driver.quit();
//	}
//
//	@Given("open NC login page")
//	public void open_nc_login_page() {
//		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
//	}
//
//	@Given("refresh login page")
//	public void refresh_login_page() {
//	    driver.navigate().refresh();
//	}
//
//	@Then("verify Email field present")
//	public void verify_email_field_present() {
//	  WebElement emailField = driver.findElement(By.id("Email"));
//	  
//	  if(emailField.isDisplayed()) {
//		  System.out.println("Email Field is Present");
//	  }
//	  else {
//		System.out.println("Email Field is not Present");
//	}
//	  
//	}
//
//	@Then("verify Password field present")
//	public void verify_password_field_present() {
//		 WebElement passField = driver.findElement(By.id("Password"));
//		  
//		  if(passField.isDisplayed()) {
//			  System.out.println("Password Field is Present");
//		  }
//		  else {
//			System.out.println("Password Field is not Present");
//		}
//	   
//	}
//
//	@When("validate {string} field by giving multiple data in email field")
//	public void validate_field_by_giving_multiple_data_in_email_field(String string) {
//		  WebElement emailField = driver.findElement(By.id("Email"));
//		  emailField.clear();
//		  emailField.sendKeys(string);
//	   
//	}
//	
//	@When("validate {string} field by giving multiple data in password field")
//	public void validate_field_by_giving_multiple_data_in_password_field(String string) {
//		 WebElement passField = driver.findElement(By.id("Password"));
//		 passField.clear();
//		 passField.sendKeys(string);
//	   
//	}
//
//	
//
//	@When("validate Email field by giving data")
//	public void validate_email_field_by_giving_data(io.cucumber.datatable.DataTable dataTable) {
//		List<Map<String,String>> data = dataTable.asMaps();
//		for(Map<String, String> id : data) {
//		String emailID = id.get("Email");
//		
//		driver.findElement(By.id("Email")).clear();
//		driver.findElement(By.id("Email")).sendKeys(emailID);
//		   
//			}
//	}
//
//	@When("validate Password field by giving data")
//	public void validate_password_field_by_giving_data(io.cucumber.datatable.DataTable dataTable) {
//		List<List<String>> data = dataTable.asLists();
//		String pass = data.get(0).get(0);
//		
//		 WebElement passField = driver.findElement(By.id("Password"));
//		 passField.clear();
//		 passField.sendKeys(pass);
//	}
//
//	@When("validate {string} field by giving positivedata in email field")
//	public void validate_field_by_giving_positivedata_in_email_field(String string) {
//		
//		WebElement emailField = driver.findElement(By.id("Email"));
//		  emailField.clear();
//		  emailField.sendKeys(string);
//	   
//	}
//
//
//
//	@When("validate {string} field by giving positivedata in password field")
//	public void validate_password_field_by_giving_positivedata_in_password_field(String string) {
//	   
//		 WebElement passField = driver.findElement(By.id("Password"));
//		 passField.clear();
//		 passField.sendKeys(string);
//		
//	}
//
//	@When("click on login button")
//	public void click_on_login_button() {
//	  driver.findElement(By.tagName("button")).click();
//	}
//
//	@When("click on logout")
//	public void click_on_logout() {
//
//	driver.findElement(By.linkText("Logout")).click();
//	
//	}

}


