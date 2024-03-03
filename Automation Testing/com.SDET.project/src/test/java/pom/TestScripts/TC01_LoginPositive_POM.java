package pom.TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.pages.CommonUtil_POM;
import pom.pages.DashboardPage_POM;
import pom.pages.LoginPage_POM;

public class TC01_LoginPositive_POM {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		CommonUtil_POM common = new CommonUtil_POM(driver);
		LoginPage_POM loginPage = new LoginPage_POM(driver);
		DashboardPage_POM dashboardPage = new DashboardPage_POM(driver);
		
		
		common.browserSetup();
		common.addSync();
		loginPage.enterEmail("admin@yourstore.com");
		loginPage.enterPassword("admi");
		loginPage.clickOnLoginBtn();
		
		
		try {
		if(dashboardPage.verifyDashboardVisible()) {
			System.out.println("Login Successful");
		}else {
			System.out.println("Login Failed");
		}
		}
		catch(Exception ex) {
			System.out.println("Login Failed");
			throw new RuntimeException("Dashboard not found");
		}
		finally {		
		common.tearDown();
		}
		
	}

}
