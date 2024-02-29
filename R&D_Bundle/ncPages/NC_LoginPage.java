package ncPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NC_LoginPage { // RULE - 1 : Create individual classes for each WebPage.
	
	WebDriver driver;
	
	// RULE - 2 : Provide information of all WebElements that we are going to use in automation.
	
	By email = By.id("Email");
	
	By pwd = By.name("Password");
	
	By loginBtn = By.tagName("button");
	
	
	// RULE - 3 : Create individual methods for each WebElements based on the webElement type
	
	public void enterEmail() {
		
		driver.findElement(email).clear();
		
		driver.findElement(email).sendKeys("admin@yourstore.com");
		
	}
	
	public void enterPassword() {
		
		driver.findElement(pwd).clear();
		
		driver.findElement(pwd).sendKeys("admin");
		
	}
	
	public void clickLoginBtn() {
	
		driver.findElement(loginBtn).click();
		
	}
	
	
	
	// RULE - 4 : In every WebPage Class, create our own constructor with WebDriver object as a parameter.
	
	public NC_LoginPage(WebDriver d) {
		
		this.driver = d;
		
	}
	
}
