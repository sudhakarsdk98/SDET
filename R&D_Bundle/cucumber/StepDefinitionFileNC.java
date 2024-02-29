//package cucumber;
//
//import java.util.List;
//import java.util.Map;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class StepDefinitionFileNC {
//
//	WebDriver driver;
//
//	String url = "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F";
//	String ncValidEmailID = "admin@yourstore.com";
//	String ncInvalidEmailID = "admin@yourstore.";
//	String ncValidPassword = "admin";
//	String ncInvalidPassword = "admn";
//
//	@Given("launch the chrome browser")
//	public void launch_the_chrome_browser() {
//		driver = new ChromeDriver();
//	}
//
//	@Given("open NC login page")
//	public void open_nc_login_page() {
//		driver.get(url);
//	}
//
//	@When("teriminate the browser")
//	public void teriminate_the_browser() {
//		driver.quit();
//	}
//
//	@Then("verify Email field present")
//	public void verify_email_field_present() {
//		WebElement email = driver.findElement(By.id("Email"));
//		if (email.isDisplayed()) {
//			System.out.println("Email Field is Present");
//		} else {
//			System.out.println("Email Field is not Present");
//		}
//
//	}
//
//	@When("validate Email field by giving positivedata")
//	public void validate_email_field_by_giving_positivedata() {
//		WebElement email = driver.findElement(By.id("Email"));
//		email.clear();
//		email.sendKeys(ncValidEmailID);
//	}
//
//	@When("validate Email field by giving negative data")
//	public void validate_email_field_by_giving_negative_data() {
//		WebElement email = driver.findElement(By.id("Email"));
//		email.clear();
//		email.sendKeys(ncInvalidEmailID);
//	}
//
//	@Then("verify Password field present")
//	public void verify_Password_field_present() {
//		WebElement password = driver.findElement(By.name("Password"));
//		if (password.isDisplayed()) {
//			System.out.println("Password Field is Present");
//		} else {
//			System.out.println("Password Field is not Present");
//		}
//
//	}
//
//	@When("validate Password field by giving positivedata")
//	public void validate_Password_field_by_giving_positivedata() {
//		WebElement password = driver.findElement(By.name("Password"));
//		password.clear();
//		password.sendKeys(ncValidPassword);
//	}
//
//	@When("validate Password field by giving negative data")
//	public void validate_Password_field_by_giving_negative_data() {
//		WebElement password = driver.findElement(By.name("Password"));
//		password.clear();
//		password.sendKeys(ncInvalidPassword);
//	}
//	
//	@ When("click on login button")
//	public void click_on_login_button() {
//		WebElement loginBtn = driver.findElement(By.tagName("button"));
//		loginBtn.click();
//	}
//	
//	@When("click on logout")
//	public void click_on_logout() {
//		WebElement logout = driver.findElement(By.linkText("Logout"));
//		logout.click();
//	}
//// DataTable -3
//	@When("validate Email field by giving data")
//	public void validate_email_field_by_giving_data(io.cucumber.datatable.DataTable dataTable) {
//		
//	List<Map<String,String>> data = dataTable.asMaps();
//	for(Map<String, String> id : data) {
//	String emailID = id.get("Email");
//	
//	driver.findElement(By.id("Email")).clear();
//	driver.findElement(By.id("Email")).sendKeys(emailID);
//	   
//		}
//	}
//
//	@When("validate Password field by giving data")
//	public void validate_password_field_by_giving_data() {
//	  
//	}
//	
//	
//	
//	
//	
//	
//	
//}
