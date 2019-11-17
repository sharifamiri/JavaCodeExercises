package day25;

import java.util.Arrays;

public class GetTheStringItemWithMaxLength{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    // create an string array of capacity 4
	    // put your favorite movie/show in

	    // 1,first use loop to print them out

	    // 2, print the length of all items

	    // 3 , get the max length movie title
		
		
		String [] movies = new String [4];
		
	   	movies[0] = "Life";
        movies[1] = "Without";
        movies[2] = "Love Is";
        movies[3] = "Meaningless";

        //int max = movies[0].length();
        
//		String max=movies[0];
//		for(int i = 1; i<movies.length; i++){
//		  if(movies[i].length()>max.length()){
//		    max=movies[i];
//		  }
//		}
//		System.out.println(max);
		
        
        
		//2ND WAY:

	    int max = movies[0].length();
	    // get the location of the word with max length
	    // then just use that index to get the word
	    int index = 0;
	    /* max = 4
	     * Iteration 1 : 7 > 4 ---> max = 7  index = 1  
	     * Iteration 2 : 7 > 7 ---> max = staySame  index = 1  
	     * Iteration 3 : 11 > 7 ---> max = 11  index = 3  
	     * 
	     * */
	    
	    for (int i = 1; i < movies.length; i++) {

	      if (movies[i].length() > max) {
	        max = movies[i].length();
	        index = i;
	      }

	    }

	    System.out.print(index+" is of the word location "
	        + "that has the max length: "+ movies[index]);

	}

}
