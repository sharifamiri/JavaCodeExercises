package day33;

import java.util.Arrays;

public class ReturningMultiplevalue {

	public static void main(String[] args) {
		//1St WAY
		int [] myArray = giveMeAnArray();
		System.out.println(Arrays.toString(myArray));
		
		//2ND WAy
		System.out.println(Arrays.toString(giveMeAnArray()));

	}
	
	public static int [] giveMeAnArray() {
		
		System.out.println("Action");
		
		int [] arr = new int [] {1,2,3};
		
		return arr;
	}

}
