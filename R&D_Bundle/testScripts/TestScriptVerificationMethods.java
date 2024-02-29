package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptVerificationMethods {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		WebElement email = driver.findElement(By.xpath("//*[@id='Email']"));
		// Using isDisplayed(); to verify the webElement is present on webPage or not.
		boolean isMailDisplayed = email.isDisplayed();
		/* Using isEnabled(); to verify the webElement is enabled or disabled on
		 webPage. */
		boolean isMailEnabled = email.isEnabled();
		// clear the email field and enter relevant data after verification.
		email.clear();
		email.sendKeys("admin@yourstore.com");

		WebElement pass = driver.findElement(By.xpath("//*[@id='Password']"));
		// Verify the webElement by using verification methods.
		boolean isPwdDisplayed = pass.isDisplayed();
		boolean isPwdEnabled = pass.isEnabled();
		// clear the password field and enter relevant data after verification.
		pass.clear();
		pass.sendKeys("admin");

		WebElement CheckBox = driver.findElement(By.xpath("//*[@id='RememberMe']"));
		// Verify the webElement by using verification methods.
		boolean isCheckboxDisplayed = CheckBox.isDisplayed();
		boolean isCheckboxEnabled = CheckBox.isEnabled();
		// Using isSelected(); to verify the webElement is selected on webPage.
		boolean isCheckboxSelected = CheckBox.isSelected();
		// Click the checkBox to selected it.
		CheckBox.click();
		// Using isSelected(), to verify the action performed.
		boolean isCheckboxSelectedVerify = CheckBox.isSelected();

		WebElement submit = driver.findElement(By.xpath("//button"));
		// Verify the webElement with verification methods.
		boolean isBtnDisplayed = submit.isDisplayed();
		boolean isBtnEnabled = submit.isEnabled();
		submit.click();
		/* Using close(); to terminate the connection between webDriver & current active
		 browser window. */
		driver.close();

		System.out.println("Email field is Displayed : " + isMailDisplayed);
		System.out.println("Email field is Enabled : " + isMailEnabled);
		System.out.println("Password field is Displayed : " + isPwdDisplayed);
		System.out.println("Password field is Enabled : " + isPwdEnabled);
		System.out.println("Remember me checkbox is Displayed : " + isCheckboxDisplayed);
		System.out.println("Remember me checkbox is Enabled : " + isCheckboxEnabled);
		System.out.println("Remember me checkbox is Selected : " + isCheckboxSelected);
		System.out.println("Remember me checkbox is Selected after action : " + isCheckboxSelectedVerify);
		System.out.println("Login button is Displayed : " + isBtnDisplayed);
		System.out.println("Login button is Enabled : " + isBtnEnabled);
		System.out.println("Below Exception occurs when close(); is used : \n");
	
	}

}
