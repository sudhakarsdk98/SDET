package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestScriptsXPath1 {

	public static void main(String[] args) throws Exception {
		
		//launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//open NC login page in the opened browser
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//clear the email field and pass the value
		driver.findElement(By.xpath("//input[@id='Email']")).clear();
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("admin@yourstore.com");
		
		//clear the password field and pass the value
		driver.findElement(By.xpath("//input[@name='Password' and @id='Password']")).clear();
		driver.findElement(By.xpath("//*[@name='Password' or @id='Password']")).sendKeys("admin");
		
		Thread.sleep(2000);
		//click login button
		driver.findElement(By.xpath("html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
		Thread.sleep(3000);
		
		//nop Side push bar
		driver.findElement(By.xpath("//*[@id='nopSideBarPusher']")).click();
		Thread.sleep(1500);
		//logout off the NC page
		driver.findElement(By.xpath("//*[text()='Logout']"));
		Thread.sleep(3000);
		//Exit entire browser
		driver.quit();	
		Thread.sleep(5000);
		
		TestScriptXPath2.main(null);
		TestScriptXPath3.main(null);
		TestScriptXPath4.main(null);
		TestScriptXPath5.main(null);
	}
	
}