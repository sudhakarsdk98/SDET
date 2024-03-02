package atmBankingProgram;

public  class ATM_Properties {
	
	
	private final String phoneNo = "9848022338";
	private String atmPin = "1005";
	private double balance;
	
	protected String getAtmPin() {
		return atmPin;
	}
	protected void setAtmPin(String atmPin) {
		this.atmPin = atmPin;
	}
	protected double getBalance() {
		return balance;
	}
	protected void setBalance(double balance) {
		this.balance = balance;
	}
	protected String getPhoneNo() {
		return phoneNo;
	}
	

}
