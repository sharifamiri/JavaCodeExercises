package day12;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Task 1
		Scanner s = new Scanner(System.in);
		
		String weather;
		String action;
			
		System.out.println("How is the weather today?");
		weather = s.next();
		
		if(weather.equals("sunny")) {
			action = "GO OUT";
		}else {
			action = "STAY HOME";
		}
		
	//---------------------------------------------------------
		//ALWAYS USE str1.equals(str2) for String equality check
		//action = (weather.equals("sunny")) ? "GO OUT" : "STAY HOME";
		action = (weather.equalsIgnoreCase("sunny")) ? "GO OUT" : "STAY HOME";
		
		System.out.println(action);		
		
		

		
		
		
	}

}
