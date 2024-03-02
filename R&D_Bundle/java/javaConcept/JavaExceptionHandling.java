package javaConcept;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class JavaExceptionHandling {

	private static double balance;

	static void deposit(int amount) {

		if (amount > 0) {
			balance = amount;

			System.out.println("Deposit successfull . . . Current available balance is : " + balance);
		} 
		else {
			System.out.println("Enter valid deposit amount");
			throw new InputMismatchException("Invalid values Input"); 
		}
	}

	static void withDrawl(int amount) {

		if (amount > 0 && amount <= balance) {
			balance -= amount;

			System.out.println("Withdrawl complete . . . Current available balance : " + balance);
		}
		else {
			throw new IllegalArgumentException("Only Numerical values allowed; Enter valid withdrawl amount");
		}
	}

	static double checkBalance() {
		System.out.println("Available balance is : " + balance);
		return balance;
	}

}

class JavaException extends JavaExceptionHandling {
	public static void main(String[] args) throws NoSuchElementException {

		while (true) {
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter deposit amount : ");
			try {
				deposit(sc.nextInt());

			}
			catch (Exception err) {

			}
			finally {

				checkBalance();

			}
			
			System.out.print("Enter withdrawl amount : ");
			withDrawl(sc.nextInt());
		}

	}
}
