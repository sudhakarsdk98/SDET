package entireSDET;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NCTemplatesPage {
	
	WebDriver driver;
	
	public NCTemplatesPage(WebDriver d) {
		this.driver = d;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "(//a[contains(@class,'btn btn-default')])[4]") WebElement delBtn;
	
	public void clickOnDelBtn() {
		delBtn.click();
	}

	
}
