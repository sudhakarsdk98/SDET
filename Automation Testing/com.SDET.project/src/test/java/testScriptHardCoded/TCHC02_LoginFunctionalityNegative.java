package testScriptHardCoded;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TCHC02_LoginFunctionalityNegative {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		driver.manage().window().maximize();

		// synchronization
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		Thread.sleep(1000);

		WebElement emailField = driver.findElement(By.id("Email"));
		wait.until(ExpectedConditions.visibilityOf(emailField)).clear();
		emailField.sendKeys("admin@yourstore.com");

		Thread.sleep(1000);

		WebElement pwsField = driver.findElement(By.name("Password"));
		wait.until(ExpectedConditions.visibilityOf(pwsField)).clear();
		pwsField.sendKeys("admi");

		Thread.sleep(1000);

		wait.until(ExpectedConditions.elementToBeClickable(By.tagName("button"))).click();

		Thread.sleep(1000);

		try {
            WebElement dashboard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Dashboard")));
            if (dashboard.isDisplayed()) {
                System.out.println("Login successful");
            } 
        } catch (Exception e) {
            System.out.println("Login failed");
            throw new RuntimeException("Dashboard element not found", e);
        } finally {
            driver.quit();

        }
	}

}
