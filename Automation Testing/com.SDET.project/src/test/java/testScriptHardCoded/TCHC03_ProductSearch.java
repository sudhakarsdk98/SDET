package testScriptHardCoded;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TCHC03_ProductSearch {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
		
		WebElement emailField = driver.findElement(By.id("Email"));
		
		WebElement pwsField = driver.findElement(By.name("Password"));
		
		emailField.clear();
		emailField.sendKeys("admin@yourstore.com");
		
		pwsField.clear();
		pwsField.sendKeys("admin");
		
		driver.findElement(By.tagName("button")).click();
		
		driver.findElement(By.linkText("Catalog")).click();
		driver.findElement(By.linkText("Products")).click();
		
		WebElement productSearch = driver.findElement(By.id("SearchProductName"));
		productSearch.sendKeys("apple");
		
		driver.findElement(By.id("search-products")).click();
		
		
		driver.quit();
	}

}
