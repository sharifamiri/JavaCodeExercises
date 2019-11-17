package day15;

import java.util.Scanner;

public class AmazonSearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		// as user to input items to search for
		//verify the tab name has changed to Amazon.com: your text
		
		System.out.println("Enter items to search for: ");
		String itemToSearchFor = s.nextLine();
		
		System.out.println("You have entered: " + itemToSearchFor);
		
		//Amazon.com: itemToSearchFor
		String expectedResult = "Amazon.com :iPad";
		String actualResult	= "Amazon.com :" + itemToSearchFor;
		
		//if(expectedResult ==actualResult) {   //==--> is for primitive
		if(expectedResult.equalsIgnoreCase(actualResult)) {
			System.out.println("Test passed for ipad");
		}else {
			System.out.println("Test failed for ipad");
		}
	
		
		
	}

}
