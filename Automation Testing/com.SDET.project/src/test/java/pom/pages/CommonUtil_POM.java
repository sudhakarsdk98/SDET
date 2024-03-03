package pom.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class CommonUtil_POM {

	WebDriver driver;
	
	String url = "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F";
	
	
	public CommonUtil_POM(WebDriver drive) {
		
		this.driver = drive;
	}
	
	
	public void browserSetup() {
		driver.get(url);
		driver.manage().window().maximize();
				
	}
	
	public void addSync() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
	}
	
	public void tearDown() {
		
		driver.quit();
	}
	
	
	
}
