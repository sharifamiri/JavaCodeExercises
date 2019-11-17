package day15;

public class NumberToChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 100;
		char myChar = (char)x;
		
		System.out.println(myChar);
		
		//Which one would come first?
		//special character -->number --> upppercase --> lowercase
		
		//the slow to high order in ASCII Table
		double y = 100.99;
		char myChar2 = (char)y;
		System.out.println(myChar2);
		
	}

}
