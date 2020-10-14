package day27;

import java.util.Arrays;

public class ArraysCopyRangeOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String []heros = {"Dad", "Mom", "Wife", "Kids", "Siblings", "Friends", "Mentors"};
		
		//copyOfRange method take 3 external data / parameters
		//original array, starting index (inclusive) and ending index (exclusive)
		//store the resulting array into a new string array variable
		
		String [] copy1 = Arrays.copyOfRange(heros, 0, 2);
		String copy2 = ""+Arrays.copyOfRange(heros, 0, 2) + Arrays.copyOfRange(heros, 3, 5);
		String [] split = copy2.split(" ");
		String [] copy10 = Arrays.copyOfRange(heros, 0, 10);
//		String [] a1 = copy1+copy10;
		System.out.println(Arrays.toString(copy1));
		System.out.println(Arrays.toString(split));
		System.out.println(Arrays.toString(copy10)); //will print null for the remaining
		
		
	}

}
