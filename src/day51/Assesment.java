package day51;

public class Assesment {

	int questionCount;
	int score;
	String type;
	static int timeLimit=45; //I want all my assesments have similar timing
	
	public static void printTimeLimit() {
		System.out.println("time limit: " + timeLimit);
	}
	
	
	@Override
	public String toString() {
		return "Assesment [questionCount=" + questionCount 
				+ ", score=" + score + ", type=" + type+"]";
	}
	
	
	
	
}
