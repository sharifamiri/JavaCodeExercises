package day18;

import java.util.Scanner;

public class WhileLoopMultipleCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter:");
		int num = scan.nextInt();
		int x = 1;
		while(x<=num) {
			
			System.out.print(x + " ");
			x++;
		}
		System.out.println();
		System.out.print("THE");
		System.out.println(" END");
		
//		int y = 1;
//		while(x<=10) {
//			System.out.print(x++ + " ");
//		}
	}

}
