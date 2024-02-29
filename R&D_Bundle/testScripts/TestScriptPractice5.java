package testScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScriptPractice5 {

	public static void main(String[] args) throws Exception {

		// Launch Firefox browser.
		WebDriver foxdriver = new FirefoxDriver();
		foxdriver.manage().window().maximize();
		// Open NC login page.
		foxdriver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		// Do login.
		WebElement mail = foxdriver.findElement(By.id("Email"));
		mail.clear();
		mail.sendKeys("admin@yourstore.com", Keys.TAB, Keys.CLEAR, "admin", Keys.ENTER);

		Thread.sleep(3000);

		// Perform actions on "Products".
		foxdriver.findElement(By.partialLinkText("Catalog")).click();
		Thread.sleep(3000);
		foxdriver.findElement(By.partialLinkText("Products")).click();
		Thread.sleep(3000);
		foxdriver.findElement(By.linkText("Add new")).click();
		foxdriver.findElement(By.id("Name")).click();
		foxdriver.findElement(By.id("Name")).sendKeys("Graphic Card");
		foxdriver.findElement(By.xpath("(//button)[3]")).click();
		Thread.sleep(3000);
		
		// Do Logout.
		foxdriver.findElement(By.linkText("Logout")).click();
		// Terminate the browser.
		foxdriver.quit();

	}

}
