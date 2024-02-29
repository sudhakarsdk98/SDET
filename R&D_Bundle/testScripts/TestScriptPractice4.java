package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptPractice4 {

	public static void main(String[] args) throws Exception {
		// Launch Chrome.
		WebDriver CrmDriver = new ChromeDriver();
		CrmDriver.manage().window().maximize();
		// Open NC login page.
		CrmDriver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		// Do login.
		WebElement mail = CrmDriver.findElement(By.id("Email"));
		mail.clear();
		mail.sendKeys("admin@yourstore.com", Keys.TAB, Keys.CLEAR, "admin", Keys.ENTER);

		CrmDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		// Perform actions in Dashboard page.
		CrmDriver.findElement(By.xpath("//div[contains(@id,'common-stat')]/descendant::button")).click();
		CrmDriver.findElement(By.xpath("(//a[@class = 'small-box-footer'])[last()]")).click();

		WebElement menu = CrmDriver.findElement(By.xpath("//select"));

		boolean isMenuEnabled = menu.isEnabled();

		menu.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

		String menuItem = menu.getText();
		Thread.sleep(3000);

		CrmDriver.findElement(By.xpath("//td/a")).click();
		Thread.sleep(3000);

		WebElement btn = CrmDriver.findElement(By.xpath("//span[@class='onoffswitch-switch']"));
		Thread.sleep(3000);
		boolean btnStatus = btn.isDisplayed();
		btn.click();
		Thread.sleep(3000);
		
		String viewMode = btn.getAttribute("text");
		
		CrmDriver.findElement(By.xpath("//button[@name='save']")).click();
		
		// Do Logout.
		CrmDriver.findElement(By.linkText("Logout")).click();

		System.out.println("Dropdown menu is enabled : " + isMenuEnabled);
		System.out.println("Dropdown menu items : \n '  " + menuItem + " '" + "\n  ");
		System.out.println("Button is displayed : " + btnStatus);
		System.out.println("Item view mode switched to : " + viewMode);
		// Terminate the browser.
		CrmDriver.quit();

	}

}
