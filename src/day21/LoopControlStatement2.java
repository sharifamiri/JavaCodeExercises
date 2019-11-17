package day21;

public class LoopControlStatement2 {

	public static void main(String[] args) {
		

		for (int i = 0; i <= 10; i++) {
			if (i==5) {
				continue;
			}
			break;
			//unreachable code
			//System.out.println("GOT MILK? " + i);
		}

//		for (int i = 0; i <= 10; i++) {
//			
//				 //SKIP THIS ITTERATION GO TO NEXT ONE
//			
//			System.out.println("GOT MILK? " + i);
//			continue;
		
//			//unreachable code
//			//System.out.println("END");
//		}
	}

}
