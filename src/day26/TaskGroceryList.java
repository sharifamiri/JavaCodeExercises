package day26;

import java.util.Arrays;

public class TaskGroceryList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    // Task num 5    
	    // create a string called groceries 
	    // add items separated by comma 
	    // split them and print them out 
	    /// find out size of split 
	    /// find out length of each items 
		
		String grocery = "Cucumber, Apple,   Banana";
		
		//String [] items = grocery.trim().split(",");
		String [] items = grocery.split(", +");
		
		//String [] items = grocery.split(", ");
		
		System.out.println(Arrays.toString(items));
		int size = items.length;
		
		System.out.println("Length of Split is: " + size);
		
		int count = 0;
		for (int i = 0; i < items.length; i++) {
			count = items[i].length();
			//System.out.println("Length of Each Split " + items[i] + " is: " + count);
			System.out.println( items[i].trim().length()); //This will reduce the space
		}


}
}