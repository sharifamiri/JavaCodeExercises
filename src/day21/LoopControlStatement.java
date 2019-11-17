package day21;

public class LoopControlStatement {

	public static void main(String[] args) {
		

//		for (int i = 0; i <= 10; i++) {
//			if (i==5) {
//				break;
//			}
//			System.out.println("GOT MILK? " + i);
//		}

		for (int i = 0; i <= 10; i++) {
			if (i==5 || i==6) {
				continue; //SKIP THIS ITTERATION GO TO NEXT ONE
			}
			System.out.println("GOT MILK? " + i);
		}
	}

}
