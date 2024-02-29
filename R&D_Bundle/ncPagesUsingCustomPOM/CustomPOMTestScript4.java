package ncPagesUsingCustomPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomPOMTestScript4 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		BrowserUtilities browser = new BrowserUtilities(driver);
		NC_CommonUtilities common = new NC_CommonUtilities(driver);
		NC_LoginPage login = new NC_LoginPage(driver);
		NC_DashBoardPage dashboard = new NC_DashBoardPage(driver);
		NC_TemplatesPage template = new NC_TemplatesPage(driver);
		
		browser.openNCLoginPage();
		browser.browserMaximise();
		browser.addSync();

		if (login.verifyEmailField()) {

			login.enterEmail("admin@yourstore.com");
			login.enterPassword("admin");
			login.clickLoginBtn();

		} else {
			System.out.println("Login failed; at ncPagesUsingCustomPOM.CustomPOMTestScript2.class");

		}
		
		if (dashboard.verifyCommonStat()) {
			
			common.clickOnSystem();
			common.clickOnTemplates();
			
		}
		else {
			System.out.println("DashBoard Page error; at ncPagesUsingCustomPOM.CustomPOMTestScript2.class");
		}
		
		template.deleteTemplate();
		browser.simpleAlert().accept();
		browser.confirmAlert().accept();
		browser.switchtoDefaultContent();
		
		common.logout();
		browser.tearDown();
		
	}

}
