package day64;

import java.util.*;

public class TreeSetExamples {

	public static void main(String[] args) {
		//SortedSet interface extends Set interface
		// TreeSet implements SortedSet

		Set<Integer> myTreeSet3 = new TreeSet<>();
		SortedSet<Integer> myTreeSet2 = new TreeSet<>();
		//HashSet<Integer> myTreeSet4 = new TreeSet<>(); //BAD!!!
		TreeSet<Integer> myTreeSet = new TreeSet<>();
		myTreeSet.add(23);
		myTreeSet.add(23);
		myTreeSet.add(3);
		myTreeSet.add(3);
		myTreeSet.add(3);
		myTreeSet.add(13);
		myTreeSet.add(20);
		myTreeSet.add(-230);
		
		System.out.println(myTreeSet);
		System.out.println(myTreeSet.size());
		
		//GETTING LOWEST ELEMENT
		System.out.println("LOWEST ELEMENT: "+myTreeSet.first());
		
		//GETTING HIGHEST ELEMENT
		System.out.println("HIGHEST ELEMENT: "+myTreeSet.last());
		
		//GETTING THE VIEW OUT OF THE SET - subset middle view
		SortedSet<Integer> myView = myTreeSet.subSet(3, 20); //20 is not included
		System.out.println("myTreeSet.subSet(3, 20)-->"+myView);
		
		//GETTING THE VIEW OUT OF THE SET - headSet from beginning till a value
		SortedSet<Integer> myView2 = myTreeSet.headSet(13);
		System.out.println("myTreeSet.headSet(13)-->"+myView2);
		System.out.println("myTreeSet.headSet(13, true)-->"+myTreeSet.headSet(13, true)); //this includes 13
		
		//GETTING THE VIEW OUT OF THE SET -- tialSet from middle till the end
		SortedSet<Integer> myView3 = myTreeSet.tailSet(13);
		System.out.println("myTreeSet.tailSet(13)-->"+myView3);
	}

}
