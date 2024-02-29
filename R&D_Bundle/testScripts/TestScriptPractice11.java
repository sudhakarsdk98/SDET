package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptPractice11 {

	// Static Variable.
	static String url = "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F";
	
	// Global Variables.
	String mailKeys = "admin@yourstore.com"; 
	 
	String pwdKeys = "admin";
	
	public static void main(String[] args) {

	// Local Variables.
	String ncLoginTitle = "Your store. Login";
	String dashboardTitle = "Dashboard / nopCommerce administration";
	
	// Instance creation to access Global Variables.
	TestScriptPractice11 tsp = new TestScriptPractice11();
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	// To confirm Chrome Browser is opened.
	System.out.println("Chrome Web Browser Launched");
	
	// Load NC login page.
	driver.get(TestScriptPractice11.url);
	
	// To verify if the loaded WebPage same as required website.
	String pageTitle = driver.getTitle();
	
	// if expected title of WebPage is same as actual title of WebPage, then we proceed to next step.
	// using Conditional Statements.
	if ( pageTitle.equals(ncLoginTitle)) {
	
	System.out.println("NC login page loaded successfully");
	
	}	else {
		
		System.out.println("Wrong page loaded, check the URL");
	}
	
	// For Email Field Validation and confirmation.
	WebElement mail = driver.findElement(By.id("Email"));
	
	// For Email field data verification.
	String mailField = mail.getAttribute("value");
	
	System.out.println("Verifying Email field...");
	
	if (mailField.isEmpty()) { // checks if Email field is empty.
		
		mail.sendKeys(tsp.mailKeys); // sendKeys(); if field is empty.
		
		System.out.println("..Email field is empty and credentials are entered.");
		
	} else if (mailField.equals(tsp.mailKeys)) { // if data existing then validates the data.
		
		System.out.println("..Correct credentials already exist, proceeding to Password field.");
		
	} else { // if validation result is incorrect then correct data is passed.
		
		mail.clear();
		mail.sendKeys(tsp.mailKeys);
		
		System.out.println("Error in credentials; Correct Email Data is entered");
	}

	
	// For Password Field Validation and confirmation.
	WebElement password = driver.findElement(By.id("Password"));

	// For Password field data verification.
	String pwdField = password.getAttribute("value");
	
	System.out.println("Verifying Password field...");
	
	if (pwdField.isEmpty()) {
		
		password.sendKeys(tsp.pwdKeys);
		
		System.out.println("..Password field is empty and credentials are entered.");
		
	} else if (pwdField.equals(tsp.pwdKeys)) {
		
		System.out.println("..Correct credentials already exist, proceeding to submit.");
		
	} else {
		
		password.clear();
		password.sendKeys(tsp.mailKeys);
		
		System.out.println("Error in credentials; Correct Password Data is entered");
	}
	
	
	// For Login button Verification and confirmation.
	WebElement loginBtn = driver.findElement(By.tagName("button"));
	// Nested if conditions.
	if(loginBtn.isDisplayed()) {
		
		if(loginBtn.isEnabled()) {
			
			loginBtn.click();
		}
	}
	
	
	System.out.println("Login completed Successfully...");
	
	
	// For Page loaded Verification and confirmation.
	String dashTitle = driver.getTitle();
	
	if(dashTitle.equals(dashboardTitle)) { // checks if the loaded webpage is the required one or not.
		
		System.out.println("Dashboard page of NC is loaded Successfully;");
		
		driver.findElement(By.linkText("Logout")).click();
	}else { // if not, then redirects to NC login page.
		
		System.out.println("Wrong WebPage loaded; Redirecting to NC login Page");
		driver.get(url);
	}
	
	
	System.out.println("Terminating the Browser...");
	driver.quit();
	
	}

}
