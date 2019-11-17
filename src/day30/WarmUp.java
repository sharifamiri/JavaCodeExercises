package day30;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
	
//	Scanner scan = new Scanner(System.in);
//	System.out.println("What is your name spartan?");
//	String name = scan.next();
	sayHello();
	sayGoodBye();
	
	//calling static method
		//ClassName.staticMethodName();
		//if the method is in same class -->
	sayHelloTo("Jon Snow");
		

	}
	
	public static void sayHello() {
		System.out.println("Hello Spartan");
	}
	
	public static void sayGoodBye() {
		System.out.println("Good Bye Spartan");
	}
	
	public static void sayHelloTo(String name) {
		System.out.println("Greeting, " + name);
	}

}
