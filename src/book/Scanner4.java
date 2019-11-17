package book;

import java.util.Scanner;

public class Scanner4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
		
		//short cut for importing is Cmnd/Cntrl + SHIFT + O
		//ask user a questions
		System.out.println("Enter your name: ");
		//save user input into String
		String name = input.next();
		
	/*	System.out.println("Enter your age: ");
		//save user input into int
		int age = input.nextInt();
		
		
		System.out.println("Your name is: " + name + "\nYour age is: " + age);
	*/
	
	//Task2
	
		
		  System.out.println("Enter birth year: "); int birthYear = input.nextInt();
		  int age = 2019 - birthYear;
		  
		  System.out.println("Your name is: " + name);
		  System.out.println("Your age is: " + age);
		  
		  /*
		  System.out.println("Enter byte value: "); 
		  byte b1 = input.nextByte();
		  System.out.println("You have entered byte value: " + b1);
		  
		  System.out.println("Enter short value: "); 
		  short s1 = input.nextShort();
		  System.out.println("You have entered short value: " + s1);
		  
		  System.out.println("Enter float value: "); 
		  float f1 = input.nextFloat();
		  System.out.println("You have entered float value: " + f1);
		  */
		  
		  System.out.println("Are you hungry? "); 
		  boolean b1 = input.nextBoolean();
		  System.out.println("I am hungry " + b1);
		 
	}

}
