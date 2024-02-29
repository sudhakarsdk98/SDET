package testScripts;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestScriptPractice10 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		// manage(); to manage browser window.
		driver.manage().window().maximize();
		
		// Synchronization; for page load.
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
		// Synchronization; for element load.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// Synchronization; for JavaScript load.
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
		
		// Synchronization; for holding the code execution for a fixed period of time.
//		Thread.sleep(3000);
		
		// Synchronization along with verification with preferred conditions or parameters.
		Wait<WebDriver> wait = new WebDriverWait(driver,Duration.ofSeconds(15))
										.pollingEvery(Duration.ofSeconds(3))
										.withMessage("Review the LOC; Element wait timeout")
										.ignoring(NoSuchElementException.class);
			
		// get(); to load a web page.
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		// getPageSource(); to fetch source code of the webpage.
		// print at the end of execution.
		String ncSC = driver.getPageSource();
		
		// findElements(); to return a List of WebElements By using XPath locator.
		List<WebElement> loginFields = driver.findElements(By.xpath("//*[@class = 'inputs']/child::input"));
		// clear(); to clear data in input fields
		// sendKeys(); to simulate typing data into fields.
		loginFields.get(0).clear();
		loginFields.get(0).sendKeys("admin@yourstore.com");
		loginFields.get(1).clear();
		loginFields.get(1).sendKeys("admin");
		
		// findElement(); By tagName to fetch a WebElement.
		// click(); to perform click action on element.
		driver.findElement(By.tagName("button")).click();
		
		// getWindowHandle(); to fetch current WebPage ID.
		String pageId = driver.getWindowHandle();
		 
		System.out.println("Current window id is : "+pageId);
		 
		// getCurrentUrl(); to fetch URL of current WebPage.
		String currentUrl = driver.getCurrentUrl();
		 
		System.out.println("Current window id is : "+currentUrl);
		
		// Actions class of SWD to perform mouse and keyboard events.
		Actions act = new Actions(driver);
	
		// swicthTo(); to perform actions in another frame or window.
		driver.switchTo().newWindow(WindowType.TAB);
		
		// navigate().to(); to load a webpage.
		driver.navigate().to("https://testpages.eviltester.com/styled/index.html");
		
		// getTitle(); to fetch title of current webpage.
		String pageTitle = driver.getTitle();
		System.out.println("current webpage title is : "+pageTitle);
		
		// getWindowHandles(); to fetch all IDs of opened browser windows.
		Set<String> allPageIds = driver.getWindowHandles();
		System.out.println("All opened window Ids are : "+allPageIds);
		
		WebElement dragndropLink = driver.findElement(By.id("useractionstest"));
		
		// getTagName(); to fetch visible tagName of element.
		String eleTagName = dragndropLink.getTagName();
		System.out.println("TagName of element; by getTagName(); : "+eleTagName);
		
		// getAttributee(); to fetch key value of element.
		String eleAtt = dragndropLink.getAttribute("tagName");
		System.out.println("TagName of element; by getAttribute(); : " + eleAtt);
		
		// perform(); to perform action without calling build();
		act.scrollToElement(dragndropLink).perform();
		
		// moveToElement(); to move mouse pointer to an element
		act.moveToElement(dragndropLink).perform();
		
		// pause(); to pause an action by fixed time.
		act.pause(2000);
		
		// click(); of Actions class to click at current pointer location.
		act.click().perform();
		
		// Drag and Drop function; Approach 1.
		
		WebElement source1 = driver.findElement(By.id("draggable1"));

		WebElement target1 = driver.findElement(By.id("droppable1"));
		
		act.dragAndDrop(source1, target1).perform();
		
		// Drag and Drop function; Approach 2.
		
		WebElement source2 = driver.findElement(By.id("draggable2"));

		WebElement target2 = driver.findElement(By.id("droppable2"));
		
		act.clickAndHold(source2).perform();
		
		act.moveToElement(target2).perform();
		
		act.release(source2).perform();
		
		// navigate().back(); to move back in webpage.
		driver.navigate().back();
		
		// Handling frames.
		// using wait for synchronization until ExpectedConditions are met. 
		wait.until(ExpectedConditions.elementToBeClickable(By.id("framestest"))).click();
		
		// switchTo().frame(); to select/move to a frame. 
		driver.switchTo().frame(3);
		
		act.pause(2000);
		act.scrollByAmount(0, 500).perform();
		
		// switchTo().defaultContent(); to move to first frame or main doc of webpage.
		driver.switchTo().defaultContent();
		
		driver.navigate().back();
		
		// Handling Alerts.
		  
		driver.switchTo().window(pageId);
		
		// navigate().refresh(); to reload the current webpage.
		driver.navigate().refresh();
		
				
		WebElement searchBox = driver.findElement(By.xpath("//*[contains(@class,'admin-search-box')]"));
		searchBox.sendKeys("Templates",Keys.DOWN,Keys.DOWN,Keys.ENTER);
		
		driver.findElement(By.xpath("(//a[contains(@class,'btn btn-default')])[4]")).click();
		
		// switchTo().alert(); to switch focus to alert and accept(); or dismiss(); the alert.
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.xpath("//*[contains(@class,'admin-search-box')]")).sendKeys("Orders",Keys.DOWN,Keys.DOWN,Keys.ENTER);
		
	// Verification methods of SWD.
		
		WebElement ordCheckBox = driver.findElement(By.className("mastercheckbox"));
		
		// isDisplayed(); of verification method to verify if the webElement is appeared on webPage or not.
		boolean isCheckBoxDisplayed = ordCheckBox.isDisplayed();
		
		// isEnabled(); to verify if the webElement is enabled or disabled on webPage.
		boolean isCheckBoxEnabled = ordCheckBox.isEnabled();
		
		// isSelected(); to verify if the webElement is selected on webPage or not.
		boolean isCheckBoxSelected = ordCheckBox.isSelected();

		ordCheckBox.click();
		
		// to verify the status after action.
		boolean isCheckBoxSelectedAction = ordCheckBox.isSelected();

		System.out.println("CheckBox is Displayed : " + isCheckBoxDisplayed);
		System.out.println("CheckBox is Enabled : " + isCheckBoxEnabled);
		System.out.println("CheckBox is Selected : " + isCheckBoxSelected);
		System.out.println("CheckBox is Selected after action : " + isCheckBoxSelectedAction);
		
		// Select class in SWD.
		
		driver.switchTo().newWindow(WindowType.TAB); 
		Thread.sleep(5000);
		
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html"); Thread.sleep(3000);
		
		WebElement selectDd = driver.findElement(By.xpath("(//select)[2]"));
		
		// Select class of SWD to handle drop-down menus in <select>.
		Select selection = new Select(selectDd);

		// selectByVisibleText(); of Select class to select option by visible text on webElement.
		selection.selectByVisibleText("February");
		selection.selectByVisibleText("March");
		
		// selectByValue(); to select option based on the value assigned to element.
		selection.selectByValue("Aug");
		selection.selectByValue("Ma");
		
		// selectByIndex(); to select option based on index of element.
		selection.selectByIndex(0);
		selection.selectByIndex(2);
		
		// deselect methods to reverse selectBy methods.
		selection.deselectByVisibleText("February");
		
		selection.deselectByValue("Aug");
		
		selection.deselectByIndex(0);
		
		selection.deselectAll();
		
		List<WebElement> allOpts = selection.getOptions();
		
		System.out.println("All options in drop-down menu are : \n");
		
		for(WebElement opt : allOpts) {
			
			String optText = opt.getText();
			
			System.out.println(optText);
		}
		
		driver.switchTo().window(pageId);
		
		// Handling WebTables.
		List<WebElement> tRows = driver.findElements(By.xpath("//table/tbody/tr"));

		// size(); to get count of collection of webElements.
		int tRowsCount = tRows.size();

		System.out.println("Count of Rows in WebTable is: " + tRowsCount);

		List<WebElement> tColumns = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));

		int tColumnsCount = tColumns.size();

		System.out.println("Count of Columns in WebTable is: " + tColumnsCount);

		System.out.println("ALL VALUES OF WEB TABLE ARE : \n");

		for(int r = 1; r <= tRowsCount; r++) { // Rows iteration.
			for(int c = 1; c <= tColumnsCount; c++) { // Columns iteration.
				// dynamic XPath to retrieve values in each cell.
				String val = driver.findElement(By.xpath("//table/tbody/tr["+r+"]/td["+c+"]")).getText();
				
				System.out.print(val+" 	");
				
			}

			System.out.println();
		}
		
		// Interacting with WebElement using JavaScript.
		// Type cast JavascriptExecutor to force convert driver to JavascriptExecutor type.
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		// ****scroll methods in JavaScript.****
		// scrollTo(); to scroll to coordinates,
		jse.executeScript("window.scrollTo(0,500);");

		// Note : Once the scrollTo action is done to fixed coordinates of browser window,
		// same coordinates repeated are of no use as the action is already completed.
		jse.executeScript("window.scrollTo(0,500);");

		// scroll reset.
		jse.executeScript("window.scrollTo(0,0);");

		// scrollBy(); to scroll by the no. of coordinates progressively.
		jse.executeScript("window.scrollBy(0,200);");

		// unlike scrollTo(); scrollBy(); can be repeated to add up to the previous
		// scroll coordinates.
		jse.executeScript("window.scrollBy(0,200);");

		// scroll reset by using a negative index.
		jse.executeScript("window.scrollBy(0,-400);");
		
		jse.executeScript("window.scrollTo(0,0);");
		
		// scrollIntoView(); to scroll until a WebElement is in the screen view.
		jse.executeScript("document.getElementsByName('checkbox_orders')[2].scrollIntoView()");
		
		jse.executeScript("document.getElementById('StartDate').scrollIntoView()");
		
		// ****Adding style to the WebElement.****
		// Add border to WebElement.
		jse.executeScript("document.getElementById('EndDate').style.border='4px red solid'");

		// Highlight the WebElement.
		jse.executeScript("document.getElementById('EndDate').style.background='yellow'");

		// setAttribute() to combine styles.
		jse.executeScript("document.getElementsByClassName('col-md-8')[4].setAttribute('style', 'border : 4px red solid ; background : yellow');");
		
		// Chained Relative Locators, to combine two or more methods to fetch a target WebElement.
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.tagName("select")).toLeftOf(By.id("BillingLastName"))).sendKeys("03/13/2017");
		
		// using JavaScript to interact with WebElement.
		jse.executeScript("document.getElementsByClassName('nav-link')[2].click();");
		
		System.out.println("\n Source code of NC login page : \n"+ncSC);
		
		driver.quit();
	}

}
