package day10;

import java.util.Scanner;

public class ConditionalOnlyIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Enter your score please");
		
		int lengthOfName = s.nextInt();
		
		if(lengthOfName>22) {
			System.out.println("Slack can not take more than 22 char");
			lengthOfName = 21;
			System.out.println("user has not been adjusted");
		}else if(lengthOfName>17) {
			System.out.println("Still Good");
		}
		System.out.println("Successfully added user");
		
		
		
	}

}
