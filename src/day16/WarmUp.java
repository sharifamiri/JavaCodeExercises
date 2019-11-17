package day16;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//find 3rd word without knowing 
		
		//String str = "Sunday is Java Day";
		String str = new String ("Sunday is Java Day");
		String up = str.toUpperCase();
		
		//str = str.toUpperCase();
		System.out.println(up);
		
		int count = str.length();
		
		//using charAt
		char last = str.charAt(count-1);
		char beforeLast = str.charAt(count-2);
		System.out.println(""+beforeLast + last); //1st way
		System.out.println(str.substring(count-2, count)); //2nd way
		System.out.println(str.substring(count-2)); //2rd way -->if just trying to find out the rest
		
		int positionOfIs = str.indexOf("is");
		System.out.println("The position of \"is\": " + positionOfIs);
		//System.out.println(str.indexOf("IS"));
		
//		int x = str.indexOf(97);
//		System.out.println(x);
		
		System.out.println(str.contains("Java")); //1st way
		System.out.println(str.indexOf("Java")>-1); //2nd way if you want to know it exists
													//more the -1, then it exists
													//Any conditional operator would give you a boolean
		//System.out.println(str.toLowerCase().contains("java")); //1st way
		String low = str.toLowerCase();
		System.out.println(low.contains("java")); //2nd way
		
		//find 2nd word without knowing
		// 0123456789
		//"Sunday is Java Day"
		//str.substring(7,9)
		int space1 = str.indexOf(" ");
		System.out.println(space1);
		
		int space2 = str.indexOf(" ", space1+1);
		//String word2 = str.substring(space1+1, space2);
		int space3 = str.indexOf(" ", space2+1);
		//String word3 = str.substring(space2+1, space3);
		//System.out.println(word3);
		System.out.println(str.substring(space2+1, space3));
		
		
		
		
		
	}

}
