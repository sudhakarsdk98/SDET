package ncTestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ncPages.CommonUtility;
import ncPages.NC_DashboardPage;
import ncPages.NC_LoginPage;
import ncPages.NC_ProductsPage;

public class NC_ProductSeaerchTS {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		CommonUtility common = new CommonUtility(driver);
		NC_LoginPage nclogin = new NC_LoginPage(driver);
		NC_DashboardPage ncdash = new NC_DashboardPage(driver);
		NC_ProductsPage ncproducts = new NC_ProductsPage(driver);
		
		common.browserMaximize();
		common.addSync();
		common.openNCLoginPage();
		nclogin.enterEmail();
		nclogin.enterPassword();
		nclogin.clickLoginBtn();
		
		if(ncdash.verifyDashboardPage()) {
			
			common.clickOnCatalog();
			common.clickOnProducts();
			ncproducts.enterProductName();
			ncproducts.clickProductSearchBtn();
		}
		else {
			
			System.out.println("Login unsuccessful");
		}
		
		common.doLogout();
		common.tearDown();
		

	}

}
