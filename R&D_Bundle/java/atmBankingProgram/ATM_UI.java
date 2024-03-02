package atmBankingProgram;

public interface ATM_UI {
	
	boolean login(String phNo, String pin);
	
	double checkBalance();

	void deposit(double amount);

	void withdraw(double amount);

	
	
	

}
