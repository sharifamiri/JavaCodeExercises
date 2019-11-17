package day31;

public class MethodReturnTypeIntro {

	public static void main(String[] args) {
		
		String str = "Jon Snow";
		int count = str.length();
		System.out.println(count);
		System.out.println(str.length());
		
		//----------------------------
		
		int five = giveMeFive();
		System.out.println(five);
		System.out.println(giveMeFive());

		String name = myName();
		System.out.println(name);
		System.out.println(myName());
		
		System.out.println(  name.substring(0,2)   );
	}
	
	public static int giveMeFive() {
		return 5;
	}
	
	public static String myName() {
		return "Sharif";
	}

}
