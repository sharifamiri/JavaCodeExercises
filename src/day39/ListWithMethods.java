package day39;

import java.util.ArrayList;
import java.util.List;

public class ListWithMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> lst = new ArrayList<>();
		
		lst.add("apple");
		lst.add("banana");
		lst.add("kiwi");
		lst.add("orange");
		
		//FOR THE VOID TYPE
		add4Itens(lst);
		
		//FOR THE RETURN TYPE
		System.out.println(getListFrom(20));
		System.out.println(getListFrom(3));

				
			
	}
	
	public static void add4Itens(List<String> strLst) {
		
		
		for (int i = 0; i < strLst.size(); i++) {
			System.out.print(strLst.get(i)+"-");
		}
		
		System.out.println();

	}
	
	//create a  method that accept a number as ending item
	
	public static ArrayList<Integer> getListFrom(int x) {
		
		ArrayList<Integer> numList = new ArrayList<>();
		
		for (int i = 1; i <= x; i++) {
			numList.add(i);
		}
		return numList;
	}

}
