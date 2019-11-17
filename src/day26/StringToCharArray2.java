package day26;

import java.util.Arrays;
import java.util.Scanner;

public class StringToCharArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Task 2
		Scanner s = new Scanner(System.in);
		
		//2ND WAY
		System.out.println("Enter Your Name:");
		String name = s.next();
		
		System.out.println("Enter Ychar to count:");
		String userCharStr = s.next();
		char charToLookFor = userCharStr.charAt(0);
		
		char [] nameChar = name.toCharArray();
		System.out.println(Arrays.toString(nameChar));
		
		int counter =0;
		for (int i = 0; i < nameChar.length; i++) {
			if(nameChar[i] == charToLookFor)
			counter++;
		}
		System.out.println("The count is: " + counter);
		
		//1ST WAY
//		System.out.println("Enter Your Name:");
//		String name = s.next();
//		
//		char [] myChar = name.toCharArray();
//		System.out.println(Arrays.toString(myChar));
//		
//		int counter =0;
//		for (int i = 0; i < myChar.length; i++) {
//			if(myChar[i] =='a')
//			counter++;
//		}
//		System.out.println("The count is: " + counter);
		


	}

}
