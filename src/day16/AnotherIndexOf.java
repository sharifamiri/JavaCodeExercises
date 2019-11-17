package day16;

public class AnotherIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                    //0123456789
		String str = "Ahmad Omar Al Alousi";
		
		System.out.println(str.indexOf("A"));
		System.out.println(str.indexOf("A", 1));  //11
		System.out.println(str.indexOf("A", 10)); //11
		System.out.println(str.indexOf("A", 11)); //11
		System.out.println(str.indexOf("A", 12)); //14
		
		int space1 = str.indexOf(" ");
		System.out.println(space1);
		int space2 = str.indexOf(" ", space1+1);
		int space3 = str.indexOf(" ", space2+1);
		
		String word2 = str.substring(space1+1, space2);
		System.out.println(word2);
		
		String word3 = str.substring(space2+1, space3);
		System.out.println(word3);
		
		
		
	}

}
