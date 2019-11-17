package day47;

import java.util.ArrayList;
import java.util.Arrays;

public class BikeMarathon {

	public static void main(String[] args) {
		
	    // counting objects 
	    // there is no way to count object programmatically 
	    // just by looking at new keyword 
	    // we need to find a block of code that run 
	      // when object is being created so we can 
	      // increase the count there
	    
	    Bike b1 = new Bike("Kawasaki", 4, 80);
	    Bike b2 = new Bike("Ducati", 5, 90);
	    Bike b3 = new Bike("Yamaha", 4, 88);
	    Bike b4 = new Bike("Harley-Davidson", 3, 70);  
	    
	    
	    
		System.out.println(b1);
		
		ArrayList<Bike> allBike = new ArrayList <>(Arrays.asList(b1,b2,b3,b4));
		
		for (int i = 0; i < allBike.size(); i++) {
			System.out.println(allBike.get(i));
		}
		
		Bike.showCurrentCount(); //-->> Bike count is 4 now
		
		System.out.println("------------------");
		
		for (Bike each : allBike) {
			//System.out.println(bike);
			System.out.println(each.getId()+"--"+each.getBrand());
			//b1.speedUp(10);
			each.speedUp(10);
			System.out.println(each.toString());
		}
		
		System.out.println("------------------");
		
		//we can do inside each loop for all of them
		b1.speedUp(10);
		System.out.println(b1.getSpeed());
		
		System.out.println("------------------");
		
		Bike.showCurrentCount();
		Bike.resetCount();
		Bike.showCurrentCount();
		Bike b5 = new Bike("Harley-Davidson", 3, 70);
		System.out.println("Current id of b5: " +b5.getId());
		
	}

}
