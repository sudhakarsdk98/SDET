package hybridEntireSDET;

public interface TS_NC_Login {
	
	boolean verifyEmailField();
	boolean verifyPasswordField();
	void launchNCLoginPage();
	void refreshPage();
	void clearEmail();
	void clearPassword();
	void enterEmail();
	void enterPassword();
	void clickOnLoginBtn();
	void clickOnLogout();

}
