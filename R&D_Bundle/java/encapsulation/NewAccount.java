package encapsulation;

public class NewAccount {

	public static void main(String[] args) {
		
		SavingsAccount sa = new SavingsAccount();
			
			sa.setAccountHolderName("John");
			sa.setAccountNo(100108984);
			sa.setBranchName("085-JNTUH");
			sa.setAddress("JNTUH, HYDERABAR, TELANGANA, INDIA -500085");
		
		System.out.println(
			"Name of the User : "+sa.getAccountHolderName()+
			"\nAccount Number   : "+sa.getAccountNo()+
			"\nAccount Type     : "+sa.getAccountType()+
			"\nBranch Name      : "+sa.getBranchName()+
			"\nAddress          : "+sa.getAddress());
		
	
	}

}
