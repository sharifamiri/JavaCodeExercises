package day65;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionFramework {

	public static void main(String[] args) {
		
		// GIVEN 
	    String str = "ABCABCEFGADBHYKJSGD"; 
	    // Find Out how many unique character 
	    
	    // HINT : 
	    
	    // Convert this to an array 
		
		//char [] arr = str.toCharArray();
		String [] strArr = str.split("");
		
		//store it in List
		List<String> lst = Arrays.asList(strArr);
		System.out.println(lst);
		
		//use one of data structure that store unique element
		Set<String> charSet = new HashSet<>(lst);
		System.out.println(charSet);
		System.out.println(charSet.size());
		
		//2ND WAY
		Set<Character> charSet2 = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			//System.out.print(str.charAt(i));
			charSet2.add(str.charAt(i));
		}
		
		System.out.println(charSet2);
		
	}

}
