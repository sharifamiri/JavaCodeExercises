package day54;

import java.util.Random;

public class WarmUp2 {

	//How can we initialize fields value
	/*
	 * if no action is taken, default value will be provided
	 * we can directly assign value with value
	 * 		or can call a method
	 * it can be initialized in initializer block
	 * it can be initialized in constructor
	 * 
	 */
	int num = getNumber(); //100;
	
	public static void main(String[] args) {
		
		WarmUp2 w = new WarmUp2();
		
		System.out.println(w.num);

	}
	
	
	public int getNumber() {
		Random r = new Random();
		int number = r.nextInt(100);
		return number;
	}

}
