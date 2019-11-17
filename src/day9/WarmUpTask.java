package day9;

import java.util.Scanner;

public class WarmUpTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to Math Library");
		System.out.println("Print two integers");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		int sum = number1 + number2;

		if((sum)>100) {
			System.out.println("You entered great numbers");
		}else {
			System.out.println("Looks like your sum is less than 100");
		}
		
		//{} -- curly braces
		//[] -- square bracket
		//() -- parentheses 
		
		//Logical Operators &&, &, ||, |, !
		//&& --> AND it will not evaluate right hand side if left side is alredy fales
		//& --> AND it will check both sides of operation
		//|| --> OR it will only evaluate right hand side if left hand side is false
		//| --> OR it will evaluate both sides
		//! --> Logical
		
	}

}

