package ncPagesUsingPOMPagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NC_CommonUtilitiesPF {
	
WebDriver driver;
	
	// WebElements commonly present in all pages.
	@FindBy(partialLinkText = "Dashboard") WebElement dashboard;
	
	@FindBy(partialLinkText = "Sales") WebElement sales;
	
	@FindBy(partialLinkText = "Orders") WebElement orders;
	
	@FindBy(partialLinkText = "Logout") WebElement logout;

	@FindBy(partialLinkText = "System") WebElement system;

	@FindBy(partialLinkText = "Templates") WebElement templates;
	
	
	
	// WebElement methods.
	
	public void clickDashboard() {
		
		dashboard.click();
	}
	
	
	public void clickOnSales() {
		
		sales.click();
	} 
	
	public void clickOnOrders() {
		
		orders.click();
		
	}
	
	public void clickOnSystem() {
		system.click();
	}
	
	public void clickOnTemplates() {
		
		templates.click();
		
	}
	
	
	public void logout() {
		
		logout.click();
	}

	
	// constructor
	
	public NC_CommonUtilitiesPF(WebDriver d) {
		
		this.driver = d;
		
		PageFactory.initElements(driver, this);
	}
	

}
