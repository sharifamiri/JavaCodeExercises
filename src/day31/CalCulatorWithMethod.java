package day31;

import java.util.Scanner;

public class CalCulatorWithMethod {

	public static void main(String[] args) {
		//1ST WAY----------------------
		add(100,30);
		sub(100,30);
		mul(100,30);
		div(100,30);
		mod(100,30);
		
		//2ND WAY----------------------
		Calc1(100, 30);
		
		//3RD WAY----------------------
		//It is 1ST WAY, but with Scanner
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two Numbers: ");
		int a = s.nextInt();
		int b = s.nextInt();
		add(a, b);
		sub(a, b);
		mul(a, b);
		div(a, b);
		mod(a, b);
		
		//4TH WAY----------------------
		Calc2('+', 4,5);
		Calc2('-', 4,5);
		Calc2('*', 4,5);
		Calc2('/', 4,5);
		Calc2('%', 4,5);
		Calc2('$', 4,5); //Not Match

	}
	
	public static void add(int a, int b) {
		System.out.println("Adition: "+(a+b));
	}
	public static void sub(int a, int b) {
		System.out.println("Subtraction: "+(a-b));
	}
	public static void mul(int a, int b) {
		System.out.println("Multiplication: "+(a*b));
	}
	public static void div(int a, int b) {
		System.out.println("Division: "+(a/b));
	}
	public static void mod(int a, int b) {
		System.out.println("Mod: "+(a%b));
	}
	public static void Calc1(int a, int b) {
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
	public static void Calc2(char operator, int a, int b) {
		switch (operator) {
		case '+':
			System.out.println("SWITCH add: "+ (a+b));
			break;
		case '-':
			System.out.println("SWITCH sub: "+ (a-b));
			break;
		case '*':
			System.out.println("SWITCH mul: "+ (a*b));
			break;
		case '/':
			System.out.println("SWITCH div: "+ (a/b));
			break;
		case '%':
			System.out.println("SWITCH mod: "+ (a%b));
			break;

		default:
			System.out.println("NOT MATCH");
			break;
		}
		

	}

}
