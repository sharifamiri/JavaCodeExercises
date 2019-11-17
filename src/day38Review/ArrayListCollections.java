package day38Review;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    // Arrays class is a class that have a lot of 
	    // static methods to perform common array operation 
	    // Arrays.sort(arrayObject)
	    
	    // Collections is a class under java.util package 
	    // to perform common collection object related operation 
		
		ArrayList <String> list = new ArrayList <>();
		list.add("Umar");
		list.add("Maryam");
		list.add("Amir");
		list.add("Sharif");
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
	    // sort method from ArrayList excect an object called Comparator we did not learn
	    // However even we don`t know this type of object
	    // we do know that any reference variable can be set to null 
	    // so we can just pass null to this method 
	    // and it will just work
		//list.sort(null);
		
		//BINARY SEARCH
		// looking for the index of an item in the sorted list 
		int amirLoc = Collections.binarySearch(list, "Maryam");
		System.out.println(amirLoc); //1 --> it is at index 1
		
		int jovaLoc = Collections.binarySearch(list, "Jova");
		System.out.println(jovaLoc); //-2 --> it must be at length 2
		
		//REVERSE
		Collections.reverse(list);
		System.out.println(list);
		
		//Shuffle Items Inside -- randomly changes places of items
		Collections.shuffle(list);
		System.out.println(list);
		
	}

}
