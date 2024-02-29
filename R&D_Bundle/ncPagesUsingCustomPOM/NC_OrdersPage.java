package ncPagesUsingCustomPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NC_OrdersPage { 

	WebDriver driver;
	

	// WebElement Information.
	
	By paymentMethodDropdown = By.id("PaymentMethodSystemName");
	
	By paymentStatusDropdown = By.xpath("(//div[contains(@class , 'k-multiselect-wrap k-floatwrap')])[2]");
	
	By searchBtn = By.id("search-orders");
	
	By tRows = By.xpath("//table/tbody/tr");
	
	By tcolumns = By.xpath("//table/tbody/tr[1]/td");
	
	
	// WebElement methods.
	
	public void getOptionsPaymentMethodDropdown() {
		
		WebElement dropdown = driver.findElement(paymentMethodDropdown);
		
		Select selection = new Select(dropdown);
		 List<WebElement> allopts = selection.getOptions();
		 System.out.println("\n All options in Dropdown : \n");
		 
		 for(WebElement opt : allopts) {
			 String text = opt.getText();
			 System.out.println(text);
		 }
		 
	}
	
	public void selectVisibleOptionPaymentMethodDropdown(String visibleText) {
		
		WebElement dropdown = driver.findElement(paymentMethodDropdown);

		Select selection = new Select(dropdown);
		
		selection.selectByVisibleText(visibleText);
	}
	
	public void clickSearchBtn() {
		driver.findElement(searchBtn).click();
	}
	
	public void getRowsAndColumnsCount() {
		
		List<WebElement> rows = driver.findElements(tRows);
		List<WebElement> columns = driver.findElements(tcolumns);
		
		int rowCount = rows.size();
		int columnCount = columns.size();
		System.out.println("Row count in WebTable is : "+rowCount);
		System.out.println("Column count in WebTable is : "+columnCount);
	}
	
	public void getWebTableValues() {
		
		List<WebElement> rows = driver.findElements(tRows);
		List<WebElement> columns = driver.findElements(tcolumns);
		int rowCount = rows.size();
		int columnCount = columns.size();
		
		System.out.println("\n All values in WebTable of Orders page are: \n");		
		for(int r=1; r<=rowCount;r++) {
			for (int c = 1; c < columnCount; c++) {
				String val = driver.findElement(By.xpath("//table/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print(val+"   ");
			}
			System.out.println();
		}
	}
	
	public void highlightWarehouseDropdown() {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("document.getElementById('WarehouseId').setAttribute('style','border:4px red solid; background : yellow');");
		
	}
	
	
	// constructor
	public NC_OrdersPage(WebDriver d) {
		
		this.driver = d;
	
	}
	
}
