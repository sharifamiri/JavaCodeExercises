package day26;

import java.util.Arrays;

public class StringToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Spartan";
		int size = str.length(); //for String we put "()" at the end
		char[] myChars = new char[str.length()];
		
		
		
		for (int i = 0; i < myChars.length; i++) {
		//for (int i = 0; i < size; i++) { //str size and myChars size are the same
			myChars[i] = str.charAt(i);
		}
		System.out.println(Arrays.toString(myChars));
		
		//2ND WAY OF CONVERSION
		//toCharArray method is a method from string class
		//and it will take no external data when being called
		//and it will return array that have each char of String object
		
		
		char[] myChars2 = str.toCharArray();
		System.out.println(Arrays.toString(myChars2));
	}

}
