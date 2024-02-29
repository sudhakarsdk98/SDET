package ncPagesUsingPOMPagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NC_LoginPagePF {
	
	WebDriver driver;
	
	// WebElement Information.
	
	
	@FindBy(how = How.ID, using = "Email")
	WebElement email;

	@FindBys({ @FindBy(xpath = "(//div[@class='inputs'])[2]"), @FindBy(name = "Password") })
	WebElement pass;

	@FindBy(id = "RememberMe") WebElement rememberMeCheckBox;
	
	@FindAll({ @FindBy(tagName = "button"), @FindBy(xpath = "//button[text() = 'Log in']") })
	WebElement loginBtn;
	
	
	
	// WebElement methods.
	
	public boolean verifyEmailField() {
		
		boolean boolEmail = email.isDisplayed();
		return boolEmail;
	}
	
	public void enterEmail(String mailID) {
		
		email.clear();
		email.sendKeys(mailID);
	}
	
	public void enterPassword(String password) {
		pass.clear();
		pass.sendKeys(password);
		
	}
	
	public WebElement GetRememberMeCheckBox() {

		return rememberMeCheckBox;
	}
	
	public void clickLoginBtn() {
		
		loginBtn.click();
	}
	
	// constructor
	
	public NC_LoginPagePF(WebDriver d) {
		
		this.driver = d;
		
		PageFactory.initElements(driver, this);

	}

}
