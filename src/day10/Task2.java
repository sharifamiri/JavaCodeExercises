package day10;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.println("Welcome Amazon shopper");
		
		System.out.println("Enter price");
		double usersPrice = s.nextDouble();
		System.out.println("Prime member?");
		boolean isPrimeMember = s.nextBoolean();
		
		
		if(isPrimeMember) {
			System.out.println("free shipping: " + usersPrice);
		}else if(usersPrice>35) {
			System.out.println("free shipping: " + usersPrice);
		}else {
			System.out.println("Add $5 shipping: " + usersPrice + " +$5");
		}
	}

}
