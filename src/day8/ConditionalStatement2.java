package day8;

import java.util.Scanner;

public class ConditionalStatement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Task2
		
		Scanner input = new Scanner(System.in);
		double iphonePrice = 599.99;
		double ipadPrice = 899.99;
		
		System.out.println("Enter your budget");
		double yourBudget = input.nextDouble();
		input.nextLine();
		
		System.out.println("Qauntity of iphone: ");
		int iphoneCount = input.nextInt();
		input.nextLine();
		
		System.out.println("Qauntity of ipad: ");
		int ipadCount = input.nextInt();
		input.nextLine();
		
		double totalPrice = (iphonePrice*iphoneCount)+ (ipadPrice*ipadCount);
		
		
		if(totalPrice>yourBudget) {
			System.out.println("Out of budget");
			System.out.println("You need extra " + (totalPrice - yourBudget));
		}else {
			System.out.println("I will take it!");
			
			System.out.println();
		}
	}

}
