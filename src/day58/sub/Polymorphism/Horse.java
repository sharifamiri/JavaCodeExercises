package day58.sub.Polymorphism;

public class Horse extends Animal {

	public String color;
	public String legsCount = "Horse Leg";
	
	@Override
	public void makeNoise() {
		System.out.println("NEIGH NEIGH");
	}
	
	public static void doStatic() {
		System.out.println("Horse Static");
	}
}
