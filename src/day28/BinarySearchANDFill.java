package day28;

import java.util.Arrays;

public class BinarySearchANDFill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {1,10,8,6,8,5,4};
		
		int index = Arrays.binarySearch(nums, 5); //has to be sorted before giving the index
		System.out.println(index);
		
		//ARRAY OBJECT MUST BE SORTED BEFORE USING THIS METHOD
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums)); //[1, 4, 5, 6, 8, 8, 10]
		
		int index1 = Arrays.binarySearch(nums, 5);
		System.out.println(index1); //2 -->it is at index 2
		
		int index2 = Arrays.binarySearch(nums, 12);
		System.out.println(index2); //-8 -->means it will be after "10" which will have length "8"
		
		//IF WE DONT HAVE THE ITEM IN THE ARRAY
		//We will get negative number to point the insertion point of the array
			//to keep this array sorted
		
		//------------------------------
		//FILL
		int []nums100 = new int [100];
		
		Arrays.fill(nums100, 5);
		System.out.println(Arrays.toString(nums100));
		
	}

}
