package day35;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//We can use same method name for different methods
		/*
		 * Definition:
		 * reusing the name of the method with different method parameters
		 * 
		 * you can have method with different parameter count
		 * you can have method with different parameter type
		 */
		
		printName();
		printName("Sharif");
		printName("Sharif", "Amiri");
		printName(2);
		
		System.out.println();
	}
	
	public static void printName() {
		System.out.println("Method overloading");
	}
	public static void printName(String name) {
		System.out.println("Name: " + name);
	}
	public static void printName(int num) {
		System.out.println("Number: " + num);
	}
	public static void printName(String firstName, String lastName) {
		System.out.println("First and last Name: " + firstName + " " + lastName);
	}

}
