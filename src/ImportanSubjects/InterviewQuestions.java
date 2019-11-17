package ImportanSubjects;

public class InterviewQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Early warm up tasks from what we already learned in class---
		1, write a program to reverse a string
		2, write a program to find all occurrence of certain character or word
		3, write a program to count all occurrence of certain character or word
		4, write a program to get the sum of numbers from 1 to a number user specified
		5, write a program to extract lowercase letter from a given String — a1b2c3 --> abc
		6, write a program to get unique characters from a string  : aaabbccc —> abc
 * 
 */
		
		//Q6:
		String str = "aaabbccc";
		
		String uniqueStr = "";
		
		for (int i = 0; i < str.length(); i++) {
			String eachChar = str.substring(i, i+1);
			
			if(!uniqueStr.contains(eachChar)) {
				uniqueStr+=eachChar;
				//System.out.print(eachChar);
			}
		}
		
		System.out.print(uniqueStr);
		
		System.out.println();
		
		//Q1:
		String name = "Goksel";
		
		String reversed = "";
		
		for (int i = name.length()-1; i>=0; i--) {
			reversed+=name.charAt(i);
			System.out.print(name.substring(i, i+1));
		}
		System.out.println(); //seperator
		System.out.print(reversed);
		System.out.println();
		
		//Q5:
		String sentence = "5 Little Monkey Jumping on The Bed";
		String lowerCases = "";
//		char eachCh = 'h';
//		System.out.println(eachCh>='a');
//		System.out.println(eachCh<='z');
//		
//		if(eachCh>='a' && eachCh<='z') {
//			System.out.println("LOWERCASE!!");
//		}
		
		for (int i = 0; i < sentence.length(); i++) {
			/// storing each character inside variable each
		      // each iteration it will store that char 
			char each = sentence.charAt(i);
			// checking whether this character at this iteration 
		      // is within the range of a-z
			if(each>='a' && each<= 'z') {
				lowerCases+= each;
				//System.out.println("LOWERCASE: " + each);
				// add on top of each other
		        //System.out.println("IT'S lowercase : " + each );
			}
		}
		System.out.print(lowerCases);
	}

}
