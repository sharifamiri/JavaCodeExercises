package day19;



		import java.util.Scanner;

		public class BreakingOutOfWhileLoop {

		  public static void main(String[] args) {
		    
		    // ask user to enter a word
		    // keep asking if its not correct 
		    // but stop asking if user try 3 times 
		    
		    Scanner scan = new Scanner(System.in); 
		    String word = "";
		    
		    int count = 0 ; 
		    
		    while(word.equalsIgnoreCase("java") ==false ) {
		    
		      System.out.println("Enter the magic word");
		      
		      word = scan.next();
		      count ++ ; 
		      if(count==3) {
		        System.out.println("NEXT TIME Try harder");
		        break ; 
		      }
		      
		    }
		    
		    // break; 
//		    int x = 10 ;
//		    while (x<100) {
//		      
//		      System.out.println(x++);
//		      //if(x==15) {
//		        break; 
//		      //}
//		      
//		    }
		    System.out.println("END");
		    

	}

	
		
	}


