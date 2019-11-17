package day10;

import java.util.Scanner;

public class Grader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Grade book 
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your score please");
		int score = s.nextInt();
		
		//you have to put OR (||) because score can not be more than 100 and less than 0
		if(score>100 || score<0) {
		System.out.println("INVALID NUMBER");

		//after first if, there should always be else if to check next statement
		}else if(score>90) {
		System.out.println("Great score: A");
		
		}else if(score>80 && score<=90) {
		System.out.println("Good score: B");
		
		}else if(score>70 && score<=80) {
		System.out.println("Ok score: C");
		
		//You have to put more specific condition on top
		
		//}else if(score>100) {
		//System.out.println("MORE THAN 100");
		
		}else {
		System.out.println("STUDY HARDER");
		}
		
		//This one won't check every scenario
//		    if(score>90) {
//			System.out.println("Great score: A");
//			
//			}if(score>80 && score<=90) {
//			System.out.println("Good score: B");
//			
//			} if(score>70 && score<=80) {
//			System.out.println("Ok score: C");
//			
//			}if(score<70) {
//			System.out.println("STUDY HARDER");
//			}
			
		
		
	}

}
