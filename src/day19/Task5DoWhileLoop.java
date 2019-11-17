package day19;

import java.util.Scanner;

public class Task5DoWhileLoop {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is the target");
		int target = scan.nextInt();
		//target=5;
		
		
		int y = 1;
		
		do {
			System.out.print(y++ + " ");
			
		} while (y<=target);
		
		//if increment by 2;
//		do {
//			System.out.print(y + " ");
//		    y+=2
//		} while (y<=target);
		
		
		System.out.println();
		
		System.out.println("y value: " + y);
		
			do {
				
				System.out.print(--y + " ");
			} while (y>1);
	}

}
