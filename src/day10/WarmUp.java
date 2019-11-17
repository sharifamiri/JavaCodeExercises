package day10;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		long accountNumber = 123456;
		String password = "abc123";
		
		
		System.out.println("Welcome to Cybertek Banking App");
		System.out.println("Enter account number");
		accountNumber = s.nextLong();
		
		System.out.println("Enter password");
		password = s.next();
		
	    /// in order to check primitive type equality 
        //you should always use ==
		// for String you should always use .equals method 
    
		// if you have single line of statement under your if or else 
		// curly braces are optional 
		if(accountNumber==123456 && password.equals("abc123")) {
			System.out.println("Success!!");
		}else {
			System.out.println("Login Fail!!");
		}
		
		
	}

}
