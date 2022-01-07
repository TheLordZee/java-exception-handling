package hcl.exception;

public class Account {
	private double balance;
	public Account(double startingBalance) {
		balance = startingBalance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount){
		if(amount <= balance) {
			balance -= amount;
		} else {
			throw new InsufficentBalanceException("Insufficent balance! Balance: $" + balance + " Amount: $" + amount);
		}
	}
}
