package day10;

import java.util.Scanner;

public class VariableAssignmentBeforeUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		//local variables must be assigned to a value before usage
		//if local variable has a single chance 
		//to not get a value before usage,
		//compiler will not compile the code
		
		int i=0;
		
		System.out.println("Do you want to give value to i?");
		String yesNo = s.next();
		
		//if(yesNo.equals("yes")) {
		if(yesNo.equalsIgnoreCase("yes")) {   //it will ignore if it is uppercar or lowercase
		
			System.out.println("YOU SAID YES");
			System.out.println("Enter your number");
			i=s.nextInt();
			
		}else {
			System.out.println("YOU SAID NO");
		}
		
		System.out.println("The value of i: " + i);
	}

}
