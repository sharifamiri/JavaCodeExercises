package day54;

//start() accept no param and return nothing 
//call the Engine's start method 
//
//print out super car <Make> <Model> 
//with <EngineCilinderCount> is starting 

public class SuperCar {

	final String make;
	final String model;
	final Engine engine;
	
	public SuperCar(String make, String model, Engine engine) {
		super();
		this.make = make;
		this.model = model;
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "SuperCar [make=" + make 
				+ ", model=" + model 
				+ ", engine=" + engine + "]";
	}
	
	public void start() {
		//this.engine.start();
		engine.start();
		System.out.println("Make = "+ make+ " Mosdel = " + model);
	
	}
	
	public static void main(String[] args) {
		Engine e = null; 
		Engine e2 = new Engine("V8", 8);
		//System.out.println(e.cilinderCount);//-->throws NullPointerException
		SuperCar sc = new SuperCar("Toyota", "Prius", e);
		System.out.println(sc);
		
		//sc.start(); //NullPointerException
	}
	
}
