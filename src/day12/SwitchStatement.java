package day12;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//SWITCH vs IF ELSE
		//Switch: should be used when checking for equality of certain variable
				//in multiple specific case
		//Ternary: conditionally assigning a value
				//we can not take actions we can only assign value according to condtion
		//If Else: most flexible can do anything
		//
		
		Scanner s = new Scanner(System.in);
		
		String weather;
		String action;
			
		System.out.println("How is the weather today?");
		weather = s.next();
		

		/*Some Important rules for switch statements :

			Duplicate case values are not allowed.
			The value for a case must be the same data type as the variable in the switch.
			The value for a case must be a constant or a literal.Variables are not allowed.
			The break statement is used inside the switch to terminate a statement sequence.
			The break statement is optional. If omitted, execution will continue on into the next case.
			The default statement is optional, and can appear anywhere inside the switch block. 
			In case, if it is not at the end, then a break statement must be kept after the 
			default statement to omit the execution of next case statement.
		*/
		
			//weather = weather.toLowerCase();
		
		
		//It is just for EQUALITY
		//you can not use it for COMPARISON
		switch(weather) {
		case "sunny" : 
			System.out.println("go swimming");
			break;    //It will GET OUT of the switch statement
		case "windy" :
			System.out.println("go fly a plane");
			break;
		case "rainy":
			System.out.println("stay home");
			//break;
		case "snowy":
			System.out.println("go snowboarding");
			break;
		default:
			System.out.println("are you sure is this right weather?");
		}
		
//		if(weather.equals("sunny")) {
//			System.out.println("go swimming");
//		}else if(weather.equals("windy")) {
//			System.out.println("go fly a plane");
//		}else if(weather.equals("rainy")) {
//			System.out.println("stay home");
//		}else if(weather.equals("snowy")) {
//			System.out.println("go snowboarding");
//		}else {
//			System.out.println("are you sure is this right weather?");
//		}

}
}