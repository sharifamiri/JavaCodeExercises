package day18;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DRY Principle
		//DO NOT REPEAT YOURSELF
		
		//Task 1
		
		/*
		 */
		
//		int x = 10;
//		if(x>5) {
//			System.out.println("Do this");
//		}else {
//			System.out.println("Do that");
//		}
		
		/*
		 * while (as long as some condition is true){
		 * keep repeating this action
		 * }
		 * 
		 * 
		 */
		int y = 10;
		while(y>5) {
			
			System.out.println("do this " + y--); //it will print iteration
			//y--;
		}
	}

}
