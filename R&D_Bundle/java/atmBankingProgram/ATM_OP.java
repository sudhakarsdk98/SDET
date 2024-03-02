package atmBankingProgram;

import java.util.Scanner;

public class ATM_OP {

	public static void main(String[] args) {

		while (true) {

			Scanner sc = new Scanner(System.in);

			ATM_UI ao = new ATM_Serv();

			System.out.println("********* WELCOME TO BASIC ATM PROGRAM WITH A DEFAULT ACCOUNT *********"
					+ "\n LOGIN TO CONTINUE . . . ."
					+ "\n DEMO CREDENTIALS 9848022338,1005");

			boolean login = ao.login(null, null);

			if (login == true) {

				System.out.println("CURRENT AVAILABLE BALANCE IS : ₹" + ao.checkBalance());

			System.out.println("\n SELECT AN OPTION BY ENTERING THE CORRESPONDING NUMBER ");
			System.out.println("\n1 DEPOSIT				2 WITHDRAWL \n\n3 CHECK BALANCE 			4 EXIT \n");

			String num = sc.next();
			

			switch (num) {
			case "1":
				ao.deposit(0);
				;

				break;

			case "2":
				ao.withdraw(0);

				break;

			case "3":
				System.out.print("AVAILABLE BALANCE IN DEFAULT ACCOUNT IS : ₹ ");
				System.out.print(ao.checkBalance());

				break;

			case "4":

				System.out.println("TRANSACTION CANCELLED");
//			sc.close();
//			System.exit(0);

				break;

			default:
				System.out.println("INVALID CHOICE; SESSION TERMINATED");
//			System.exit(1);
				break;
			}

			System.out.println("\n\n REDIRECTING TO MAIN PAGE.... \n **********/////\\\\\\\\********** \n\n");
		}else {
			
			System.out.println("REDIRECTING TO HOME PAGE --> -->"
					+ "\n		 -->"
					+ "\n		 -->"
					+ "\n		 --> ");
		}
		}

	}

}
