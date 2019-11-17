package day31;

import java.util.Scanner;

public class MethodWithTwoParameters {

	public static void main(String[] args) {
		
		//repeat("java", 5);
		repeat("java", 5);
		repeat("spartan", 20);
		
		//Below won't work
		//repeat();
		//repeat("spartan");
		//repeat("spartan", true, 123);
		
		//Scanner
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter word:");
		//String word = s.next();
		String str = s.next();
		
		System.out.println("Enter number:");
		int num = s.nextInt();
		
		//repeat(word, num);
		repeat(str, num);
		
		
	}
	
	public static void repeat(String word, int num) {
		for (int i = 1; i <=num; i++) {
			System.out.print(word+ " ");
		}
		System.out.println();
	}

}
