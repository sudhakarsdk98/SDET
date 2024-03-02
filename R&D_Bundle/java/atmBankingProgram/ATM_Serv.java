package atmBankingProgram;

import java.util.Scanner;

public class ATM_Serv implements ATM_UI {

	Scanner sc = new Scanner(System.in);

	ATM_Properties serv = new ATM_Properties();

	@Override
	public boolean login(String phNo, String pin) {

		System.out.print("ENTER PHONE NUMBER : ");
		phNo = sc.next();
		String phno = serv.getPhoneNo();

		if (phNo.equals(phno)) {

			System.out.print("\nENTER 4 DIGIT PIN : ");
			pin = sc.next();
			String atmPin = serv.getAtmPin();
			if (pin.equals(atmPin)) {

				System.out.print("LOGIN SUCCESSFULL");
				return true;

			} else {

				System.out.print("\nINVALID PIN : ");
				return false;

			}

		} else {
			System.out.print("\nINVALID PHONE NUMBER : ");
			return false;

		}

	}

	@Override
	public double checkBalance() {
		double balance = serv.getBalance();
		return balance;
	}

	@Override
	public void deposit(double amount) {
		System.out.print("ENTER DEPOSIT AMOUNT :  ₹ ");
		amount = sc.nextDouble();
		double balance = serv.getBalance();
		if (amount > 0) {

			serv.setBalance(balance + amount);

			System.out.println("\nYOUR TRANSACTION IS COMPLETE");
			System.out.println("SHOW AVAILABLE BALANCE? \n \n1 YES    2 NO");

			String input = sc.next();

			switch (input) {
			case "1":

				System.out.println("CURRENT AVAILABLE BALANCE IS : ₹ " + serv.getBalance());

				break;

			case "2":

				System.out.println("YOUR SESSION ENDED");

				break;

			default:
				System.out.println("SESSION TERMINATED");
				break;
			}

		} else {
			System.out.println("INVALID AMOUNT; SESSION EXPIRED");

		}

	}

	@Override
	public void withdraw(double amount) {
		System.out.print("ENTER WITHDRAWL AMOUNT :  ₹ ");
		amount = sc.nextDouble();
		double avalBal = serv.getBalance();
		if (amount > 0 && amount <= avalBal) {

			serv.setBalance(avalBal - amount);

			System.out.println("YOUR TRANSACTION IS COMPLETE");
			System.out.println("\n SHOW AVAILABLE BALANCE? \n \n1 YES    2 NO");

			String input = sc.next();
			switch (input) {
			case "1":

				System.out.println("CURRENT BALANCE IS : ₹ " + serv.getBalance());

				break;

			case "2":

				System.out.println("YOUR SESSION ENDED");

				break;

			default:
				System.out.println("SESSION TERMINATED");
				break;

			}
		} else {
			System.out.println("INVALID AMOUNT [OR] INSUFFICIENT FUNDS");

		}

	}

}
