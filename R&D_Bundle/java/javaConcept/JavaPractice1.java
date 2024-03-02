package javaConcept;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JavaPractice1 {

	// Class Level Variables.
	String mailId = "admin@yourstore.com";

	String pwd = "admin";

	// Static Variable
	static String url = "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F";

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// Local Variables.
		String loginPageTitle = "Your store. Login";
		String dashboardTitle = "Dashboard / nopCommerce administration";

		
		// Load NC login page using static variable.
		driver.get(JavaPractice1.url);
		
		// Check if correct WebPage is loaded or not.
		// by comparing pageTitles.
		if (driver.getTitle().equals(loginPageTitle)) {

			System.out.println("NC login page loaded successfully");
		} else {

			System.out.println("Please check the URL");
		}
		
		
		// Instance creation to access Global Variables.
		JavaPractice1 jp = new JavaPractice1();

		
		// Email FIeld.
		WebElement email = driver.findElement(By.id("Email"));

		String emailField = email.getAttribute("value");

		if (emailField.isEmpty()) {

			email.sendKeys(jp.mailId);

			System.out.println("Email FIeld is empty; sending Mail ID data");

		} else if (email.getAttribute("value").equals(jp.mailId)) {

			System.out.println("Existing value is correct; proceeding to Password Field");

		} else {

			email.clear();
			email.sendKeys(jp.mailId);

			System.out.println("Error in existing value; Correct data has been passed");
		}

		
		// Password Field.
		WebElement pass = driver.findElement(By.id("Password"));

		String pwdField = pass.getAttribute("value");

		if (pwdField.isEmpty()) {

			pass.sendKeys(jp.pwd);

			System.out.println("pass FIeld is empty; sending password");

		} else if (pass.getAttribute("value").equals(jp.pwd)) {

			System.out.println("Existing value is correct; proceeding to Login");

		} else {

			pass.clear();
			pass.sendKeys(jp.pwd);

			System.out.println("Error in existing value; Correct data has been passed");
		}

		
		// Login Button.
		
		WebElement loginBtn = driver.findElement(By.tagName("button"));
		
		if(loginBtn.isDisplayed()) {
			
			if(loginBtn.isEnabled()) {
				
				loginBtn.click();
				
			}else {
				
				System.out.println("Login Button is Displayed but Disabled");
				
			}
			
		}else {
			
			System.out.println("Error in Login Button");
			
		}
		
		
		// Verifying if the DashBoard page is loaded or not.
		
		if(driver.getTitle().equals(dashboardTitle)) {
		
		System.out.println("NC DashBoard Page loaded successfully");
		
		}else {
			
			System.out.println("Error; wrong page loaded");
		}
		
		
		// Switch Case.  
		
		
		WebElement commonstatMenu = driver.findElement(By.xpath("(//button[contains(@class,'btn btn-tool')]/i)[3]"));
		
		String menuStatus = commonstatMenu.getAttribute("className");
		
		
		switch (menuStatus) {
		case "fas fa-plus":
			
			commonstatMenu.click();
			
			driver.findElement(By.xpath("//a[@class='small-box-footer']")).click();
			
			System.out.println("Collapsible menu is closed; clicked on the open button");
			
			break;
			
		case "fas fa-minus":
			
			driver.findElement(By.xpath("//a[@class='small-box-footer']")).click();
			
			System.out.println("Collapsible menu is opened; action performed");
			
			break;

		default:
			
			System.out.println("Error in Common statistics Menu");
		}
		
		
		// for loop.
		
		WebElement dropdown = driver.findElement(By.tagName("select"));
		
		Select select = new Select(dropdown);
		
		List<WebElement> allOpts = select.getOptions();
		
		System.out.println("\n OPTIONS SELECTED IN DROP-DOWN MENU ARE : \n");
		
		for (int i = 0; i < allOpts.size(); i++  ) {
			
			select.selectByIndex(i);
			
			System.out.println(select.getFirstSelectedOption().getText());
		}
		
		// while loop.
		
		List<WebElement> tRows = driver.findElements(By.xpath("//table/tbody/tr"));

		// size(); to get count of collection of webElements.
		int tRowsCount = tRows.size();

		System.out.println("Count of Rows in WebTable is: " + tRowsCount);

		List<WebElement> tColumns = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));

		int tColumnsCount = tColumns.size();

		System.out.println("Count of Columns in WebTable is: " + tColumnsCount);

		System.out.println("\n ALL VALUES OF WEB TABLE ARE : \n");
		
		int r, c;
		
//		r = c = 1; previously defined initialization.
		
		r =1; // initialization for rows.
		
		// Values in 1st Row.
		while (r<=tRowsCount) {
			
			// initialization for columns should be done inside the loop such that the
			// variable is reset each iteration to start from first cell of each row.
			c = 1; 
			while(c<=tColumnsCount) {
				
				String cellVal = driver.findElement(By.xpath("//table/tbody/tr[" + r + "]/td[" + c + "]")).getText();

				System.out.print(cellVal + " 	");
				
				c++;
			}
			
			System.out.println();
			r++;
			
		}
		
		
		driver.findElement(By.linkText("Logout")).click();
		
		driver.quit();
		
	}

}
