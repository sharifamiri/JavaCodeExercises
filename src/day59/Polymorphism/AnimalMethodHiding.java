package day59.Polymorphism;

import day58.sub.Polymorphism.*;

public class AnimalMethodHiding {

	public static void main(String[] args) {
		
		
		Animal.doStatic();
		Dog.doStatic();
		Horse.doStatic();
		
		Animal myAnimal1 = new Dog();
		myAnimal1.doStatic();
		
		Animal myAnimal2 = new Horse();
		myAnimal2.doStatic();
		
		Animal myAnimal3 = new Cat();
		myAnimal3.doStatic();
		
		
		

	}

}
