package ncPagesUsingCustomPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomPOMTestScript1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		BrowserUtilities browser = new BrowserUtilities(driver);
		NC_CommonUtilities common = new NC_CommonUtilities(driver);
		NC_LoginPage login = new NC_LoginPage(driver);
		NC_DashBoardPage dashboard = new NC_DashBoardPage(driver);
		
		browser.openNCLoginPage();
		browser.browserMaximise();
		browser.addSync();
		browser.getCurrentPageURL();
		
		if (login.verifyEmailField()) {
			
			login.enterEmail("admin@yourstore.com");
			login.enterPassword("admin");
			login.GetRememberMeCheckBox().click();
			login.GetRememberMeCheckBox().click();
			login.clickLoginBtn();
			
		}
		else { 
			System.out.println("Login failed; at ncPagesUsingCustomPOM.CustomPOMTestScript1.class");
			
		}
		
		
		if (dashboard.verifyCommonStat()) {
		
			browser.getCurrentPageTitle();
			common.clickOnSales();
			common.clickOnOrders();
		}
		else {
			System.out.println("DashBoard Page error; at ncPagesUsingCustomPOM.CustomPOMTestScript1.class");
		}
		
		common.logout();
		
		browser.getCurrentPageSourceCode();
		
		browser.tearDown();
		
	}

}
