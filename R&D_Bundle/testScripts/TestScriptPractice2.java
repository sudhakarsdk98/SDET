package testScripts;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptPractice2 {

	public static void main(String[] args) throws Exception {

	ChromeDriver driver = new ChromeDriver();
 //using manage(); to manage browser window.
	driver.manage().window().maximize();
 //Using get(); to load a webpage with complete URL.
	driver.get("https://www.google.com");
 //Using navigate().to(); to load a webpage with complete URL.
	driver.navigate().to("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
 //Using manage(); to achieve synchronization between browser and WebDriver.
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 //Using getWindowHandle(); to capture current webpage ID.	
	String pageId1 = driver.getWindowHandle();
 //Using findElement(); by XPath locator to identify webElement and login to the NC page.
	WebElement mailId = driver.findElement(By.id("Email"));
	WebElement pass = driver.findElement(By.id("Password"));
 //Using clear(); to delete any value in field. And sendKeys(); to fill data into field.
	mailId.clear();
	mailId.sendKeys("admin@yourstore.com");
	
	pass.clear();
	pass.sendKeys("admin");
 //Using click(); to perform hit action on any webElement.	
	driver.findElement(By.tagName("button")).click();
	Thread.sleep(3000);
 //Using findElements(); to identify multiple webElements by XPath and return those to a List<WebElement>.	
	List<WebElement>allDropdownMenus = driver.findElements(By.xpath("//nav[@class='mt-2']/descendant::li[contains(@class,'has-treeview')]"));
	int dropdownMenuCount = allDropdownMenus.size();
 //Using navigate().refresh(); to refresh/reload the current webpage of the browser.
	driver.navigate().refresh();
	Thread.sleep(3000);
 //Using findElement(); by XPath locator to identify webElement and perform actions.	
	driver.findElement(By.xpath("(//p[contains(text(),'Catalog')])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//p[contains(text(),'Products')])[1]")).click();
	Thread.sleep(3000);
 //Using findElements(); to identify multiple webElements by XPath and return those to a List<WebElement>.	
	List<WebElement> allButtons = driver.findElements(By.xpath("//button/descendant-or-self::button[contains(@class,'btn')]"));
	int allButtonsCount = allButtons.size();
	Thread.sleep(3000);
 //Using getCurrentUrl(); to capture the current webpage URL.	
	String url = driver.getCurrentUrl();
 //Using findElement(); by XPath locator to identify webElement and perform actions.	
	driver.findElement(By.xpath("//p[contains(text(),'Help')]")).click();
	driver.findElement(By.xpath("(//a[@class='nav-link'])[last()]")).click();
	Thread.sleep(3000);
 //Using switchTo(); to switch between browser windows.	
	driver.switchTo().window(pageId1);
 //Using getWindowHandles(); to capture webpage IDs of all windows opened in the browser.
	Set<String> allPageId = driver.getWindowHandles();
 //Using navigate().back(); to go back to the previous webpage.	
	driver.navigate().back();
	Thread.sleep(2000);
 //Using getTitle(); to capture the current webpage name.	
	String pageTitle1 = driver.getTitle();
 //Using navigate().forward(); to move to the next webpage.	
	driver.navigate().forward();
	Thread.sleep(2000);
 //Using findElement(); to identify webElement by linkText and perform action to logout of NC page.	
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
 //Using getPageSource(); to capture source code of the current webpage.	
	String pageSC = driver.getPageSource();
 //Using quit(); to close the webDriver.	
	driver.quit();
 //To print all the retrieved and saved data to console.	
	System.out.println("Webpage Id of current browser window is : " + pageId1);
	System.out.println("Count of all dropdown menus is : " + dropdownMenuCount);
	System.out.println("Count of all buttons is : " + allButtonsCount);
	System.out.println("Current webpage URL is : " + url);
	System.out.println("All broswer window Ids are : " + allPageId);
	System.out.println("Current webpage Title is : " + pageTitle1);
	System.out.println("Source code of the webpage is : \n" + pageSC);
	
	}

}
