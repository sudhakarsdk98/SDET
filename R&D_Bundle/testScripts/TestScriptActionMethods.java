package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptActionMethods {

	public static void main(String[] args) throws Exception {
		
		ChromeDriver driver = new ChromeDriver();
		
//page level action methods of SWD.		
		
	// using manage() to maximize the browser window.	
		driver.manage().window().maximize();
	//using get() to load webpage in chrome browser by giving complete URL.
		driver.get("https://www.google.com");
		
	//using navigate().to() to load NC login page in chrome browser by giving complete URL.
		driver.navigate().to("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
	//using manage to achieve synchronization between browaer and WebDriver.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	//using navigate().back() to go back in web page.
		driver.navigate().back();
			Thread.sleep(3000);
		
	//using navigate().forward() to go forward in web page.
		driver.navigate().forward();
			Thread.sleep(3000);
		
	//using navigate().refresh() to reload/refresh the web page.
		driver.navigate().refresh();
			Thread.sleep(3000);
			driver.findElement(By.tagName("button")).click();	
	
	//using getTitle() to capture webpage name
		String webPageName = driver.getTitle();
		
	//using getCurrentUrl() to capture current webpage url.
		String url = driver.getCurrentUrl();
		
	//using getWindowHandle() to capture current webpage ID (HashCode).
		String dashPageId = driver.getWindowHandle();
			driver.navigate().back();
			Thread.sleep(5000);
	//using getPageSource() to capture current webpage source code.
		String loginSC = driver.getPageSource();
		
		System.out.println("Title of the webpage is: "+webPageName);
		System.out.println("URL of the current webpage is: "+url);
		System.out.println("Webpage ID of dashboard page is: "+dashPageId);
		System.out.println("Source code of current webpage is:\n"+loginSC);
		driver.quit();
	}

}
