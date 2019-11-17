package day20;

import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name = scan.next();
		String fUp = name.substring(0, 1).toUpperCase();
		String expected = fUp + name.substring(1);
		
		System.out.println(expected);
		
		
		//WHILE:
//		while (!(name.equals("abc") && pass.equals("123")));{
//			System.out.println("Enter username: ");
//			name = scan.next();
//			System.out.println("Enter password: ");
//			pass = scan.next();
//		}
//		System.out.println("END");

	}

}
