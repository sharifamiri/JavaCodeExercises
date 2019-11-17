package day53;

public class Planet {

	//OVERLOADING ONLY CARE ABOUT YOUR METHOD SIGNITURE
		//SAME NAME DIFFERENT PARAMETER LIST
	
	public void rotate() {
		
		System.out.println("rotating");
	}
	
	public void rotate(int d) {
		
		System.out.println("rotating d");
	}
	
//	public int rotate(int d) {
//		
//		System.out.println("rotating d");
//		return d;
//	}
	//WE CAN NOT HAVE TWO METHOD WITH SAME METHOD SIGNITURE IN SAME CLASS
	
	public static int rotate(int d, int y) {
		
		System.out.println("rotating d with return");
	
		return 5;
	}
	
	
	
	
}



