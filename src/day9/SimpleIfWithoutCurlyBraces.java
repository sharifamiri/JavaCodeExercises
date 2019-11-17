package day9;

import java.util.Scanner;

public class SimpleIfWithoutCurlyBraces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		int x = 10;
		System.out.println("Enter number");
		x = s.nextInt();

		/*
		 * boolean b = false; () inside here, you can put boolean literal: true or false
		 * boolean variable: b boolean expression: any operation that result in boolean
		 * 
		 * 
		 */
		// Curly braces for if and else blocks are optional
		// ONLY WHEN WE HAVE SINGLE STATEMENT
		// COMMAND + SHIFT + F --> checking 
		//COMMAND + SHIFT O --> It will take out what we brought
		if (x != 10)
			System.out.println("NOT 10!");

		else { // if we don't use braces, it will only take one statement
			System.out.println("YEST IT IS 10!");
			System.out.println("YEST IT IS 10! as I said");
		}
	}

}
