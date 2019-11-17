package book;

import java.util.Scanner;

public class Scanner_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter your name: ");
		
		String name = input.next();
		
		System.out.println("Your name is " + name);
		
		System.out.println("Enter your city: ");
		
		String city = input.next();
		
		System.out.println("Your city is " + city);
		
		System.out.println("Enter your state: ");
		
		String state = input.next();
		
		System.out.println("Your state is: " + state);
		
		System.out.println("Enter your nationality: ");
		
		String nationality = input.next();
		
		System.out.println("Your nationality is " + nationality);
		
		System.out.println("Your are " + name + " from " + city + ", " + state 
				                       + ". Your nationality is " + nationality + ".");

	   
		
		
		
		
		
		
		
		
	}

}
