package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptExe {

	public static void main(String[] args) throws Exception {
				//launch the Chrome browser
				ChromeDriver driver = new ChromeDriver();
				
				//open NC login page in opened browser
				driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
				
				//maximize the browser
				driver.manage().window().maximize();
				
				//clear the Email field and pass the Email value
				driver.findElement(By.id("Email")).clear();
				driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
				
				//clear the password field and pass the password value
				driver.findElement(By.name("Password")).clear();
				driver.findElement(By.name("Password")).sendKeys("admin");
				
				//click the login button
				driver.findElement(By.tagName("button")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.linkText("Sales")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.partialLinkText("wishlists")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.className("nav-item")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
				//close the entire browser
				driver.quit();		
	}

}
