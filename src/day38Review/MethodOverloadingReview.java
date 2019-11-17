package day38Review;

public class MethodOverloadingReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  
	    doSomething(100); //if int not htere, it will print long bec long doesn't have decimal
	    doSomething(100L); 
	    

	  }
	  
	  public static void doSomething(double x) {
	    System.out.println( "doSomething(double x)" );
	  }
	  
//	  public static void doSomething(int x) {
//	    System.out.println( "doSomething(int x)" );
//	  }
	  
	  public static void doSomething(long x) {
	    System.out.println( "doSomething(long x)" );
	  }
	  
	  
	  
	  
	  

	}
