package day12;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers please: ");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
	
		
		System.out.println("Enter operator --> +, -, *, / :");
		String operator = s.next();
		
		//switch (operator.toLowerCase()) {
		switch (operator) {
		case "+":
			System.out.println("the addition result is " + (num1 + num2));
			break;
		case "-":
			System.out.println("the subtraction result is " + (num1 - num2));
			break;
		case "*":
			System.out.println("the multiplication result is " + (num1 * num2));
			break;
		case "/":
			System.out.println("the division result is " + (num1 / num2));
			break;
		default:
			System.out.println("INVALID OPERATOR");
		}
		
		
//		System.out.println("Enter 2 numbers please: ");
//		double num11 = s.nextInt();
//		double num22 = s.nextInt();
//		
//		System.out.println("Enter operator --> +, -, *, / :");
//		String operator = s.next();
//		
//		
//		String total;
//		total = (operator.equals("+")) ? "addition: " + (num11+num22) : (operator.equals("-")) ? "subtraction: " + (num11-num22) : "Invalid";
//		System.out.println(total);
	
		//Same as above
//		if(operator.equals("+")) {
//			System.out.println("the addition result is " + (num1 + num2));
//		}else if(operator.equals("-")) {
//			System.out.println("the subtraction result is " + (num1 - num2));
//		}else if(operator.equals("*")) {
//			System.out.println("the multiplication result is " + (num1 * num2));
//		}else if(operator.equals("/")) {
//			System.out.println("the division result is " + (num1 / num2));
//		}else {
//			System.out.println("INVALID OPERATOR");
//		}
	}

}
