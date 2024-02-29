package ncPagesUsingPOMPagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NC_DashBoardPagePF {
	
	WebDriver driver;
	
	// WebElement information
	
	@FindBy(xpath = "(//div[contains(@class , 'card-header with-border clearfix')])[2]" ) WebElement commonstat;
	
	// methods
	
	public boolean verifyCommonStat() {
		
		boolean boolCommonstat = commonstat.isDisplayed();
		return boolCommonstat;
	}

	
	// constructor
	
	public NC_DashBoardPagePF(WebDriver d) {
		
		this.driver = d;
		PageFactory.initElements(driver, this);
	}
	
	

}
