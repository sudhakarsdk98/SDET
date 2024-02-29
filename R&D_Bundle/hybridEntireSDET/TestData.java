package hybridEntireSDET;

import org.openqa.selenium.WebDriver;

public class TestData {
	
	private String ncUrl = "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F";
	WebDriver driver;
	
	
	protected String getNcUrl() {
		return ncUrl;
	}
	
}
