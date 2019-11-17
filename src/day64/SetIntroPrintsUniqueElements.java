package day64;

import java.util.HashSet;
import java.util.*;

public class SetIntroPrintsUniqueElements {

	public static void main(String[] args) {
		
		//Set interface
			// -- define a data structure of unique element
		
		// HashSet class
		
		//HashSet<String> myStates = new HashSet<>();
		
		Set<String> myStates = new HashSet<>();
		myStates.add("VA");
		myStates.add("TX");
		myStates.add("VA");//doesn't do anything bec it is duplicate
		myStates.add("PA");
		myStates.add("OR");
		myStates.add("TX");
		myStates.add("CT");
		myStates.add("CT");
		myStates.add("VA");
		//Set interfaces only prints unique ones...only ones
		System.out.println(myStates);
		
		System.out.println("size is: "+ myStates.size());
		
		myStates.remove("PA");
		System.out.println("My state contains PA: "+ myStates.contains("PA"));
		
		for (String state : myStates) {
			System.out.println("my state is: "+state);
		}
		
		//what if we want to copy these unique value
		//somewhere else where we can use index
		
		List<String> lst = new ArrayList<>(myStates);
		System.out.println(lst);
		System.out.println(lst.get(0));
		

	}

}
