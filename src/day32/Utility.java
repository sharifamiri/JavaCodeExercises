package day32;

public class Utility {

	public static void main(String[] args) {
		
		String name = "Emine";
		System.out.println(name.length());

		
		//we can use directly staticMethod(params) to call static methods
		System.out.println(giveMe5());
		//we can use className.staticMethod(params) to call static methods
		System.out.println(Utility.giveMe5());
		
		int myNum = giveMe5();
		System.out.println(myNum);
		

	}
	
	public static int giveMe5() {
		return 5;
		
	}
	

}
