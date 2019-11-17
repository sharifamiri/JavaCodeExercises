package day22;

public class UsingIndexForSearchingIndex2IMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ABCDEBCD";
		int countOfChars = str.length();
		int count=0;
		String target = "BCD";
		int targetLength = target.length();
		

		//2nd WAY:
	    for (int i = 0; i < str.length()-targetLength+1; i++) {
	      String word = str.substring(i, i+targetLength);
	      System.out.println(word);
	    	if(word.equals(target)) {
				count++;
	    	}
	    }
		
	    System.out.println(count);
		
//		//1st WAY:
//	    for (int i = 0; i < str.length()-1; i++) {
//	      //we can also use Equals
//	    	if( str.substring(i, i+2).contains("BC")) {
//				count++;
//	    	}
//	    }

	}

}
