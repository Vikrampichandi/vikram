
	import java.io.IOException;
	import java.text.DecimalFormat;
	import java.util.HashMap;
	import java.util.Map.Entry;
	import java.util.Scanner;
	public class Working_place extends Accunt_informations{
		Scanner menuInput = new Scanner(System.in);
		DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

		HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
		public void getLogin() throws IOException {
			int x = 1;

			do {
				try {
				
					data.put(123456789, 1234);
					data.put(123456780, 1230);
					data.put(645332710, 3047);

					System.out.println("Welcome to the MOCHA BANK");

					System.out.print("Please enter Your Account Number: ");
					setCustomerNumber(menuInput.nextInt());

					System.out.print("Please enter Your Pin Number: ");
					setPinNumber(menuInput.nextInt());
				} catch (Exception e) {
					System.out.println("\n" + "Invalid character(s). Only numbers." + "\n");
					x = 2;
				}
				for (Entry<Integer, Integer> entry : data.entrySet()) {
					if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
						getAccountType();
					}
				}
				System.out.println("\n" + "Wrong Account Number or Pin Number." + "\n");
			} while (x == 1);
		}

		public void getAccountType() {
			System.out.println("Select your Account : ");
			System.out.println(" 1.Current Account");
			System.out.println(" 2.Saving Account");
			System.out.println(" 3.Exit");
			System.out.print("Choice: ");

			selection = menuInput.nextInt();

			switch (selection) {
			case 1:
				getChecking();
				break;

			case 2:
				getSaving();
				break;

			case 3:
				System.out.println("Thank You for using this ATM .....Come again 🙏");
				break;

			default:
				System.out.println("\n" + "Invalid Choice." + "\n");
				getAccountType();
			}
		}
		public void getChecking() {
			System.out.println("Current Account: ");
			System.out.println("1.Check Balance");
			System.out.println("2.Withdrawal");
			System.out.println("3.Deposit");
			System.out.println("4.Exit");
			System.out.print("Choice: ");

			selection = menuInput.nextInt();

			switch (selection) {
			case 1:
				System.out.println("Current Account Balance: " + moneyFormat.format(getCheckingBalance()) + "\n");
				getAccountType();
				break;

			case 2:
				getCheckingWithdrawInput();
				getAccountType();
				break;

			case 3:
				getCheckingDepositInput();
				getAccountType();
				break;

			case 4:
				System.out.println("Thank You for using this ATM .....Come again 🙏");
				break;

			default:
				System.out.println("\n" + "Invalid choice." + "\n");
				getChecking();
			}
		}
		public void getSaving() {
			System.out.println("Saving Account: ");
			System.out.println("1.Balance");
			System.out.println("2.Withdrawal");
			System.out.println("3.Deposit");
			System.out.println("4.Exit");
			System.out.print("Choice: ");

			selection = menuInput.nextInt();

			switch (selection) {
			case 1:
				System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()) + "\n");
				getAccountType();
				break;

			case 2:
				getSavingWithdrawInput();
				getAccountType();
				break;

			case 3:
				getSavingDepositInput();
				getAccountType();
				break;

			case 4:
				System.out.println("Thank You for using this ATM .....Come again 🙏");
				break;

			default:
				System.out.println("\n" + "Invalid choice." + "\n");
				getSaving();
			}
		}

		int selection;
	}


