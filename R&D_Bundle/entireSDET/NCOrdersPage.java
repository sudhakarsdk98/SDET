package entireSDET;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NCOrdersPage {

	WebDriver driver;
	
	public NCOrdersPage(WebDriver d) {
		this.driver = d;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "WarehouseId") WebElement warehouse;
	@FindBy(xpath = "(//input[@class='k-input'])[3]") WebElement orderStatuses;
	@FindBy(xpath = "//table/tbody/tr") List<WebElement> trows;
	@FindBy(xpath = "//table/tbody/tr[1]/td") List<WebElement> tcolumns;
	
	public int tRowsCount() {
		System.out.println("Count of Rows in Webtable is : "+trows.size());
		return trows.size();
	}
	
	public int tColumnsCount() {
		System.out.println("COunt of Columns in Webtable is : "+tcolumns.size());
		return tcolumns.size();
	}
	
	public void getTableValues() {
		for (int r = 1; r < trows.size(); r++) {
			for (int c = 1; c < tcolumns.size(); c++) {
				
				String cellval = driver.findElement(By.xpath("//table/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print(cellval+"		");
			}
			System.out.println();
		}
	}
	
	public Select warehouseSelectOrDeselectOpt() {
		Select select = new Select(warehouse);
		return select;
	}
	
	public void warehouseGetAllOpts() {
		Select select = new Select(warehouse);
		for(WebElement val : select.getOptions()) {
		System.out.println(val.getText());
		}
	}
	public String warehousegetSelectedopt() {
		Select select = new Select(warehouse);
		String strallopt = select.getFirstSelectedOption().getText();
		return strallopt;
	}

	public void setOrderStatusesField(String stat) {
		
		orderStatuses.sendKeys(stat);
	}
	
}
