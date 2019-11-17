package day27;

import java.util.Arrays;

public class ArraysEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr1 = {1,3,4,65,2};
		int [] arr2 = {1,3,4,65,2};
		int [] arr3 = {3,1,4,65,2}; //we should sort it first to compare
		
		boolean sameOrNot1 = Arrays.equals(arr2, arr3);
		System.out.println("Arr2 compare to Arr3: " +  Arrays.equals(arr2, arr3) );
		
		Arrays.sort(arr2);
		
		Arrays.sort(arr3);
		
		
		// comparing two variable 
	    // it will alwayse check whether they have 
	    // same exact thing stored inside the variable 
		
		System.out.println(arr1==arr2); //false because different method
		
		boolean sameOrNot = Arrays.equals(arr1, arr2);
		
		System.out.println(sameOrNot); //true
										//if we sort it will loose the order, then will become false
		
		
		    Arrays.sort(arr2);
		    Arrays.sort(arr3);
		    
		    System.out.println("Arr2 compare to Arr3 -- after sorting: " 
		        +  Arrays.equals(arr2, arr3) );
		
		
		System.out.println(sameOrNot1); //true
		
		
		
	}

}
