package day33;

import java.util.Scanner;

public class ReturnKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		
		int num = scan.nextInt();
		
		if(num<0) {
			return;
		}
		//once return keyword reached, method ends
		
		System.out.println("Complex statement");
		
	}

}
