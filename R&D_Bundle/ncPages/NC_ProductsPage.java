package ncPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NC_ProductsPage { // RULE - 1 : Create individual classes for each WebPage.
	
	WebDriver driver;
	
	// RULE - 2 : Provide information of all WebElements that we are going to use in automation.
	
	By productNameInput = By.name("SearchProductName");
	
	By productSearchBtn = By.id("search-products");
	
	// RULE - 3 : Create individual methods for each WebElements based on the webElement type.
	
	public void enterProductName() {
		
		driver.findElement(productNameInput).sendKeys("PC");
		
	}
	
	public void clickProductSearchBtn() {
		
		driver.findElement(productSearchBtn).click();
		
	}
	
	// RULE - 4 : In every WebPage Class, create our own constructor with WebDriver object as a parameter.
	
	public NC_ProductsPage(WebDriver d) {
		
		this.driver = d;
	}

}
