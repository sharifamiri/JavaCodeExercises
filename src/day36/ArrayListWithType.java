package day36;

import java.util.ArrayList;

public class ArrayListWithType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//NO PRIMITIVE TYPES ALLOWED AS TYPE
		ArrayList <Integer> numList = new ArrayList <>();
		
		//numList.add(Integer.parseInt("12"));
		
		//ADDING ITEM
		//We call add  method from ArrayList class
		Integer i = 100; //autoboxing to Integer Object
		numList.add(i);
		numList.add(200);
		
		System.out.println(numList);
		
		//GETTING SINGLE ITEM FROM ARRAY ARRAYLIST
		int i2 = numList.get(0); //auto unboxing happens here
		
		System.out.println(i2);
		System.out.println(numList.get(1));  //It is a method returns a value
	}

}
