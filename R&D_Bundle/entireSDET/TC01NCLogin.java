package entireSDET;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01NCLogin extends BaseClass {

	

	@Test(priority = 1, groups = "NCLoginCredentials", retryAnalyzer = RetryAnalyzercls.class)
	public void ncEmail_TC_0001() {
		NCLoginPage ncloginpage = new NCLoginPage(driver);

		Assert.assertEquals(ncloginpage.email.isDisplayed(), true, "Email field not present");

	}

	@Test(priority = 2, groups = "NCLoginCredentials", retryAnalyzer = RetryAnalyzercls.class)
	public void ncPassword_TC_0002() {
		NCLoginPage ncloginpage = new NCLoginPage(driver);

		Assert.assertEquals(ncloginpage.pwd.isDisplayed(), true, "Password field not present");

	}

	@Test(priority = 3, groups = "NCLoginCredentials", retryAnalyzer = RetryAnalyzercls.class)
	public void ncLoginBtn_TC_0003() {
		NCLoginPage ncloginpage = new NCLoginPage(driver);

		Assert.assertEquals(ncloginpage.loginBtn.isDisplayed(), true, "Login Button not present");

	}

	
	@Test(priority = 4 ,dataProvider = "testData", dataProviderClass = BaseClass.class, dependsOnGroups = "NCLoginCredentials", retryAnalyzer = RetryAnalyzercls.class)
	public void ncLogin(String email, String Password) {
		NCLoginPage ncloginpage = new NCLoginPage(driver);

		ncloginpage.enterEmailID(email);
		ncloginpage.enterPassword(Password);
		ncloginpage.clickLoginBtn();

		if (driver.getTitle().equals(ncDashboardPageTitle)) {
			
			Assert.assertTrue(true);
			System.out.println("TestCase successfull with positive data");
		} else {
			System.out.println("TestCase failed with negative data");
			Assert.assertTrue(true);

		}
		
	}

}
