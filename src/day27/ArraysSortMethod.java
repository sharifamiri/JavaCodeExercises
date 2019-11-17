package day27;

import java.util.Arrays;

public class ArraysSortMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {1,4,5,2,77,45};
		
		//System.out.println(Arrays.toString(nums));
		Arrays.sort(nums);
		
		System.out.println(Arrays.toString(nums));

		//char array
		//char array is sorted by ASCII Code value low to high
		//most of the special chars --numbers --uppercase --lowercase
		
		String name = "CybeterTek";
		char [] nameChars = name.toCharArray();
		
		Arrays.sort(nameChars);
		
		System.out.println(Arrays.toString(nameChars));

		String [] names = {"abc","efg"," ","123","Ku"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));

		//if multiple items have same first char
			//it will move on to compare the next char
		//numbers come first
		String [] names1 = {"abc","efg","afz"};
		Arrays.sort(names1);
		System.out.println(Arrays.toString(names1));
		
	}

}
