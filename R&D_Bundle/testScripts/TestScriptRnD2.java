package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

//import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class TestScriptRnD2 {

	public static void main(String[] args) throws InterruptedException  {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		// Conventional way of fetching a WebElement.
		WebElement pass = driver.findElement(By.id("Password"));
		
		pass.clear();
		
		pass.sendKeys("admin");

		// Using RelativeLocator class and with(); to fetch the Target WebElement from a Relative WebElement
		// above(); to findElement above the relative WebElement.
		WebElement mail = driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.id("Password")));

		mail.clear();

		mail.sendKeys("admin@yourstore.com");
		
		// below(); to findElement below the relative WebElement.
		driver.findElement(RelativeLocator.with(By.tagName("button")).below(pass)).click();
		
		driver.findElement(By.xpath("(//button[contains(@class,'btn-tool')])[4]")).click();
		
		// toLeftOf(); to findElement below to the left of relative WebElement.
		driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(By.xpath("//*[@id='nopcommerce-common-statistics-card']/descendant::a[2]"))).click();

		driver.navigate().back();
		
		// toRightOf(); to findElement to the right of relative WebElement.
		driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.xpath("//*[@id='nopcommerce-common-statistics-card']/descendant::a[2]"))).click();
		
		driver.navigate().back();
		
		// near(); to findElement near the relative WebElement.
		driver.findElement(RelativeLocator.with(By.tagName("a")).near(By.xpath("//*[@id='nopcommerce-common-statistics-card']/descendant::a[3]"))).click();
		
		// Chained Relative Locators, to combine two or more methods to fetch a target WebElement.
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.tagName("select")).toRightOf(By.id("StartDate"))).sendKeys("Return ID");
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
