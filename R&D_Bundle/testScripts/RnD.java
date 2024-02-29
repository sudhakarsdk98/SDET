package testScripts;

import java.io.File;
import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RnD {

	public static void main(String[] args) throws Exception {
		
		
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://tus.io/demo");
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");		
//		WebElement ele = driver.findElement(By.tagName("input"));
		
		WebElement ele = driver.findElement(By.id("Password"));
		ele.sendKeys("sdkfoie");
		ele.sendKeys("F:\\Eclipse workspace\\com.NCSDETBatch005.org\\NCReports");
		
		 File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 String screenshotBase64 = ((TakesScreenshot) ele).getScreenshotAs(OutputType.BASE64);
		 
		 FileInputStream fis = new FileInputStream("F:\\Eclipse workspace\\com.NCSDETBatch005.org");
		
		
		
		
		

	}

}
