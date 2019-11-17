package day25;

import java.util.Arrays;
import java.util.Random;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WARM UP
		// create an array of int with capacity of 50 
	    // store 1-50 inside 
	    // print them out 
		
		int nums[] = new int [50];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] =i+1;
		}
		System.out.println(Arrays.toString(nums));
		
		
		//USING RANDOM NUMBERS
//		Random rand = new Random();
//		for (int x= 0; x < 50; x++) {
//			nums[x] = rand.nextInt(100);
//			if(nums[x]%2==0)
//			//System.out.print((nums[x]+" "));
//		}

		
		
		int [] evenNumbers = new int [51];

		for (int i = 0; i < nums.length; i++) {
			evenNumbers[i] = i*2;
		}
		System.out.println(Arrays.toString(evenNumbers));
	}

}
