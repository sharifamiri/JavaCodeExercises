package day16;

public class StringEquality2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abc";  //Using String Literal
		String s2 = new String("abc"); //Using ne keyword

		System.out.println(s1==s2); //false -->bec it is not literal
		
		String s3 = "abc";
		
		System.out.println(s1==s3); //true --> bec it is literal
		
		//SCP == STRING CONSTANT POOL --->> STRING POOL
		
		//What is String pool:
			//String pool is a special location inside heap
			//to store unique string literal

	}

}
