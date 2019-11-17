package day19;

import java.util.Scanner;

public class ReverseStringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    /// USING ABOVE CODE --> CREATE A PROGRAM 
	    // TO CHECK WHETHER A WORD IS PALINDROM 
	    //    ANA --> REVERSE -- ANA
	    //    CIVIC --> REVERSE -- CIVIC

	    
	    // in order to reverse a String 
	    // we can start getting the chars in reversed order 
	    // by using charAt method 
	    // since the order is decrementing , we use -- 
	    // in order to save the reversed word, we need a container
	    // before we reverse the word , just put empty value in container
	    // while we looping through each chars , 
	    // concatenate this character to the variable value 
	    // after the loop we will have the word stored in reversed order
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a name");
		
		String name = scan.nextLine();
		
//		int y = 1;
//		int count = name.length();
//		String s1 ="";
//		while(y<=count) {
//		//while(count>0) {
//			s1 = name.charAt(count-y) + "";
//			System.out.print(s1);
//			y++; 
//		}
		
		
		int count = name.length();
		String reverse = "";
		while(count>0) {
			System.out.println("Reverse BEFORE: " + reverse);
			count--;
			reverse = reverse + name.charAt(count);
			
			System.out.println("Reverse AFTER: " + reverse);
			//reverse+=name.charAt(count);
			//System.out.print(reverse);
		}
		
		//1st way for Palindrome;
		System.out.println("PALINDROME: " + name.equals(reverse));
		
		
		//2nd way for Palindrome
//		if (count > 0) {
//		     int x1 = 0;
//		     int x2 = count-1;
//		     while (x1 < x2) {
//		          if (name.charAt(x1) == name.charAt(x2)) {
//		               x1++;
//		               x2--;
//		 System.out.println("Palindrome");
//		}
//		}
		
		
		//palindrom is when you reverse, it is still the same
			//ANA, CIVIC
		
	}

}
