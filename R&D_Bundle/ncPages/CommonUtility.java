package ncPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CommonUtility {  // RULE - 1 : Create individual classes for each WebPage.
	
	WebDriver driver;

	// RULE - 2 : Provide information of all WebElements that we are going to use in automation.
	
	By nccatalog = By.xpath("(//p[contains(text(),'Catalog')])[1]");
	
	By ncproducts = By.xpath("(//p[contains(text(),'Products')])[1]");
	
	By ncLogout = By.linkText("Logout");
	
	// RULE - 3 : Create individual methods for each WebElements based on the webElement type.
	
	public void clickOnCatalog() {
		
		driver.findElement(nccatalog).click();
	}
	
	public void clickOnProducts() {
		
		driver.findElement(ncproducts).click();
	}
	
	public void doLogout() {
		
		driver.findElement(ncLogout).click();
	}
	
	public void openNCLoginPage() {
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}
	
	public void browserMaximize() {
		
		driver.manage().window().maximize();
	}
	public void addSync() {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	public void tearDown() {
		
		driver.quit();
	}
	
	// RULE - 4 : In every WebPage Class, create our own constructor with WebDriver object as a parameter.
	public CommonUtility(WebDriver d) {
		this.driver = d;
		
//		PageFactory.initElements(driver, d);
	}
	
}
