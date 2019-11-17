package day19;

import java.util.Scanner;

public class Task2FindLastCharacterStartsWithUpperCaseIMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    // CREATE A PROGRAM LIKE ABOVE 
        // to check whether user input first character
        // 1 , started with number
        // 2 , end with uppercase
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a word");
		String str = scan.next();
		int sum=0;
		char firstChar = str.charAt(0);
		sum+=firstChar;
		System.out.println(sum);
		//it is looking for ASCII Code
		//System.out.println('a' > 'b');
		
		if(firstChar >='0' && firstChar <='9') {
			
			System.out.println("number");
			
		}else {
			
			System.out.println("NOT Number");
		}
		
		//2nd: end with upper case
		char lastChar = str.charAt(str.length()-1);
		if(lastChar >='A' && lastChar <='Z') {
			
			System.out.println("UPPER Case");
		}else {
			
			System.out.println("NOT UPPER Case");
		}
	}

}
