package abstraction;

import java.util.Scanner;

public class ATMProgram {

	public static void main(String[] args) {

		while (true) {
			Scanner sc = new Scanner(System.in);
			Bank defaultAC = new ATMUserInterface();

			System.out.println("********* WELCOME TO BASIC ATM PROGRAM WITH A DEFAULT ACCOUNT *********");
			System.out.println("CURRENT AVAILABLE BALANCE IS : ₹" + defaultAC.checkBalance());

			System.out.println(" SELECT AN OPTION BY ENTERING THE CORRESPONDING NUMBER ");
			System.out.println("\n1 DEPOSIT \n2 WITHDRAWL \n3 CHECK BALANCE \n4 EXIT \n");

			int num = sc.nextInt();

			switch (num) {
			case 1:
				defaultAC.deposit(0);

				break;

			case 2:
				defaultAC.withdraw(0);

				break;

			case 3:
				System.out.print("AVAILABLE BALANCE IN DEFAULT ACCOUNT IS : ₹ ");
				System.out.print(defaultAC.checkBalance());

				break;

			case 4:

				System.out.println("TRANSACTION CANCELLED");
//			sc.close();
//			System.exit(0);

				break;

			default:
				System.out.println("INVALID CHOICE; SESSION TERMINATED");
//			System.exit(1);
				break;
			}

			System.out.println("\n\n REDIRECTING TO MAIN PAGE.... \n");
			System.out.println("\n REDIRECTING TO MAIN PAGE.... \n");
			System.out.println("\n REDIRECTING TO MAIN PAGE.... \n");
		}
	}

}
