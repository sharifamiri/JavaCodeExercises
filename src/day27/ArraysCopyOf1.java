package day27;

import java.util.Arrays;

public class ArraysCopyOf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String []heros = {"Dad", "Mom", "Wife", "Kids", "Siblings", "Friends", "Mentors"};
		

		System.out.println(Arrays.toString(heros));
		
		String[] copy2 = Arrays.copyOf(heros, 2);
		String[] copy6 = Arrays.copyOf(heros, 6);
		String[] copy0 = Arrays.copyOf(heros, 0);
		String[] copy10 = Arrays.copyOf(heros, 10); //out of range
		//String[] copyNeg = Arrays.copyOf(heros, -2); //won't compile
		
		System.out.println(Arrays.toString(copy2));
		System.out.println(Arrays.toString(copy6));
		System.out.println(Arrays.toString(copy0));
		System.out.println(Arrays.toString(copy10)); //[Dad, Mom, Wife, Kids, Siblings, Friends, Mentors, null, null, null]
		//System.out.println(Arrays.toString(copyNeg)); //won't compile
		

		
		
	}

}
