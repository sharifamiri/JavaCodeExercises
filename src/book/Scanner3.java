package book;

import java.util.Scanner;

public class Scanner3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your mood today : ");
		String mood = input.next();
		input.nextLine();
		
		
		System.out.println("Enter your location today: ");
		
		String location = input.nextLine();
		System.out.println("Your location is: "+ location);
		System.out.println("Your mood today is: " + mood);
		
		input.close();
		
	}

}
