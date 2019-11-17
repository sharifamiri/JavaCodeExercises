package day35;

public class MethodOverloading5IMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ANY literal non-fractional numbers will be seen as int 
	    // ANY literal fractional numbers will be seen as double     
	  
//	    add(10, 12) ; 
	    //add(10L, 12L) ; // 10L can be upcasted to 10D , but not 12L to 12 as int
//	    add(10d, (byte)12) ;
	    
	    add(9, 9.5) ; 
	    add(9, 10D) ; 
	    
	    //ambiguous method call error
	    //add( 9 , 9 ) ; 
	    
	    add( 9D, 9 ) ; //for double, int
	    add( 9, 9D ) ; //for int, double

	  }
	  
	  public static void add(double a, int b) {
	    System.out.println("add( double a, int b) ");
	  }

	  public static void add(int a, double b) {
	    System.out.println("add( int a, double b) ");
	  }

	    
	  
	  
	  
	}