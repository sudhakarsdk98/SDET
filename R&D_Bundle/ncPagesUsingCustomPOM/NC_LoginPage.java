package ncPagesUsingCustomPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NC_LoginPage {
	
	WebDriver driver;
	
	// WebElement Information.
	
	By email = By.id("Email");

	By pass = By.name("Password");
	
	By rememberMeCheckBox = By.id("RememberMe");
	
	By loginBtn = By.tagName("button");
	
	// WebElement methods.
	
	public boolean verifyEmailField() {
		
		boolean boolEmail = driver.findElement(email).isDisplayed();
		return boolEmail;
	}
	
	public void enterEmail(String mailID) {
		
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys(mailID);
	}
	
	public void enterPassword(String password) {
		driver.findElement(pass).clear();
		driver.findElement(pass).sendKeys(password);
		
	}
	
	public WebElement GetRememberMeCheckBox() {

		WebElement checkbox = driver.findElement(rememberMeCheckBox);
		return checkbox;
	}
	
	public void clickLoginBtn() {
		
		driver.findElement(loginBtn).click();
	}
	
	// constructor
	
	public NC_LoginPage(WebDriver d) {
		
		this.driver = d;

	}
	
}
