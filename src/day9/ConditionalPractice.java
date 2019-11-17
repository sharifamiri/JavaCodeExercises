package day9;

public class ConditionalPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10, j = 21;
		int sum = i+j;
		
		//TASK 2
		/*
		 * if (i>5 && j%2==1 && sum==31) 
		 * { System.out.println("BINGO!"); 
		 * }else {
		 * System.out.println("Try again Spartans"); }
		 */
		//i is more than 5 OR j is odd number OR sum is 30
		if (i>5 || j%2==1 || sum==31) 
			  { System.out.println("BINGO!"); 
			  }else {
			  System.out.println("Try again Spartans"); }
	}

}
