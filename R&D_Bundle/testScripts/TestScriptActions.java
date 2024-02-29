package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestScriptActions {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		Actions action = new Actions(driver);

		driver.manage().window().maximize();

		// Actions class in SWD to perform mouse operations

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		WebElement mail = driver.findElement(By.name("Email"));
		mail.clear();
		mail.sendKeys("admin@yourstore.com", Keys.TAB, "admin");

		action.pause(3000);

		action.click(driver.findElement(By.tagName("button"))).perform();

		action.pause(3000);

		action.doubleClick(driver.findElement(By.xpath("//div[@id='navbarText']/descendant::a[1]"))).perform();

		action.pause(3000);

		action.scrollToElement(driver.findElement(By.xpath("(//div/h3)[last()]"))).perform();

		action.pause(3000);

		WebElement logout = driver.findElement(By.linkText("Logout"));

		action.moveToElement(logout).pause(3000).click().perform();

		Thread.sleep(3000);

		// Drag and drop of item in two approaches.
		// Approach 1.
		driver.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(3000);

		driver.switchTo().frame(0);

		WebElement source = driver.findElement(By.id("draggable"));

		WebElement target = driver.findElement(By.id("droppable"));

		action.dragAndDrop(source, target).perform();

		action.pause(2000);

		driver.switchTo().defaultContent();

		// Approach 2.
		driver.findElement(By.linkText("Sortable")).click();

		Thread.sleep(3000);

		driver.switchTo().frame(0);

		WebElement item5 = driver.findElement(By.xpath("//*[@id='sortable']/li[5]/span"));

		WebElement item1 = driver.findElement(By.xpath("//*[@id='sortable']/li[1]/span"));

		action.clickAndHold(item5).perform();

		action.pause(2000);

		action.moveToElement(item1).perform();

		action.pause(2000);

		action.release(item5).perform();

		driver.switchTo().defaultContent();

		Thread.sleep(5000);

		driver.quit();
	}

}
