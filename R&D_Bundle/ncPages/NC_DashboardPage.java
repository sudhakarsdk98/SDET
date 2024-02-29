package ncPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NC_DashboardPage { // RULE - 1 : Create individual classes for each WebPage.
	
	WebDriver driver;
	
	// RULE - 2 : Provide information of all WebElements that we are going to use in automation.
	
	By dash = By.xpath("//h1[contains(text(),'Dashboard')]");
	
	
	// RULE - 3 : Create individual methods for each WebElements based on the webElement type.
	
	public boolean verifyDashboardPage() {
		
		boolean dashDisplayed = driver.findElement(dash).isDisplayed();
		
		return dashDisplayed;
	}
	
	// RULE - 4 : In every WebPage Class, create our own constructor with WebDriver object as a parameter.

	public NC_DashboardPage(WebDriver d) {
		this.driver = d;
		
	}
	
	
}
