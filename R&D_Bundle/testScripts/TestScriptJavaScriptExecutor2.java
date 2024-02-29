package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptJavaScriptExecutor2 {

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
		// cast WebElemet to again force convert driver to return WebElement type.
		// Strictly use "return" in JS in order to return the WebElement into Object.
		WebElement email = (WebElement) jse.executeScript("return document.getElementById('Email')");

		email.clear();

		email.sendKeys("admin@yourstore.com");

		// completing login process.
		// for data input in password field.
		jse.executeScript("document.getElementById('Password').value='admin';");

		// click login button using JS.
		jse.executeScript("document.getElementsByTagName('button')[0].click();");
		
		// ****scroll methods in JavaScript.****
		// scrollTo(); to scroll to coordinates, 
		jse.executeScript("window.scrollTo(0,500);");
		
		// Note : Once the scrollTo action is done to fixed coordinates of browser window,
		// same coordinates repeated are of no use as the action is already completed.
		jse.executeScript("window.scrollTo(0,500);");
		
		// scroll reset.
		jse.executeScript("window.scrollTo(0,0);");
		
		
		// scrollBy(); to scroll by the no. of coordinates progressively.
		jse.executeScript("window.scrollBy(0,200);");
		
		// unlike scrollTo(); scrollBy(); can be repeated to add up to the previous scroll coordinates. 
		jse.executeScript("window.scrollBy(0,200);");
		
		// scroll reset by using a negative index.
		jse.executeScript("window.scrollBy(0,-400);");
		
		// opening Products page in NC.
		jse.executeScript("document.getElementsByClassName('nav-icon far fa-dot-circle')[0].click();");
		
		Thread.sleep(3000);
		
		// scrollIntoView(); to scroll until a WebElement is in the screen view.
		jse.executeScript("document.getElementsByClassName('checkboxGroups')[14].scrollIntoView();");
		
		jse.executeScript("document.getElementsByClassName('checkboxGroups')[1].scrollIntoView();");
		
		jse.executeScript("document.getElementsByTagName('Select')[0].scrollIntoView();");	
		
		
		// ****Adding style to the WebElement.****
		// Add border to WebElement.
		jse.executeScript("document.getElementsByTagName('Select')[0].style.border='4px red solid';");		
		
		// Highlight the WebElement.
		jse.executeScript("document.getElementsByTagName('Select')[0].style.background='yellow';");
		
		// click logout using JS.
			jse.executeScript("document.getElementsByClassName('nav-link')[2].click();");
		
		Thread.sleep(3000);

		driver.quit();
	}

}
