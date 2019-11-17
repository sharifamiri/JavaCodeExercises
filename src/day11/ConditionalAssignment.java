package day11;

import java.util.Scanner;

public class ConditionalAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String result;
		 
		
		System.out.println("Enetr number");
		int score = s.nextInt();
		
		if(score>75)
			result = "pass";
		else
			result = "fail";
		
		System.out.println("result is " + result);
	}

}
