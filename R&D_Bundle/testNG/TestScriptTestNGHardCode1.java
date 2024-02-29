package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestScriptTestNGHardCode1 {

	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void ncEmailField() {

		WebElement email = driver.findElement(By.id("Email"));
		Assert.assertTrue(email.isDisplayed(), "Email Field not Visible;");
		
		
	}
	
	
	
	
	
	
}
