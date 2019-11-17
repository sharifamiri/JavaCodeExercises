package day18;

import java.util.Scanner;

public class NullReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		String a = "abc";
//		String b = "efg";
//		
//		//null is a speacial reference that point to nothing
//		//b is now pointing to nothing instead of "efg" object
//		
//		b = null;
//		
//		Scanner s = null;
//		System.out.println(s.next());

//		int x = 0;
//		System.out.println(x);
//		
//		String s = null ;
//		System.out.println(s);
		
		//Null vs " "
		//String s1; --> this is just the variable you can use it later on
		String s1 = null ;
		String s2 = "" ; //the moment you open the quotes, you have a dog
		
		//System.out.println(s1.length()); //--> I don't have any dog
		System.out.println(s2.length()); //-->I have a dog, but it is empty
		
		
	}

}
