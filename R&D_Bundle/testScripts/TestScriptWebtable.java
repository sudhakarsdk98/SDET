package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptWebtable {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		driver.findElement(By.xpath("//button")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(".//span/input")).sendKeys("customers", Keys.DOWN, Keys.ENTER);
		Thread.sleep(3000);

		List<WebElement> tableRows = driver.findElements(By.xpath("//table/tbody/tr"));

		int rowCount = tableRows.size();

		System.out.println("Count of rows in Web Table are : " + rowCount);

		List<WebElement> tableColumns = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));

		int colCount = tableColumns.size();

		System.out.println("Count of columns in Web Table are : " + colCount);

		// For Rows Iteration
		for (int row = 1; row <= rowCount; row++) {

			// For Columns Iteration
			for (int col = 1; col <= colCount; col++) {

				String table = driver.findElement(By.xpath("//table/tbody/tr[" + row + "]/td[" + col + "]")).getText();

				System.out.print(table + "		| ");
			}

			System.out.println();

		}

		driver.quit();

	}

}
