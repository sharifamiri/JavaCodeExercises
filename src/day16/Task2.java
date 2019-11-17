package day16;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter your name");
		String name = s.nextLine();
		
		boolean b1 = name.startsWith("A");
		boolean b2 = name.endsWith("x");
		System.out.println(b1);
		System.out.println(b2);
		
		int index = name.lastIndexOf("a");
		System.out.println(index);
		
		int count = name.length();
		int midPoint = count/2;
		
		if(count>2) {
		    if(count%2==1) {
			//System.out.println(name.substring(midPoint, midPoint+1));
		    System.out.println(name.charAt(midPoint));
		    	
			
		    }else if(count%2==0) {
			//System.out.println(name.substring(midPoint-1, midPoint+1));
		    char midR = name.charAt(midPoint-1);
		    char midL = name.charAt(midPoint);
		    System.out.println(" "+ midR+midL);
		    
		    }
		}
		
	}

}
