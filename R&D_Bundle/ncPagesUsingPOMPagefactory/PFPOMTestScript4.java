package ncPagesUsingPOMPagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PFPOMTestScript4 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		BrowserUtilitiesPF browser = new BrowserUtilitiesPF(driver);
		NC_CommonUtilitiesPF common = new NC_CommonUtilitiesPF(driver);
		NC_LoginPagePF login = new NC_LoginPagePF(driver);
		NC_DashBoardPagePF dashboard = new NC_DashBoardPagePF(driver);
		NC_TemplatesPagePF template = new NC_TemplatesPagePF(driver);
		
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
