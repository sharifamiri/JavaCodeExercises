package day8;

public class ReviewIncrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		 
		/* System.out.println(score++); //10 
		 System.out.println(score);
		 * //11
		 * 
		 * System.out.println(++score); //12
		 * 
		 * System.out.println(score--); //12 -->post-decrement
		 * 
		 * System.out.println(score); //11
		 */
		 int score = 10;  
		 int result = score++;
		
		System.out.println(result);
		//current value at this moment
		score = score++ + ++score; //11 + (12+1) = 24
		System.out.println(score);
		
		
		
		
		
		
		
		
		
		
		
	}

}
