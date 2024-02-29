package hybridEntireSDET;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browser_Util implements TS_NC_Login{
	
	private String ncUrl = "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F";

	WebDriver driver;
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	public void tearDown() {
		driver.quit();
	}

	@Override
	public boolean verifyEmailField() {
		
		return false;		
	}

	@Override
	public boolean verifyPasswordField() {
		
		return false;			
	}

	@Override
	public void launchNCLoginPage() {
		driver.get(ncUrl);		
	}

	@Override
	public void refreshPage() {		
		driver.navigate().refresh();
		
	}

	@Override
	public void clearEmail() {		
		
	}

	@Override
	public void clearPassword() {		
		
	}

	@Override
	public void enterEmail() {		
		
	}

	@Override
	public void enterPassword() {		
		
	}

	@Override
	public void clickOnLoginBtn() {		
		
	}

	@Override
	public void clickOnLogout() {
		driver.findElement(By.linkText("Logout")).click();
		
	}

	
}
