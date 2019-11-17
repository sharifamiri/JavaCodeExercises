package day61;

import java.util.ArrayList;
import java.util.List;

public class ElectronicAction {

	
	public static void main(String[] args) {
	    
	    /*
	     * create List of Electronic with random 10 items 
	     * turn them all on 
	     * 
	     * find out how many computer and how many AirConditioner are there
	     * 
	     * */
		  
		  //We can use these for allItem
//		  Electronic item1 = new Computer();
//		  Electronic item2 = new AirConditioner();
//		  Electronic item3 = new Computer();
//		  Electronic item4 = new AirConditioner();
//		  Electronic item5 = new Computer();
//		  Electronic item6 = new AirConditioner();
//		  Electronic item7 = new Computer();
//		  Electronic item8 = new AirConditioner();
//		  Electronic item9 = new Computer();
//		  Electronic item10 = new AirConditioner();
		  
		  int cntComputer = 0;
		  int cntAC = 0;
//		  if(item1 instanceof Computer) {
//			  cntComputer++;
//		  }else if(item1 instanceof Computer) {
//			  cntAC++;
//		  }
		  
		  List<Electronic> allItems = new ArrayList<>();
		  
		  //The list is expecting an instance of Electronic 
		  
		  allItems.add(new Computer());
		  allItems.add(new AirConditioner());
		  allItems.add(new Computer());
		  allItems.add(new AirConditioner());
		  allItems.add(new Computer());
		  allItems.add(new AirConditioner());
		  allItems.add(new Computer());
		  allItems.add(new AirConditioner());
		  allItems.add(new Computer());
		  allItems.add(new AirConditioner());
		  
		  for (Electronic each : allItems) {
			each.turnOn();
			if(each instanceof Computer) {
				
				Computer cp = (Computer) each;
				cp.code();
				cntComputer++;
			}else if(each instanceof AirConditioner) {
				
				AirConditioner ac = (AirConditioner) each;
				ac.controlTemp();
				cntAC++;
			}
		}
		  System.out.println("-------------------------");

		  System.out.println("Computer count: "+cntComputer);
		  System.out.println("AirConditioner count: "+cntAC);
	    
	  }
}
