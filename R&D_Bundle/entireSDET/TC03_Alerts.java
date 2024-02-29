package entireSDET;

import org.testng.annotations.Test;

public class TC03_Alerts extends BaseClass {

	@Test(groups = "alerts")
	public void ncAlert() {
		
		NCLoginPage login = new NCLoginPage(driver);
		NCCommonUtil comm = new NCCommonUtil(driver);
		NCTemplatesPage temp = new NCTemplatesPage(driver);
		
		login.clickLoginBtn();
		
		comm.clickOnSystem();
		comm.clickOnTemplates();
		temp.clickOnDelBtn();
		
		switchToAlert();
		acceptAlert();
		alertWaits();
		switchToAlert();
		dismissAlert();
		
		
	}
	
	
	
	
	
	
}
