package hybridEntireSDET;

import java.util.List;
import java.util.Map;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestStepDefinition {

	NC_LoginPage stepdef = new NC_LoginPage();

	@Before
	public void browserSetup() {
		stepdef.setUp();
	}

	@After
	public void terminate() {
		stepdef.tearDown();

	}

	@Given("open the NC login page")
	public void open_nc_login_page() {
		stepdef.launchNCLoginPage();
	}

	@Given("refresh the login page")
	public void refresh_login_page() {
		stepdef.refreshPage();
	}

	@Then("verify that Email field present")
	public void verify_email_field_present() {
		boolean bool = stepdef.verifyEmailField();

		if (bool) {
			System.out.println("Email Field is Present");
		} else {
			System.out.println("Email Field is not Present");
		}

	}

	@Then("verify that Password field present")
	public void verify_password_field_present() {
		boolean bool = stepdef.verifyPasswordField();

		if (bool) {
			System.out.println("Password Field is Present");
		} else {
			System.out.println("Password Field is not Present");
		}

	}

	@When("validate {string} field by providing multiple data in email field")
	public void validate_field_by_providing_multiple_data_in_email_field(String string) {
		stepdef.clearEmail();
		stepdef.enterEmail(string);

	}

	@When("validate {string} field by providing multiple data in password field")
	public void validate_field_by_providiing_multiple_data_in_password_field(String string) {
		stepdef.clearPassword();
		stepdef.enterPassword(string);

	}

	@When("validate Email field by providing data")
	public void validate_email_field_by_giving_data(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps();
		for (Map<String, String> id : data) {
			String emailID = id.get("Email");

			stepdef.clearEmail();
			stepdef.enterEmail(emailID);

		}
	}

	@When("validate Password field by providing data")
	public void validate_password_field_by_giving_data(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();
		String pass = data.get(0).get(0);

		stepdef.clearPassword();
		stepdef.enterPassword(pass);
	}

	@When("validate {string} field by providing valid data in email field")
	public void validate_field_by_giving_positivedata_in_email_field(String string) {

		stepdef.clearEmail();
		stepdef.enterEmail(string);

	}

	@When("validate {string} field by providing valid data in password field")
	public void validate_password_field_by_giving_positivedata_in_password_field(String string) {

		stepdef.clearPassword();
		stepdef.enterPassword(string);

	}

	@When("click on nclogin button")
	public void click_on_login_button() {
		stepdef.clickOnLoginBtn();
	}

	@When("click on nclogout")
	public void click_on_logout() {
		stepdef.clickOnLogout();

	}

}
