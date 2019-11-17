package day62.Exceptions;

import java.util.Scanner;

public class TryCatchBlock {

	public static void main(String[] args) {
		
//		Scanner s = new Scanner(System.in);
//		
//		try {
//		System.out.println("Enter num1: ");
//		int num1 = s.nextInt();
//		System.out.println("Enter num2: ");
//		int num2 = s.nextInt();
//		
//		System.out.println("Division result is: "+num1/num2);
//		}catch(Exception e) {//ArithmeticException ae) {
//			System.out.println("You INPUT 0");
//		}
//		System.out.println("Ending of the code");

//		Integer i1 = null;
//		Integer i2 = null;
//		
//		try {
//			System.out.println(i1+i2);
//		} catch (NullPointerException npe) {
//			System.out.println("Sorry, I can't deal with NULL");
//		}
//		System.out.println("END of Code");
		
		Scanner s = new Scanner(System.in);
		int [] num = {1,5,6};
		try {
			System.out.println("Enter index");
			int i = s.nextInt();
			System.out.println(num[i]);
		} catch (ArrayIndexOutOfBoundsException arr) {
			System.out.println("Sorry, index doesn't exist");
		}
		System.out.println("END of Code");
		
		
		
		// Try catch block is used wrap up a piece of code that aniticipated to throw certain type of exception 
	    // and catch the exception that happen if it happen 
	    // and and either try to recover from it or just report it 
	    // so the program does not shutdown and continue to execute 
	    
	    //TASK
	    // write a piece of code that 
	    // you anticipate to throw ArrayIndexOutOfBoundsException
	    // and put it under try catch block so it does not shutdown when it happen 
	    System.out.println( "Beginning of the code " );

	    int[] arr = { 1, 2, 3, 4 }; 
	    try {
	      
	      System.out.println(arr[100]);   // -->>  new ArrayIndexOutOfBoundsException();
	      System.out.println("End of try block");
	    
	      // ArrayIndexOutOfBoundsException aibe = new ArrayIndexOutOfBoundsException();
	    }catch(ArrayIndexOutOfBoundsException aibe ) {
	      
	      System.out.println("out of bound happen , This is catch block message");
	      // here is the scenario , if this exception happen 
	      // IF JUST WANT TO PRINT LAST ITEM OF THE ARRAY 
	      System.out.println("just returning last item instead : " );
	      System.out.println(  arr[ arr.length-1]   );
	      
	    }
	      
	    System.out.println( "Ending of the code " );
	    
	    
		
	}

}
