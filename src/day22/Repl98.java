package day22;

import java.util.Scanner;

public class Repl98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
		 int inhabitants = scan.nextInt();
		for (int i = 0; inhabitants>0; i++) {
		
			System.out.println("Day " + i + " [" + inhabitants + "]");
			inhabitants/=2;
			
		}
		System.out.println("---- EXTINCT ----");
	}

}
