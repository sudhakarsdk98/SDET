package javaConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaVariables1 {

	// Class Level / Instance / Global Variable declared within Class but outside main method.
	String url = "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F";

	public static void main(String[] args) {

		// Local Variables mailId and pwd declared within main method.
		String mailId = "admin@yourstore.com";

		String pwd = "admin";

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// Reference Object creation for Class to fetch the Global Variable.
		JavaVariables1 jv = new JavaVariables1();
		
		// using stored Global Variable to input data.
		driver.get(jv.url);

		WebElement email = driver.findElement(By.id("Email"));

		email.clear();
		
		// Using Local Variables to send data to Input fields.
		email.sendKeys(mailId, Keys.TAB, Keys.CLEAR, pwd);
		
		driver.findElement(By.tagName("button")).click();
		
		driver.quit();

	}

}
