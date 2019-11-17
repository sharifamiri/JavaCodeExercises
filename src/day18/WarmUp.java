package day18;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long x = 10;
		long y = 15;
		
		System.out.println(x==y);
		
		Scanner scan1 = new Scanner(System.in);
		//scna1 is a variable / container that can hold 
			//the address of any single scanner object
			//the reference / pointer of any single scanner object
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = scan2;
		
		System.out.println(scan1==scan2);
		
		String s1 = "literal";
		String s2 = new String("literal");
		String s3 = "literal";
		String s4 = "cat";
		
		// since "literral" already exists in the pool
				// it will not create new object and it will just 
				// point to existing object 
				//new goes to heap and cat and literal go to pool
		
		System.out.println(s1.equals(s2)); //treu --> bec checking content
		System.out.println(s1==s2); //false --> bec checking location & they have different location
		System.out.println(s1==s3); //true --> bec checking location & they have same location
		
		System.out.println(scan2==scan3); //true--> bec two leash pointing to same object
		
		
		
		
		
		
	}

}
