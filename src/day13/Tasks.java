package day13;

import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter 1st name;");
		String name1 = s.next();
		
		System.out.println("Enter 2nd name;");
		String name2 = s.next();
		
		
		boolean b1 = name1.equalsIgnoreCase(name2);
		
		System.out.println("Is it the same? " + b1);
		
		int count1 = name1.length();
		int count2 = name2.length();
		
		if(name1.length()>name2.length()) {
			System.out.println(name1.charAt(1));
		}else {
			System.out.println(name2.charAt(2));
		}
		
		System.out.println((name1.length()>name2.length())? name1.charAt(1): name2.charAt(2));
		
		char c1 = name2.charAt(name2.length()-1);
		
		switch(c1) {
		case 'a':
			System.out.println("name ended with a");
			break;
		case 'b':
			System.out.println("name ended with b");
			break;
		case 'c':
			System.out.println("name ended with c");
			break;
		default:
			System.out.println("did not get abc");
		}
		
	}

}
