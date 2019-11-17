package day11;

public class NestedIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String username = "user123";
		String password = "pass22";
		
		if(username.equals("user") && password.equals("pass")) {
			if(password.equals("pass")) {
				System.out.println("Log in Successful!");
			}
			
			System.out.println("\" login successful \"");
		}else {       //Always open curly braces and close it at the end
			if(! username.equals("user")) {
				System.out.println("Username not found");
			}else {
				System.out.println("Password not Correct");
			}
		}
		
		//You can omit curly brace when it is single statement
		if(username.equals("user")) 
			if(password.equals("pass")) 
				System.out.println("Log in Successful!");
}

}
