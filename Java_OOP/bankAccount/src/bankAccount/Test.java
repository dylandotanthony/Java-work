package bankAccount;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount ZankousAccount = new BankAccount();
		ZankousAccount.depositMoney(425, "checking");
		ZankousAccount.withdrawMoney(125, "checking");
		ZankousAccount.depositMoney(1400, "savings");
		ZankousAccount.withdrawMoney(400, "savings");
		
		
		BankAccount BuddysAccount = new BankAccount();
		BuddysAccount.depositMoney(500, "checking");
		BuddysAccount.withdrawMoney(125, "checking");
		BuddysAccount.depositMoney(100, "savings");
		BuddysAccount.withdrawMoney(50, "savings");
		
		
		System.out.println(ZankousAccount.getCheckingBalance());
		
		ZankousAccount.displayAccountBalance();
		BuddysAccount.displayAccountBalance();
		
		System.out.println(BankAccount.totalMoney);
		System.out.println(BankAccount.numOfAccounts);
		
		
	}

}
