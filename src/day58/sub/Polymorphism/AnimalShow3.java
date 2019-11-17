package day58.sub.Polymorphism;

public class AnimalShow3 {

	public static void main(String[] args) {
		
		Animal a1 = new Dog(); 
		a1.makeNoise();
		
		System.out.println(a1.legsCount);
		//if you refer a Dog as Animal
		//it will do only general animal related stuff
		Animal a2 = new Horse(); 
		a2.makeNoise();
		
		Dog d1 = new Dog();
		d1.makeNoise();

	}

}
