package day34;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    /*
	     * Create static a method called
	     *  
	     *  getArrayFrom1toX
	     *  it takes one parameter 
	     *  and return array starting from 1 to the number specified
	     *  
	     *   getArrayFrom1toX(5) --> {1,2,3,4,5}
	     * */
		
		//System.out.println(getArrayFrom1toX(5));
		
		int []arr = getArrayFrom1toX(5);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.toString(getArrayFrom1toX(5)));
		
		String store = Arrays.toString(getArrayFrom1toX(5));
		System.out.println(store);
		
		
	}
	
	public static int [] getArrayFrom1toX(int x) {
		int [] arr = new int[x];
		for (int i = 0; i < arr.length; i++) {
			arr [i] = i+1;
		}
		return arr;
	}

}
