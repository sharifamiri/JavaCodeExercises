package day38Review;

import java.util.ArrayList;

public class TaskOnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    /*
	     * TASK 1 : 
	     * Create an ArrayList of integer from 1-100
	     * 
	     * get the sum of the each items 
	     * get the average
	     * 
	     * Create another list that contain items from 100- 1 
	     * get the count of numbers divisible by 3 and 5 
	     * 
	     * 
	     * Combine above 2 lists -- add everything from 2nd list to first one
	     * 
	     * */
		//1ST
		ArrayList <Integer> num1 = new ArrayList<>();
		
		for (int i = 1; i <= 10; i++) {
			num1.add(i);
		}
		System.out.println(num1);
		
		int sum = 0;
		for (Integer nums : num1) {
			sum+=nums;
		}
		System.out.println(sum);
		
		
		//2nd
		ArrayList <Integer> num2 = new ArrayList<>();
		
		for (int i = 10; i >= 1; i--) {
			num2.add(i);
		}
		System.out.println(num2);
		
		
		//3RD
		int count = 0;
		for (Integer nums2 : num2) {
			if(nums2%3==0 && nums2%5==0) {
				count++;
			}
		}
		
		System.out.println("The target count is: " + count);
		
		//4Th
		num1.addAll(num2);
		
		System.out.println(num1);
		
		//the logic is: pick each and every item in num2 and add it to num1
		
		for (int i = 0; i < num2.size(); i++) {
			num1.get(num2.get(i));
			
//			Integer eachInt = num2.get(i);
//			num1.get(eachInt);
		}
		
		System.out.println(num1);
		
	    //// addAll method of ArrayList class 
	    // this will just add every item in lst2 by the end of lst1 items 
//	    lst1.addAll(lst2) ;  
//	    System.out.println( lst1 );
	//    
	    
	    //// addAll method of ArrayList class , second overloaded version
	    // this will just insert every item in lst2
	    // to the specified index 
	    
	    num1.addAll(1,num2) ; //add num2 at location index of 1
	    System.out.println( num1 );
		
		
		num1.sort(null);
		
		System.out.println(num1);
		
		
		
	}

}
