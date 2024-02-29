package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptXPath5 {

	public static void main(String[] args) throws Exception{
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
				driver.findElement(By.xpath("//input[@name='Password']")).clear();
				driver.findElement(By.xpath("//*[@name='Password']")).sendKeys("admin");
				Thread.sleep(2000);
				//click login button
				driver.findElement(By.xpath("//button")).click();
				Thread.sleep(3000);
				
				//open common statics collapse button
				driver.findElement(By.xpath("(//button)[6]")).click();
				Thread.sleep(1000);
				//open more info for registered customers
				driver.findElement(By.xpath("(//a[@class='small-box-footer'])[3]")).click();
				Thread.sleep(3000);
				
				//logout of NC
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				Thread.sleep(3000);
				//Exit entire browser
				driver.quit();

	}

}
