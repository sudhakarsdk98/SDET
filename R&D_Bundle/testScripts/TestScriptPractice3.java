package testScripts;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptPractice3 {

	public static void main(String[] args) throws Exception {
		//open Chrome browser by using ChromeDriver.
		ChromeDriver driver = new ChromeDriver();
		// using manage(); to manage browser window.
		driver.manage().window().maximize();
		// Using get(); to load a webpage with complete URL.
		driver.get("https://www.google.com");
		// Using navigate().to(); to load a webpage with complete URL.
		driver.navigate().to("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		// Using manage(); to achieve synchronization between browser and WebDriver.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Using findElement(); by id locator to identify webElement.
		WebElement mailId = driver.findElement(By.id("Email"));
		// Using getAttribure(); to capture and return the attribute of a webElement.
		String tagName = mailId.getAttribute("tagName");
		// Using getTagName(); to capture and return the tagName of a webElement
		String tag = mailId.getTagName();
		// Using clear(); to remove existing data from an input field.
		mailId.clear();
		// Using sendKeys(); to send data in input field and also keyboard keys operations.
		mailId.sendKeys("admin@yourstore.com", Keys.TAB, Keys.CLEAR, "admin", Keys.ENTER);
		// Using findElements(); to identify multiple webElements by XPath and return those to List<WebElement>.
		List<WebElement> cardMenu = driver.findElements(By.xpath("//div[contains(@class,'card-header with-border')]"));
		// Using getWindowHandle(); to capture current webpage ID.
		String pageId = driver.getWindowHandle();
		// Using click(); action method on a webElement to perform hit action on the webElement.
		driver.findElement(By.linkText("Catalog")).click();
		// Using getCurrentUrl(); to capture the current webpage URL.
		String url = driver.getCurrentUrl();
		// Using findElement(); by partialLinkText locator to identify webElement.
		driver.findElement(By.partialLinkText("reviews")).click();
		Thread.sleep(3000);
		// Using getTitle(); to capture the current webpage name.
		String pageTitle = driver.getTitle();
		// Using navigate().back(); to go back to the previous webpage.
		driver.navigate().back();
		Thread.sleep(3000);
		// Using getText(); to capture the text existing on a webElement.
		String eleTxt = driver.findElement(By.xpath("//*[@id='navbarText']/descendant::a")).getText();
		// Using navigate().forward(); to move to the next webpage.
		driver.navigate().forward();
		Thread.sleep(3000);
		// Using findElement(); by XPath locator to identify webElement and perform actions.
		driver.findElement(By.xpath("//div[contains(@class,'document')]//a")).click();
		Thread.sleep(6000);
		// Using getWindowHandles(); to capture webpage IDs of all windows opened in the browser.
		Set<String> allPageIds = driver.getWindowHandles();
		// Using navigate().refresh(); to refresh/reload the current webpage of the browser.
		driver.navigate().refresh();
		Thread.sleep(3000);
		// Using findElement(); to identify webElement by linkText and perform action to logout of NC page.
		driver.findElement(By.linkText("Logout")).click();
		// Using getPageSource(); to capture source code of the current webpage.
		String pageSC = driver.getPageSource();
		// Using quit(); to quit or close the entire browser.
		driver.quit();
		// Using all Object names to print the values to console.
		System.out.println("tagName of WebElement captured by getAttribute() : " + tagName);
		System.out.println("tagName of WebElement capture by getTagName() : " + tag);
		System.out.println("Count of collapsable menus on Dashboard page is : " + cardMenu.size());
		System.out.println("Current webpage ID is : " + pageId);
		System.out.println("Current webpage URL is : " + url);
		System.out.println("Current webpage title : " + pageTitle);
		System.out.println("Text of the WebElement is : " + eleTxt);
		System.out.println("All webpage IDs are : " + allPageIds);
		System.out.println("Source code of the current page is : \n" + pageSC);
	}

}
