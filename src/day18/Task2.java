package day18;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		
		
		//AS LON AS I don't get 5 0r 10 I keep asking
		//we use &&
		int x = 0;
		
		while(!(x==5 ||x==10)) {
			System.out.println("ENTER");
			x = s.nextInt();
		}
		
		System.out.println("YAY GOOD JOB");
		
	}

}
