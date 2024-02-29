package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestScriptSynchronization {

	public static void main(String[] args) throws InterruptedException {

		// Synchronization Concept of SWD.
		// To achieve sync in between Browser and WebDriver.
		// To prevent Exceptions and interruptions in TestScript Execution.

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// Dynamic Implicit Synchronization method for webPage load timeout.
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

		// Dynamic Implicit Synchronization method for javaScript load timeout.
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(15));

		// The above method is deprecated. Below method can be used instead (or)
		// Explicit Synchronization WebDriverWait class is recommended.
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		// Dynamic Implicit Synchronization method for webElement load timeout.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		/**
		 * Dynamic Explicit Synchronization class, which is a specialization of
		 * FluentWait class.
		 **/
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		/**
		 * Dynamic Explicit Synchronization class, which is complex in usability.
		 * Implements the Wait interface. It gives more control on
		 * parameters/conditions.
		 **/
		FluentWait<WebDriver> superWait = new FluentWait<WebDriver>(driver)
											.withTimeout(Duration.ofSeconds(15))
											.pollingEvery(Duration.ofSeconds(3))
											.withMessage("Element is not present; check the locator value.")
											.ignoring(NoSuchElementException.class);

		// Using conditions to achieve verification and synchronization.
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.tagName("button")))).click();

		WebElement menuDropdown = driver.findElement(By.partialLinkText("System"));

		wait.until(ExpectedConditions.elementToBeClickable(menuDropdown));

		menuDropdown.click();

		driver.findElement(By.partialLinkText("Templates")).click();

		/**
		 * Using conditions to achieve verification and synchronization with our own
		 * parameters.
		 **/
		superWait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Delete"))).click();

		driver.switchTo().alert();

		driver.switchTo().alert().accept();

		// Static Explicit Synchronization method which holds the TestScript Execution
		// for entire duration.
		Thread.sleep(3000);

		driver.switchTo().alert().accept();

		// Using below Static method to achieve sync after webPage Script timeout.
		Thread.sleep(3000);

		driver.findElement(By.linkText("Logout")).click();

		driver.quit();

	}

}
