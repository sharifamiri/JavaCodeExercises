package day37;

import java.util.*;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//where do we put the type of items
		//we put it inside <> diomond operator
		ArrayList<String> list1 = new ArrayList<>();
		
		//this is imposible to use List as type
		//this will be explained when we learn Inheritance
		List<String> list2 = new ArrayList<>();
		
		
		//ArrayList is a class that we can use to create ArrayList objects
		//it has lost of built in functionality to work with data easily
		
		//Adding items
		list1.add("Sharif");
		list1.add("Fakha");
		list1.add("Jova");
		list1.add("Xojam");
		
		
		System.out.println(list1);
		String str = list1.get(0);
		System.out.println(str);
		
		// getting single items we use get method and provide index
		System.out.println("Item 1: " +list1.get(0));
		System.out.println("Item 2: " +list1.get(1));
		System.out.println("Item 3: " +list1.get(2));
		System.out.println("Item 4: " +list1.get(3));
		
		//iterating over each items using loops
		
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		
		//getting the count of the items inside
		//we use size() method
		
		int count = list1.size();
		System.out.println("Item count is: "+ count);
		
		
	}

}
