package inBuiltPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import ncPages.CommonUtility;

public class ExampleInbuiltPOMTestScript1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		CommonUtility common = new CommonUtility(driver);
//		ExampleInbuilt_NC_LoginPage inlp = new ExampleInbuilt_NC_LoginPage(driver);
		
//		PageFactory.initElements(driver, inlp);
		ExampleInbuilt_NC_LoginPage inlp = PageFactory.initElements(driver, ExampleInbuilt_NC_LoginPage.class);
		
		
		common.browserMaximize();
		common.addSync();
		common.openNCLoginPage();
		inlp.enterNCEmail();
		inlp.enterNCPassword();
		inlp.clickOnNCLoginBtn();
		common.tearDown();
		
	}

}
