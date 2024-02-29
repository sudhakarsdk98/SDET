package ncPagesUsingPOMPagefactory;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BrowserUtilitiesPF {
	
WebDriver driver;
	
	// methods.
	
	public void openNCLoginPage() {
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}
	
	
	public void browserMaximise() {
		
		driver.manage().window().maximize();
	}
	
	public void addSync() {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
	}
	
	public String getCurrentPageURL() {
		
		String url = driver.getCurrentUrl();
		System.out.println("Current WebPage URL is : "+url);
		return url;
	}
	public String getCurrentPageTitle() {
		
		String pagetitle = driver.getTitle();
		System.out.println("Current WebPage title is : "+pagetitle);
		return pagetitle;
	}
	
	public String getWebPageID() {
		
		String pageid = driver.getWindowHandle();
		System.out.println("Current WebPage ID is : "+pageid);
		return pageid;
	}
	
	public String getCurrentPageSourceCode() {

		String sc = driver.getPageSource();
		System.out.println("\n Current WebPage Source Code is : \n" + sc);
		return sc;
	}
	
	public Alert simpleAlert() {

		Alert al = driver.switchTo().alert();
		
		return al;
	}
	
	public Alert confirmAlert() {

		Alert al = driver.switchTo().alert();
		
		return al;
	}
	
	public void switchtoDefaultContent() {

		driver.switchTo().defaultContent();
		
		
	}
	
	public void closeCurrentWindow() {
		driver.close();
	}
	
	public void tearDown() {
		driver.quit();
	}
	
	
	public BrowserUtilitiesPF(WebDriver d) {
		
		this.driver = d;
		
		PageFactory.initElements(driver, this);
	}

}
