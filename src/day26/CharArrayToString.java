package day26;

import java.util.Arrays;

public class CharArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hayrulla Muattar";
		char[] nameChars = str.toCharArray();
		
		System.out.println(Arrays.toString(nameChars));
		String str1 = "";
		for (int i = 0; i < nameChars.length; i++) {
			char c =nameChars[i];
			//System.out.print(c+ " "); //it print: H a y r u l l a   M u a t t a r 
			str1=str1+c;
		}
		System.out.println(str1);
	}

}
