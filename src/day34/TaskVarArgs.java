package day34;

public class TaskVarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = sentenceBuilder("Snail", "Pillbug", "Bird", "cat", "fish");
	    String word = wordBuilder("Dragon", "Fly", "Dragonite", "Flyonite");
	    System.out.println(sentence);
		
		System.out.println(sentenceBuilder("Maryam", "Emine", "Hadice"));
		System.out.println(wordBuilder("Maryam", "Emine", "Hadice"));
		
	}

	  // Task 4
	  // create a static method sentenceBuilder
	  // take string vararg words as parameter
	  // return the concatenation of all the arguments user passed
	  // call this method to see your result
	
	public static String sentenceBuilder(String...sentence ) {
		String store = "";
		for (int i = 0; i < sentence.length; i++) {
			store+=sentence[i]+" ";
			
		}
		return store;
	}
	  // Task 5
	  // create a static method wordBuilder
	  // take string vararg words as parameter
	  // return the concatenation of last character
	  // from all the words user passed
	  // call this method to see your result
	
	public static String wordBuilder(String...sentence ) {
		String store = "";
		for (int i = 0; i < sentence.length; i++) {
			store+=sentence[i].substring(sentence[i].length()-1)+" ";
			
		}
		return store;
	}
}
