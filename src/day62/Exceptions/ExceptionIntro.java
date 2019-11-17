package day62.Exceptions;

public class ExceptionIntro {

	public static void main(String[] args) {
		
		//EXCEPTIONS ARE OBJECT
		
		//ArrayIndexOutOfBoundException
		int[] nums = {1,5,6};
		//System.out.println(nums[99]);
		
		ArrayIndexOutOfBoundsException aib = new ArrayIndexOutOfBoundsException();
		System.out.println(aib);

		//throw keyword --> is used to throw exception manually
		//throw aib;
		
		// TASK 1  
	       
	       // try to divide a number by 0 to see ArithmaticException 
	       // and comment out that code and generate same exception using throw keyword 
	     
	     //System.out.println(  10/0 );
	     // There is another constructor in every exception that accept String 
	     // you can use it to provide more information about the cause 
	     
//	     ArithmeticException ar = new ArithmeticException("DO NOT DIVIDE BY 0"); 
//	     throw ar ; 
	     
	     throw new ArithmeticException("BLA BLA "); 
	     
	       
	       // OPTIONALLY TRY NULL POINTER EXCEPTION 
	     
	     
	     
	    
	  }

	}
		

