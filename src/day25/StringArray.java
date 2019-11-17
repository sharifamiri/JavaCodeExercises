package day25;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] movies = new String [4];
		
		   	movies[0] = "Life";
	        movies[1] = "Without";
	        movies[2] = "Love Is";
	        movies[3] = "Meaningless";
	        
	        System.out.println(Arrays.toString(movies));
	        
	        //Getting the count
//	        int i=0;
//	        System.out.println(movies.length); //this is how many objects
//	        System.out.println(movies[0].length());
//	        System.out.println(movies[i].length());
//	        i++;
//	        System.out.println(movies[1].length());
//	        System.out.println(movies[i].length());
//	        System.out.println(movies[2].length());
//	        System.out.println(movies[3].length());
	        
	        for (int j = 0; j < movies.length; j++) {
				System.out.println(movies[j] + ": char count is " + movies[j].length());
			}
		
	        int max = movies[0].length();
	        
	        for (int i = 0; i < movies.length; i++) {
				if(movies[i].length()>max)
					max=movies[i].length();
			}
	        System.out.println(max); //it gives us a length, but not the name of the movie
	}

}
