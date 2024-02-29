package entireSDET;

import java.time.Duration;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass extends Properties {


	@Parameters("browser") 
	@BeforeClass
	public void browserSetup(@Optional("chrome") String browser) {
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Enter valid browser : chrome / firefox / edge ");
			break;
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
		
	}
	
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	@DataProvider(name = "testData")
	public Object[][] testData(){
		Object[][] testData= new Object[2][2];
		testData[0][0] = emailIDNeg;
		testData[0][1] = passwordNeg;
		testData[1][0] = emailID;
		testData[1][1] = password;
		return testData;
	}

	public void alertWaits() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	public String getCurrentPageTitle() {
		String pageTitle = driver.getTitle();
		System.out.println("Current Page Title is : "+pageTitle);
		return pageTitle;
	}
	
	public String getCurrentURL() {
		String url = driver.getCurrentUrl();
		System.out.println("Current Page URL is : "+url);
		return url;
	}
	
	public String getPageSource() {
		String sc = driver.getPageSource();
		System.out.println("Source Code of current page is : \n"+sc);
		return sc;
	}
	
	public String getWindowHandle() {
		String pageID = driver.getWindowHandle();
		System.out.println("Current Page ID is : "+pageID);
		return pageID;
	}
	
	public java.util.Set<String> getWindowHandles() {
		java.util.Set<String> pageIDs = driver.getWindowHandles();
		return pageIDs;
	}
	
	public void switchToAlert() {
		driver.switchTo().alert();
	}
	
	public void acceptAlert() {
		driver.switchTo().alert().accept();
		System.out.println("Alert accepted");
	}
	
	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
		System.out.println("Alert dismissed");
	}
	
	public void switchToDefaultContent() {
		driver.switchTo().defaultContent();
	}
	
	public void openNewBrowserTab() {
		driver.switchTo().newWindow(WindowType.TAB);
	}
	
	public void closeBrowserWindow() {
		driver.close();
	}
	
}
