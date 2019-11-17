package day53;

public class Krypton extends Planet {

	public static void main(String[] args) {
		
		

	}
	
	@Override
	public void rotate() {
		System.out.println("Krypton planet");
	}
	
	//THIS IS NOT VALID bec it doesn't have same return type
//	public int rotate() {
//		
//		System.out.println("rotating");
//	}
	
	//NOT VALID  bec since we can not reduce access modifier visibility
//	protected void rotate() {
//		
//		System.out.println("rotating");
//	}
	//NOT VALID bec parameter is String...
		//it is overloading the rotate method of super class
//	protected void rotate(String x) {
//		
//		System.out.println("rotating");
//	}
	
	//NOT VALID bec it is static
	//Overriding is only for instance not static
	//static method can not hide instance method from super class
	
	//NOT VALID bec instance method can not override static method 
//	public int rotate(int d, int y) {
//		
//		System.out.println("rotating");
//	}
	
	public static int rotate(int d, int y) {
		
		System.out.println("rotating with return");
		return 105;
	}
	


}
