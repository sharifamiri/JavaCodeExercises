package day40;

public class BankAccount {

	//2 instance variables / fields
	//it has default access modifier
		//Accessible in same class and package
	public double balance;
	String accountHolder;
	
	
	public void showAccountHolder() {
		System.out.println("Account holder name is: " + accountHolder);
		
	}
	public void showBalance() {
		System.out.println("Account balance: " + balance);
		
	}
	public void deposit(double amount) {
		balance = balance+amount;
		
	}
	public void withraw(double amount) {
		balance = balance-amount;
		
	}
	//this one now has default access modifier
	 void add100Dolars() {
		balance = balance+100;
		
	}
	public void printInfo() {
		System.out.println("Customer: " + accountHolder + ", Balance: "+balance+ "$");
		
	}
	
	
	
}
