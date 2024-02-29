package inBuiltPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

public class ExampleInbuilt_NC_LoginPage { //Rule - 1

		WebDriver driver;

		// Rule - 2
		@FindBy(how = How.ID, using = "Email")
		WebElement email;

		@FindBys({ @FindBy(xpath = "(//div[@class='inputs'])[2]"),
					@FindBy(name = "Password") })
					WebElement pws;

		@FindAll({ @FindBy(tagName = "button"),
					@FindBy(xpath = "//button[text() = 'Log in']") })
					WebElement loginBtn;

		// Rule - 3

		public void enterNCEmail() {
			email.clear();
			email.sendKeys("admin@yourstore.com");
		}

		public void enterNCPassword() {
			pws.clear();
			pws.sendKeys("admin");
		}

		public void clickOnNCLoginBtn() {
			loginBtn.click();
		}

		// Rule - 4;
		public ExampleInbuilt_NC_LoginPage(WebDriver d) {
			this.driver = d;
//			PageFactory.initElements(driver, this);

		}

}
