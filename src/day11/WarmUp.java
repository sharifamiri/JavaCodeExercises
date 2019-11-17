package day11;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Task 1
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter a number:");
		int number = s.nextInt();
		
		if (number%3==0 && number%5==0) {
			System.out.println("FIZZ BUZZ");
		}else if(number%3==0) {
			System.out.println("BUZZ");
		}else if (number%5==0 ) {
			System.out.println("FIZZ");
		}else {
			System.out.println("Invalid Number");
		}
		
	}

}
