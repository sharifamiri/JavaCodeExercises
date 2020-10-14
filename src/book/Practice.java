package book;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
	    String in = input.next();
	    
	    //your code here
		    float price1=10.0f;
		    float price2=2.0f;

		    if(in.equals("chicken")|| in.equals("burger")){
		      System.out.println(price1);
		    }
		    if(in.equals("")){
		      System.out.println(price2);
		    }
	}

}
