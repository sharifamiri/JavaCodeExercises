package book;

import java.util.Scanner;

public class ComparisonOperators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating scanner object
        Scanner input = new Scanner(System.in);
		
		//ask user a questions
		System.out.println("Enter number 1:  ");
		int num1 = input.nextInt();
		System.out.println("Enter number 2:  ");
		int num2 = input.nextInt();
		
		boolean isGreater = num1>num2;
		
		System.out.println("Is number1 greater than number 2: " + isGreater);
		
	}

}
