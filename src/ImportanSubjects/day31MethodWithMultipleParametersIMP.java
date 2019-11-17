package ImportanSubjects;

import java.util.Scanner;

public class day31MethodWithMultipleParametersIMP {

	public static void main(String[] args) {
		
		// create a static method with no return type
	    // take one int array as parameter and print them out in one line 
	    // with - in between
		
		//1ST WAY
		boolean rem = true;
		int pass = 123;
		String user = "abc";

		login(user, pass, rem);
		
		//--------------------------------
		
		//2ND WAY
		login("abc", 123, true);
		login("abc1", 5123, false);
		
		
	}
	
	public static void login(String username, int password, boolean rememberMe) {
		System.out.println("You entered username: " + username);
		System.out.println("You entered password: " + password);
		//System.out.println("Rember Me: " + rememberMe); //another way to call boolean
		
		if(rememberMe == true) {
			System.out.println("CHECKED");
		}else {
			System.out.println("NOT CHECKED");
		}

	}

}
