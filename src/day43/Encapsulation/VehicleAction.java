package day43.Encapsulation;

public class VehicleAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle car1 = new Vehicle();
		
		car1.setMake("Tesla");
		car1.setModel("Model X");
		car1.setSpeed(100);
		
		System.out.println(car1.getModel());
		car1.increaseSpeed(5);
		System.out.println(car1.getSpeed());
		car1.decreaseSpeed(6);
		System.out.println(car1.getSpeed());
		
		Vehicle car2 = new Vehicle();

		car2.setMake("BMW");
		car2.setModel("M6");
		car2.setSpeed(150);
		
		
		
		
	}

}
