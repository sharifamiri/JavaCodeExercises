package day33;

import java.util.Arrays;

public class WarmUpReturnMethod {

	public static void main(String[] args) {
		int nums [] = new int [] {1,2,3,4,5};
		int a = getSum(nums);
		
		System.out.println("Sum of all numbers: "+a);
		System.out.println(getSum(nums));
		
		String names [] = {"Sharif", "Jova", "Xojam"};
		String b = addAll(names);
		System.out.println("Add of all numbers: "+b);
		
		
		int c = getMax(nums);
		
		System.out.println("All names are: "+c);

	}
	
	public static int getSum(int [] num) {
		int sum = 0;
		
		for(int i=0; i<num.length; i++) {
			sum+=num[i];
		}
		return sum;
	}
	public static String addAll(String [] name) {
		String store = "";
		
		for(int i=0; i<name.length; i++) {
			store+=name[i]+" ";
		}
		return store;
	}
	public static int getMax(int [] num1) {
		int max = num1[0];
		
		for(int i=0; i<num1.length; i++) {
			if(max<num1[i])
				max=num1[i];
		}
		return max;
	}

}
