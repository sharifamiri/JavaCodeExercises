package day38Review;

import java.util.ArrayList;

public class CombineTwoArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    ArrayList<String> lst1 = new ArrayList<>();
	    lst1.add("Superman"); 
	    lst1.add("Batman"); 
	    lst1.add("Aquaman"); 
	    
	    ArrayList<String> lst2 = new ArrayList<>();
	    lst2.add("Wonder Woman"); 
	    lst2.add("Cyborg"); 
	    lst2.add("Flash");
	    
//	    lst1.addAll(lst2) ; 
//	    System.out.println(lst2);
	    
	    lst1.addAll(2, lst2); 
	    
	    System.out.println("Justice league : " + lst1);
	    
	    ArrayList <String> list3 = new ArrayList <>(lst1);
	    
	    System.out.println();
	    System.out.println(list3);
	    
	 // How to get String representation out of arraylist object 
	    String list3ToStr = list3.toString();
	    
	    // whenever you print out a reference variable 
	    // that point to an obejct , 
	    // it will automatically call toString() method implicitly 
	    System.out.println(list3ToStr); 
	    System.out.println(list3);
	    

	    
	    
	    
	    
	  }
	}