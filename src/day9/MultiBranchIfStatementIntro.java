package day9;

public class MultiBranchIfStatementIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Grade book 
		
		int score = 84;
		
		//if the score is between 90- A
		//if the score is between 80-89 B
		//if the score is between 70-79 C
		//ELSE D and print study harder
		
		//80<score>89? -->NO
		
		//First it will check for IF condition..if TRUE will go to IF block
		//If it is false, it will check for next condition...if it is true will execute
		//If nothing true, will go to ELSE
		
		if(score>=90) {
			System.out.println("You got A");
		}else if(score>=80 && score<90) {
			System.out.println("You got B");
				
		}else if (score>=70 && score<80) {
		
		}else {
			System.out.println("study harder");
		}
		
		
	}

}
