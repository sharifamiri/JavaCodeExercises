package day26;

import java.util.Arrays;

public class SplittingTheStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Java is fun";
		
		String [] words = str.split(" ");
		
		System.out.println(Arrays.toString(words));
		
		String str1 = "Java is fun, java is    challenging";
		
		//String [] words1 = str1.split("\\s+");
		//String [] words1 = str1.split(" +");
		String [] words1 = str1.trim().split(" ");
		
		System.out.println(Arrays.toString(words1));
		
		
	}

}
