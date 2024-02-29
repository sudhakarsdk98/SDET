package testScripts;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestScriptPractice9 {
	

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		// Actions class of SWD to perform mouse and Keyboard key events.
		Actions act = new Actions(driver);
		
		// manage(); to manage browser window.
		driver.manage().window().maximize();
		
		// Synchronization of WebDriver and Browser. 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(15));
		
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		/**		Thread.sleep(3000);  a Static Synchronization method. **/
		
		// get(); to load a WebPage.
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		// using findElement() By id locator to fetch a WebElement.
		WebElement mail = driver.findElement(By.id("Email"));
		
		// clear(); to clear data in field.
		mail.clear();
		
		// sendKeys(); to enter data into field.
		// Keys to represent keyboard key input events.
		mail.sendKeys("admin@yourstore.com", Keys.TAB,Keys.DELETE,"admin");
		
		// Synchronization by using webDriverWait with conditions.
		// using click(); to click an element. 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("button"))).click();
		
		// getCurrentUrl(); to fetch URL of WebPage.
		String pageUrl = driver.getCurrentUrl();
		
		// print statement to print the values to console.
		System.out.println("Current WebPage URL is : "+ pageUrl);
		
		// getTitle(); to fetch WebPage name.
		String pageTitle = driver.getTitle();
		
		System.out.println("Current WebPage Title is : "+ pageTitle);
		
		// getWindowHandle(); to fetch WebPage ID.
		String pageId = driver.getWindowHandle();
		
		System.out.println("Current WebPage ID is : "+ pageId);
		
		// DOM creation for WebElement.
		WebElement ele = driver.findElement(By.partialLinkText("All Orders"));
		
		// getTagName(); to fetch tagName of WebElement.
		String eleTagName = ele.getTagName();
		
		System.out.println("TagName of WebElement fetched using getTagName(); is : "+ eleTagName);
		
		// getAttribute(); to fetch an Attribute of a WebElement.
		String eleTagNameAtt = ele.getAttribute("tagName");
		System.out.println("TagName of WebElement fetched using getAttribute(); is : "+ eleTagNameAtt);
		
		// getText(); to fetch visible text of a WebElement.
		String eleText = ele.getText();
		System.out.println("Text on WebElement fetched using getText(); is : "+ eleText);
		
		String eleTextAtt = ele.getAttribute("text");
		System.out.println("Text on WebElement fetched using getAttribute(); is : "+ eleTextAtt);
		
		// click(); of Actions class.
		// perform(); to perform called action.
		act.click(ele).perform();
		
		WebElement multiSelectMenu = driver.findElement(By.xpath("//div[contains(@class,'k-multiselect-wrap')]"));
		
		// click(); and sendKeys(); of Actions class.
		// also an Approach to select drop-down menus.
		act.click(multiSelectMenu).sendKeys(Keys.DOWN,Keys.ENTER).perform();
		
		// Approach to handle drop-down menus developed in <select> tag.
		WebElement selectDd = driver.findElement(By.id("PaymentMethodSystemName"));
		
		// Select class of SWD to handle drop-down menus in <select>.
		Select selection = new Select(selectDd);
		
		// selectByVisibleText(); of Select class to select option by visible text on webElement.
		selection.selectByVisibleText("Credit Card");
		
		// selectByValue(); to select option based on the value assigned to element.
		selection.selectByValue("Payments.PayPalCommerce");
		
		// selectByIndex(); to select option based on index of element.
		selection.selectByIndex(0);
		
		// getOptions(); to fetch the List of WebElements in drop-down menu.
		List<WebElement> allOpts = selection.getOptions();
		
		System.out.println("All options in DropDown menu are: \n");
		
		for(WebElement opt : allOpts) { // to fetch individual element.
			
			String optTxt = opt.getText();
			
			System.out.println(optTxt);
			
		}
		System.out.println();
		
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

		// Drag and Drop in Actions class.
		driver.switchTo().newWindow(WindowType.TAB);
		// get(); to load a webPage using URL.
		driver.get("https://jqueryui.com/droppable/");

		// switchTo(); to switch between html docs.
		driver.switchTo().frame(0);


		// Approach 1.
		WebElement source = driver.findElement(By.id("draggable"));

		WebElement target = driver.findElement(By.id("droppable"));
		
		// dragAndDrop(); to perform mouse operation of drag and drop on webElement.
		act.dragAndDrop(source, target).perform();
		
		// defaultContent(); to revert to the main doc. of html.
		driver.switchTo().defaultContent();
		
		// navigate().refresh(); to reload a webPage.
		driver.navigate().refresh();
		

		driver.switchTo().frame(0);

		// Approach 2.
		WebElement source1 = driver.findElement(By.id("draggable"));

		WebElement target1 = driver.findElement(By.id("droppable"));
		
		// clickAndHold(); to click on webElement and hold the operation.
		act.clickAndHold(source1).perform();
		
		// moveToElement(); of Action class to move cursor to the webElement.
		act.moveToElement(target1).perform();
		
		// release(); to let go of the webElemnt held by mouse operation.
		act.release(source1).perform();
		

		driver.switchTo().defaultContent();

		// Alerts Handling.
		driver.switchTo().window(pageId);
		
		Thread.sleep(3000);

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
		// print at the end of script.
		String sc = driver.getPageSource();

		
		// close(); to close current browser window.
		driver.close();
		
		// switchTo().window(); to switch between browser windows.
		driver.switchTo().window(pageId);
		
		// navigate().back(); to move to previous webPage in browser.
		driver.navigate().back();

		Thread.sleep(4000);

		// WebTable Handling.
		// findElements() By XPath to fetch a group of webElements to List.
		List<WebElement> tRows = driver.findElements(By.xpath("//table/tbody/tr"));
		
		// size(); to get count of collection of webElements.
		int tRowsCount = tRows.size();

		System.out.println("Count of Rows in WebTable is: " + tRowsCount);

		List<WebElement> tColumns = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));

		int tColumnsCount = tColumns.size();

		System.out.println("Count of Columns in WebTable is: " + tColumnsCount);

		System.out.println("ALL VALUES OF TABLE ARE : \n");

		for (int r = 1; r <= tRowsCount; r++) { // for Rows iteration.
			for (int c = 1; c <= tColumnsCount; c++) { // for Columns iteration.
				// using Dynamic XPath fetch all values in iterations.
				String tableVal = driver.findElement(By.xpath("//table/tbody/tr[" + r + "]/td[" + c + "]")).getText();

				System.out.print(tableVal + "	 	");

			}
			System.out.println();

		}
		
		System.out.println("Current webpage source code is: \n" + sc + "\n");
		
		// Interacting with WebElement using JavaScript.
		// Type cast JavascriptExecutor to force convert driver to JavascriptExecutor type.
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		// ****scroll methods in JavaScript.****
		// scrollTo(); to scroll to coordinates,
		jse.executeScript("window.scrollTo(0,500);");

		// Note : Once the scrollTo action is done to fixed coordinates of browser
		// window,
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
		
		// opening Products page in NC.
		jse.executeScript("document.getElementsByClassName('nav-icon far fa-dot-circle')[0].click();");

		Thread.sleep(3000);

		// scrollIntoView(); to scroll until a WebElement is in the screen view.
		jse.executeScript("document.getElementsByClassName('checkboxGroups')[14].scrollIntoView();");

		jse.executeScript("document.getElementsByClassName('checkboxGroups')[1].scrollIntoView();");

		jse.executeScript("document.getElementsByTagName('Select')[0].scrollIntoView();");

		// ****Adding style to the WebElement.****
		// Add border to WebElement.
		jse.executeScript("document.getElementsByTagName('Select')[0].style.border='4px red solid';");

		// Highlight the WebElement.
		jse.executeScript("document.getElementsByTagName('Select')[0].style.background='yellow';");
		
		// setAttribute() to combine styles.
		jse.executeScript("document.getElementsByTagName('a')[2].setAttribute('style','border:4px red solid;background:grey');");
		
		Thread.sleep(3000);

		// Chained Relative Locators, to combine two or more methods to fetch a target WebElement.
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.tagName("select")).toLeftOf(By.id("SearchWarehouseId"))).sendKeys("New Product");
		
		Thread.sleep(3000);
		
		
		// quit(); to closing every associated browser window.
		driver.quit();
		
		
	}

}
