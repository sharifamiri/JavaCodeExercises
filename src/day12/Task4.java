package day12;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Day number");
		int dayNum = s.nextInt();
		String dayWord = null;
		
//		switch (dayNum) {
//		case 1:
//			dayWord = "Monday";	
//		break;
//		case 2:
//			dayWord = "Tuesday";
//		break;
//		case 3:
//			dayWord = "Wednesday";
//		break;
//		case 4:
//			dayWord ="Thursday";
//		break;
//		case 5:
//			dayWord ="Friday";
//		break;
//		case 6:
//			dayWord ="Saturday";
//		break;
//		case 7:
//			dayWord ="Sunday";
//		break;
//		default:
//			System.out.println("INVALID");
//			
//		}
		
		//case 1-6-->weekdays & Case 6-7 --> weekends
		switch (dayNum) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			dayWord ="Weekdays";
		break;
		case 6:
		case 7:
			dayWord ="Weekends";
		break;
		default:
			System.out.println("INVALID");
			
		}
	
		System.out.println("It is: " + dayWord);
		
	}

}
