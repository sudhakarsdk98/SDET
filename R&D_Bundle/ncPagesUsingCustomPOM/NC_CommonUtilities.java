package ncPagesUsingCustomPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NC_CommonUtilities {
	
	WebDriver driver;
	
	// WebElements commonly present in all pages.
	
	By dashboard = By.partialLinkText("Dashboard");
	
	By sales = By.partialLinkText("Sales");
	
	By orders = By.partialLinkText("Orders");
	
	By logout = By.linkText("Logout");	
	
	By system = By.partialLinkText("System");
	
	By templates = By.partialLinkText("Templates");
	
	
	
	// WebElement methods.
	
	public void clickDashboard() {
		
		driver.findElement(dashboard).click();
	}
	
	
	public void clickOnSales() {
		
		driver.findElement(sales).click();
	} 
	
	public void clickOnOrders() {
		
		driver.findElement(orders).click();
		
	}
	
	public void clickOnSystem() {
		driver.findElement(system).click();
	}
	
	public void clickOnTemplates() {
		
		driver.findElement(templates).click();
		
	}
	
	
	public void logout() {
		
		driver.findElement(logout).click();
	}

	
	// constructor
	
	public NC_CommonUtilities(WebDriver d) {
		
		this.driver = d;
	}
	
}
