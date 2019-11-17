package day19;

import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ask user a word
		//for example Bilal --> B-i-l-a-l
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Enter a word");
//		String str = scan.next();
		
		String str = "Bilal";
//		//System.out.println();
//		System.out.print(str.charAt(0)+"-");
//		System.out.print(str.charAt(1)+"-");
//		System.out.print(str.charAt(2)+"-");
//		System.out.print(str.charAt(3)+"-");
//		System.out.print(str.charAt(4)+"");
		
		int x = 0;
		while(x<5) {
			
			System.out.print(str.charAt(x) + "-");
			x++; //++x;-->same
		}	
		System.out.println("Enter a name");
		String name = scan.nextLine();
		int y = 0;
		while(y<name.length()) {
				
			System.out.print(str.charAt(y) + "-");
			y++; //++x;-->same
		}
	}

}
