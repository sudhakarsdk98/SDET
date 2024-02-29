package testScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScriptPractice12 {

	static String ncUrl = "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F";
	
	String mailId = "admin@yourstore.com";
	String pwd = "admin";
	
	
	public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();
	
	TestScriptPractice12 tsp = new TestScriptPractice12();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
	
	driver.get(ncUrl);
	
	List<WebElement> inputFields = driver.findElements(By.xpath("//*[@class = 'inputs']/child::input"));
	
// for-each loop.
	for(WebElement field : inputFields) {
	// if ; else;
		if (field.isDisplayed()) {
			
			if (field.isEnabled()) {
				
				field.clear();
				
				// switch statement.
				switch (field.getAttribute("id")) {
				
				case "Email":
					
					field.sendKeys(tsp.mailId);
					
					break;
					
				case "Password":
					
					field.sendKeys(tsp.pwd);
				
					break;
					
				default :
					
					System.out.println("Error in fields");
				
				}
					
				
				
			}else {
				System.out.println("Error; fields disabled");
				
			}
		}else {
			
			System.out.println("Error; fields hidden/not displayed");
			
		}
	}
	
	System.out.println("Data entered in fields, proceeding to Login..");
		
// Login.
	
	WebElement submit = driver.findElement(By.tagName("button"));
	
	if (submit.isDisplayed() && submit.isEnabled()) {
		
		System.out.println("Login button is displayed and enabled.");
		submit.click();
	}else {
		
		System.out.println("Error in Login button");
	}
	

	
	driver.findElement(By.xpath("(//input)[3]")).sendKeys("Orders",Keys.DOWN,Keys.DOWN,Keys.ENTER);
	
	
	WebElement dropdown = driver.findElement(By.tagName("select"));
	
	Select select = new Select(dropdown);
	
	List<WebElement> allOpts = select.getOptions();
	
	System.out.println("\n OPTIONS SELECTED IN DROP-DOWN MENU ARE : \n");

// for loop.
	
	for (int i = 0; i < allOpts.size(); i++  ) {
		
		select.selectByIndex(i);
		
		System.out.println(select.getFirstSelectedOption().getText());
	}
	
	
// while loop.
	
	List<WebElement> tRows = driver.findElements(By.xpath("//table/tbody/tr"));

	// size(); to get count of collection of webElements.
	int tRowsCount = tRows.size();

	System.out.println("\n Count of Rows in WebTable is: " + tRowsCount);

	List<WebElement> tColumns = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));

	int tColumnsCount = tColumns.size();

	System.out.println("Count of Columns in WebTable is: " + tColumnsCount);

	System.out.println("\n ALL VALUES OF WEB TABLE ARE : \n");
	
	int r, c;
	
	
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
	
// Do-while loop.
	
	List<WebElement> checkbox = driver.findElements(By.xpath("//input[@name = 'checkbox_orders']"));
	
	int boxCount = checkbox.size();
	
	int boxIndex = 1;
	do {
		
		driver.findElement(By.xpath("(//input[@name = 'checkbox_orders'])["+boxIndex+"]")).click();
		
		boxIndex++;
		
	} while (boxIndex<=boxCount);
	
	driver.quit();
			
	}

}
