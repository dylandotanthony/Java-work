package bankAccount;

public class BankAccount {

	private double checkingBalance;
	private double savingBalance;

	public static int numOfAccounts = 0;
	public static double totalMoney = 0.00;
	
	
	public BankAccount() {
		this.checkingBalance = 0.00;
		this.savingBalance = 0.00;
		BankAccount.numOfAccounts +=1;
	}
		
		
	// Getter
	
	public double getCheckingBalance() {
		return this.checkingBalance;
	}
		
	public double getSavingBalance() {
		return this.savingBalance;
	}
		
	public void depositMoney(double amount, String account) {
		// Increment The Balance 
		if(account == "checking") {
			this.checkingBalance += amount;
		}else {
			this.savingBalance += amount;
		}
		
		// Increment totalMoney
		BankAccount.totalMoney += amount;
	}
	
	public void withdrawMoney(double amount, String account) {
		// Decrease The Balance 
		if(account == "checking") {
			this.checkingBalance -= amount;
		}else {
			this.savingBalance -= amount;
		}
		
		// Increment totalMoney
		BankAccount.totalMoney -= amount;
	}
	
	public void displayAccountBalance() {
		System.out.printf("Checking: $ %s, Savings: $ %s\n", this.checkingBalance, this.savingBalance);
	}
	
	public void displayTotalMoney() {
		System.out.printf("Bank of Dylan Total Cash: $ %s,", BankAccount.totalMoney);
	}
	
}
