package day53;

//public final class Computer {
public class Computer {

	public final void systemPolicy() {
		
		System.out.println("DO NOT CHANGE THIS POLICY");
	}
	
	public final static void staticSystemPolicy() {
		System.out.println("DO NOT CHANGE THIS STATIC POLICY");
	}
	
	public static void main(String[] args) {
		
		final int x = 100;
		
		//How many place variable can show up?
		
		/*
		 * inside a method --> local variable
		 * 
		 * one method header inside (..) --> method parameters
		 * 
		 * under the class outside any method or block --> field
		 */
	}
}



class MacBook extends Computer{
	
	//@Override NOT VALID bec cannot override final method
//	public void systemPolicy() {
//			System.out.println("DO NOT CHANGE THIS POLICY");
//	}
	
	//NOT VALID bec can not hide final static method
//	public final static void staticSystemPolicy() {
//		System.out.println("DO NOT CHANGE THIS STATIC POLICY");
//	}
	
}
