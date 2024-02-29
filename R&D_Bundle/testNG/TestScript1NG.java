//package testNG;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//public class TestScript1NG {
//	
//	WebDriver driver;
//	
//	
//	@BeforeClass
//	public void setUp() {
//
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//	}
//	
//	@AfterClass()
//	public void tearDown() {
//		driver.quit();
//	}
//	
//	@Test(priority = 1)
//	public void ncLoginPage() {
//
//		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
//		
//		System.out.println("NC login page loaded successfully");
//	}
//
//	@Test(priority = 2, groups = "NCLoginCredentials")
//	public void ncEmailField() {
//
//		WebElement email = driver.findElement(By.id("Email"));
//		
//		if (email.isDisplayed()) {
//			
//			System.out.println("Email Field is Displayed");
//		} 
//		else {
//			
//			System.out.println("Email Field is not Displayed");
//		}
//	}
//	
//	
//	@Test(priority = 3, groups = "NCLoginCredentials")
//	public void ncPasswordField() {
//
//		WebElement pass = driver.findElement(By.id("Password"));
//		
//		if (pass.isDisplayed()) {
//			
//			System.out.println("Password Field is Displayed");
//		} 
//		else {
//			
//			System.out.println("Password Field is not Displayed");
//		}
//	}
//	
//	
//	@Test(priority = 4, groups = "loginBtn", dependsOnGroups = "NCLoginCredentials")
//	public void ncLoginBtn() {
//
//		WebElement loginBtn = driver.findElement(By.tagName("button"));
//		
//		if (loginBtn.isDisplayed()) {
//			
//			System.out.println("Login Button is Displayed");
//		} 
//		else {
//			
//			System.out.println("Login Button is not Displayed");
//		}
//	}
//	
//	
//
//	@Test(priority = 5,dependsOnMethods = {"ncEmailField","ncPasswordField","ncLoginBtn"})
//	public void ncLogin() {
//		
//		WebElement email = driver.findElement(By.id("Email"));
//		email.clear();
//		email.sendKeys("admin@yourstore.com");
//		
//		WebElement pass = driver.findElement(By.id("Password"));
//		pass.clear();
//		pass.sendKeys("admin");
//		
//		System.out.println("Positive data entered into Login Fields");
//
//		driver.findElement(By.tagName("button")).click();
//		
//	}
//	
//	@Test(priority = 6, dependsOnMethods = "ncLogin")
//	public void ncDashboard() {
//		
//		WebElement dash = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]"));
//		
//		if (dash.isDisplayed()) {
//			
//			System.out.println("Login to NC page successfull");
//		}
//	}
//	
//	@Test(priority = 7, dependsOnMethods = "ncDashboard")//, invocationCount = 3,invocationTimeOut = 1000
//	public void ncDashboardPage() {
//		
//		WebElement commonstat = driver.findElement(By.xpath("(//button[contains(@class,'btn btn-tool')])[4]"));
//		
//		commonstat.click();
//	}
//	
//	
//	@Test(priority = 8, dependsOnMethods = "ncDashboard", enabled = false)
//	public void ncSalesandProducts() {
//		
//		driver.findElement(By.partialLinkText("Sales")).click();
//		driver.findElement(By.partialLinkText("Orders")).click();
//		
//		
//	}
//	
//	
//	
//}
