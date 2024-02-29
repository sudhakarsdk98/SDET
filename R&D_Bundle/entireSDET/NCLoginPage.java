package entireSDET;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NCLoginPage {

	WebDriver driver;
	
	@FindBy(name = "Email")@CacheLookup WebElement email;
	
	@FindBy(name = "Password")@CacheLookup WebElement pwd;
	
	@FindBy(tagName = "button")@CacheLookup WebElement loginBtn;
	
	public void enterEmailID(String mailID) {
		email.clear();
		email.sendKeys(mailID);
	}
	
	public void enterPassword(String pass) {
		pwd.clear();
		pwd.sendKeys(pass);
	}
	
	public void clickLoginBtn() {
		loginBtn.click();
	}
	
	public NCLoginPage(WebDriver d) {
		this.driver = d;
		PageFactory.initElements(driver,this);
		
	}
}
