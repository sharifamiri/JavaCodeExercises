package day16;

public class StringEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abc";  //Using String Literal
		String s2 = new String("abc"); //Using ne keyword
		
		String s3 = s1; //just copying s1 address to s3
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1 == s3); //this is the only time this works
		
		//What is String pool:
			//

		
	}

}
