package encapsulation;

public class SavingsAccount {

	private int accountNo;

	private String branchName;

	private final String accountType = "Savings Account";

	private String accountHolderName;

	private String address;

	protected int getAccountNo() {
		return accountNo;
	}

	protected void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	protected String getBranchName() {
		return branchName;
	}

	protected void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	protected String getAccountHolderName() {
		return accountHolderName;
	}

	protected void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	protected String getAddress() {
		return address;
	}

	protected void setAddress(String address) {
		this.address = address;
	}

	protected String getAccountType() {
		return accountType;
	}

}
