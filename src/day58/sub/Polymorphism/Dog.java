package day58.sub.Polymorphism;

public class Dog extends Animal implements IndoorPet {

	public String breed;
	public String legsCount = "Dog Leg";
	
	@Override
	public void makeNoise() {
		System.out.println("WOOF WOOF");
	}
	
	public static void doStatic() {
		System.out.println("Dog Static");
	}
	
}
