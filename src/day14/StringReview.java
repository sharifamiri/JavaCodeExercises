package day14;

public class StringReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String class method
		 * 
		 * 1. length() --> will give you count
		 * 2.
		 * 
		 */
		
		String name = "Mamatjan";
		
		System.out.println(name.length());
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.toLowerCase());
		
		char secondChar = name.charAt(1);
		System.out.println(secondChar);
		
		int lastIndex = name.length()-1;
		System.out.println(name.charAt(lastIndex));
		/*
		 * length() taking no external data and returning a number
		 * 
		 * 1st character index always is 0
		 * last character index always one less than actual count of character
		 *      str.length()-1
		 *      int lastIndex = str.length()-1;
		 *     
		 * 
		 * charAt(1) taking one external data/argument and returning a character
		 * 
		 *      str.charAt(str.lenght()-1);
		 *      str.charAt(lastIndex);
		 */
		
		System.out.println(name.equals("Mamatjan"));
		System.out.println(name.equalsIgnoreCase("mamatjan"));
		
		//contains
		//name.contains("am");
		boolean containsOrNot = name.contains("aam");
		System.out.println(containsOrNot);
		
		//indexOf
		//return the index of first occurrence of the string given
		//if it does not exist, it will return -1
		System.out.println(name.indexOf("am"));
		System.out.println(name.indexOf("t"));
		System.out.println(name.indexOf("samatjan"));
		System.out.println(name.indexOf("Mamatjan"));
		System.out.println(name.indexOf("mamatjan"));
		
		String uName = name.toUpperCase();
		System.out.println(uName.indexOf("MAMATJAN"));
		System.out.println(name.toUpperCase().indexOf("MA"));
		
		//System.out.println(name.length().indexOf("MA")); --> this is a bad code because length gives an INT
		
	}

}
