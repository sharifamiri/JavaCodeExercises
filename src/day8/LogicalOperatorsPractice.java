package day8;

public class LogicalOperatorsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 10;
		boolean result1 = score>4;
		boolean result2 = score>4 && score <11;
		boolean result3 = score>14 && score <11; //10<14, STOP, FALSE
		boolean result4 = score>14 || score <11; //10<14, MOVE 10<11, TRUE
		
		//boolean result5 = score>9 || score <1; //10>9 -->TRUE
		//boolean result5 = score++>10 && score <12; //11>10 TRUE and 11<12 FALSE -->FALSE
		//boolean result5 = ++score>10 && score <12; // 11 > 10 && 11<12
		//boolean result5 = score++>10 || score <12;  //10>10 FLASE || 11 <12 TRUE --TRUE 
		                                              //as long as one true, the whole thing is true
		//boolean result5 = score++>10 && ++score <13; //10>10 false so it will NOT evaluate next one
		//boolean result5 = score++>10 & ++score <13; //10>10 & 12<13 -->false so it will evaluate next one
		//boolean result5 = score>10 & ++score <13;    //if one is false, the whole thing is false
		//System.out.println("the value of right now: " + score); 
		
		//boolean result5 = score>10 | ++score <13; //10>10 FALSE OR 11<13 TRUE -->TRUE
		boolean result6 = !true && true;
		boolean result7 = (score>5) && (6>5); //TRUE TRUE--TRUE
		boolean result8 = (score>5) && !(6>5); //TRUE FALSE --FALSE
		
		boolean result9 = (score>5) && !(score>11) && (score/2 ==5); //TRUE FALSE.. --FALSE
		boolean result10 = (score>5) && !(score <= 11) && (score/2 ==5); //TRUE TRUE TRUE.. --TRUE
		
		System.out.println("result is " + result10);
		System.out.println(true && false || true);
		System.out.println(true || false && false);
		
		//precedence
		System.out.println(score>10 || score==10 && score <5);
		System.out.println(score>10 || (score==10 && score <5));
	
		
		
		
		/*
		 * System.out.println("result is " + result1); System.out.println("result is " +
		 * result2); System.out.println("result is " + result3);
		 * System.out.println("result is " + result4); System.out.println("result is " +
		 * result5);
		 */
		
		
		
	}

}
