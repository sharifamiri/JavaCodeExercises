package day20;

import java.util.Scanner;

public class WarmUp20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * while(some condition is true){
		 * 	action to be repeated
		 * }
		 * 
		 * do{
		 * 	action to be repeated
		 * }while(some condition is true)
		 * 
		 * 
		 */
			Scanner scan = new Scanner(System.in);
			
			String name = "abc";
			String pass = "123";
			
			//WHILE:
			while (!(name.equals("abc") && pass.equals("123")));{
				System.out.println("Enter username: ");
				name = scan.next();
				System.out.println("Enter password: ");
				pass = scan.next();
			}
			System.out.println("END");
			
			//DO WHILE:
//			do {
//				System.out.println("Enter username: ");
//				name = scan.next();
//				System.out.println("Enter password: ");
//				pass = scan.next();
//			} while (!(name.equals("abc") && pass.equals("123")));
//				
//			System.out.println("END");
	}

}
