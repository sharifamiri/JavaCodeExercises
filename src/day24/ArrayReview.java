package day24;

public class ArrayReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ARRAY REVIEW
		/*
		 * Array id an object can store multiple items of same type
		 * 
		 */
		//1ST WAY
		int [] nums = new int[3];
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		
		
		//2ND WAY
		int[] nums2 = new int[] {1, 2, 3, 4, 5, 65, 6};
		System.out.println(nums2[5]);
		
		//3RD WAy
		int [] nums3 = {1,2,3,4,5,65,6};
		
		//teh declartion and initialization need to happen in same line
		//int[] numsd;
		//nums4 = {1,2,3,4,5}; --> can't use this
		
		//getting the count of items
		System.out.println(nums3.length);
		
	}

}
