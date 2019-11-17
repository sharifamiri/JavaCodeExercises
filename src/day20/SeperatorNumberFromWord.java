
package day20;

public class SeperatorNumberFromWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//java20awesome ---> javaawesome 20
		
		String mix = "Aonline132x";
		String numberStr = "";
		
		//check whether c is between 0 - 9
		int i = 0;
		 while(i<mix.length()) {
			char c = mix.charAt(i); 
			
			if(c>='0' && c<='9') {
			System.out.println(c);
			numberStr = numberStr+c;
			}
			i++;
		 }
		System.out.println(numberStr);
		
		
		
		//check whether c is between a - z
	    int y = 0 ; 
	    do {
	      
	      char c = mix.charAt(y);
	      
	      if(c  >= 'a' && c  <= 'z') {
	        System.out.println(c); 
	      }
	      y++; 
	      
	    } while (y< mix.length());
	    
	    System.out.println(  numberStr );
	}

}
