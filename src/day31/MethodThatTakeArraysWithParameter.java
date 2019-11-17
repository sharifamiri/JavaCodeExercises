package day31;

import java.util.Arrays;

public class MethodThatTakeArraysWithParameter {

	public static void main(String[] args) {
	
		int []object1 = {1,2,3,3};
		int []object2 = {1,2,3,4};
		reportBiggerArray(object1, object2);
		
		reportBiggerArray(new int [] {1,2,3}, new int []{4,5,6,7});
		System.out.println(Arrays.toString(object1));

	}
	
	
	public static void reportBiggerArray(int [] num1, int num2 []) {
	
		if(num1.length>num2.length)
			System.out.println(Arrays.toString(num1));
		else if(num1.length<num2.length)
			System.out.println(Arrays.toString(num2));
		else
			System.out.println("THEY ARE EQUAL SIZE");

	}
	

}
