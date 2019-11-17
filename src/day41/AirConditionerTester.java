package day41;

public class AirConditionerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AirConditioner ac = new AirConditioner();
		ac.brand = "Samsung";
		ac.currentTemp = 42;
		ac.isOn = false;
	
		ac.displayBrand();
		ac.turnOn();
		ac.turnOff();
		ac.showCurrentTemp();
		ac.displayAllInfo();
		ac.increaseTemp(10);
		ac.showCurrentTemp();
		
		ac.decreaseTemp(30);
		ac.showCurrentTemp();
		
		System.out.println(ac.currentTemp);
		ac.setTemperature(80f);
		ac.showCurrentTemp();
	}

}
