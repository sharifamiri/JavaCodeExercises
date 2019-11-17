package day19;

import java.util.Scanner;

public class LoopingChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		//String str = "1abc2";
		
		//how to check whether string start with a-z
		
		char firstChar = str.charAt(1);
		
		//it is looking for ASCII Code
		//System.out.println('a' > 'b');
		
		if(firstChar >='a' && firstChar <='z') {
			
			System.out.println("lower case letter");
		}else {
			
			System.out.println("Not A-Z");
		}
		
	}

}
