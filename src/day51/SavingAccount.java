package day51;

public class SavingAccount extends BankAccount {

	double returnRate;

	public SavingAccount(String accountName, 
			long accountNumber, double balance, double returnRate) {
		super(accountName, accountNumber, balance);
		
		this.returnRate = returnRate;
		
	}
	
	@Override
	public String toString() {
		return "BankAccount [accountName=" + accountName 
				+ ", accountNumber=" + accountNumber + ", balance=" + balance
				+ ", returnRate=" + returnRate+"]";
	}
	
	@Override
	public void deposit(int num) {
		
		//this.balance+=num+100;
		
		super.deposit(num+100);
		super.withraw(5); //adding 100 and taking 5
	}
	
	@Override
	public void withraw(int num) {
		//this.balance-=num-10;
		super.withraw(num-10);
		
	}
	
	
	
}
