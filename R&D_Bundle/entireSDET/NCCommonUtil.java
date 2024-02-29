package entireSDET;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NCCommonUtil {
	
	WebDriver driver;
	
	@FindBy(linkText = "Dashboarad") WebElement dashboard;
	@FindBy(linkText = "Catalog") WebElement catalog;
	@FindBy(linkText = "Sales") WebElement sales;
	@FindBy(linkText = "Orders") WebElement orders;
	@FindBy(linkText = "System") WebElement system;
	@FindBy(linkText = "Templates") WebElement templates;
	@FindBy(linkText = "Logout") WebElement logout;
	
	public void ncLogout() {
		logout.click();
	}
	
	public void clickOnDashboard() {
		
		dashboard.click();
	}
	
	public void clickOnCatalog() {
		catalog.click();
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
	
	public NCCommonUtil(WebDriver d) {
		this.driver = d;
		PageFactory.initElements(driver, this);
	}
}
