package day31;

import java.util.Arrays;

public class ArrayWithMethod {

	public static void main(String[] args) {
		//1ST
		int [] object = {1,2,3,4};
		arrayPrinter(object);
		
		//2ND
		arrayPrinter(new int []{1,2,3,4,5});
	

	}
	
	
	public static void arrayPrinter(int [] num) {
		//1Sat
		System.out.println(Arrays.toString(num));
		
		//2Nd
		for (int each : num) {
			System.out.print(each+ "-");
		}
		System.out.println();
	}
	

}
