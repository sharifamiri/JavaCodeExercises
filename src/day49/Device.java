package day49;

public class Device {

	int serialNum;
	
	public Device() {
		System.out.println("Device Constractor");
	}
	public Device(int serilNum) {
		System.out.println("1 arg Constractor");
		this.serialNum = serialNum;
	}
}
