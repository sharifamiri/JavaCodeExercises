package day38Review;

public class VarArgsReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    doSomething(4,5,6,7,8);
	    doSomething(5); //it will look for exact match (int x)
	    				//if we have only Long and int..., it will got to 
	    				//int.. bec Long is object type.
	    
	    //****It will look for exact match: Primitive-->Wrapper Type -->VarArgs
	   
	    doSomething(5,5);
	    
	    
	}
	  
	  public static void doSomething(int x) {
	    System.out.println( "doSomething(int x)" );
	  }
	  public static void doSomething(Integer x) {
		  System.out.println( "doSomething(Integer x)" );
	  }
	  public static void doSomething(int x, int y) {
		  System.out.println( "doSomething(int x, int y)" );
	  }
	  
	  public static void doSomething(Long x) {
	    System.out.println( "doSomething(int... x)" );
	  }
	  public static void doSomething(int... x) {
		  System.out.println( "doSomething(int... x)" );
	  }
	  
	  
	  
	  
	  
	  
	  

	}