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
import org.openqa.selenium.support.ui.Select;

public class TestScriptPractice7 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		// Actions class for mouse and keyboard operations.
		Actions action = new Actions(driver);
		// Synchronization of browser and WebDriver for webPage timeout.
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		// Synchronization of browser and WebDriver for webElement timeout.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// navigate().to(); to load a webPage with URL.
		driver.navigate().to("https://www.google.com");
		// manage() to manage the browser window.
		driver.manage().window().maximize();
		// findElement to fetch a webELement By using className locator.
		// sendKeys(); to send data to webElement.
		driver.findElement(By.className("gLFyf")).sendKeys("nopcommerce your store login", Keys.ENTER);
		// Synchronization method to make the driver wait for specific time.
		Thread.sleep(3000);
		// moveToElement() of Action class to move cursor to the webElement.
		// click(); to perform hit action on webElement.
		// perform(); to perform the action on webElement.
		action.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Your store. Login')]"))).click()
				.perform();
		// getCurrentUrl(); to fetch the URL of the current browser window.
		String currentUrl = driver.getCurrentUrl();
		// print statement to print data to console.
		System.out.println("URL of current webpage is: " + currentUrl);
		// findElement By using an id locator.
		WebElement mail = driver.findElement(By.id("Email"));
		// getAttribute(); to fetch the required property of webElement.
		String eleClassName = mail.getAttribute("class");

		System.out.println("ClassName of WebElement mail is: " + eleClassName);
		// clear(); to clear data in a webElement.
		mail.clear();
		// using sendKeys(); & Keys to send keyboard functions on webElement.
		mail.sendKeys("admin@yourstore.com", Keys.TAB, "admin", Keys.ENTER);
		// getTitle(); to fetch the Title of the current webPage.
		String pageTitle = driver.getTitle();

		System.out.println("Title of the webPage is: " + pageTitle);
		// getWindowHandle(); to fetch Id of the current browser window.
		String webpageId = driver.getWindowHandle();
		
		System.out.println("Current webPage Id is: " + webpageId);
		
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("Categories", Keys.DOWN, Keys.ENTER);

		WebElement catCheckBox = driver.findElement(By.className("mastercheckbox"));
		// isDisplayed(); of verification method to verify if the webElement is appeared on webPage or not.
		boolean isCheckBoxDisplayed = catCheckBox.isDisplayed();
		// isEnabled(); of verification method to verify if the webElement is enabled or disabled on webPage.
		boolean isCheckBoxEnabled = catCheckBox.isEnabled();
		// isSelected(); of verification method to verify if the webElement is selected on webPage or not.
		boolean isCheckBoxSelected = catCheckBox.isSelected();

		catCheckBox.click();

		boolean isCheckBoxSelectedAction = catCheckBox.isSelected();

		System.out.println("Dropdown menu is Displayed : " + isCheckBoxDisplayed);
		System.out.println("Dropdown menu is Enabled : " + isCheckBoxEnabled);
		System.out.println("Dropdown menu is Selected : " + isCheckBoxSelected);
		System.out.println("Dropdown menu is Selected : " + isCheckBoxSelectedAction);

		WebElement catDropdown = driver.findElement(By.xpath("//*[@id='SearchPublishedId']"));

		// Approach 1 for dropDown handling.
		// using sendKEys(); to navigate through options.
		catDropdown.sendKeys(Keys.DOWN, Keys.ENTER);

		// Approach 2 for dropDown handling.
		// For <Select>, using Select class to fetch, select or deselect data from dropdown. 
		Select selection = new Select(catDropdown);
		// selectByVisibleText(); of Select class to select data by visible text on webElement.
		selection.selectByVisibleText("Unpublished only");
		// selectByIndex(); to select data by index of webElement.
		selection.selectByIndex(0);
		// selectByValue(); to select data by value assigned to webElement.
		selection.selectByValue("1");
		// getOptions(); to collect all options in dropdown.
		List<WebElement> allOpts = selection.getOptions();

		System.out.println("Count of options in dropdown is: " + allOpts.size());

		System.out.println("All options in dropdow are: \n");

		for (WebElement opt : allOpts) {
			// getText(); to fetch the text on webElement.
			String optText = opt.getText();
			System.out.println(optText);
		}

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
		driver.switchTo().window(webpageId);

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
		driver.switchTo().window(webpageId);
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
		// quit(); to closing every associated browser window.
		driver.quit();

	}

}
