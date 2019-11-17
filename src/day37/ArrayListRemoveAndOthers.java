package day37;

import java.util.ArrayList;

public class ArrayListRemoveAndOthers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ArrayList<Integer> numList = new ArrayList<>();

		numList.add(49);
		numList.add(200);
		numList.add(300);
		numList.add(400);
		numList.add(500);

		// find certain index value
		System.out.println("index of value 500: " + numList.indexOf(500));

		// add a number at index 1; add(index, value);
		numList.add(1, 99);
		System.out.println(numList);

		// update a value
		numList.set(2, 23);
		System.out.println("Changed at index 2" + numList);

		// remove a message, 1000 will be gone
		numList.remove(1);
		System.out.println("Index 1 removed: " + numList);

		// counting items
		System.out.println("size of list: " + numList.size());

		// remove using valueOf
		numList.remove(Integer.valueOf(300));
		System.out.println("valueOf method: if 300 is removed: " + numList);

		// remove using indexOf
		numList.remove(numList.indexOf(49));
		System.out.println("indexOf methd: if 49 is removed: " + numList);

		// remove using valueOf
		numList.remove(new Integer(23));
		System.out.println("new Integer method: if 23 is removed: " + numList);
		
		
		// clear all contents in the template
		numList.clear();
		System.out.println("all data cleared: " + numList);

	}

}