package day59.Polymorphism;

import day58.sub.Polymorphism.*;

public class AnimalShow59_2 {

	public static void main(String[] args) {
		//Cat is a Cat
		Cat c1 = new Cat();
		//Cat is an Animal
		Animal a1 = new Cat();
		//Cat is an IndoorPet
		IndoorPet i1 = new Cat();
		//Animal is a Cat --> NOT VALID
		//Cat a2 = new Animal();
		//Cat IS-A Object
		Object o1 = new Cat();
		Object o2 = c1;
		
		
	}
}
