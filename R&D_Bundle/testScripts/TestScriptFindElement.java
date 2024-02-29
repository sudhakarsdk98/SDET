package testScripts;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptFindElement {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
	
   //findElement() Architecture,
	 // fetch the web element using  findElement()  with a unique locator identifying only one web element
		WebElement email = driver.findElement(By.xpath("//*[@id='Email']"));
		email.clear();
	 // fetch the web element using  findElement()  with a common locator identifying more than one web element
		WebElement pass = driver.findElement(By.xpath("//div/descendant-or-self::input"));
		pass.sendKeys("admin@yourstore");

   //findElements()	Architecture,
     // fetch the web element using  findElements()  with a unique locator identifying only one web element
		List<WebElement> singleEle = driver.findElements(By.xpath("//*[@name='Email']"));
		int count1 = singleEle.size(); 
	// fetch the web element using  findElements()  with a common locator identifying more than one web element
		List<WebElement> allEles = driver.findElements(By.xpath("//div/descendant-or-self::input"));
		int count2 = allEles.size();
	// fetch the web element using  findElements() with a unique locator identifying no web element
		List<WebElement> noEle = driver.findElements(By.xpath("//*[@name='Gmail']"));
		int count3 = noEle.size();
		
		System.out.println("count of singleEle tags: "+count1);
		System.out.println("Count of allEles tags: "+count2);
		System.out.println("Count of noEle tags: "+count3);
		
   //FOR EXCEPTION IN  findElement() Architecture,	
	 // fetch the web element using  findElement()  with wrong locator identifying no web element
		WebElement submit = driver.findElement(By.xpath("//*[@name='Gmail']"));
		submit.clear();
	}

}
