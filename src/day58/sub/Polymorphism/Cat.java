package day58.sub.Polymorphism;

public class Cat extends Animal implements IndoorPet{

	public String legsCount = "Cat Leg";
	
	@Override
	public void makeNoise() {
		System.out.println("MIYAV MIYAV");
	}
}
