package testScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptAlerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);

		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("System")).click();
		Thread.sleep(2000);

		driver.findElement(By.partialLinkText("Temp")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		Thread.sleep(2000);

		// Handling **Confirmation Alert** in NC webPage.
		Alert ncConfirmAlert = driver.switchTo().alert();

		String confirmPopupText = ncConfirmAlert.getText();

		System.out.println("Text on NC Confirmation Alert is : " + confirmPopupText);

		ncConfirmAlert.accept();
		Thread.sleep(3000);

		// Handling **Simple Alert** in NC webPage.
		Alert ncSimpleAlert = driver.switchTo().alert();

		String simplePopupText = ncSimpleAlert.getText();

		System.out.println("Text on NC Simple Alert is : " + simplePopupText);

		ncSimpleAlert.accept();

		driver.switchTo().defaultContent();

		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);

		// For **Prompt Alert** in below webPage.
		driver.navigate().to("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		Thread.sleep(3000);

		driver.findElement(By.id("promptexample")).click();
		Thread.sleep(2000);

		Alert promptAlert = driver.switchTo().alert();
		Thread.sleep(3000);

		promptAlert.sendKeys("New text prompt");
		Thread.sleep(2000);

		String promptPopupText = promptAlert.getText();

		System.out.println("Text on Prompt Alert is : " + promptPopupText);

		promptAlert.accept();
		Thread.sleep(3000);

		driver.quit();

	}

}
