package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ForEachLoopTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//TASK 1

		
		String [] str = {"Cybertek", "Spartans", "Batch11"};
		
		System.out.println(Arrays.toString(str));
		System.out.println(str[0]);
		
		for(String eachStr: str) {
			System.out.println(eachStr);
		}
		//--------------------------------
		//--------------------------------
		//TASK 2
			    /*
	     * ask user a word turn that word into a charArray then print out using for each
	     * loop Cybertek --> C-y-b-e-r-t-e-k-
	     */

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a word");
		String word = s.next();
		
		char [] eachChar = word.toCharArray();
		
		for(char c1: eachChar) {
			System.out.print(c1+ " ");
		}
		System.out.println();
		
		//----------------------------
		/*
	     * ask user for a sentence split it to get each word use for each loop to print
	     * out each word
	     */
		String [] splitted = word.split("");
		for(String splittedStr: splitted) {
			System.out.print(splittedStr + "-");
		}
		s.nextLine();
		String sentence = s.nextLine();
		
		String [] eachSplitted = sentence.split(" ");
		for(String eachWord: eachSplitted) {
			System.out.println(eachWord);
		}
		
		//--------------------------------
	    /*
	     * Optional : use combine above two for each loop to finish our previous tasks
	     * 
	     */
		String word2 = "Break Time";
		
//		char [] wordChars = word2.toCharArray();
//		for(char c: wordChars) {
//			System.out.println(c+ "-");
//		}
		
		String [] eachSplitted2 = word2.split(" ");
		for(String eachWord: eachSplitted2) {
			//System.out.println(eachWord);
			
			char [] wordChars = eachWord.toCharArray();
			for(char c: wordChars) {
				System.out.print(c+ "-");
				
			}
			System.out.println();
		}
		

		
		
	}

}
