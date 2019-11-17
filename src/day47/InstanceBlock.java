package day47;

import java.util.Random;

public class InstanceBlock {

	
	int num;
	
	{
//		System.out.println("Initializing the launch");
//		System.out.println("Setting protocols");
//		System.out.println("checking fuel level");
		System.out.println("All system GO!!");
		Random r = new Random();
		num=r.nextInt(100);
	}
	
	//Instance block comes before any constructor
	
	public InstanceBlock() {
//		System.out.println("All system GO!!");
//		Random r = new Random();
//		num=r.nextInt(100);
		System.out.println("Constructor");
	}
	
	public InstanceBlock(String name) {
//		System.out.println("All system GO!!");
//		Random r = new Random();
//		num=r.nextInt(100);
		System.out.println("Constructor " + name);
	}
	
	
	
}
