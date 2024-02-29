package testScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptPractice {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();

		List<WebElement> IdPass = driver.findElements(By.xpath("//*[@class='inputs']/descendant-or-self::input"));
		int eleSize = IdPass.size();
		IdPass.get(0).clear();
		IdPass.get(0).sendKeys("admin@yourstore.com");
		IdPass.get(1).clear();
		IdPass.get(1).sendKeys("admin");
		
		driver.findElement(By.xpath("//button")).click();
		driver.findElement(By.xpath("//a[@class='nav-link']/ancestor-or-self::a")).click();
		driver.findElement(By.xpath("//a[contains(@class,'btn-xs')]")).click();
		
		System.out.println(eleSize);
		
		driver.quit();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		TestScriptsXPath1.main(null);
		TestScriptXPath2.main(null);
		TestScriptXPath3.main(null);
		TestScriptXPath4.main(null);
		TestScriptXPath5.main(null);		

	}

}
