package ncPagesUsingPOMPagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NC_TemplatesPagePF {
	
	WebDriver driver;
	
	// WebElement information.
	@FindBy(xpath = "(//a[contains(@class,'btn btn-default')])[4]" ) WebElement deleteTemplates;
	
	// WebElement methods.
	public void deleteTemplate() {
		
		deleteTemplates.click();
	}
	
	// constructor
	
	public NC_TemplatesPagePF(WebDriver d) {

		this.driver = d;
		PageFactory.initElements(driver, this);
	}

}
