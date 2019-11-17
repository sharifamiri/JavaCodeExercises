package day24;

import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		int[] nums = new int[10];
		
		//This is useful to 
		for (int x= 0; x < 10; x++) {
			nums[x] = rand.nextInt(100);
			
		}
		System.out.print(Arrays.toString(nums));
		
		
//		for (int x= 0; x < 10; x++) {
//			int i = rand.nextInt(100);
//			System.out.print(i + " ");
//		}
		
	}

}
