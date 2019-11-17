package day12;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Day number");
		int dayNum = s.nextInt();
		String dayWord = null;
		
		switch (dayNum) {
		case 1:
			dayWord = "Monday";	
		//break;  //If block break, it will go to the next one..OVERRIDE
		case 2:
			dayWord = "Tuesday";
		break;
		case 3:
			dayWord = "Wednesday";
		break;
		case 4:
			dayWord ="Thursday";
		break;
		case 5:
			dayWord ="Friday";
		break;
		case 6:
			dayWord ="Saturday";
		break;
		case 7:
			dayWord ="Sunday";
		break;
		default:
			System.out.println("INVALID");
		}
		System.out.println(dayWord);
	}

}
