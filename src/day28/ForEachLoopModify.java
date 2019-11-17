package day28;

import java.util.Arrays;

public class ForEachLoopModify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=a;
		b=20;
		
		int [] arr = {1,2,4,6,3};
		
		for (int i = 0; i < arr.length; i++) {
			//arr[i]=20; //-->this will change all to 20
			int eachItem = arr[i];
			eachItem = 20;
		}
		System.out.println(Arrays.toString(arr));//[1, 2, 4, 6, 3]
		
		//for each loop can not be used to change a value
		for(int eachItem : arr) {
			eachItem=20;
		}
		System.out.println(Arrays.toString(arr));//[1, 2, 4, 6, 3]-->still the same 
													//bec it wo't change "arr" value
		
		
		
		
		
	}

}
