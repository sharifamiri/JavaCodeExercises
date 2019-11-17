package day40;

public class Computer {

	//unknown -- it's a default value for type instance variable (property)
	//we can change default values if they are not final
	String type = "unknown";
	int ram;
	double screenSize;
	String color;
	String OS;
	boolean isPersonal;
	
	//it is highly not recommended to have main method inside this class
	
	public void printInfo() {
		System.out.println("Type: " + type + ", OS: " +OS
				+ ", Color: "+ color + ", Ram: "+ram
				+"GB, Personal: " + isPersonal);
	}
	

}
