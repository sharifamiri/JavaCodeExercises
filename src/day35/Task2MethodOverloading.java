package day35;

public class Task2MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    /// Create few static methods called addNums 
	    
	    //  first one take 2 numbers and add them
	    //  return the result as int 
	    
	    //  second one take 3 numbers and add them
	      //  return the result as int 
	      
	    
	    //  third one take 4 numbers and add them
	    //  does not return a value , 
	    // just print out the result 
		
		System.out.println(addNums(4,5));
		System.out.println(addNums(4,5,6));
		
		addNums(1,2,3,4);
	}

	// not valid because of same method name and same method parameter list
	//  public static void addNums(int x,int y) {
	//    System.out.println("aaaaa");
	//  }

	// not valid because of same method name and same method parameter list
	//  public static int addNums(int a,int b) {
	//    return a+b;
	//  }

	
	public static int addNums(int num1, int num2) {
		return num1+num2;
	}
	public static int addNums(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	public static void addNums(int num1, int num2, int num3, int num4) {
		System.out.println(num1+num2+num3+num4);;
	}

}
