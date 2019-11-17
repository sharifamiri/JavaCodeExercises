package day18;

public class WhileLoopDoesNotAlwaysGoToBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=100;
		//if while condition is not true, it will never go to the block
		while(x>200) {
			System.out.println("do something");
			x++;
		}
		
		System.out.println("END");
	}

}
