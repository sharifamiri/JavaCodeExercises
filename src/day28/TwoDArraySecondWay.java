package day28;

import java.util.Arrays;

public class TwoDArraySecondWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []num1 = new int [] {1,3,5};
		int []num2 = new int [] {1,13};
		
		//2 dimensinal array is an array objext that store
		//1 simensional array in eaxh slot
		
		int[][] numsOfnums = new int [2][];
		
		numsOfnums[0]=num1;
		numsOfnums[1]=num2;
		
	    for (int i = 0; i < numsOfnums.length; i++) {
	        
	        System.out.println( Arrays.toString(numsOfnums[i])  );
	        System.out.println( numsOfnums[i].length  );
	        
	      }
	    
	    //Get all the numbers -->1 3 5 1 13 
	    for( int[] eachRow :  numsOfnums ) {
	        
	        for( int eachCell : eachRow) {
	          
	          System.out.print( eachCell + " " );
	          
	        }
	        
	      }
	    
		
		
		
	}

}
