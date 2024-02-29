package ncPagesUsingPOMPagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PFPOMTestScript2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		BrowserUtilitiesPF browser = new BrowserUtilitiesPF(driver);
		NC_CommonUtilitiesPF common = new NC_CommonUtilitiesPF(driver);
		NC_LoginPagePF login = new NC_LoginPagePF(driver);
		NC_DashBoardPagePF dashboard = new NC_DashBoardPagePF(driver);
		NC_OrdersPagePF orders = new NC_OrdersPagePF(driver);
		
		browser.openNCLoginPage();
		browser.browserMaximise();
		browser.addSync();
		
		if (login.verifyEmailField()) {
			
			login.enterEmail("admin@yourstore.com");
			login.enterPassword("admin");
			login.clickLoginBtn();
			
		}
		else { 
			System.out.println("Login failed; at ncPagesUsingCustomPOM.CustomPOMTestScript2.class");
			
		}
		
		
		if (dashboard.verifyCommonStat()) {
		
			common.clickOnSales();
			common.clickOnOrders();
		}
		else {
			System.out.println("DashBoard Page error; at ncPagesUsingCustomPOM.CustomPOMTestScript2.class");
		}
		
		orders.selectVisibleOptionPaymentMethodDropdown("PayPal Commerce");
		orders.getOptionsPaymentMethodDropdown();
		orders.clickSearchBtn();
		
		common.logout();
		browser.tearDown();

	}

}
