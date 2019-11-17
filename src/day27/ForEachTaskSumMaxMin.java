package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ForEachTaskSumMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = new int [5];
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter 5 numbers: ");
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(nums));
		
		int sum = 0;
		int max = nums[0];
		int min = nums[0];
		
		
		for (int i : nums) {
			sum+= i;
		}
		System.out.println(sum);
		
		for (int i : nums) {
			if(i>max) {
				max=i;
			}
			if(i<min) {
				min=i;
				}
			
		}
		
		System.out.println("Max is: " + max);
		System.out.println("Min is: " + min);
		
		
	}

}
