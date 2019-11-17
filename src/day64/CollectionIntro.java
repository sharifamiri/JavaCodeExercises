package day64;

import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class CollectionIntro {

	public static void main(String[] args) {
		
		ArrayList<Integer> lst1 = new ArrayList<>();
		
		List<Integer> lst2 = new ArrayList<>();
		
		Collection<Integer> lst3 = new ArrayList<>();
		lst3.add(2);
		//doesn't work because Collection doesn't support get method..it doesn't have index
		//System.out.println(lst3.get(0));
		
		// lst3.get(0); 
	    System.out.println(  lst2.get(0)  );

	}

}
