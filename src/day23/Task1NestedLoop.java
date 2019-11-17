package day23;

public class Task1NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 4; i++) {
			System.out.println("Iteration: " + (i+1));
			for (int j = 15; j >= 5; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}

}
