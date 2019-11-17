package day20;

public class InfiniteForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i = 0; i < 0; i++) {
			System.out.println("i "+ i);
		}
		
		for (int i = 0; i < 10; i--) {
			System.out.println("i "+ i);
			
			if(i==5) {
				break;
			}
		}
		
		System.out.println("THE END");
	}

}
