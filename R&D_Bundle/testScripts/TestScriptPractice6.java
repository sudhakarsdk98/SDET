package testScripts;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScriptPractice6 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		// Go to webPage by using navigate().to(" complete URL");
		driver.navigate().to("https://www.google.com");
		// Using manage() to manage browser window.
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		// Using get(); to open NC login page with complete URL.
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);
		// Perform login using findElement() to identify input field By locator id.
		WebElement mail = driver.findElement(By.id("Email"));
		// Using clear() to clear data from input field.
		mail.clear();
		// Using sendKeys() to perform keyboard actions and complete login.
		mail.sendKeys("admin@yourstore.com", Keys.TAB, "admin", Keys.ENTER);
		// Using XPath to identify webElemet and perform actions to search for contents.
		driver.findElement(By.xpath("//input[contains(@class,'admin-search-box')]")).sendKeys("Orders",
				Keys.DOWN,Keys.DOWN, Keys.ENTER);
		// Using getTitle() to fetch the title of the webPage.
		String pageTItle = driver.getTitle();
		System.out.println("Title of the webpage is :" + pageTItle);
		// Using getCurrenturl() to fetch URL of the current webPage.
		String url = driver.getCurrentUrl();
		System.out.println("Current webpage url is :" + url);
		// Using getWindowHandle() to fetch the id of current webPage.
		String pageId = driver.getWindowHandle();
		System.out.println("Current webpage ID is :" + pageId);
		// Using findElements() to fetch a List of webElement.
		List<WebElement> eles = driver.findElements(By.xpath("//div[@class='col-md-8']"));
		System.out.println("No. of input fields : " + eles.size());

		// Approach 1 for drop-down menu in <Select>.
		// Identifying a drop-down menu and performing various actions.
		WebElement dropdownMenu = driver.findElement(By.xpath("//*[@id='PaymentMethodSystemName']"));
		// Making a DOM for all options in the drop-down menu.
		Select selection = new Select(dropdownMenu);
		// Using selectByVisibleText() to select an option based on the visible text.
		selection.selectByVisibleText("CyberSource");
		Thread.sleep(2000);
		// Using selectByIndex() to select an option based on index of the item.
		selection.selectByIndex(0);
		Thread.sleep(2000);
		// Using selectByValue() to select an option based on the item value.
		selection.selectByValue("Payments.Manual");
		Thread.sleep(2000);

		List<WebElement> allOpts = selection.getOptions();
		Thread.sleep(2000);

		System.out.println("All options in dropdown menu are : ");
		for (WebElement opt : allOpts) {

			String optList = opt.getText();

			System.out.println(optList);
		}
		
		
		// Approach 2 for drop-down menu selection in all tags.
		WebElement opt = driver.findElement(By.xpath("(//input[@class='k-input'])[4]"));
		//opt.click();
		Thread.sleep(2000);
		opt.sendKeys(Keys.DOWN,Keys.ENTER,Keys.DOWN,Keys.ENTER);
		Thread.sleep(2000);
		
		// SWD verification methods.
		driver.findElement(By.xpath("//*[@id='search-orders']")).click();
		Thread.sleep(3000);

		WebElement checkBox = driver.findElement(By.xpath("//input[@class='mastercheckbox']"));

		boolean isCheckBoxVisible = checkBox.isDisplayed();
		System.out.println("Checkbox is displayed : " + isCheckBoxVisible);

		boolean isCheckBoxEnabled = checkBox.isEnabled();
		System.out.println("Checkbox is Enabled : " + isCheckBoxEnabled);

		boolean isCheckBoxSelected = checkBox.isSelected();
		System.out.println("Checkbox is Selected : " + isCheckBoxSelected);

		checkBox.click();

		boolean isCheckBoxSelectedAfterAction = checkBox.isSelected();
		System.out.println("Checkbox is Selected after action : " + isCheckBoxSelectedAfterAction);

		
		// getaAttribute() to fetch properties of webElement.
		String eleTag = checkBox.getAttribute("tagName");
		System.out.println("Attribute of the webElement is : " + eleTag);
		// getTagName() to fetch original tagName.
		String eleTagName = checkBox.getTagName();
		System.out.println("tagName of the webElement is : " + eleTagName);

		driver.findElement(By.xpath("//span/a")).click();
		// getWindowHandles() to fetch all IDs of opened browser windows.
		Set<String> allWinIDs = driver.getWindowHandles();
		System.out.println("All opened browser window ids are : " + allWinIDs);
		// navigate().back() to move back in webPage.
		driver.navigate().back();
		Thread.sleep(3000);
		// navigate().forward() to move forward in webPage.
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		// getPageSource() to capture source code of webPage.
		String sc = driver.getPageSource();
		System.out.println("Source code of the webpage is : \n"+sc);
		
		// close() to close current opened window of browser.
		driver.close();
		Thread.sleep(4000);
		//quit() to close entire browser *recommended*.
		driver.quit();
		
	}

}
