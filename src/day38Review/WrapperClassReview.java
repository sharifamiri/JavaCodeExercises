package day38Review;

public class WrapperClassReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  
	    doSomething(new Integer (100));
	    doSomething(Integer.valueOf(100));
	    doSomething(100); //auto boxing  -- or it will go to the closest match (int)
	    doSomething(null); //Integer one will be read, bec it is an object
	    
	    doSomething(Integer.parseInt("100")); //Any parseint will return Primitive
	    int val = Integer.parseInt("100");

	    //doSomething();
	}
	  
	  public static void doSomething(Integer x) {
	    System.out.println( "doSomething(Integer x)" );
	  }
	  
	  public static void doSomething(int x) {
	    System.out.println( "doSomething(int x)" );
	  }
	  
	  
	  
	  
	  

	}