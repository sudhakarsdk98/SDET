package ncPagesUsingPOMPagefactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NC_OrdersPagePF {
	
WebDriver driver;
	

	// WebElement Information.
	@FindBy(id = "PaymentMethodSystemName") WebElement paymentMethodDropdown;

	
	@FindBy(xpath = "(//div[contains(@class , 'k-multiselect-wrap k-floatwrap')])[2]") WebElement paymentStatusDropdown;
	
	@FindBy(id = "search-orders") WebElement searchBtn;
	
	@FindBy(xpath =  "//table/tbody/tr") List<WebElement> tRows;
	
	@FindBy(xpath = "//table/tbody/tr[1]/td") List<WebElement> tcolumns;
	
	
	// WebElement methods.
	
	public void getOptionsPaymentMethodDropdown() {
		
		Select selection = new Select(paymentMethodDropdown);
		 List<WebElement> allopts = selection.getOptions();
		 System.out.println("\n All options in Dropdown : \n");
		 
		 for(WebElement opt : allopts) {
			 String text = opt.getText();
			 System.out.println(text);
		 }
		 
	}
	
	public void selectVisibleOptionPaymentMethodDropdown(String visibleText) {
		

		Select selection = new Select(paymentMethodDropdown);
		
		selection.selectByVisibleText(visibleText);
	}
	
	public void clickSearchBtn() {
		searchBtn.click();
	}
	
	public void getRowsAndColumnsCount() {
		
		
		int rowCount = tRows.size();
		int columnCount = tcolumns.size();
		System.out.println("Row count in WebTable is : "+rowCount);
		System.out.println("Column count in WebTable is : "+columnCount);
	}
	
	public void getWebTableValues() {
		
		int rowCount = tRows.size();
		int columnCount = tcolumns.size();
		
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
	public NC_OrdersPagePF(WebDriver d) {
		
		this.driver = d;
		
		PageFactory.initElements(driver, this);
	
	}

}
