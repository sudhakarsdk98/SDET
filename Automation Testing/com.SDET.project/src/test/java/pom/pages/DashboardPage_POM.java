package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage_POM {
	
	WebDriver driver;

	public DashboardPage_POM(WebDriver drive) {
		this.driver = drive;
	}
	
	By dashboard = By.linkText("Dashboard");
	
	
	public boolean verifyDashboardVisible() {

		boolean bool = driver.findElement(dashboard).isDisplayed();
		return bool;
	}
}
