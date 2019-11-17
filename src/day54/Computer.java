package day54;

public class Computer {

	//@Override this is a new method, it's not overriding
		//it is just a new method
	public void turnOn() {
		System.out.println("computer");
	}
	
}



class Electronic{
	
	private void turnOn() {
		System.out.println("electronic");
	}
}