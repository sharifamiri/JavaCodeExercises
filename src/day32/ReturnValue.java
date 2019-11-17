package day32;

public class ReturnValue {

	public static void main(String[] args) {
		
		
		// If the method with return type is being called 
	    // and result is not stored , it will be just lost in next statement 
	    
	    // givemeLastChar("Sharif") ; 
	    
	    // printing on the console is not same thing as returning a value 
		char last = giveMeLastChar("Sharif");
		System.out.println();
		System.out.println(last+""+last);

	}
	
	
	public static char giveMeLastChar(String name) {
		
		char last = name.charAt(name.length()-1);
		System.out.println(last);
		return last;
	}

}
