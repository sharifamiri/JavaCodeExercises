package book;

import java.util.Scanner;

public class HW_ComparisonOperator {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("What kind of insurance are you looking for? Car or Health ");
		String Car = input.nextLine();
		
		//assume you choose Car
		System.out.println("What is your full name?");
		String fullname = input.nextLine();
		
		System.out.println("What is your age? ");
		int age = input.nextInt();
		boolean old = age>=25;
		boolean young = age<=17;
		if (old)
		{System.out.println("You are eligible for 20% discount ");
		}
		if (young)
		{System.out.println("Your not eligible for car insurance");}
		
		
		
	
		
	}
	}
