package hybridEntireSDET;

import org.openqa.selenium.By;

public class NC_LoginPage extends Browser_Util{
	
	By email = By.id("Email");
	By password = By.name("Password");
	By loginBtm = By.tagName("button");
	
	public boolean verifyEmailField() {
		boolean bool = driver.findElement(email).isDisplayed();
		
		return bool;
	}
	
	public boolean verifyPasswordField() {
		boolean bool = driver.findElement(password).isDisplayed();
		
		return bool;
	}

	public void clearEmail() {		
		driver.findElement(email).clear();
	}
	public void enterEmail(String string) {		
		driver.findElement(email).sendKeys(string);
	}
	public void clearPassword() {		
		driver.findElement(password).clear();
	}
	public void enterPassword(String string) {		
		driver.findElement(password).sendKeys(string);
	}
	
public void clickOnLoginBtn() {		
		driver.findElement(loginBtm).click();
	}

	
}
