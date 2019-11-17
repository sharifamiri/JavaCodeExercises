package day18;

import java.util.Scanner;

public class GiveMeFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int x = 0;
		System.out.println();
		
		while(x!=5) {
			System.out.println("GIVE ME 5");
			x=scan.nextInt();
		}
		
		System.out.println("YAY GOOD JOB");
	}

}
