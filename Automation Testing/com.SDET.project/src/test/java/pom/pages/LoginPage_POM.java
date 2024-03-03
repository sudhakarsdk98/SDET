package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_POM {
	
	WebDriver driver;
	
	public LoginPage_POM(WebDriver drive) {
		this.driver = drive;
	}
	
	By emailField = By.id("Email");
	By pwsField = By.name("Password");
	By logintBtn = By.tagName("button");
	
	
	public void enterEmail(String emailID) {
		
		driver.findElement(emailField).clear();
		driver.findElement(emailField).sendKeys(emailID);
		
	}
	
	public void enterPassword(String pws) {
		driver.findElement(pwsField).clear();
		driver.findElement(pwsField).sendKeys(pws);
		
	}
	
	public void clickOnLoginBtn() {
		driver.findElement(logintBtn).click();
	}

	
	
	
	

}
