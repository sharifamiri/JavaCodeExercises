package day27;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {1,33,567,11,22};
		
		for (int i = 0; i < nums.length; i++) {
			int eachItem = nums[i];
			System.out.println(eachItem);
		}
		
		//for each loop syntax
		/*
		 
		 for(eachItemDataType variable name: collectionVariable){
		 your action here
		 }
		 
		 
     * for each loop  or enhanced for loop  
     * 
     * for each loop can only be used for looping through collection type
     * int this particular example it is an array
		 */
		
		for(int eachItem : nums) {
			System.out.println(eachItem);
		}
	}

}
