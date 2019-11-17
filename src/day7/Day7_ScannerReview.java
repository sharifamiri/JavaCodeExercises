package day7;

import java.util.Scanner;

public class Day7_ScannerReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		   System.out.println("Enter your name please: ");
		   
		   //String name = scan.nextLine();
		   String name = scan.next();
		   scan.nextLine(); //this is just to capture enter key 
		   
		   System.out.println("Enter your compnay please: ");

		   String company = scan.next();
		   //String company = scan.next();
		   
		   //it has to be a number otherwise it won't be picked up
		   System.out.println("Enter your age please: ");
		   int age = scan.nextInt();
		   
		   System.out.println("Hello Fellow coder " + name + ", you work at " + company
				   + " and your age is " + age);
		
		byte b = scan.nextByte();
		short s = scan.nextShort();
		long l = scan.nextLong();
		float f = scan.nextFloat();
		double d = scan.nextDouble();
		//char c = scan.nextChar(); //NO CHAR
		boolean bo = scan.nextBoolean();
		
		
		
	}

}
