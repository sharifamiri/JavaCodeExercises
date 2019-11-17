package day13;

public class StringClassPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		* equals  ---  str1.equal(str2) --> return boolean result
		* equalsIgnoreCase  ---  str1.equalsIgnoreCase(str2) --> return boolean result without case checking
		* 
		* toUpperCase   -----  s1.toUpperCase()  ---> 
		* toLowerCase   -----  s1.toLowerCase()  ---> 
		* 
		* charAt         ------- s1.charAt(position of the char)
		* 
		* length ------- s1.length() ; ---> count of the character how do we
		* get last character index of any String s1.length() -1 how do we get
		* first character of any String s1.charAt(0) WHILE COUNTING EACH AND
		* EVERY CHARACTER COUNTS including space or any other special charcaters
		* 
		 */
		
		
		String s1 = "abc";
		String s2 = "ABC";
		
		boolean b1 = s1.equals("abc");
		boolean b2 = s1.equals(s2);
		boolean b3 = s1.equalsIgnoreCase(s2);
		

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		System.out.println(s1+ "---uppercase " + s1.toUpperCase());
		System.out.println(s1+ "---lowerrcase " + s1.toLowerCase());
		
		//get a certain character inside a str
		//"abc" ---> a is at position 0, b->1, c-> 2
		
		char c1 = s1.charAt(0); //this will give you first character
		char c2 = s1.charAt(1); //this will give you second character
		char c3 = s1.charAt(2); //third character
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		
		//getting the length of string object
		
		int countOfCharacter = s1.length();
		System.out.println(s1.length());
	}

}
