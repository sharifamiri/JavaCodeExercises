package day37;

import java.util.ArrayList;

public class MoreArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numList = new ArrayList<>();
		
		numList.add(100);
		numList.add(200);
		numList.add(300);
		numList.add(400);
		
		System.out.println(numList);
		
		//inserting items at certain location
		//insert 500 as a second item
		//add(index, value);
		numList.add(1, 500);
		
		System.out.println(numList);
		
		//it should be within range or exception occurs
		//numList.add(10, 500);
		
	    // Updating a value inside ArrayList item 
	    // set(index, newValue)
	    numList.set(2, 1000) ; 
	    System.out.println(numList);
	    
	    // removing items from arrayList 
	    // remove(ItemValue)
	    // remove(index)
	    // THIS WILL WAIT 
	    
	    
	    // deleting everything from the list 
	    numList.clear();
	    System.out.println(numList);
	    
	    ///---------------------------------
	    	//update a value
	  		numList.set(2, 23);
	  		System.out.println("Changed at index 2"+ numList);
	  		
	  		
	  		//remove a message, 1000 will be gone
	  		numList.remove(1);
	  		System.out.println("Index 1 removed: "+ numList);
	  		
	  		//clear all contents in the template
	  		numList.clear();
	  		System.out.println("all data cleared: " + numList);
		
	  		
		
		
	}

}
