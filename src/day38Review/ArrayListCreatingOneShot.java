package day38Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCreatingOneShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Arrays.asList(rar args) --> can be used to add items while object is being created
		//1. However, the variable type MUST BE A LIST
			//because the method return List not ArrayList
		
		//2. It will generate a unmodifiable list
			//can not add or remove item
		//add or remove operation is forbidden 
		//update will work by using set
		
		List<Integer> list = Arrays.asList(3,4,5,6,7,8);
		
		//Unlike ArrayList, it can not add or remove
		//list.add(1);
		//list.remove(1);
		System.out.println(list);
		
		List<String> jla = Arrays.asList("Superman", "Batman", "Wonder Women");
		
		System.out.println(jla);
		
		//Converting List to ArrayList to use other methods
		ArrayList <String> list2 = new ArrayList <>(jla);
		
		System.out.println(list2);
		
		list2.add("John");
		
		System.out.println(list2);
		
		
		
	}

}
