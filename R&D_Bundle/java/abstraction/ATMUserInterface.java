package abstraction;

import java.util.Scanner;

public class ATMUserInterface implements Bank {

	private double balance;
	//= 1000.00;
	Scanner sc = new Scanner(System.in);

	@Override
	public double checkBalance() {

		return balance;
	}

	@Override
	public void deposit(double amount) {

		System.out.print("ENTER DEPOSIT AMOUNT :  ₹ ");
		amount = sc.nextDouble();
		if (amount > 0) {

			balance += amount;

			System.out.println("YOUR TRANSACTION IS COMPLETE");
			System.out.println("SHOW AVAILABLE BALANCE? \n YES/NO");

			String input = sc.next().toUpperCase();

			switch (input) {
			case "YES":

				System.out.println("CURRENT AVAILABLE BALANCE IS : ₹ " + balance);

				break;

			case "NO":

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
		if (amount > 0 && amount <= balance) {

			balance -= amount;

			System.out.println("YOUR TRANSACTION IS COMPLETE");
			System.out.println("\n SHOW AVAILABLE BALANCE? \n YES/NO");

			String input = sc.next().toUpperCase();
			switch (input) {
			case "YES":

				System.out.println("CURRENT BALANCE IS : ₹ " + balance);

				break;

			case "NO":

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
