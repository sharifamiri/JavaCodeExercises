package day18;

import java.util.Scanner;

public class SayILoveJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String theAnswer = "";
		
		//we need "!" to enter LOOP
		
		while(!theAnswer.equalsIgnoreCase("yes")) {
			System.out.println("Do you love JAVA?");
			theAnswer = s.next();
		}
		
		System.out.println("Finally, CORRECT");
		
		
	}

}
