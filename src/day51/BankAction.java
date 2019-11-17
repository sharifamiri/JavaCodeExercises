package day51;

public class BankAction {

	public static void main(String[] args) {
		

		BankAccount b1 = new BankAccount("Checking", 12345678l, 10235.67);
		
		System.out.println(b1);
		
		SavingAccount s1 = new SavingAccount("Checking", 12345678l, 10235.67, 2.1);
		
		s1.deposit(10);
		System.out.println(s1);
		
		s1.withraw(12345);
		System.out.println(s1);

	}

}
