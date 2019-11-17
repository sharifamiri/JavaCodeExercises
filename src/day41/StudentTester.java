package day41;

import day40.BankAccount;

public class StudentTester {

	public static void main(String[] args) {
		
		Student sharif = new Student();
		sharif.name = "Sharif";
		sharif.age = 31;
		sharif.ssn = 12345678;
		
		sharif.displayName();
		//sharif.displayNameAndAge();
		//sharif.showSSN();
		
		BankAccount acc1 = new BankAccount();
		
		//System.out.println(acc1.accountHolder);
		System.out.println(acc1.balance);
		//acc1.add100Dolars();

		
	}

}
