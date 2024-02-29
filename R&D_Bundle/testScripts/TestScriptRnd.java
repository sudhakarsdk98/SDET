package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestScriptRnd {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		// driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();

		//Actions action = new Actions(driver);

		/*
		 * List<WebElement> singleEle =
		 * driver.findElements(By.xpath("//*[@name='Email']")); for (WebElement ele :
		 * singleEle) { ele.clear(); }
		 */

		/*
		 * List<WebElement> singleEle =
		 * driver.findElements(By.xpath("(//*[@class='inputs']/descendant::input)"));
		 * //for (WebElement ele : singleEle) { singleEle.get(0).clear();//}
		 * singleEle.get(1).clear(); singleEle.get(0).sendKeys("admin@yourstore.com");
		 * 
		 * singleEle.get(1).sendKeys("admin"); singleEle.get(1).sendKeys(Keys.ENTER);
		 */

		driver.get("https://jqueryui.com/checkboxradio/");
		Thread.sleep(3000);

		driver.switchTo().frame(0);

		WebElement buttonNewyork = driver.findElement(By.xpath("//fieldset[1]/label[1]"));

		WebElement buttonParis = driver.findElement(By.xpath("//fieldset[1]/label[2]"));

		WebElement button2Star = driver.findElement(By.xpath("//fieldset[2]/label[1]"));

		WebElement button3Star = driver.findElement(By.xpath("//fieldset[2]/label[2]"));

		WebElement button2Double = driver.findElement(By.xpath("//fieldset[3]/label[1]"));

		WebElement button2Queen = driver.findElement(By.xpath("//fieldset[3]/label[2]"));

		// NewYork button
		boolean isButtonNewyorkSelected = buttonNewyork.isSelected();
		
		System.out.println("NewYork button status : " + isButtonNewyorkSelected);

		buttonNewyork.click();
		Thread.sleep(3000);
		boolean buttonNewyorkAfterAction = buttonNewyork.isSelected();

		System.out.println("NewYork button status after action : " + buttonNewyorkAfterAction);

		// Paris button.
		boolean isButtonParisSelected = buttonParis.isSelected();

		System.out.println("Paris button status : " + isButtonParisSelected);

		buttonParis.click();
		Thread.sleep(3000);
		boolean buttonParisAfterAction = buttonParis.isSelected();

		System.out.println("Paris button status after action : " + buttonParisAfterAction);

		// 2Star button.
		boolean isButton2StarSelected = button2Star.isSelected();

		System.out.println("2Star button status : " + isButton2StarSelected);

		button2Star.click();
		Thread.sleep(3000);
		boolean button2StarAfterAction = button2Star.isSelected();

		System.out.println("2Star button status after action : " + button2StarAfterAction);

		// 3Star button.
		boolean isButton3StarSelected = button3Star.isSelected();

		System.out.println("3Star button status : " + isButton3StarSelected);

		button3Star.click();
		Thread.sleep(3000);
		boolean button3StarAfterAction = button3Star.isSelected();

		System.out.println("3Star button status after action : " + button3StarAfterAction);

		// 2Double button.
		boolean isButton2DoubleSelected = button2Double.isSelected();

		System.out.println("2Double button status : " + isButton2DoubleSelected);

		button2Double.click();
		Thread.sleep(3000);
		boolean button2DoubleAfterAction = button2Double.isSelected();

		System.out.println("2Double button status after action : " + button2DoubleAfterAction);

		// 2Queen button.
		boolean isButton2QueenSelected = button2Queen.isSelected();

		System.out.println("2Queen button status : " + isButton2QueenSelected);

		button2Queen.click();
		Thread.sleep(3000);
		boolean button2QueenAfterAction = button2Queen.isSelected();

		System.out.println("2Queen button status after action : " + button2QueenAfterAction);

		
	}
}
