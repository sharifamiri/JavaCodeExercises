package day60;

import day58.*;
import day58.sub.Polymorphism.*;

// -->>Director--->>Manager--->>Employee

public class Director  extends Manager{
	
	//double salary; 
	//int budget; 
	int stockOption = 50000; 
	
	public static void main(String[] args) {
		
		Director e1  = new Director(); 
		//System.out.println( e  );
		
		Employee e = new Director();
		System.out.println(e.salary);
		
		// how to access Director's stock option 
		// in order to access Director specific field we need to refer the Director as a Director
		
		long myLong = 100 ;     // upcasting 
		int i = (int) myLong ;  // downcasting 
		
		Director d = (Director) e ; 
		System.out.println(d.salary);
		System.out.println(d.budget);
		System.out.println(d.stockOption);
		
		
		Object o = new Dog(); 
		Dog puppy = (Dog) o ; 
		puppy.makeNoise();
		
		
		
		
		
	}

}