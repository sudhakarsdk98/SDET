package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptJavascriptExecutor {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// conventional way of interacting with WebElements with SWD.
		// findElement(); By id in SWD using Selenese.
		WebElement mail = driver.findElement(By.id("Email"));

		mail.clear();

		driver.navigate().refresh();

		Thread.sleep(3000);

		// Interacting with WebElement using JavaScript.
		// cast JavascriptExecutor to force convert driver to JavascriptExecutor type.
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		// Create a DOM to implement all WebDriver methods in JSE.
		// cast WebElemet to again force convert driver to WebElement type.
		// Strictly use "return" in JS in order to return the WebElement into Object.
		WebElement email = (WebElement) jse.executeScript("return document.getElementById('Email')");

		email.clear();

		email.sendKeys("admin@yourstore.com");

		// completing login process.
		// for data input in password field.
		jse.executeScript("document.getElementById('Password').value='admin';");

		// click login button using JS.
		jse.executeScript("document.getElementsByTagName('button')[0].click();");

		// click logout using JS.
		jse.executeScript("document.getElementsByClassName('nav-link')[2].click();");

		Thread.sleep(3000);
		
		driver.quit();

	}

}
