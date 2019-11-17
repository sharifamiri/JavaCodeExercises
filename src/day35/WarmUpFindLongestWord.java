package day35;

public class WarmUpFindLongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    /*
	     * // Warm up Create a static method called findLongestWord this method have one
	     * parameter as String vararg and return the longest word as String
	     */
		
		String str = findLongestWord("Sharif", "Tahir", "Jova", "Jon Snow", "Jon Snob");
		
		System.out.println(str);
	}
	
	public static String findLongestWord(String...words ) {
		String longest = words[0];
		
//		for (int i = 1; i < words.length; i++) {
//			if(longest.length()<words[i].length()) {
//				longest = words[i];
//			}
//		}
		for (String name : words) {
			if(longest.length()<name.length()) {
				longest = name;
		}
		}
		return longest;

}
}
