package ncPagesUsingCustomPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NC_DashBoardPage {
	
	WebDriver driver;
	
	// WebElement information
	
	By commonstat = By.xpath("(//div[contains(@class , 'card-header with-border clearfix')])[2]");
	
	// methods
	
	public boolean verifyCommonStat() {
		
		boolean boolCommonstat = driver.findElement(commonstat).isDisplayed();
		return boolCommonstat;
	}

	
	// constructor
	
	public NC_DashBoardPage(WebDriver d) {
		
		this.driver = d;
	}
	
	
	
	
	
}
