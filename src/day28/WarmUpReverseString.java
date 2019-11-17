package day28;

import java.util.Arrays;

public class WarmUpReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    // Reverse above sentence to generate below  
		// Optional : reverse word + reverse each char of the words
		
		String str = "Sunday Perfect Day to start coding";
		
		String [] reverseStr = str.split(" ");
		
		//1ST WAY
		System.out.println(Arrays.toString(reverseStr));
		String store [] = new String[reverseStr.length];
		for (int i = 0; i < reverseStr.length; i++) {
			store[i]=reverseStr[reverseStr.length-1-i];
		}
		System.out.print(Arrays.toString(store));
		//--------------------------------------
		//This one would only print words without Array type
//		for (int i = 0; i < reverseStr.length; i++) {
//			System.out.print(reverseStr[reverseStr.length-1-i] + " ");
//		}
		//--------------------------------------
		System.out.println();
		
		
		//2ND WAY
		for (int i = 0; i < reverseStr.length/2; i++) {
			String temp = reverseStr[i];
			reverseStr[i]=reverseStr[reverseStr.length-1-i];
			reverseStr[reverseStr.length-1-i]=temp;
		}
		System.out.println(Arrays.toString(reverseStr));
		
		//--------------------------------------
		String str1 = "Sunday Perfect Day to start coding";
		
		String [] reverseStr1 = str.split(" ");
		String store1 = "";
		for (int i = 0; i < reverseStr1.length; i++) {
			char []c1 = reverseStr1[i].toCharArray();
			for (int j = 0; j < c1.length/2; j++) {
				char temp = c1[j];
				c1[j]=c1[c1.length-1-j];
				c1[c1.length-1-j]=temp;
				
			}
			System.out.println(Arrays.toString(c1));
			String reverse = new String(c1);
			store1+=reverse+" ";
		}
		
		System.out.println(store1);
		String [] splt2 = store1.split(" ");
		System.out.println(Arrays.toString(splt2));
		
		
		
		//--------------------------------------
		//REVERSE
//		String []fruit = {"Apple"};
//		String fruit2 = "";
//		for (int i = 1; i <= fruit[0].length(); i++) {
//			fruit2+=""+fruit[0].charAt(fruit[0].length()-i);
//			
//		}
//		System.out.print(fruit2);
//		String []fruit3 = {fruit2};
//		
//		System.out.println();
//		
//		System.out.println(Arrays.toString(fruit3));
//		
		//--------------------------------------
		

		
		
	}
}
