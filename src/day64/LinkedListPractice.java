package day64;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.sound.midi.Soundbank;


public class LinkedListPractice {

	public static void main(String[] args) {
		// List has two popular implementation
		//ArrayList, LinkedList
		
		List<Integer> lst1 = new ArrayList<Integer>();
							//lst1 = new LinkedList<>();
		
		List<Integer> lst2 = new LinkedList<>();
		lst2.add(2);
		lst2.add(5);
		lst2.add(8);
		lst2.add(1);
		
		for (int i = 0; i < lst2.size(); i++) {
			System.out.print(lst2.get(i)+"- ");
		}
		
		System.out.println(lst2.toString());
		
		lst2.remove(2);
		lst2.remove(new Integer(2));
		
		List<Long> lst3 = new LinkedList<>();
		lst3.add(1L);
		lst3.add(50L);
		lst3.add(80L);
		lst3.add(10L);
		System.out.println(lst3);
		lst3.remove(1);
		System.out.println(lst3);
		
		/**
		 * ArrayList 
		 * is backed by array
		 * whenever we try to add or remove item
		 * it's automatically resizing underlying array
		 * for us, so we can just call method
		 * 
		 */
		
		//Adding items 
			//LinkedList is faster
			//because it just need to create new pointer to the neighbor
			//ArrayList relatively slower because of 
				//resizing operation in underlying array
		
		//ACCORDING TO ABOVESITUATION
		/**
		 * If you have situation that you have to always add or
		 * remove itmes intensively, LinkedList is better
		 * 
		 */
		
		//get(4) / random access by index
		
			//ArrayList is faster because it can directly 
			//jump to the element since it's backed by array
		
			//LinkedList is slower because it has to go through 
			//each and every neighbor before the element
		
		/**
		 * If you have situation that you have to always randomly
		 * access items by it's index, ArrayList is faster
		 * 
		 */
		
		
		
		

	}

}
