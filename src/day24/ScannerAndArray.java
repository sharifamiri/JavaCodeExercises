package day24;

import java.util.Scanner;

public class ScannerAndArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		
//		System.out.println("Enter Number");
//		arr[0] = scan.nextInt();
//		System.out.println("Enter Number");
//		arr[1] = scan.nextInt();
//		System.out.println("Enter Number");
//		arr[2] = scan.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter Number"+ (i+1));
			arr[i] = scan.nextInt();
			System.out.println(arr[i]);
		}
		
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Minimum Valus is: " +min);
	}

}
