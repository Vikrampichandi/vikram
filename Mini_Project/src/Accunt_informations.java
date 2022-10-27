

	import java.text.DecimalFormat;
	import java.util.Scanner;

	public class Accunt_informations{
		Scanner input = new Scanner(System.in);
		DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
		
		public int setCustomerNumber(int customerNumber) {
			this.AccountNumber = customerNumber;
			return customerNumber;
		}
		public int getCustomerNumber() {
			return AccountNumber;
		}
		public int setPinNumber(int pinNumber) {
			this.pinNumber = pinNumber;
			return pinNumber;
		}
		public int getPinNumber() {
			return pinNumber;
		}
		public double getCheckingBalance() {
			return currentBalance;
		}
		public double getSavingBalance() {
			return savingBalance;
		}
		public double calcCheckingWithdraw(double amount) {
			currentBalance = (currentBalance - amount);
			return currentBalance;
		}
		public double calcSavingWithdraw(double amount) {
			savingBalance = (savingBalance - amount);
			return savingBalance;
		}
		public double calcCheckingDeposit(double amount) {
			currentBalance = (currentBalance + amount);
			return currentBalance;
		}
		public double calcSavingDeposit(double amount) {
			savingBalance = (savingBalance + amount);
			return savingBalance;
		}
		public void getCheckingWithdrawInput() {
			System.out.println("Checking Account Balance: " + moneyFormat.format(currentBalance));
			System.out.print("Amount you want to withdraw from Current Account: ");
			double amount = input.nextDouble();

			if ((currentBalance - amount) >= 0) {
				calcCheckingWithdraw(amount);
				System.out.println("New Current Account balance: " + moneyFormat.format(currentBalance) + "\n");
			} else {
				System.out.println("Insufficent fund" + "\n");
			}
		}
		public void getSavingWithdrawInput() {
			System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
			System.out.print("Amount you want to withdraw from Saving Account: ");
			double amount = input.nextDouble();

			if ((savingBalance - amount) >= 0) {
				calcSavingWithdraw(amount);
				System.out.println("New Saving Account balance: " + savingBalance + "\n");
			} else {
				System.out.println("No available Balance" + "\n");
			}
		}
		public void getCheckingDepositInput() {
			System.out.println("Current Account Balance: " + moneyFormat.format(currentBalance));
			System.out.print("Amount you want to deposit from Current Account: ");
			double amount = input.nextDouble();

			if ((currentBalance + amount) >= 0) {
				calcCheckingDeposit(amount);
				System.out.println("New Current Account balance: " + moneyFormat.format(currentBalance) + "\n");
			} else {
				System.out.println("No available Balance." + "\n");
			}
		}
		public void getSavingDepositInput() {
			System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
			System.out.print("Amount you want to deposit from Saving Account: ");
			double amount = input.nextDouble();

			if ((savingBalance + amount) >= 0) {
				calcSavingDeposit(amount);
				System.out.println("New Saving Account balance: " + moneyFormat.format(savingBalance) + "\n");
			} else {
				System.out.println("No available Balance" + "\n");
			}
		}

		private int AccountNumber ;
		private int pinNumber ;
		private double currentBalance = 0;
		private double savingBalance = 0;
	}


