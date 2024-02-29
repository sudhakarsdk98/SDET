package withoutFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutFrameworkTS1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		WebElement mail = driver.findElement(By.id("Email"));
		
		mail.clear();
		mail.sendKeys("admin@yourstore.com");
		
		WebElement pws = driver.findElement(By.name("Password"));
		
		pws.clear();
		pws.sendKeys("admin");
		
		driver.findElement(By.tagName("button")).click();
		
		
		driver.findElement(By.xpath("(//p[contains(text(),'Catalog')])[1]")).click();
		
		driver.findElement(By.partialLinkText("Products")).click();
		
		driver.findElement(By.name("SearchProductName")).sendKeys("PC");
		
		driver.findElement(By.id("search-products")).click();
		
		driver.findElement(By.linkText("Logout")).click();
		
		driver.quit();
	}

}
