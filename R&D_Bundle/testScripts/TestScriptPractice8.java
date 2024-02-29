package testScripts;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestScriptPractice8 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
	// manage(); to manage browser window and webDriver.
		driver.manage().window().maximize();
		
	// Synchronization of WebDriver and Browser.
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(15));
		
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
/**		Thread.sleep(3000);  a Static Synchronization method. **/
		
	// navigate().to(); to load a webPage.
		driver.navigate().to("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

	// Condition for WebDriverWait class of Synchronization.
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Email")));
		
	// findElement(); By using 'name' locator and clear(); to clear the field.
		driver.findElement(By.name("Email")).clear();
	
	// findElement(); By using 'id' locator and sendKeys(); to send data to the field.
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		
	// findElement(); By using 'XPath' locator and clear(); to clear the field.
		driver.findElement(By.xpath("//input[@id='Password']")).clear();
	
	// findElement(); By using 'XPath' locator sendKeys(); to send data to the field.
		driver.findElement(By.xpath("//*[@name='Password']")).sendKeys("admin");
		
	// findElement(); By using 'tagName' locator and click(); to perform hit action on button.
		driver.findElement(By.tagName("button")).click();
		
	// findElement(); By using 'className' locator and click(); to perform hit action.	
		driver.findElement(By.className("nav-link")).click();
	
	// findElement(); By using 'linkText' locator and click(); to perform hit action.
		driver.findElement(By.linkText("View All Orders")).click();
		
	// navigate().back(); to move back in webPage.
		driver.navigate().back();
		
	// findElement(); By using 'partialLinkText' locator and click(); to perform hit action.
		driver.findElement(By.partialLinkText("All Orders")).click();
				
		driver.navigate().back();
		
	// navigate().forward(); to move forward in webPage.
		driver.navigate().forward();
		
	// navigate().refresh(); to reload the webPage.
		driver.navigate().refresh();
		
	// findElement(); By using Absolute XPath and perform click(); action. 
		driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[1]/a")).click();
	
	// getTitle(); to fetch the current webPage name.
		String pageTitle = driver.getTitle();
	// print statement to print values to console.
		System.out.println("Title of the current webPage is: "+pageTitle);
		
	// getCurrentUrl(); to fetch current webPage URL.
		String url = driver.getCurrentUrl();
		
		System.out.println("URL of the current webPage is: "+url);
		
	// getWindowHandle(); to fetch Current webPage ID.
		String pageId = driver.getWindowHandle();
		
		System.out.println("ID of the current webPage is: "+pageId);
		
	// getAttribute(); to fetch the webElement properties value.
		String eleId = driver.findElement(By.className("nav-link")).getAttribute("id");
		
		System.out.println("Attribute id value of the webElement is: "+eleId);
		
		driver.findElement(By.xpath("//input[contains(@class,'admin-search-box')]")).sendKeys("Products",Keys.DOWN,Keys.ENTER);
		
	// SWD verification methods.
		// findElement(); By XPath with index stored in a DOM.
		WebElement checkBox = driver.findElement(By.xpath("(//input[@class='mastercheckbox'])[1]"));
		
	// isDisplayed(); to verify if the webElement is appeared or not.
		boolean isCheckBoxDisplayed = checkBox.isDisplayed();
		
		System.out.println("CheckBox is Displayed : "+isCheckBoxDisplayed);
		
	// isEnabled(); to verify whether the webElement is Enabled/Disabled.
		boolean isCheckBoxEnabled = checkBox.isEnabled();
		
		System.out.println("CheckBox is Enabled : "+isCheckBoxEnabled);
		
	// isSelected(); to verify if the webElement is selected or not.	
		boolean isCheckBoxSelected = checkBox.isSelected();
		
		System.out.println("CheckBox is Selected : "+isCheckBoxSelected);
		
		checkBox.click();
		
	// isSelected(); to verify if the webElement is selected or not after action.	
		boolean isCheckBoxSelectedonAct = checkBox.isSelected();
		
		System.out.println("CheckBox is Selected after action : "+isCheckBoxSelectedonAct);
		
	// Select class in SWD to handle drodown menus in <select> tag.
		// Approach 1.
		// make a DOM for dropdown webElement.
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='SearchManufacturerId']"));
	// Select class with dropdown in constructor.
		Select selection = new Select(dropdown);
		
	// selectByVisibleText(); to select an option by visible text on screen.
		selection.selectByVisibleText("HP");
		
	// selectByIndex(); to select an option by index of the option.
		selection.selectByIndex(1);
		
	// selectByValue(); to select an option by value assigned to the option by developer.
		selection.selectByValue("3");
		
	// getOptions(); to fetch all the options present in the <select> tag and return to a List.
		List<WebElement> allOpts = selection.getOptions();
		
	// size(); to get the count of webElements in the List of webElements.
		System.out.println("Count of options in Manufacturer dropdown are : "+allOpts.size());
		
		System.out.println("Count of options in Manufacturer dropdown are : \n");
		
		for (WebElement opt : allOpts) {
			
			// getText(); to fetch the text present on the webElement.
			String optNames = opt.getText();
			
			System.out.println(optNames);
		}
		System.out.println();
		
	// Approach 2.
		// We use sendKeys(); for the dropdowns without <select> tag.
		
		driver.navigate().refresh();
		
		
		driver.findElement(By.xpath("//*[@id='SearchManufacturerId']")).sendKeys(Keys.DOWN,Keys.DOWN,Keys.UP,Keys.ENTER);
		Thread.sleep(3000);
	// WebTables handling in SWD.
		
	// findElements(); to fetch a List of WebElements.
		List<WebElement> tRows = driver.findElements(By.xpath("//table[@id='products-grid']/tbody/tr"));
		
		int tRowsCount = tRows.size();
		
		List<WebElement> tColumns = driver.findElements(By.xpath("//table[@id='products-grid']/tbody/tr[1]/td"));
		
		int tColumnsCount = tColumns.size();
		
		System.out.println("Count of rows in WebTable is : "+tRowsCount);
		
		System.out.println("Count of columns in WebTable is : "+tColumnsCount);
		
		System.out.println("\n ALL VALUES OF TABLE ARE : \n");
		
		
		for ( int r = 1; r <= tRowsCount; r++) { // for rows iteration.
			
			for ( int c = 1; c <= tColumnsCount; c++) { // for columns iteration.
				// using Dynamic XPath fetch all values in iterations.
				String tVal = driver.findElement(By.xpath("//table[@id='products-grid']/tbody/tr["+r+"]/td["+c+"]")).getText();
				
				System.out.print(tVal+"		");
				
			}
				System.out.println();
			
		}
		
		
		
		
	// for performing mouse and keyboard actions we use Actions class with driver in the constructor.
		
		Actions action = new Actions(driver);
		
	// Drag and Drop in Actions class.
		driver.switchTo().newWindow(WindowType.TAB);
	// get(); to load a webPage using URL.
		driver.get("https://jqueryui.com/droppable/");

		Thread.sleep(5000);
		
	// switchTo(); to switch between html docs.
		driver.switchTo().frame(0);
		
		Thread.sleep(3000);

	// Approach 1.
		WebElement source = driver.findElement(By.id("draggable"));

		WebElement target = driver.findElement(By.id("droppable"));
	// dragAndDrop(); to perform mouse operation of drag and drop on webElement.
		action.dragAndDrop(source, target).perform();
		
	// defaultContent(); to revert to the main doc. of html.
		driver.switchTo().defaultContent();
		
	// navigate().refresh(); to reload a webPage.
		driver.navigate().refresh();

		driver.switchTo().frame(0);

	// Approach 2.
		WebElement source1 = driver.findElement(By.id("draggable"));

		WebElement target1 = driver.findElement(By.id("droppable"));
		
	// clickAndHold(); to click on webElement and hold the operation.
		action.clickAndHold(source1).perform();
		
	// moveToElement(); of Action class to move cursor to the webElement.
		action.moveToElement(target1).perform();
		
	// release(); to let go of the webElemnt held by mouse operation.
		action.release(source1).perform();
	
		driver.switchTo().defaultContent();

	// Alerts Handling.
		driver.switchTo().window(pageId);

		driver.findElement(By.xpath("(//input)[3]")).sendKeys("Templates", Keys.DOWN, Keys.DOWN, Keys.ENTER);

	// Confirmation Alert.
		driver.findElement(By.xpath("//a[text()='Delete']")).click();

		Alert ncConfirmAlert = driver.switchTo().alert();

		String confirmPopupText = ncConfirmAlert.getText();

		System.out.println("Text on NC Confirmation Alert is : " + confirmPopupText);
				
	// accept(); to accept condition on popup.
		ncConfirmAlert.accept();
		Thread.sleep(3000);

	// Simple Alert.
		Alert ncSimpleAlert = driver.switchTo().alert();

		String simplePopupText = ncSimpleAlert.getText();

		System.out.println("Text on NC Simple Alert is : " + simplePopupText);

		ncSimpleAlert.accept();

		driver.switchTo().defaultContent();

	// Prompt Alert.
		driver.switchTo().newWindow(WindowType.TAB);

		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");

		driver.findElement(By.id("promptexample")).click();
		Thread.sleep(2000);

		Alert promptAlert = driver.switchTo().alert();

		promptAlert.sendKeys("New text prompt");

		String promptPopupText = promptAlert.getText();

		System.out.println("Text on Prompt Alert is : " + promptPopupText);
		
	// dismiss(); to reject condition on popup.
		promptAlert.dismiss();
		Thread.sleep(3000);
		
	// getWindowHandles(); to fetch Ids of all opened browser windows.
		Set<String> allWebpageIds = driver.getWindowHandles();

		System.out.println("All opened webpage Ids are: " + allWebpageIds);
		
	// getPageSource(); to fetch entire code of the webPage.
		String sc = driver.getPageSource();

		System.out.println("Current webpage source code is: \n" + sc + "\n");
		
	// close(); to close current browser window.
		driver.close();
		
	// switchTo().window(); to switch between browser windows.
		driver.switchTo().window(pageId);
		
		driver.findElement(By.linkText("Logout")).click();
		
		
		driver.quit();
		
	}

}
