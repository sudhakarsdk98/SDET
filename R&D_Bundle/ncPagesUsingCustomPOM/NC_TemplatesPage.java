package ncPagesUsingCustomPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NC_TemplatesPage {

	WebDriver driver;
	
	// WebElement information.
	By deleteTemplates = By.xpath("(//a[contains(@class,'btn btn-default')])[4]");
	
	// WebElement methods.
	public void deleteTemplate() {
		
		driver.findElement(deleteTemplates).click();
	}
	
	// constructor
	
	public NC_TemplatesPage(WebDriver d) {

		this.driver = d;
	}
	
}
